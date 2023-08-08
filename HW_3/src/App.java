import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные через пробел, в формате: Фамилия Имя Отчество дата_рождения номер_телефона пол");
        String input = scanner.nextLine();

        String[] data = input.split(" ");
        if (data.length != 6) {
            System.out.println("Ошибка: неверное количество данных");
            return;
        }

        String lastName = data[0];
        String firstName = data[1];
        String middleName = data[2];
        String birthDate = data[3];
        String phoneNumber = data[4];
        char gender = data[5].charAt(0);

        try {
            validateData(lastName, firstName, middleName, birthDate, phoneNumber, gender);
            saveToFile(lastName, firstName, middleName, birthDate, phoneNumber, gender);
            System.out.println("Данные успешно сохранены в файл");
        } catch (InvalidDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void validateData(String lastName, String firstName, String middleName,
            String birthDate, String phoneNumber, char gender) throws InvalidDataException {
        if (!birthDate.matches("\\d{2}.\\d{2}.\\d{4}")) {
            throw new InvalidDataException("неверный формат даты рождения");
        }
        if (!phoneNumber.matches("\\d+")) {
            throw new InvalidDataException("неверный формат номера телефона");
        }
        if (gender != 'f' && gender != 'm') {
            throw new InvalidDataException("неверный формат пола");
        }
    }

    private static void saveToFile(String lastName, String firstName, String middleName,
            String birthDate, String phoneNumber, char gender) throws IOException {
        try (FileWriter writer = new FileWriter(lastName + ".txt", true)) {
            writer.write(lastName + " " + firstName + " " + middleName + " " + birthDate + " " + phoneNumber + " "
                    + gender + "\n");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
            e.printStackTrace();
        }
    }
}