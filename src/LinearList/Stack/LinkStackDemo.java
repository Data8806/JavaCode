package LinearList.Stack;

/**
 * @Author Data
 * @Project
 * @Date 2021-02-21
 * @Version 1.0
 * @Description 测试链式栈
 */
public class LinkStackDemo {
    public static void main(String[] args){
        int size = 10;
        LinkStack linkStack = new LinkStack();
        for (int i = 0; i < size; i++){
            linkStack.push(i);
        }
        System.out.println("链式栈是否为空：");
        System.out.println(linkStack.isEmpty());
        System.out.println("链式栈的个数：");
        System.out.println(linkStack.size());
        System.out.println("打印链式栈中的元素");
        for (int i = 0; i < size;i++){
            System.out.print(linkStack.pop()+" ");
        }
    }
}
