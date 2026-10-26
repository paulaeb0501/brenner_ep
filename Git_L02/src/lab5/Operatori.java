package lab5;

public class Operatori {
    Complex c1= new Complex(2,3);
    Complex c2=new Complex(2,1);

    public Operatori() {
    }

    public void aduna(Complex c1,Complex c2)
    {
        int R=c1.getR()+c2.getR();
        int I=c1.getI()+c2.getI();
        System.out.println( R + " + i * "+ I );
    }

    public void scade(Complex c1,Complex c2)
    {
        int R=c1.getR()-c2.getR();
        int I=c1.getI()-c2.getI();
        System.out.println( R + " - i * "+ I );
    }

    public void inmultire(Complex c1,Complex c2)
    {

    }
}
