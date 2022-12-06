import java.util.Scanner;

public class Input {
    public static char[] read() throws Exception {
        System.out.println("Введите операцию:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim().replace(" ", "");

        char[] inputArray = str.toCharArray();
        if(inputArray.length > 3)
            throw new Exception("Формат математической операции не удовлетворяет заданию - два числа и один оператор (+, -, /, *)");
        else if (inputArray.length < 3)
            throw new Exception("Строка не является математической операцией");

        return inputArray;
    }
}
