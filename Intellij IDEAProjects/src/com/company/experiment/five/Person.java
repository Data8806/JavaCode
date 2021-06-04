package com.company.experiment.five;

public abstract class Person {
    private String name;
    private boolean sex;
    private int age;

    // 如果要当父类，建议保留无参构造方法
    public Person() {
    }

    public Person(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    //  普通方法
    public void work() {
        System.out.println("工作");
    }

    // 抽象方法
    public abstract void eat(String style);

    public String getName(){
        return this.name;
    }

}
