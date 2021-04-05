import  A.AA.AAA.AAAA.*;
import A.*;
import A.AA.*;
import BPackage.B.*;

public class Main {
    public static void main(String[] args) {
        //A.AA.AAA.AAAA.AAAA2 aaa = new  A.AA.AAA.AAAA.AAAA2(5);
        AAAA2 aaa = new AAAA2(5);
        aaa.getA();
        A a = new A(2);
        a.getA();
        AA1 aa = new AA1(10);
        aa.getA();

        ClassB bCl = new ClassB();
        bCl.getB();
        ClassA aCl = new ClassA();
        aCl.getBMethod();
        aCl.getB();
    }
}
