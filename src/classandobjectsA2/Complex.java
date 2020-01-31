package classandobjectsA2;

public class Complex {
    private final double i = Math.sqrt(-1);
    private float realPart;
    private float imaginaryPart;

    public Complex(){
        this.realPart = 1;
        this.imaginaryPart = 1;
    }

    public Complex(float realPart, float imaginaryPart)
    {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public Complex add(Complex c1, Complex c2){
        Complex sum = new Complex();
        sum.imaginaryPart = c1.imaginaryPart + c2.imaginaryPart;
        sum.realPart = c1.realPart + c2.realPart;
        return sum;
    }
    public Complex subtract(Complex c1, Complex c2){
        Complex sub = new Complex();
        sub.imaginaryPart = c2.imaginaryPart - c1.imaginaryPart;
        sub.realPart = c2.realPart - c1.realPart;
        return sub;
    }

    @Override
    public String toString() {
        String str = "(" + Double.toString(realPart) + "," + Double.toString(imaginaryPart) + ")";
        return str;
    }
}
