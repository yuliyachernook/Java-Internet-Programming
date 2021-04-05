package BPackage.B;

public class B {
    public int b;

    public B(int b) {
        this.b = b;
    }

    public void getB() {
        System.out.println(getClass().getSimpleName() + ' ' + b);
    }
}
