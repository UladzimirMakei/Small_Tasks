package com.ivantheterrible.felse.divisibility;

import java.util.Scanner;

import static com.ivantheterrible.felse.divisibility.DivisibilityMethod.isNumberDivisible;
import static java.lang.System.out;

public class NumberInput {
    public static int inputValue() {
        boolean successfulInput = false;
        int valueInput = '0';
        do {
            try {
                valueInput = greetingAndScanning();
                successfulInput = isInputCorrect(valueInput);
                if (!successfulInput)
                    out.println("Your number is not divisible by 2, 3, 5");
            } catch (Exception e) {
                out.println("Your number input is not correct. Check requested format and try again");
            }
        } while (!successfulInput);
        return valueInput;
    }

    private static int greetingAndScanning() {
        out.println("Enter a number you want to check for divisibility by 2, 3, 5: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static boolean isInputCorrect(int number) {
        return isNumberDivisible(number, 2) || isNumberDivisible(number, 3)
                || isNumberDivisible(number, 5);
    }
}
