public class Main {
    public static void main(String[] args) {

//        task 1
        char clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else {
            System.out.println("Установите версию приложения для Android по ссылке»");
        }

        //        task 2
        char clientOs = 0;
        int year = 2016;
        if (clientOS == 0) {
            if (year > 2015){
                System.out.println("Установите версию приложения для iOS по ссылке");
            }else{
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }

        }else {
            if (year > 2015){
                System.out.println("Установите версию приложения для Android по ссылке");
            }else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }

//        task 3
        int visYaer = 1700;
        if ((visYaer % 4 == 0) && (visYaer % 100 != 0) || (visYaer % 400 == 0)){
            System.out.println("Год "+ visYaer + " високосный");
        }else{
            System.out.println("Год "+ visYaer + " не високосный");
        }
//        task 4
        int deliveryDistance = 150;
        if (deliveryDistance < 20){
            System.out.println("Потребуется дней:" + 1);
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней:" + 2);
        } else if (deliveryDistance < 100) {
            System.out.println("Потребуется дней:" + 3);
        }else{
            System.out.println("Доставки нет");
        }
//        task 5
        byte mounthNumber = 6;
        switch (mounthNumber) {
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
                System.out.println("Такого месяца нет");
        }
    }
}