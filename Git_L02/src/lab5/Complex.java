package lab5;

public class Complex {
    private int r;
    private int i;

    public Complex(int r,int i) {
        this.r=r;
        this.i=i;
    }

    public int getI() {
        return i;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "r=" + r +
                ", i=" + i +
                '}';
    }
}
