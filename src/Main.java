public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1:");
        int clientOS = 0;
        int clientAndroid = 1;
        if (clientOS>clientAndroid) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задача 2:");
        int clientDeviceYear = 2015;
        if (clientOS>clientAndroid) {
            if (clientDeviceYear>=2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else { System.out.println("Установите версию приложения для Android по ссылке");
        }
        } else if (clientDeviceYear<2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        System.out.println("Задача 3:");
        int year = 1996;
        if (year%4==0 && year%100!=0 || year%400==0) {
            System.out.println(year+" год является високосным");
        } else { System.out.println(year+" год не является високосным"); }

        System.out.println("Задача 4:");
        int deliveryDistance = 95;
        int amountOfDays = 1;
        if (deliveryDistance>0 && deliveryDistance<=20) { System.out.println("Потребуется дней: "+amountOfDays); }
        else if (deliveryDistance>20 && deliveryDistance<=60) { System.out.println("Потребуется дней: "+(amountOfDays+amountOfDays)); }
        else if (deliveryDistance>60 && deliveryDistance<=100) { System.out.println("Потребуется дней: "+(amountOfDays+amountOfDays+amountOfDays)); }

        System.out.println("Задача 5:");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Несуществующий номер месяца");
        }
    }
}