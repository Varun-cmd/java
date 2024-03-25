package org.example.restapi;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


public class course {
    private int sNo;
    private String courseName;
    private String partner;

    public course(int sNo, String courseName, String partner) {
        this.sNo = sNo;
        this.courseName = courseName;
        this.partner = partner;
    }

    public int getsNo() {
        return sNo;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getPartner() {
        return partner;
    }

    @Override
    public String toString() {
        return "course{" +
                "sNo=" + sNo +
                ", courseName='" + courseName + '\'' +
                ", partner='" + partner + '\'' +
                '}';
    }


}
