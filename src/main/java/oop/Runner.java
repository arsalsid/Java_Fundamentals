package oop;

import java.util.SortedMap;

public class Runner  {

    public static void main(String[] args) {

        Employee Arsalan = new Employee();
        Arsalan.markAttendance();
        Arsalan.setName ("kiran");
        Arsalan.setDesignation("SQA");
        Arsalan.setEmpId("061");

        System.out.println(Arsalan.getName());
        System.out.println(Arsalan.getDesignation());
        System.out.println(Arsalan.getEmpId());

        Employee Sami = new Employee();
        Sami.markAttendance();
        Sami.setName("Samiullah");
        Sami.setDesignation("SDET");
        Sami.setEmpId("062");

        System.out.println(Sami.getName());
        System.out.println(Sami.getDesignation());
        System.out.println(Sami.getEmpId());

    }
}
