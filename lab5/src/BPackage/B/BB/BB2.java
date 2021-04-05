package BPackage.B.BB;

public class BB2 {
    public int b;

    public BB2(int b) {
        this.b = b;
    }

    public void getB() {
        System.out.println(getClass().getSimpleName() + ' ' + b);
    }
}
