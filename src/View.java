import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public int getValue(String msg) {
        System.out.println(msg);
        return in.nextInt();
    }

    public void viewMenu() {
        System.out.println("1. сложение");
        System.out.println("2. вычитание");
        System.out.println("3. умножение");
        System.out.println("4. деление");
        System.out.println("0. чтобы завершить");
    }
}
