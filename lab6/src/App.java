import p1.p2.p3.*;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        AAA aaa = new AAA();
        aaa.setSurname("Chernook");
        aaa.setName("Yuliya");
        aaa.setFathername("Sergeevna");
        aaa.setBirthday(2001, 04, 02);
        aaa.setFirstDate(new Date());
        aaa.setUniversity("BSTU");

        System.out.println(aaa.getSurname());
        System.out.println(aaa.getName());
        System.out.println(aaa.getFathername());
        System.out.println(aaa.getBirthday());
        System.out.println(aaa.getFirstDate());
        System.out.println(aaa.getUniversity());
    }
}
