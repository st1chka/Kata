package Kata.RomanCalc;

import Kata.RomanCalc.Numbers.RomanNumber;

import static Kata.Main.*;

public class Logic {
    public void logicRomeCalc(String a, String operator, String b) {
        RomanNumber.number();

        calc.romeCalc(romeNumber.getRomeNumbers(a), operator, romeNumber.getRomeNumbers(b));

        int value = calc.romeCalc(romeNumber.getRomeNumbers(a), operator, romeNumber.getRomeNumbers(b));
        if (value < 1) {
            exception.lessZero();
        }
        System.out.println(romeNumber.getArabNumbers(value));
    }


}
