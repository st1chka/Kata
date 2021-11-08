package Kata;


import Kata.ArabCalc.ArabNumber;
import Kata.Check.Check;
import Kata.Exception.Exception;
import Kata.RomanCalc.Calc.Calc;
import Kata.RomanCalc.Numbers.RomanNumber;


import java.util.*;


public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Check check = new Check();
    public static ArabNumber arabNumber = new ArabNumber();
    public static RomanNumber romeNumber = new RomanNumber();
    public static Calc calc = new Calc();
    public static Exception exception = new Exception();

    public static void main(String[] args) {
        String calculate = String.valueOf(scanner.nextLine());
        String[] arr = calculate.split("\\s");


        check.sizeCheck(arr);

        String a = arr[0];
        String operator = arr[1];
        String b = arr[2];


        check.checkingAllData(a, operator, b);

    }


}
