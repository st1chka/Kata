package Kata.ArabCalc;


import Kata.Exception.Exception;

public class ArabNumber {

    public int arabCalc(String a, String operator, String b) {

        if (operator.equals("*")) {
            System.out.println(Integer.parseInt(a) * Integer.parseInt(b));
        }
        if (operator.equals("/")) {
            System.out.println(Integer.parseInt(a) / Integer.parseInt(b));
        }
        if (operator.equals("+")) {
            System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
        }
        if (operator.equals("-")) {
            System.out.println(Integer.parseInt(a) - Integer.parseInt(b));
        }

        System.exit(0);
        return 0;
    }


}
