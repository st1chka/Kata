package Kata.ArabCalc.Check;

import Kata.Exception.Exception;

public class Check {
    public Exception exception = new Exception();
    public static boolean checkArab(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (java.lang.Exception e) {
            System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
            return false;
        }
    }

    public void sizeСheck(String[] arr) {
        if (arr.length <= 1) {
            exception.smaller();
        }
        if (arr.length > 3) {
            exception.moreThree();
        }
    }

}
