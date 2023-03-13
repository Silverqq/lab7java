package com.company;

public class Math {
    int a, b, x;
    Math(int a, int b, int x){
        this.a = a;
        this.b = b;
        this.x = x;
    }
    public static int getFact(int f){
        int res = 1;
        for(int i = 1; i <= f; i++){
            res = res * i;
        }
        return res;
    }
    public int Math1(){
        return 3*x + 5;
    }
    public double Math2(){
        if(a-b == 0){
            return -1.0;
        }
        return (double)(a+b)/(a-b);
    }
    public void Math3(){
        if(b==0){
            System.out.println("Ошибка деления на 0");
            return;
        }
        double temp = (double) (a*x)/b;
        if(temp%1==0){
            System.out.println(getFact((int)temp));
            return;
        }
        System.out.println("Факториал невозможен");
    }
}
