package Kata;


import Kata.ArabCalc.ArabNumber;
import Kata.ArabCalc.Check.Check;
import Kata.Exception.Exception;
import Kata.RomanCalc.Calc.Calc;
import Kata.RomanCalc.RomanNumber;

import java.util.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Check check = new Check();
    public static ArabNumber arabNumber = new ArabNumber();
    public static RomanNumber romeNumber = new RomanNumber();
    public static Calc calc = new Calc();
    public static Exception exception = new Exception();


    public static void main(String[] args) {

        StringBuilder calc = new StringBuilder(scanner.nextLine());
        String calculate = String.valueOf(calc);
        String[] arr = calculate.split("\\s");


        check.sizeСheck(arr);

        String a = arr[0];
        String operator = arr[1];
        String b = arr[2];


        arabAndRomeCalc(a, operator, b);

    }

    private static void arabAndRomeCalc(String a, String operator, String b) {
        if (!a.equals("1") || !a.equals("2") || !a.equals("3") || !a.equals("4") || !a.equals("5") ||
                !a.equals("6") || !a.equals("7") || !a.equals("8") || !a.equals("9") || !a.equals("10") &&
                !b.equals("1") || !b.equals("2") || !b.equals("3") || !b.equals("4") || !b.equals("5") ||
                !b.equals("6") || !b.equals("7") || !b.equals("8") || !b.equals("9") || !b.equals("10")) {
            exception.range();
        }
        if (a.equals("I") || a.equals("II") || a.equals("III") || a.equals("IV") || a.equals("V") ||
                a.equals("VI") || a.equals("VII") || a.equals("VIII") || a.equals("IX") || a.equals("X") ||
                b.equals("I") || b.equals("II") || b.equals("III") || b.equals("IV") || b.equals("V") ||
                b.equals("VI") || b.equals("VII") || b.equals("VIII") || b.equals("IX") || b.equals("X")) {
            logicRomeCalc(a, operator, b);
        } else {
            arabNumber.arabCalc(a, operator, b);

        }
    }

    private static void logicRomeCalc(String a, String operator, String b) {
        RomanNumber.number();

        calc.romeCalc(romeNumber.getRomeNumbers(a), operator, romeNumber.getRomeNumbers(b));

        int value = calc.romeCalc(romeNumber.getRomeNumbers(a), operator, romeNumber.getRomeNumbers(b));
        if (value < 1) {
            exception.lessZero();
        }
        System.out.println(romeNumber.getArabNumbers(value));
    }


}
