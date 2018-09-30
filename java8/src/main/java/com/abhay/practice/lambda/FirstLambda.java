package com.abhay.practice.lambda;

import java.io.File;
import java.io.FileFilter;

public class FirstLambda {


    public static void main(String args[]){

        //java 6 anonymous class
        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java");
            }
        };

        //Java 8 Lambda expression
        FileFilter fileFilterLambda = (File pathname) -> pathname.getName().endsWith(".java");

        File dir = new File("c:/test");
        File[] files = dir.listFiles(fileFilter);

        System.out.println("Java 6 Implementation --> ");
        for (File file : files){
            System.out.println(file);
        }

        files = dir.listFiles(fileFilterLambda);

        System.out.println("Java 8 Implementation --> ");
        for (File file : files){
            System.out.println(file);
        }


    }



}
