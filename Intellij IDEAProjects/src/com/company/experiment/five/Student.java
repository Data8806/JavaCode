package com.company.experiment.five;

public class Student extends Person implements TClassroom{
    private String major;

    public Student(String name,boolean sex,int age,String major){
        // 创建子类时，必须先创建父类
        super(name,sex,age);
        this.major = major;
    }

    @Override
    public void work(){
        System.out.println("学习");
    }

    @Override
    public void eat(String style){ System.out.println(this.getName()+"吃饭风格"+style); }

    @Override
    public void goClass(String no,Person p){
        System.out.println(this.getName()+"去上"+p.getName()+"的"+no);
    }
}
