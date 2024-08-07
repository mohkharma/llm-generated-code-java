package gtp4o.task34;

// Java Code
public class Task34_OPENAI_gpt_4o {
    public static boolean isNarcissistic(int number) {
        int originalNumber = number;
        int sum = 0;
        int numberOfDigits = String.valueOf(number).length();
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        int num = 153; // example number
        System.out.println(isNarcissistic(num));
    }
}