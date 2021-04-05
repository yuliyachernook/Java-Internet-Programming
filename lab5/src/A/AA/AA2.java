package A.AA;

public class AA2 {
    public int a;

    public AA2(int a) {
        this.a = a;
    }

    public void getA() {
        System.out.println(getClass().getSimpleName() + ' ' + a);
    }
}

