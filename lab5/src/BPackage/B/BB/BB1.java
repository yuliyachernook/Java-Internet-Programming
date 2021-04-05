package BPackage.B.BB;

public class BB1 {
    public int b;

    public BB1(int b) {
        this.b = b;
    }

    public void getB() {
        System.out.println(getClass().getSimpleName() + ' ' + b);
    }
}
