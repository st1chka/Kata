package Kata.Check;

import Kata.Exception.Exception;
import Kata.RomanCalc.Logic;

import static Kata.Main.arabNumber;


public class Check {
    public Exception exception = new Exception();
    public Logic logic = new Logic();

    public void sizeCheck(String[] arr) {
        if (arr.length <= 2) {
            exception.smaller();
        }
        if (arr.length > 3) {
            exception.moreThree();
        }
    }

    public void checkingAllData(String a, String operator, String b) {
        if (operator.equals("*") || operator.equals("/") || operator.equals("-") || operator.equals("+")) {
            checkingOperands(a, operator, b);
        } else {
            exception.invalidOperator();
        }
    }

    private void checkingOperands(String a, String operator, String b) {
        if (checkArab(a) && checkArab(b)) {
            validatorInputNumbers(a, operator, b);
        } else if (!checkArab(a) && !checkArab(b)) {
            validatorInputNumbers(a, operator, b);
        } else {
            exception.numberFormatException();
        }


    }

    public boolean checkArab(String number) {
        for (char c : number.toCharArray()) {
            if (!Character.isDigit(c)) return true;
        }
        return false;
    }

    public void validatorInputNumbers(String a, String operator, String b) {

        if ((a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4") || a.equals("5") ||
                a.equals("6") || a.equals("7") || a.equals("8") || a.equals("9") || a.equals("10")) &&
                (b.equals("1") || b.equals("2") || b.equals("3") || b.equals("4") || b.equals("5") ||
                        b.equals("6") || b.equals("7") || b.equals("8") || b.equals("9") || b.equals("10"))) {
            arabNumber.arabCalc(a, operator, b);
        } else if ((a.equals("I") || a.equals("II") || a.equals("III") || a.equals("IV") || a.equals("V") ||
                a.equals("VI") || a.equals("VII") || a.equals("VIII") || a.equals("IX") || a.equals("X")) &&
                (b.equals("I") || b.equals("II") || b.equals("III") || b.equals("IV") || b.equals("V") ||
                        b.equals("VI") || b.equals("VII") || b.equals("VIII") || b.equals("IX") || b.equals("X"))) {
            logic.logicRomeCalc(a, operator, b);
        } else {
            exception.range();
        }
    }


}
