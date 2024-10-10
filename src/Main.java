import java.io.PrintStream;
import java.util.Scanner;
public class Lab1 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        out.print("Введите объем ванночки (только натуральное число): ");
        int x = in.nextInt();
        out.print("Введите объем воды," +
                " который наливается" +
                " в первую, вторую, третью и четвртую ванночки" +
                " соответственно (только натуральные числа): ");
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
        if (a>=x) {
            if (b>=2*x-a) {
                if (c>=3*x-a-b) {
                    if (d>=4*x-a-b-c) {
                        out.println("4 ванночки заполнены.\nВанночки: A, B, C, D");
                    }
                    else {
                        out.println("3 ванночки заполнены.\nВанночки: A, B, C");
                    }
                }
                else {
                    if (d>=x) {
                        out.println("3 ванночки заполнены.\nВанночки: A, B, D");
                    }
                    else {
                        out.println("2 ванночки заполнены.\nВанночки: A, B");
                    }
                }
            }
            else {
                if (c>=x) {
                    if (d>=2*x-c) {
                        out.println("3 ванночки заполнены.\nВанночки: A, C, D");
                    }
                    else {
                        out.println("3 ванночки заполнены.\nВанночки: A, B, C");
                    }
                }
                else {
                    if (d>=x) {
                        out.println("2 ванночки заполнены.\nВанночки: A, D");
                    }
                    else {
                        out.println("1 ванночка заполнена.\nВанночки: A");
                    }
                }
            }
        }
        else {
            if (b>=x) {
                if (c>=2*x-b) {
                    if (d>=3*x-b-c) {
                        out.println("3 ванночки заполнены.\nВанночки: B, C, D");
                    }
                    else {
                        out.println("2 ванночки заполнены.\nВанночки: B, C");
                    }
                }
                else {
                    if (d>=x) {
                        out.println("2 ванночки заполнены.\nВанночки: B, D");
                    }
                    else {
                        out.println("1 ванночка заполнена.\nВанночки: B");
                    }
                }
            }
            else {
                if (c>=x) {
                    if (d>=2*x-c) {
                        out.println("2 ванночки заполнены.\nВанночки: C, D");
                    }
                    else {
                        out.println("1 ванночка заполнена.\nВанночки: C");
                    }
                }
                else {
                    if (d>=x) {
                        out.println("1 ванночка заполнена.\nВанночки: D");
                    }
                    else {
                        out.println("Ванночки не заполнены");
                    }
                }
            }
        }
    }
}
