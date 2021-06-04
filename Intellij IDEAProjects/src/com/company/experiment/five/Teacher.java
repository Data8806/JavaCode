package com.company.experiment.five;

public class Teacher extends Person implements TCourse {
    public Teacher(String name,boolean sex,int age) {
        super(name, sex, age);
    }
    @Override
    // 重写标志
    public void work(){
        System.out.println("讲课");
    }

    @Override
    public void eat(String style) {
        System.out.println(this.getName()+"的吃饭风格是"+style);
    }

    @Override
    public void teacherCourse(String course) {
        System.out.println(this.getName()+"上"+course);
    }

}
