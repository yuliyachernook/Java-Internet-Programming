package p1.p2;

import p1.Person;

import java.util.Date;

public interface Student extends Person {

    int limitUniversityLength = 77;

    void setFirstDate(Date d);
    Date getFirstDate();
    void setUniversity(String u);
    String getUniversity();
}
