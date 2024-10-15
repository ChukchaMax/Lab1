import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        out.print("Введите объем ванночки (только натуральное число): "); // Просит пользователя ввести объем ванночек
        int x = in.nextInt(); // Пользователь вводит в объем ванночек в переменную 'x'
        out.print("Введите объем воды, который наливается в первую, вторую," +
                " третью и четвртую ванночки соответственно (только натуральные числа): "); // Просит пользователя ввести объем воды, которую будут наливать в ванночки
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt(); // Пользователь вводит объем воды в переменные 'A', 'B', 'C', 'D'
        if (a>=x) { // Проверяем заполнится или переполнится первая (вверхняя) ванночка. На мне важно если ванночка заполнится, потому что в остатке получится 0
            if (b>=2*x-a) { // Проверяем заполнится или переполнится вторая ванночка с остатком воды, которая вылилась из первой. Выражение 2*x-a=x-(a-x) дает оставшийся объем ванночки
                if (c>=3*x-a-b) { // Проверяем заполнится или переполнится третья ванночка с остатком воды, которая вылилась из второй. Остаток считали так же, как в предыдущей строчки
                    if (d>=4*x-a-b-c) { // Проверяем заполнится или переполнится четвертая ванночка с остатком воды, которая вылилась из третьей.
                        out.println("4 ванночки заполнены.\nВанночки: A, B, C, D"); // Выводит результат
                    }
                    else {
                        out.println("3 ванночки заполнены.\nВанночки: A, B, C"); // Выводит результат
                    }
                }
                else {
                    if (d>=x) { // Проверяет переполнилась или заполнилась ли четвертая ванночка, когда прошлая не заполнилась или не переполнилась
                        out.println("3 ванночки заполнены.\nВанночки: A, B, D"); // Выводит результат
                    }
                    else {
                        out.println("2 ванночки заполнены.\nВанночки: A, B"); // Выводит результат
                    }
                }
            }
            else {
                if (c>=x) { // Проверяем переполнилась или заполнилась ли третья ванночка
                    if (d>=2*x-c) { // Проверяем переполнится или заполнится четвертая ванночка с остатком воды, которая вылилась из третьей
                        out.println("3 ванночки заполнены.\nВанночки: A, C, D"); // Выводит результат
                    }
                    else {
                        out.println("2 ванночки заполнены.\nВанночки: A, C"); // Выводит результат
                    }
                }
                else {
                    if (d>=x) { // Проверяем переполнилась или  заполнилась ли четвертая ванночка
                        out.println("2 ванночки заполнены.\nВанночки: A, D"); // Выводит результат
                    }
                    else {
                        out.println("1 ванночка заполнена.\nВанночки: A"); // Выводит результат
                    }
                }
            }
        }
        else {
            if (b>=x) { // Проверяем переполнилась или заполнилась вторая ванночка
                if (c>=2*x-b) { // Проверяем заполнится или переполнится третья ванночка с остатком воды, которая вылилась из второй
                    if (d>=3*x-b-c) {
                        out.println("3 ванночки заполнены.\nВанночки: B, C, D"); // Выводит результат
                    }
                    else {
                        out.println("2 ванночки заполнены.\nВанночки: B, C"); // Выводит результат
                    }
                }
                else {
                    if (d>=x) { // Проверяем переполнилась или  заполнилась ли четвертая ванночка
                        out.println("2 ванночки заполнены.\nВанночки: B, D"); // Выводит результат
                    }
                    else {
                        out.println("1 ванночка заполнена.\nВанночки: B"); // Выводит результат
                    }
                }
            }
            else {
                if (c>=x) { // Проверяем переполнилась или  заполнилась ли третья ванночка
                    if (d>=2*x-c) { // Проверяем заполнится или переполнится четвертая ванночка с остатком воды, которая вылилась из третьей.
                        out.println("2 ванночки заполнены.\nВанночки: C, D"); // Выводит результат
                    }
                    else {
                        out.println("1 ванночка заполнена.\nВанночки: C"); // Выводит результат
                    }
                }
                else {
                    if (d>=x) { // Проверяем переполнилась или  заполнилась ли четвертая ванночка
                        out.println("1 ванночка заполнена.\nВанночки: D"); // Выводит результат
                    }
                    else {
                        out.println("Ванночки не заполнены"); // Выводит результат
                    }
                }
            }
        }
    }
}
