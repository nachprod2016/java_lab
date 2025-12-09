public class Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1.5, 2.5);
        ComplexNumber b = new ComplexNumber(1.8, 2.3);
        System.out.println("Число а: " + a.getNumber());
        System.out.println("Число b: " + b.getNumber());
        a.sumComplexNumbers(b);
        System.out.println("Сумма чисел а + b: " + a.getNumber());
    }
}
