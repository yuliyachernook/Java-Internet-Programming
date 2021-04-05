package A.AA;

public class AA1 {
    public int a;

    public AA1(int a) {
        this.a = a;
    }

    public void getA() {
        System.out.println(getClass().getSimpleName() + ' ' + a);
    }
}
