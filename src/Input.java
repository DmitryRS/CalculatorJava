import java.util.Scanner;

public class Input {
    public static String[] read() throws Exception {
        System.out.println("Введите операцию:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim();
        String[] inputArray = str.split(" ");
        if(inputArray.length > 3)
            throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        else if (inputArray.length < 3)
            throw new Exception("Строка не является математической операцией");

        return inputArray;
    }
}
