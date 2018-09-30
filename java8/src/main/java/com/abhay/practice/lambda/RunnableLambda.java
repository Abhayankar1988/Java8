package com.abhay.practice.lambda;

public class RunnableLambda {

    public static void main(String args[]) throws InterruptedException {

        System.out.println("Java 6 Implementation --> ");

        //java 6 anonymous class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5; i++){
                    System.out.println("Hello world from Thread : " +
                            Thread.currentThread().getName());
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        thread.join();

        System.out.println("Java 8 Implementation --> ");

        //java 8 Lambda expression
        Runnable runnableLambda = () -> {
            for(int i=0;i<5; i++){
                System.out.println("Hello world from Lambda Thread : " +
                        Thread.currentThread().getName());
            }
        };

        Thread threadLambda = new Thread(runnableLambda);
        threadLambda.start();
        threadLambda.join();






    }
}
