public class MathFunctions {
    //2
    public void mathInt(int a, int b) {
        System.out.println("a(2) - b(2) = " + (Math.pow(a, 2) - Math.pow(b, 2)));
    }

    public void mathFloat(float a, float b) {
        System.out.println("a(3) - b(3) = " + (Math.pow(a, 3) - Math.pow(b, 3)));
    }

    public void mathDouble(double a, double b) {
        System.out.println("a(4) - b(4) = " + (Math.pow(a, 4) - Math.pow(b, 4)));
    }

    public void mathChar(char a, char b) {
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
    }

    //3
    public void createArray() {
        int[] xx = new int[10];
        for (int i = 0; i < xx.length; i++) {
            xx[i] = 1;
        }

        System.out.println("Array:");
        for (int i = 0; i < xx.length; i++) {
            System.out.println(xx[i]);
        }
    }

    public void createSecondArray() {
        int[][] xx = new int[5][5];
        for (int i = 0; i < xx.length; i++)
        {
            for (int j = 0; j < xx[i].length; j++)
            {
                xx[i][j] = i + j;
            }
        }

        System.out.println("Second array:");
        for (int i = 0; i < xx.length; i++)
        {
            for (int j = 0; j < xx[i].length; j++)
            {
                System.out.println((xx[i][j]));
            }
        }
    }

    public void createBit(){
        int num=5, secNum=6;
        System.out.println("\nNumber1 in normal form is "+num);
        System.out.println("Number2 in normal form is "+secNum);
        System.out.println("Binary number1: "+Integer.toBinaryString(num));
        System.out.println("Binary number2: "+Integer.toBinaryString(secNum));
        System.out.println("Number1 with not: "+~num);
        System.out.println("Number1 & Number2: "+ Integer.toBinaryString(num&secNum));
        System.out.println("Number1<<2: "+ Integer.toBinaryString(num <<= secNum));
        System.out.println("Number1^Number2: "+ Integer.toBinaryString(num ^= secNum));
    }

    public void createBool(int a) {
        boolean bool = (a % 2 == 0 && a / 10 < 1) ? true : false;
        boolean bool2 = (a % 2 == 0 || a / 10 < 1) ? true : false;
        System.out.println("Bool1: " + bool);
        System.out.println("Bool2: " + bool2);
    }

    public void createControlOperators()
    {
        int i = 0;
        while(i <= 10) {
            System.out.println(i);
            i++;
        }

        int k = 0;
        do {
            System.out.println(k);
            k++;
        } while (k <=5);

        for (int j = 0; j <= 10; j++)
        {
            if (j%2 == 0) System.out.println("Even");
            else System.out.println("Odd");
        }

        int count = 2;
        switch (count) {
            case 1: System.out.println("It is 1");
                break;
            case 2: System.out.println("It is 2");
                break;
            default: System.out.println("0");
        }
    }
}
