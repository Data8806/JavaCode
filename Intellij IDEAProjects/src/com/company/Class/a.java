package com.company.Class;

public class a {
    private int n = 1;
    public  int add(int b,int c) {
        return n+1;
    }
}

class Base{
    public void method(){
        System.out.print("Hello");
    }
}

class Child extends Base{
    public void methodB(){
        System.out.println("World");
    }
}
