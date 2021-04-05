package p1.p2.p3;


import p1.p2.Student;

import java.util.Date;

public class AAA implements Student {

    private String Surname;
    private String Name;
    private String Fathername;
    private java.util.Date Birthday;
    private java.util.Date FirstDate;
    private String University;

    public void setSurname(String surname) {
        this.Surname = surname;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setFathername(String fathername) {
        this.Fathername = fathername;
    }

    public void setBirthday(int yyyy, int mm, int dd) {
        if (this.Limityyyy < yyyy) this.Birthday = new java.util.Date(yyyy,mm,dd);
    }

    public void setFirstDate(Date firstDate) {
        this.FirstDate = firstDate;
    }

    public void setUniversity(String u) {
        this.University = u;
    }

    public String getSurname() {
        return this.Surname;
    }

    public String getName() {
        return this.Name;
    }

    public String getFathername() {
        return this.Fathername;
    }

    public java.util.Date getBirthday() {
        return this.Birthday;
    }

    public  java.util.Date getFirstDate() {
        return this.FirstDate;
    }

    public String getUniversity() {
        return this.University;
    }
}
