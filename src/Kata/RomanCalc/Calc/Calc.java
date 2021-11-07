package Kata.RomanCalc.Calc;

public class Calc {

    public int romeCalc(Integer a, String operator, Integer b) {
        if (operator.equals("*")) {
            return a * b;
        } else if (operator.equals("/")) {
            return a / b;
        } else if (operator.equals("+")) {
            return a + b;
        } else if (operator.equals("-")) {
            return a - b;
        }
        return 0;
    }
}
