package Kata.ArabCalc;


import static Kata.ArabCalc.Check.Check.checkArab;
public class ArabNumber {

    public void arabCalc(String a, String operator, String b) {
        if (checkArab(a) && checkArab(b)) {
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
        }
    }


}
