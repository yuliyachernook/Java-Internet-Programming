package A.AA.AAA.AAAA;

public class AAAA1 {
    public int a;

    public AAAA1(int a) {
        this.a = a;
    }

    public void getA() {
        System.out.println(getClass().getSimpleName() + ' ' + a);
    }
}
