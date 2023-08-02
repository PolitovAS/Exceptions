import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
public class task_1 {
    public static void main(String[] args) throws Exception {
        System.out.println(getFloatNum(0.0f));
    }

    private static float getFloatNum(float num) {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Введите n: ");
                num = Float.parseFloat(in.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Ошибка: введенное значение не является дробным числом.");
            }
        }
        return num;
    }
}