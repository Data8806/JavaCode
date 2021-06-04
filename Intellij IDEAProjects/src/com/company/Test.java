package com.company;

import java.util.Date;

/**
 *统一的测试方法
 * @author Data
 */
public class Test {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String a = input.next().toUpperCase();
//      ClassThirteen student = new ClassThirteen("sdaw","1234",10);
//        ClassFourteen.combine();  //调用静态方法
//        ClassFourteen s1 = new ClassFourteen();
//        s1.setName("张三");
//        s1.setAge(20);
//        System.out.println(s1.getName());


//        SmallStudent s1 = new SmallStudent();
//        MediumStudent s2 = new MediumStudent();
//        Test.testEat(s1);     //多态

//        ClassEighteen myGirl1 = new ClassEighteen("林黛玉",18,"温和");
//        myGirl1.takeSeat();
//        myGirl1.getInfo();
////        String name = myGirl1.getName();
//        System.out.println(myGirl1.getName());
//        ClassEighteen myGirl2 = new ClassEighteen();
//        myGirl2.setName("薛宝钗");
//        myGirl2.setAge(19);
//        myGirl2.setCharacter("泼辣");
//        myGirl2.takeSeat();
//        myGirl2.getInfo()
//        Account myBank = new Account("12345678","小明");
//        myBank.saveMoney(100);
//        myBank.withdrawMoney(80);
//        myBank.getInfo();
//        }
//    public static void testEat(ClassFifteen student){
//        student.eat();  
//    }
//}
//        Rational r1 = new Rational(-1);
//        Rational r2 = new Rational(1,2);
//        Rational r3 = new Rational(1,2);
//        Rational r4 = new Rational(1,2);
//        System.out.println(Rational.rationalCount());
//        // 加法
//        System.out.println(r1.add(r2,r3).getRational());
//        // 减法
//        System.out.println(r1.sub(r2,r3).getRational());
//        // 乘法
//        System.out.println(r1.mul(r2,r3).getRational());
//        // 除法
//        System.out.println(r1.div(r2,r3).getRational());


//        Student s = new Student("张三",true,18,"大数据");
//        Person p = new Person("李四",true,40);
//        Teacher t = new Teacher("王五",true,30);
//        // instanceof 判断 两边的类型是否相同，相同返回true，否则返回false
//        if (s instanceof Person){}
//
//        s.work();
//        t.work();


        // 多态
//        Person [] ps = new Person[3];
//        ps[0] = new Person();
//        ps[1] = new Teacher("张三",true,28);
//        ps[2] = new Student("李四",true,18,"大数据");
//
//        for(Person i:ps){
//            i.work();
//            System.out.println(i.getClass());
//        }
//        int n = 12;
//        int age = 10;
//        Recursion R = new Recursion();
//        System.out.println(R.add_age(n,age));

//        Rational r1 = new Rational(1,2);
//        Rational r2 = new Rational(2,4);
//        Rational r3 = new Rational(1,2);
//        Rational r4 = new Rational(2);
//        System.out.println(r1.equals(r1));
//        System.out.println(r1.equals(r2));
//        System.out.println(r1.equals(r3));
//        System.out.println(r1.equals(r4));
//        System.out.println(r1);
//        System.out.println(r4);
//        Person teacher = new Teacher("老王",true,30);
//        Person student = new Student("张三",true,18,"大数据");
//        teacher.eat("温柔");
//        student.eat("豪放");
////        teacher.teacherCourse("隔壁家嗨嗨嗨");   报错，父类没有该接口
//        Teacher tea = new Teacher("老李",true,32);
//        Student student1 = new Student("王四",true,18,"大数据");
//        student1.goClass("基础编程",teacher);

//        String str = input.next().toUpperCase();
//        Season cSeason = Season.valueOf(str);   // 将字符串转换为枚举类型
//        System.out.println(cSeason.ordinal());
//        switch(cSeason){
//            case AUTUMN:
//                System.out.println("秋天");
//                break;
//            case SPRING:
//                System.out.println("春天");
//                break;
//            case WINTER:
//                System.out.println("冬天");
//                break;
//            case SUMMER:
//                System.out.println("夏天");
//                break;
//            default:
//                System.out.println("没有该季节");
//        }
//
//        for(Season i:Season.values()){
//            System.out.println(i+"索引号"+i.ordinal());
//        }


//        System.out.print("input left:");
//        int left = input.nextInt();
//        System.out.print("input right:");
//        int right = input.nextInt();
//        System.out.print("Please choose +-*/ :");
//        String op = input.next().trim();
//        int result=0;
//        Operator oper = new Operator();
//        System.out.println(oper.add(8,15));
//        Operator addOperator = new AddOperator();
//        addOperator.setLeft(left);
//        addOperator.setRight(right);
//        System.out.println(addOperator.cal());

        // concat 拼接方法

//        String a = "你好世界";
//        System.out.println(a.concat(a));
//        System.out.println(a);

//        int [] a = new int[5];
//        for(int i:a){
//            System.out.println(i);
//        }

//        for (int i = 0; i < 5; i++) {
//            for (int j=5;j>i;j--){
//                System.out.print(" ");
//            }
//            for(int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 0;i<5;i++){
//
//        }
//        int a = 4;
//        int b = a>>>1;
//        System.out.println(b);
//        int [] a = new int[]{1,2,3,4};
//        int b = 3;
//        for(int i :a){
//            System.out.println(i);
//        }
//        System.out.println(a[-1]);
        Date date = new Date();
        System.out.println(date);
    }
}

