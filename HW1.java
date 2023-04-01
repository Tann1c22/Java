import java.util.Scanner;

public class HW1 {

    public static void main(String[] args) {
        // Вычислить n-ое треугольного число (сумма чисел от 1 до n)
        int n = InputInt();
        Task1(n);
        //Вычислить n! (произведение чисел от 1 до n)
        int y = InputInt();
        Task2(y);
        //Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка)
        Task3(1,169); // параметр y для задания кол-ва простых чисел
        //Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую операцию, ответ)
        Task4();
    }
    static int InputInt(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scan.nextInt();
        return n;
    }
    static String InputString(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите требуемую операцию: ");
        String n = scan.nextLine();
        return n;
    }
    static void Task1(int n){
        int y = 0;
        for (int i = 0; i <= n; i++) {
            y += i;
        }
        System.out.print("n-ое треугольное число равно: ");
        System.out.println(y);
    }
    static void Task2(int n){
        double k = 1;
        for (int i = 1; i <= n; i++) {
            k *= i;
        }
        System.out.print("Факториал этого числа равен: ");
        System.out.println(k);
    }
    public static void Task3(int x, int y) {
        int counter = 0;
        while (counter < y) {
            if (simple(x)) {
                System.out.println("i = " + x);
                counter++;
            }
            x++;
        }
    }

    public static boolean simple(int num) {
        for (int x = 2; x < num; x++) {
            if (num % x == 0) {
                return false;
            }
        }
        return true;
    }
    public static void Task4(){
        int n = InputInt();
        int y = InputInt();
        String g = InputString();
        int k = 0;
        if (g.equals("*")){
            k = n*y;
        } else if (g.equals("/")){
            k = n/y;
        } else if (g.equals("+")){
            k = n+y;
        } else if (g.equals("%")){
            k = n%y;
        } else if (g.equals("-")){            
            k = n-y;
        } else {
            System.out.println("Такой операции нет");
            System.exit(0);
        }
        System.out.println(k);
    }
}
