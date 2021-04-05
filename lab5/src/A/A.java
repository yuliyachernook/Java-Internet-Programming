package A;

public class A {
    public int a;

    public A(int a) {
        this.a = a;
    }

    public void getA() {
        System.out.println(getClass().getSimpleName() + ' ' + a);
    }
}
