package com.pa;

public class Lab0Main {

    public static void main(String[] args) {
        Person p = new Person(1,"paulo");
        Person p2 = new Person(2,"maria");

        System.out.println(p.toString());
        p.setId(3);
        p.setName("manuel");
        System.out.println(p.getId());
        System.out.println(p.getName());
        System.out.println(p.toString());
    }





}
