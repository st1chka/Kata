package Kata.Exception;

public class Exception {
    public void moreThree(){
        System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        System.exit(0);
    }
    public void smaller(){
        System.out.println("throws Exception //т.к. строка не является математической операцией");
        System.exit(0);
    }
    public void range(){
        System.out.println("throws Exception //т.к. диапазон от 1 до 10 или от I до X");
        System.exit(0);
    }
    public void lessZero(){
        System.out.println("throws Exception //т.к. результат римского вычесления не может быть < I");
        System.exit(0);
    }
    public static void invalidOperator() {
        try {
            throw new java.lang.Exception("throws Exception //не корректный оператор");
        } catch (java.lang.Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }


}
