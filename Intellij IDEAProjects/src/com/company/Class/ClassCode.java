package com.company.Class;

import java.util.Scanner;
public class ClassCode {
    public static void main(String[] args) {
//    int a = 0;
//    int b = 10;
//    int [] c = {1,2,3};
//    int c = a << 2;
//    int c = a >> 1;
//    int c = a ++ + ++b - --a - b--;
//    if (a>b){ int c = a-b;System.out.println(c);}
//    else {int c = b-a;System.out.println(c);}
//    System.out.println(c);
//    System.out.println(a);
//    System.out.println(b);
    // write your code here
//    while(a<b){a++;System.out.println(a);}

//    System.out.println(c);
//        int m = 5;
//        int n = 8;
//        int p = 10;
//        int temp = ((m++ +n)>>(--p))^m;   // 优先级   ((m ++ +n)>>(--p))^m
//        int result = (m +++ --n) << temp;
//        System.out.println(temp);
//        System.out.println(result);
//        // 整数间的转换
//        int a = 30;
//        byte b = (byte)a;    //大转小，强制转换
//        byte c =30;
//        int d = c;   // 小转大，直接转
//        // 浮点型之间的转换,同上
//        float e = 3.14f;
//        double f = e;
//
//        double i = 3.14;
//        float j = (float)i;
//
//        //整型与浮点之间转换,比的不是字符串大小，比的是的精度，所有的整型转浮点型，自动转，而浮点型转整型，强制转
//        int g = 10;
//        double h = g;
//        float a = 3.75f;
//        float b = 2.9f;
//        int c = (int)a;
//        int d = (int)b;
//        System.out.println(c);
//        System.out.println(d);
//        int a = 4;
//        float b = a;
//        double c = a;
//        System.out.println(b);
//        System.out.println(c);
//        float a = 3.14f;
//        short b = (byte) a;
//        System.out.println(b);
//        boolean a = false;
//        boolean b = !a;
//        System.out.println(b);
//        int a = 4;
//        int b = 5;
//        int c = ~a;
//        System.out.println(c);
//        while (){System.out.println(1);}
        //整型与字符型之间的转换,整型转字符按ASCll码，强制转
        // 常量赋值不需要转换，float类型赋值，需要标识
//        char q = 97;
//        int w = (char)q;
//        System.out.println(w);
        // 字符型转整型，自动转
//        char a = 'a';
//        int b = a;
//        System.out.println(b);'
//        char a = 'a';
//        byte b =(byte) a;
//        System.out.println(b);
    }
}


// 第六节课

class ClassSix {
    public static void main(String[] args) {
        // 判断语句
        // else if 可以有很多，但最后需要else结束
//        int a = 1;
//        int b = 3;
//        if (a>b){
//            System.out.println("a比b大");
//        }else if(a==b) {
//            System.out.println("a 等于 b");
//        }else{
//                System.out.println("a 比 b小");
//        }
        // 练习，判断分数等级，大于等于90为优秀
//
//        int score = 0;
//
//        if (score >= 90){
//            System.out.println("优秀");
//        }else if(score >= 80) {
//            System.out.println("良好");
//        }else if (score >= 70){
//            System.out.println("中等");
//        }else if (score >= 60){
//            System.out.println("及格");
//        }else {
//            System.out.println("不及格");
//        }


        // 分支语句: switch...cose...具有穿透性：执行了一个，剩下的都要执行
        // 关键字  break default
//        int ticket = 10;
//        switch (ticket){
//            case 1:
//                System.out.println("a");
//            case 2:
//                System.out.println("b");
//            case 3:
//                System.out.println("c");
//            case 4:
//                System.out.println("d");
////                break;
//            case 5:
//                System.out.println("e");
//            case 6:
//                System.out.println("g");
//            case 7:
//                System.out.println("h");
//            default:
//                System.out.println("i");
//        }
        // 练习 判断季节 char season = 夏天
//        String season = "春天";
//
//        switch (season){
//            case"春天":
//                System.out.println("这就是春天");
//                break;
//            case"夏天":
//                System.out.println("这就是夏天");
//                break;
//            case"秋天":
//                System.out.println("这就是秋天");
//                break;
//            case "冬天":
//                System.out.println("这就是冬天");
//                break;
//
//            default:
//                System.out.println("没有这个季节");
//        }
    }
}

// 第七节课

class ClassSeven{
    public static void main(String[] args){
        // 循环   while() {}     do{}while()    for(初始化，循环次数，计数){}
//        for (int i = 0; i<=5;i++) {
//            System.out.println(i);
//        }
         //练习打印*
//        for (int i =1; i<=100;i++){
//            System.out.println();
//            for (int j=1;j<=100;j++){
//                System.out.print("*");
//            }
//        }
//        for (int i=1;i<=5;i++){
//            for (int j =1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        // 打印 *
//        for (int i =1;i<=4;i++){
//            for(int j =1;j<=4-i;j++) {
//                System.out.print(" ");
//            }
//            for (int g =1;g<=2*i-1;g++){
//                    System.out.print("*");
//                }
//            System.out.println();
//        }
         //打印九九乘法表
//        for (int i = 1;i<=9;i++){
//            for (int j =1;j<=i;j++){
//                System.out.print(j+"*"+i+"=="+i*j+" ");
//            }System.out.println();
//        }
        // 打印杨辉三角

    }
}




// 第八节课

class ClassEight{
    public static void main(String[] args) {
//        int i = 0;
//        while(i != 15){
//            i += 1;
//            if (i == 10){
//                continue;
//            }System.out.println(i);
//        }
//        for(int i=1;i<=100;i++){
//            if (i<=10){
//                System.out.println(i);
//            }else {
//                break; //跳出最近的循环
//            }
//        }
//        int i = 1;
//        for (;i<=8;i++){
//            for (int j=1;j<=3;j++) {
//                if (i >= 5 || j >= 2) {
//                    continue;
//                }
//                System.out.println("输出" + ++i);
//            }
//        }
//        System.out.println("i的值"+ i);
//        int i = 1;
//        for(;i<=4;i++){
//            for(int j =1;j<=4;j++){
//                if (i == 2 ||j==3){
//                    System.out.println("输出");
//                    continue;
//                }else if (i==4) {
//                    System.out.println("shuchu"); //
//                    break;
//                }
//            }
//        }
//        int i = 0;
//        int j = 10;
//        int k = 0;
//        while (i <= 10){
//            switch (i){
//                case 1:
//                    System.out.println(i);
//                    break;
//                case 2:
//                    System.out.println(i);
//                    break;
//                case 3:
//                    System.out.println(i);
//            }
//            if(i == j){
//                break;
//            }
//            k+=1;
//            i+=1;
//            j-=1;
//        }
//        System.out.println("循环结束，循环次数为："+k);

    }
}
// 第九节课

class ClassNine{
    public static void main(String[] args){
        // 数组,存储大量相同类型的数据

//        char[]a ={'1','2','3'};
//        int [] a = {1,2,3};
//        for (int i=0; i < a.length;i++){
//            System.out.println(a[i]);
//            System.out.println(i);
//        }
        // 数据的定义,一旦定义，就不允许修改
//        short[] number = new short[80]; // 动态初始化，在内存中开辟一个存80个short类型数据的连续空间
//        short[] number1 = new short[]{1,2,3,4,5,6,7,8,9};  // 静态初始化


        // 数组的访问
        // 数组具有索引，从0开始，没有负索引,可以使用其他变量来接受，但是要注意数据类型的关系
//        for(int i=0; i< number1.length; i++){
//            System.out.println(number1[i]);
//        }
        // 例子
//        int a = 1;
//        int b = a;
//        a = 10;
//        System.out.println(a);
//        System.out.println(b);
//        int [] a = new int[]{1,2,3};
//        int []b = a;
//        b[2] = 5;

//        // 练习  拼接 数据 a、b
//        int [] a = new int[]{1,2,3,4};
//        int [] b = new int[]{5,6,7};
//        int len = a.length + b.length;
//        int [] c = new int[len];
//        for(int j=0; j<len; j++){
//            if(j< a.length){
//                c[j] = a[j];
////                System.out.println(a[j]);
//            }
//            else{
//                c[j] = b[j- a.length];
////                System.out.println(j);
//            }
//        }
//        for (int d= 0;d< c.length;d++){
//            System.out.println(c[d]);
//        }
//        int []a = new int[]{1,2,3,4,5};
//        int []b = new int[]{6,7,8,9,10};
//        int []c = a;
//        a = b;
//        b =c;
//        for(int i =0; i<b.length;i++){
//            System.out.print(b[i]+" ");
//        }
//        int [] a = new int[]{1,2,3};
//        System.out.println(a[2]);
    }
}
// 第十节课

class ClassTen {
    public static void main(String[] args) {
//        int m = 1;
//        int n = 2;
//        m = n++ * m;
//        System.out.println(m);
//        System.out.println(3);
        // 练习  升序 冒泡排序
//        int [] a = new int[]{12,14,1,6,47,58};
//        for(int i=1;i<a.length;i++){
//            for(int j=0;j<a.length-i;j++){
//                // 通过索引交换位置，从0开始
//                int temp =a[j];
//                if (temp>a[j+1]){
//                    a[j] = a[j+1];
//                    a[j+1] = temp;
//                }
//            }
//        }
//        for (int m =0;m< a.length;m++){
//            System.out.println(a[m]);
//        }
        // 增强for循环,目标不能为空
//        int [] a = new int[]{};
//        for (int i:a){
//            System.out.println(i);
//        }


//         二维数组
//        int [][]a = {{1,2},{3,4,5},{6,7,8,9}};  // 静态初始化定义
//        double [][] bbb =new double[3][2]; //动态初始化
////         其中 3 2 含义：包含了三个一维数组，每个数组含两个元素
////         二位数组迭代:

//        for(int []i:a){   // 增强for循环迭代二维数组
//            for(int j:i){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//        for(int i=0;i<a.length;i++){
//            for (int j=0;j<a[i].length;j++){
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//         除了基本数据类型，其他都为引用型
//        String b ="abc";
//        String c = new String("abc");

//        System.out.println(b==c);
//         String 是个类，里面有个方法叫equals
//        System.out.println(b.equals(c));


//            System.out.println(a[i]);
//        }
//        int [][]a = new int[3][];
//        System.out.println(a[0]);
//        System.out.println(a[1]);
//        System.out.println(a[2]);
//        System.out.println("....................");
//        a[0] = new int[]{1,2,3};
//        a[1] = new int[2];
//        a[2] = new int[3];
//        System.out.println(a[0][0]);
//        System.out.println(a[1][1]);
//        System.out.println(a[2][2]);

    }
}
// 第十一节课


class ClassEleven {
    /** 面向对象
    属性： 姓名、学号
    方法：吃饭等
*/
    /**属性
    属性组成 访问权限修饰符 + 特征修饰符 + 类型 + 属性名
     访问权限：（public公共、protected用于继承、private私有）
    特征修饰符 static静态、 final只读（同步的）
     */

    String name;
    String id;
    String sex;
    byte age;

    /** 方法
    构成 ：访问权限修饰符 + 特征修饰符 +返回值（没有返回值：void）+方法名+参数
     访问权限：（public公共、protected用于继承、private私有）
     特征修饰符 static静态、 final只读（同步的）
     参数：执行方法所需先决条件
     返回值：执行完一个方法后，返回一个结果
     方法名命名：第一单词字母小写，其他单词字母大写
 */
    public static void main(String[]args){
        // 创建对象
        ClassEleven hangman = new ClassEleven();
        // 使用方法
//        String result = hangman.maiFanFan(10);
        System.out.println(hangman.maiFanFan(10));
    }
    public String maiFanFan(float money){
        if (money < 10){
            System.out.println("炒面");

        }else if (money < 20){
            System.out.println("汉堡");
        }else{
            System.out.println("有钱");
        }
     String yuju = "买好了";
        return yuju;
    }
}
// 第十二节课
class ClassTwelve {
    public static void main(String[] args){
        ClassTwelve a = new ClassTwelve();
//        int [] c = new int[]{1,2,3,4};
//        int [] d = new int[]{5,6,7,8};
//        int [] result = a.arrayMultiplication(c,d);
//        for (int[]i:result){
//            for(int j :i){
//                System.out.print(j);
//            }System.out.println();
//        }
//        for(int i:result){
//            System.out.print(i);
//        }
//        int[][]x = new int[][]{{1,2,3},{4,5,6,7},{9,10,11,12,13,14},{15,16,17,18,19,20}};
//        int []result = a.splitArray(x);
//        for(int i:result){
//            System.out.print(i+" ");
        }
//        int[] b = new int[]{1,2,3,4,5};
//        int[] c = new int[]{5,6,7,8,9};
//        int [] result = a.arrayMultiplication(b,c);
//        if(result.length!=0){
//            for (int i:result){
//                System.out.print(i + " ");
//            }
//        }

//    }
    public int[] exchange(int x,int y) {  // 交换两值
        int temp = x;
        x = y;
        y =temp;
        int [] result = new int[]{x,y};
        return result;
    }

    public int[] splicing(int[] x,int[] y){   // 拼接数组
        int [] result = new int[x.length+y.length];
        for(int i = 0;i<x.length+y.length;i++){
            if (i<x.length){
                result[i] = x[i];
            }else{
                result[i] = y[i-x.length];
            }
        }
        return result;
    }

    public int[][] enhancedSplicing(int[]x,int[]y){  //拼接成二维数组
        int [] [] result = new int[][]{x,y};
//        result[0] = x;
//        result [1] = y;
        return result;
    }
    public int[] arrayMultiplication(int[] x,int[]y){
        if(x.length!=y.length){
            String chr = "数组位数不同";
            System.out.println(chr);
            int []result = new int[]{};
            return result;
        }else {
            int [] result = new int[x.length];
            for (int i= 0;i<x.length;i++){
                result[i] =x[i] *y[i];
            }
            return result;
        }
    }

    public int[] splitArray(int[][]x){// 分二维数组为一维数组
        int len = 0;
        int k = 0;
        for(int[]i:x){
            len += i.length;
        }
        int [] result = new int[len];
        for(int []i:x){
            for(int j:i){
                result[k] = j;
                k++;
            }
        }
        return result;
    }
}
// 第十三节课

class ClassThirteen{
    /**
     * 构造方法
     * 访问权限 public共有（同一个类、同一个包、不同包）
     * protected私有（同一个包、同一个类）
     * 默认不写（同一个包、同一个类）
     * private 同一个类

     *特征
     * 返回值 对象
     * 方法名 类名
     * 参数
     * java底层默认提供一个无参数的构造方法，可以重新为有参数的，如果还想用无参数的，那么必须显示给出
     * 方法重载
     */
    private String name;
    String number;
    int age;
    public ClassThirteen(){}  // 显示给出
    public ClassThirteen(String name,String number,int age){
        name = name;
        number = number;
        age = age;
    }

    // 方法重载，方法名是一样的，参数不一样（类型、个数、顺序）


    //
}

// 第 十四节课
// 关键字： this
// 关键字：supper父类
// 关键字：static(静态不需要创建对象即可调用)可以修饰类属性、方法,不能修饰构造方法
// 当static修饰属性时相当于python中的类属性.
// 当 static修饰方法时为静态方法.直接类名.静态方法名（）调用
// 普通方法可以调用静态方法，反之则不行.

class ClassFourteen{
    private String name;
    int age;
    public ClassFourteen(){}; // 重现
    public ClassFourteen(String name,String number,int age){
        // this 区别形式参数与同名属性的冲突.
        // this 指代的是调用方法的那个对象
        // this 相当于python中的self
        // this()相当于构造方法
        // 构造方法可以调普通方法，反之不行.但是构造方法间不能互相调用
        this();
        this.name = name;
        this.age = age;
    }
    public static void combine(){ //静态方法
    }

    // set 相当于python类的写方法
    // get 相当于python类的读方法

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
}

//第十五节课
/**
 * 继承：子类拥有父类的所以东西，也可以自己定义新的东西
 一个类可以被多个类继承，但是只能继承一个类.
 *关键字 extends 实现继承
 *关键字 supper
 * 方法重写：必须要有继承关系
 *
 *
 * 多态

 */

class ClassFifteen{
   private String name;
   private int age;

   public ClassFifteen(){};
   public ClassFifteen(String name,int age){
       this.name = name;
       this.age = age;
   }
   public void study(){
       System.out.println(this.name+"爱学习");
   }
   public void eat(){
       System.out.println("我是学生，我爱吃饭");
   }
}
class SmallStudent extends ClassFifteen{
    @Override
    public void eat(){
        System.out.println("我是小学生，我爱吃饭");
    }

}

class MediumStudent extends ClassFifteen{
    @Override
    public void eat(){
        System.out.println("我是中学生，我爱吃饭");
    }
}




class ClassSixteen{
    public static void main(String[] args) {
        int x = 2;
//        int y = x+30%7;
//        System.out.println(y);

        Scanner input = new Scanner(System.in);
        // 定义scanner，等待输入
//        int year = in.nextInt();
//        String result = year%4 == 0 && year%100!=0 ||year%400==0 ?"是":"不是";
//        System.out.println(year+" "+result+"闰年");

        // 分离三位数

//        double ran = Math.random();  //产生0到1的随机数
//        int number = (int) (ran*1000);
//        System.out.println(ran);
//        System.out.println(number);
//        System.out.println(a);
//        int number = in.nextInt();
//        int a= number/100;
//        int b = number/10%10;
//        int c = number%10;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);

        // 小写转大写，大写转小写
//        char c1 = in.next().charAt(0);
//        if(c1>=97){
//            char c2 = (char)(c1-32);
//            System.out.println(c2);
//        }
//        else{
//            char c2 = (char)(c1+32);
//            System.out.println(c2);
//        }
//        char a = 70;
//        int c = (int) 'a';

        //输入两个整数x、y及运算符,输出他们的和差积商，要求保留小数结果

//        int a = input.nextInt();
//        int b = input.nextInt();
//        char operator = input.next().charAt(0);
//        if (operator == '*' ){
//            System.out.println(a*b);
//        }
//        else if(operator =='/'){
//            System.out.println(a/b);
//        }
//        else if (operator =='+'){
//            System.out.println(a+b);
//        }
//        else if (operator == '-'){
//            System.out.println(a-b);
//        }
//        else {System.out.println("输入错误");
//        }
//        switch (operator){
//            case '*':
//                System.out.println(a*b);
//                break;
//            case'/':
//                System.out.println(a/b);
//                break;
//            case '+':
//                System.out.println(a+b);
//                break;
//            case'-':
//                System.out.println(a-b);
//                break;
//            default:
//                System.out.println("输入错误");
//        }

        int[] num = new int[3];
        for (int i = 0; i < 3; i++) {
//            System.out.println(i);
            num[i] = input.nextInt();
        }

//        }
//        int i = 0;
//        while (i < num.length) {
//            num[i] = input.nextInt();
//            i++;
//        }
        for (int j : num) {
            System.out.print(j + " ");
//        }
        }
    }
}

class ClassSeventeen{
    /**
     * 解决约瑟夫问题
     */
    private static int[] kids;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        init();
        solve();
        findWinner();
    }

    private static void findWinner() {
        for(int j:kids){
            if(j!=0){
                System.out.println(j);
                break;
            }
        }

    }

    private static void solve() {
        int n = kids.length;
        int r= n;  // 剩余人数
        int index = -1;
        int count = 0;
        while(r>1 ){
            index = (index+1)% n;  //第二圈可能会出现越界问题
            if(kids[index] ==0 ){  //解决死亡，还在报数问题
                continue;
            }
            count++;
            if (count ==3){
                kids[index] = 0;  //杀死
                count = 0; // 报数归零
                r--;  // 人数减一
            }
        }
    }

    public static void init(){
        kids = new int[17];
        for(int i =0;i< kids.length;i++){
            kids[i] = i+1;  // 编号
        }
    }
}

class ClassEighteen{
    /**
     * 面向对象
     *类：封装数据和行为数据类型
     * 数据：姓名、年龄、性别
     * 行为：占座位
     */

    // 属性（成员变量、实例变量）
            // private 私有

    private String name;
    private int age;
    private String height;
    private String weight;
    private String character;

    public static void main(String[] args) {
        // 实例化
        // 申请堆内存、调用构造方法初始化成员变量 返回堆地址（对象引用）
        ClassEighteen myGirl = new ClassEighteen("林黛玉",18,"温和");
        myGirl.takeSeat();
        myGirl.getInfo();

    }

    /**
     * 构造方法：作用初始化成员变量
     * 构造方法有两种，分为有参数和没有参数
     */
    public ClassEighteen(){

    }

    public ClassEighteen(String name,int age,String character){
        this.name = name;
        // this 当前对象
        this.age = age;
        this.character = character;
    }
    public void takeSeat(){
        System.out.println(this.name+"帮忙占座位");
    }
    public void getInfo(){
        System.out.println("姓名："+name+" 年龄："+age+" 性格："+character);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name.charAt(0)+"女士";
    }

    public void setAge(int age){
        this.age = age;
    }
    public void setCharacter(String character){
        this.character = character;
    }
}

// 第十九节课

class Account{
    /**
     * 银行账户类
     * 属性：账号id，用户 owner 余额remains
     * 方法：显示账号信息，存钱，取钱
     * 访问器
     */
    private String id;
    private String owner;
    private int remains;
    public Account(){};
    public Account(String id,String owner){
        this.id = id;
        this.owner = owner;
    }
    public void saveMoney(int money){
        this.remains +=money;
        System.out.println("存钱成功，你的余额为："+this.remains);
    }
    public void withdrawMoney(int money){
        if (money <= this.remains){
            this.remains-=money;
            System.out.println("取钱成功,剩余余额："+this.remains);
        } else{
            System.out.println("余额不足，取钱失败");
        }
    }
    public void getInfo(){
        System.out.println("户主:"+this.getOwner()+" 卡号："+this.getId()+" 余额："+this.getRemains());
    }

    public String getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }
    public int getRemains() {
        return remains;
    }
}

//class Test{
//    public static void main(String[] args) {
//        Account myBank = new Account("12345678","小明");
//        myBank.saveMoney(100);
//        myBank.withdrawMoney(120);
//        myBank.getInfo();
//    }
//}

// 第二十节课

class Rational{
    /**
     * 有理数类
     * 成员变量：分子 numerator，分母Denominator
     * 构造方法：初始化成员变量
     * get\set 访问器
     */
    private int numerator;
    private int denominator;
    private static int count;

    static{  // 静态初始化块
        count = 0;
    }

    public Rational(int numerator,int denominator){
        this.setNumerator(numerator);
        this.setDenominator(denominator);
        this.simplification();
        count++;
    }
    public Rational(int numerator){  //重载构造方法
        //在类里面调用构造方法
        this(numerator,1);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if(denominator!=0) {
            this.denominator = denominator;
        }
        else{
            System.out.println("输入错误，分母不能为零");
        }
    }

    @Override
    public String toString(){  //返回有理数形式
        if (this.denominator ==1){
            // 处理分母为1的有理数
            return String.valueOf(this.numerator);
            // valueOf 将传入的单个值变为字符串.
        }
        else {
            return String.format("%d/%d",this.numerator,this.denominator);
        }
    }

    private void simplification(){  //化简方法
        int m = Math.abs(this.numerator);
        int n = Math.abs(this.denominator);
        while(n>0){
            int rem = m%n;
            m = n;
            n = rem;
        }
        this.setNumerator(this.numerator/m);
        this.setDenominator(this.denominator/m);
        if (this.denominator<0){
            this.numerator*=-1;
            this.denominator*=-1;
        }
    }
    public Rational add(Rational right){  // 加法
        int x =this.numerator*right.denominator+this.denominator*right.numerator;
        int y =this.denominator*right.denominator;
        return new Rational(x,y);
    }
    public Rational add(Rational right,Rational...args){  // Rational...args 可变参数  增强加法
        Rational sum = this.add(right);
        for (Rational arg : args){
            sum=sum.add(arg);
        }
        return sum;
    }

    public Rational sub(Rational right){ // 减法
//        int x = this.numerator*right.denominator-this.denominator*right.numerator;
//        int y = this.denominator*right.denominator;
//        return new Rational(x,y);
        Rational y = new Rational(-right.numerator,right.denominator);
        return this.add(y);
    }


    public Rational sub(Rational right,Rational...args){
        Rational dif = this.sub(right);
        for (Rational arg : args) {
            dif = dif.sub(arg);
        }
        return dif;
    }
    public Rational mul(Rational right){ //乘法
        int x = this.numerator*right.numerator;
        int y = this.denominator*right.denominator;
        return new Rational(x,y);
    }
    public Rational mul(Rational right,Rational...args){
        Rational pro = this.mul(right);
        for(Rational arg:args){
            pro = pro.mul(arg);
        }
        return pro;
    }
    public Rational div(Rational right){ //除法
//        int x = this.numerator*right.denominator;
//        int y = this.denominator*right.numerator;
        Rational n =  new Rational(right.denominator,right.numerator);
        return this.mul(n);
    }
    public Rational div(Rational right,Rational...args){
        Rational quo = this.div(right);
        for(Rational arg:args){
            quo = quo.div(arg);
        }
        return quo;
    }

    // 统计创建的有理数个数

    public static int rationalCount(){
        return count;
    }

    @Override
    public boolean equals(Object obj){
        // 判断类型是否相同
        if (this.getClass()!=obj.getClass()){
            return false;
        }
        // 判断对象是否为空
        if(obj == null){
            return false;
        }
        // 引用相同，同一对象
        if (this==obj){
            return true;
        }

        Rational other = (Rational) obj;
        Rational result = this.sub(other);
        return result.numerator ==0;
    }
}

/*

第二十五节课

static 可以将对象方法修饰为类方法，
static 可以将对象成员变量变成修饰为静类成员变量

static{  // 静态初始化块
}

继承,代码互用：干法则

 */



/*
第26节课

1 如果要做父类，建议提供无参构造方法
2 类型转换的问题： 小转大，隐式转换.  大转小： 显式转换.
3 子类可以拿来当父类使用,向上转型
4 父类要用来当父类使用，必须强制转换：向下转型
5 instanceof 作用判断前面的类型是否为后面的类型
6 动态绑定机制
7 方法的重写：方法名相同，执行内容不同
8 @Override 标志
9 多态的而条件： 继承、重写、编译时类型转换。 表现：一个接口，多种行为.
10 getClass()方法 返回对象所属的类
 */



// 第二十七节课

/*
1 object类
2 引用类需要用 equals方法 来判断是否相等, equals 为object类的方法.
3 == 比的是地址
4 重写equals方法
5 重写toString犯法
6 toString 会自己调用
7 不能重写 final ，如个体Class（）方法
8 必须要重写 ：抽象方法
9 抽象关键字：abstract,抽象方法必须要在抽象类中
 */


// 第二十八节课

/*
1 抽象类不能实例化
2 抽象方法没有具体实现
3 继承一个抽象类，要重写抽象类的中的抽象方法或者本身变为抽象类
4 抽象类的作用：多态,模板
5 接口 -- implements, Java8以前，接口只能有抽象方法，以后可以有普通方法.  作用：蓝图
6
 */


/*
第二十九节课
1 枚举类
 */

//class Sea{
//    public final static int SPRING = 0;
//    public final static int SUMMER = 1;
//    public final static int AUTUMN = 2;
//    public final static int WINTER = 3;
//
//    public static void main(String[] args) {

//    }
//}

/*
第三十节课
1 开-闭法则
2 单一职责原则
3 迪米特法则
4 工厂模式
 */



