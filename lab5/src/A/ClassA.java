package A;

import BPackage.B.B;

public class ClassA extends B {

   public  ClassA() {super(25);};

    public void getBMethod() {
        super.getB();
    }
}
