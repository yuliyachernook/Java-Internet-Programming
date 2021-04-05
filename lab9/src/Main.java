public class Main {
    public static void main(String[] args) {

        System.out.println("1-2");

        String s01 = new String();
        System.out.println("s01 length = " + s01.length());

        char[] cs = { '0', '1', '2', '3', '4', '5', '6', '7'};
        String s02 = new String(cs);
        System.out.println("s02 length = " + s02.length() + " s02 = " + s02);

        String s03 = new String(cs, 3, 5);
        System.out.println("s03 length = " + s03.length() + " s03 = " + s03);

        String s04 = "01234567";
        System.out.println("s04 length = " + s04.length() + " s04 = " + s04);

        String s05 = new String("01234567");
        System.out.println("s05 length = " + s05.length() + " s05 = " + s05);

        System.out.println("3");

        System.out.println("\"01234567\".length = " + "01234567".length());

        System.out.println("4");

        String s06 = new String("01234567");
        for (int i = 0; i < s06.length(); i++) {
            System.out.println(s06.charAt(i)
                    + ((i < s06.length() - 1)? "-" : ""));
        }
        System.out.println("");
        char[] cs1 = new char[6 - 2];
        s06.getChars(2, 6, cs1, 0);
        for (int i = 0; i < cs1.length; i++) {
            System.out.println(cs1[i] + ((i < cs1.length - 1) ? "-" : ""));
        }

        System.out.println("5");

        String s07 = new String("01234567");
        String s08 = new String("01234567");
        System.out.println("(s07 == s08) = " + (s07 == s08));
        System.out.println("(s07 == \"01234567\") = " + (s07 == "01234567"));
        System.out.println("s07.equals(s08) = " + s07.equals(s08));
        String s09 = s08;
        System.out.println("(s08 == s09) = " + (s08 == s09));

        System.out.println("6");

        String s10 = new String("Yuliya Chernook");
        System.out.println(s10.indexOf('c'));
        System.out.println(s10.indexOf('o'));
        System.out.println(s10.lastIndexOf('o'));
        System.out.println(s10.indexOf('o', 5));
        System.out.println(s10.lastIndexOf('o', 5));
        System.out.println(s10.lastIndexOf('o', 14));

        System.out.println("7");

        String s11 = new String("Yuliya Chernook");
        System.out.println(s11.substring(5));
        System.out.println(s11.substring(2, 4));

        System.out.println("8");

        String s12 = new String("Yuliya Chernook" +  " Yuliya Chernook");
        System.out.println(s12.replace('n', 'f'));
        System.out.println(s12.toUpperCase());
        System.out.println(s12.toLowerCase());

        System.out.println("9");

        StringBuffer s15 = new StringBuffer(100);
        s15.append("Yuliya Chernook ");
        System.out.println("s15.length() = " + s15.length());
        System.out.println("s15.capacity() = " + s15.capacity());
        s15.insert(15, "Yuliya Chernook");
        System.out.println(s15);
        System.out.println("s15.length() = " + s15.length());
        System.out.println("s15.capacity() = " + s15.capacity());
        s15.delete(15, 17);
        System.out.println(s15);
        s15.ensureCapacity(200);
        System.out.println("s15.capacity() = " + s15.capacity());
        String s16 = s15.toString();

        System.out.println("10");

        Byte x1 = 3;
        Short x2 = 256;
        Integer x3 = 1000;
        Float x4 = 3.14f;
        Double x = 2.9e10;

        System.out.println("11");

        Planet planet = Planet.EARTH;

        switch (planet)
        {
            case MERCURY: System.out.println("MERCURY"); break;
            case JUPITER: System.out.println("JUPITER"); break;
            default: System.out.println("default");
        }

        System.out.println("12");
        Planet planett = Planet.NEPTUN;
        System.out.println(planett.gravity);
        System.out.println(planett.mass);
        System.out.println(planett.radius);
    }

    public enum Planet
    {
        MERCURY(3.02e+23, 2.439e+06),
        VENUS(3.02e+23, 2.439e+06),
        EARTH(3.02e+23, 2.439e+06),
        MARS(3.02e+23, 2.439e+06),
        JUPITER(3.02e+23, 2.439e+06),
        SATURN(3.02e+23, 2.439e+06),
        URANUS(3.02e+23, 2.439e+06),
        NEPTUN(1.024e+26, 2.477e+07);
        private final double mass;
        private final double radius;
        private final double gravity;
        private static final double G = 6.673000e-11;
        Planet (double mass, double radius)
        {
            this.mass = mass;
            this.radius = radius;
            this.gravity = G*mass/(radius*radius);
        }
    }
}

