import java.util.ArrayList;
import java.util.Arrays;

public class Number {
    public static boolean isRoman = false;
    public static ArrayList<String> romanNumber = new ArrayList<>(Arrays.asList("O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"));

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
