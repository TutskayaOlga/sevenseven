public class Main {
    public static void main(String[] args) {
        var voice = 10;
        var voice1 = 15;
        int table = voice - voice1;
        int table1 = Math.abs(voice - voice1);
        System.out.println(table1);
        System.out.println();

        int dayOfWeekNumber = 7;
        switch (dayOfWeekNumber) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Такого дня не существует");
                break;
        }
        System.out.println();
        int dayOfWeekNumber1 = 5;
        switch (dayOfWeekNumber1) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Будний день");
                break;
            case 6:
            case 7:
                System.out.println("Выходной день");
                break;
            default:
                System.out.println("Такого дня не существует");
        }
        int start = 5;
        while (start > 0) {
            System.out.println (start);
            start--;
        }
        for (int i = 0; i <= 20; i++){
            System.out.println ("Итерация цикла" + i);
        }
        for (double a = 2.3; a <= 3.0; a+=0.1){
            System.out.println ("Итерация цикла" + a);
        }
        int salary = 65535;
        int total = 0;
        for (int i = 0; i < 12; i++){
            total = total + total/100;
            total = total + salary;
            System.out.println("Mесяц " + i + " заработная плата после индексации состовит " + total);
        }
    }
    }