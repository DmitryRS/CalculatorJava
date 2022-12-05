public class Main {
    public static void main(String[] args) throws Exception {
        String[] inputArray = Input.read();
        int[] numbers = Number.parse(inputArray);
        int num1 = numbers[0];
        int num2 = numbers[1];

        int result = 0;
        switch (inputArray[1]) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> result = num1 / num2;
            default -> throw new Exception("Неправильный оператор");
        }

        if(Number.isRoman) {
            if(result < 0)
                throw new Exception("В римской системе исчесления не может быть отрицательного числа");
            System.out.println("Результат: " + Number.romanNumber.get(result));
        } else {
            System.out.println("Результат: " + result);
        }
    }
}
