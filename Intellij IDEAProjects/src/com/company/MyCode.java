package com.company;

//import com.company.TClassroom.ClassEleven;

public class MyCode {
    public static void main(String[]args){
    }
}

class HelloWorld{
//    public static void main(String[] args){
//        ClassEleven xiaozhang = new ClassEleven();
//        System.out.println(xiaozhang.maiFanFan(20));
//        int [][] a = new int[1][0];
//        System.out.println(a);
//        System.out.println(a[0]);
//        System.out.println(a[1]);
//        System.out.println(a[2]);
//        System.out.println("Hello Java");
        // 单行注释://  多行注释：/*.....*/  文档注释 /**.....*/

}

class HelloArgs{
    public static void main(String[] args){
//        if(args.length>0){
//            System.out.println("hello"+args[0]);
//        }
//        byte a = 127;
//        System.out.println();
        // 整数类型都有MIN_VALUE和MAX_VALUE属性
//        System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
//        long a = 3;
//        System.out.println(Float.MAX_VALUE+"~"+Float.MIN_VALUE);
//        char a = '中';
//        char b = '国';
//        System.out.print(a);
//        System.out.print(b);
//        final   //声明为只读变量
//        int a = 10;
//        int b = 10;

        int m = Math.abs(7);
        int n = Math.abs(5);
        while(n>0) {
            int rem = m % n;
            m = n;
            n = rem;
        }
        System.out.println(m);
    }
}

class Recursion{
    /**
     * 递归类:用递归解决问题
     * add_age 解决第一个年龄为10，后一个人的年龄比前面一个人的年龄大两岁
     */

    public Recursion(){}

    public int add_age(int n,int age){
        if(n == 1){
            return age;
        }
        age+=2;
        n--;
        return add_age(n,age);
    }
}

