package LinearList.Stack;

/**
 * @author Data
 * @Project
 * @Date 2021-02-21
 * @Version 1.0
 * @Description 顺序栈的测试
 */
public class SequenceStackDemo {
    public static void main(String[] args){
        int size = 10;
        SequenceStack sequenceStack = new SequenceStack(size);
        // 入栈
        for (int i = 0; i<size;i++){
            sequenceStack.push(i);
        }
        System.out.println("顺序栈是否为空");
        System.out.println(sequenceStack.isEmpty());
        System.out.println("顺序栈是否已满");
        System.out.println(sequenceStack.isFull());
        System.out.println("打印顺序栈的元素");
        for(int i =0;i<size;i++){
            System.out.print(sequenceStack.pop()+" ");
        }
    }
}
