public class AAA extends Exception{
    public AAA (Integer a) throws ExceptionAAA1 {
        if (a==null) throw new ExceptionAAA1();
    }
    public void method (int m) throws ExceptionAAA2, ExceptionAAA3 {
        if (m==0) throw new ExceptionAAA2();
        if (m<0) throw  new ExceptionAAA3();
        System.out.println("Your number is "+m);
    }
}

