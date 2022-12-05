import java.util.ArrayList;
import java.util.Arrays;

public class Number {
    public static boolean isRoman = false;
    public static ArrayList<String> romanNumber = new ArrayList<>(Arrays.asList("O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX"));

    public static int[] parse(String[] inputArray) throws Exception {
        String str1 = inputArray[0];
        String str2 = inputArray[2];
        int num1, num2 = 0;
        if(romanNumber.indexOf(str1) > 0) {
            isRoman = true;
            num1 = romanNumber.indexOf(str1);
            if(romanNumber.indexOf(str2) > 0) {
                num2 = romanNumber.indexOf(str2);
            } else {
                throw new Exception("Используются одновременно разные системы счисления");
            }
        } else {
            try {
                num1 = Integer.parseInt(str1);
                num2 = Integer.parseInt(str2);
            } catch (NumberFormatException e) {
                throw new Exception(e);
            }
        }

        if(num1 < 1 || num2 < 1 || num1 > 10 || num2 > 10)
            throw new Exception("Калькулятор должен принимать на вход числа от 1 до 10 включительно");
        return new int[]{num1, num2};
    }
}
