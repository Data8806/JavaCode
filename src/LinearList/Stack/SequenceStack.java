package LinearList.Stack;

/**
 * @Author Data
 * @Project
 * @Date 2021-02-21
 * @Version 1.0
 * @Description 顺序栈的实现
 */
public class SequenceStack implements Stack{
    /**
     * 用于存储数据的Object数组
     */
    private Object [] data;
    /**
     * 顺序栈的最大容量
     */
    private  int maxSize;
    /**
     * 栈顶元素的索引
     */
    private int top;
    /**
     * 顺序栈的有参构造器
     * @param maxSize 顺序栈最大容量
     */
    public SequenceStack(int maxSize){
        this.maxSize = maxSize;
        data = new Object[maxSize];
        this.top = -1;
    }
    /**
     * 顺序栈的无参构造器
     */
    public SequenceStack(){
        this(10);
    };
    /**
     * 判断栈是否为空
     * @return true 空 false 非空
     */
    @Override
    public boolean isEmpty(){
        return top==-1;
    }
    /**
     * 判断栈是否已满
     * @return true 满 false 不满
     */
    public boolean isFull(){
        return top+1>= this.maxSize;
    }
    /**
     * 入栈操作
     * @param element 入栈元素
     * @return 入栈结果
     */
    @Override
    public boolean push(Object element){
        // 判断栈是否已满
        if(isFull()){
            throw new RuntimeException("栈已满，无法进行入栈操作");
        }
        data[++top] = element;
        return true;
    }
    /**
     * 出栈操作
     * @return 出栈元素
     */
    @Override
    public Object pop(){
        if (isEmpty()){
            throw new RuntimeException("栈为空，无法进行出栈操作");
        }
        // 保存栈顶元素
        Object element = data[top];
        // 删除元素
        this.top--;
        return element;
    }
    /**
     * 栈的大小
     * @return 栈中元素的个数
     */
    @Override
    public int size(){
        return top +1;
    }
}
