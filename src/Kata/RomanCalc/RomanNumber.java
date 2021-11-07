package Kata.RomanCalc;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class RomanNumber {
    public static HashMap<String, Integer> romeNumbers = new HashMap<>();
    public static void number() {
        romeNumbers.put("I", 1);
        romeNumbers.put("II", 2);
        romeNumbers.put("III", 3);
        romeNumbers.put("IV", 4);
        romeNumbers.put("V", 5);
        romeNumbers.put("VI", 6);
        romeNumbers.put("VII", 7);
        romeNumbers.put("VIII", 8);
        romeNumbers.put("IX", 9);
        romeNumbers.put("X", 10);
        romeNumbers.put("XI", 11);
        romeNumbers.put("XII", 12);
        romeNumbers.put("XIII", 13);
        romeNumbers.put("XIV", 14);
        romeNumbers.put("XV", 15);
        romeNumbers.put("XVI", 16);
        romeNumbers.put("XVII", 17);
        romeNumbers.put("XVIII", 18);
        romeNumbers.put("XIX", 19);
        romeNumbers.put("XX", 20);
        romeNumbers.put("XXI", 21);
        romeNumbers.put("XXII", 22);
        romeNumbers.put("XXIII", 23);
        romeNumbers.put("XXIV", 24);
        romeNumbers.put("XXV", 25);
        romeNumbers.put("XXVI", 26);
        romeNumbers.put("XXVII", 27);
        romeNumbers.put("XXVIII", 28);
        romeNumbers.put("XXIX", 29);
        romeNumbers.put("XXX", 30);
        romeNumbers.put("XXXI", 31);
        romeNumbers.put("XXXII", 32);
        romeNumbers.put("XXXIII", 33);
        romeNumbers.put("XXXIV", 34);
        romeNumbers.put("XXXV", 35);
        romeNumbers.put("XXXVI", 36);
        romeNumbers.put("XXXVII", 37);
        romeNumbers.put("XXXVIII", 38);
        romeNumbers.put("XXXIX", 39);
        romeNumbers.put("XL", 40);
        romeNumbers.put("XLI", 41);
        romeNumbers.put("XLII", 42);
        romeNumbers.put("XLIII", 43);
        romeNumbers.put("XLIV", 44);
        romeNumbers.put("XLV", 45);
        romeNumbers.put("XLVI", 46);
        romeNumbers.put("XLVII", 47);
        romeNumbers.put("XLVIII", 48);
        romeNumbers.put("XLIX", 49);
        romeNumbers.put("L", 50);
        romeNumbers.put("LI", 51);
        romeNumbers.put("LII", 52);
        romeNumbers.put("LIII", 53);
        romeNumbers.put("LIV", 54);
        romeNumbers.put("LV", 55);
        romeNumbers.put("LVI", 56);
        romeNumbers.put("LVII", 57);
        romeNumbers.put("LVIII", 58);
        romeNumbers.put("LIX", 59);
        romeNumbers.put("LX", 60);
        romeNumbers.put("LXI", 61);
        romeNumbers.put("LXII", 62);
        romeNumbers.put("LXIII", 63);
        romeNumbers.put("LXIV", 64);
        romeNumbers.put("LXV", 65);
        romeNumbers.put("LXVI", 66);
        romeNumbers.put("LXVII", 67);
        romeNumbers.put("LXVIII", 68);
        romeNumbers.put("LXIX", 69);
        romeNumbers.put("LXX", 70);
        romeNumbers.put("LXXI", 71);
        romeNumbers.put("LXXII", 72);
        romeNumbers.put("LXXIII", 73);
        romeNumbers.put("LXXIV", 74);
        romeNumbers.put("LXXV", 75);
        romeNumbers.put("LXXVI", 76);
        romeNumbers.put("LXXVII", 77);
        romeNumbers.put("LXXVIII", 78);
        romeNumbers.put("LXXIX", 79);
        romeNumbers.put("LXXX", 80);
        romeNumbers.put("LXXXI", 81);
        romeNumbers.put("LXXXII", 82);
        romeNumbers.put("LXXXIII", 83);
        romeNumbers.put("LXXXIV", 84);
        romeNumbers.put("LXXXV", 85);
        romeNumbers.put("LXXXVI", 86);
        romeNumbers.put("LXXXVII", 87);
        romeNumbers.put("LXXXVIII", 88);
        romeNumbers.put("LXXXIX", 89);
        romeNumbers.put("XC", 90);
        romeNumbers.put("XCI", 91);
        romeNumbers.put("XCII", 92);
        romeNumbers.put("XCIII", 93);
        romeNumbers.put("XCIV", 94);
        romeNumbers.put("XCV", 95);
        romeNumbers.put("XCVI", 96);
        romeNumbers.put("XCVII", 97);
        romeNumbers.put("XCVIII", 98);
        romeNumbers.put("XCIX", 99);
        romeNumbers.put("C", 100);
    }

    public Integer getRomeNumbers(String num) {
        return romeNumbers.get(num);
    }

    public Set<String> getArabNumbers(Integer num) {
        return romeNumbers.entrySet()
                .stream()
                .filter(entry -> Objects.equals(entry.getValue(), num))
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }




}
