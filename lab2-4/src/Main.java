public class Main {
    public static void main(String[] args) {
        System.out.println("\nLab 2");
        int a1 = 4, b1 = 5;
        float a2 = 4.44f, b2 = 3.33f;
        double a3, b3;
        a3 = 7.89;
        b3 = 9.87;
        char a4 = 'a', b4 = 'b';
        MathFunctions math = new MathFunctions();
        math.mathInt(a1, b1);
        math.mathFloat(a2, b2);
        math.mathDouble(a3, b3);
        math.mathChar(a4, b4);

        System.out.println("\nLab 3");
        math.createArray();
        math.createSecondArray();
        math.createBit();
        math.createBool(5);
        math.createControlOperators();
        StaticClass.getBigStaticElem();

        System.out.println("\nLab 4");
        CCC ccc = new CCC();
        System.out.println("sum ccc= " + ccc.sum());
        CCC ccc2 = new CCC(5, 10);
        System.out.println("sum ccc2= " + ccc2.sum());
        System.out.println("y ccc2 = " + ccc2.getY());
        System.out.println("sub ccc = " + CCC.sub(5, 10));
        DDD ddd = new DDD();
        System.out.println("sum ddd " + ddd.sum());
        System.out.println("sub ddd: " + DDD.sub(5, 6));
        DDD ddd2 = new DDD(2, 20);
        System.out.println("sum ddd2 " + ddd2.sum());
        System.out.println("calc ddd2 " + ddd2.calc());

    }
}