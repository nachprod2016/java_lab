public class ComplexNumber {

    private double x;
    private double y;

    public ComplexNumber(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void sumComplexNumbers(ComplexNumber o) {
        this.x += o.x;
        this.y += o.y;
    }

    String  getNumber() {
        return String.valueOf(x) + " + " + String.valueOf(y) + 'i';
    }
}