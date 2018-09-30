package com.abhay.practice.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {

    public static void main(String args[]){

        System.out.println("Java 6 Implementation --> ");

        //java 6 anonymous class
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };


        List<String> list = Arrays.asList("Abhay", "Abhishek", "Amit", "RK");

        list.sort(comparator);

        for(String s1 : list){
            System.out.println(s1);
        }

        System.out.println(" ");

        System.out.println("Java 8 Implementation --> ");

        //java 8 Lambda expression
        Comparator<String> comparatorLambda = (String s1, String s2) -> s1.length() - s2.length();

        list.sort(comparatorLambda);

        for(String s1 : list){
            System.out.println(s1);
        }


    }

}
