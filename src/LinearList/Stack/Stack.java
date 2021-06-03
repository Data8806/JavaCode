package LinearList.Stack;

/**
 * @author Data
 * @Project
 * @Date 2021-02-20
 * @Version 1.0
 * @Description 栈的统一接口
 */
public interface Stack {
    /**
     * 判断栈是否为空
     * @return false 非空，true 空
     */
    boolean isEmpty();
    /**
     * 入栈操作
     * @param element 入栈元素
     * @return 入栈结果
     */
    boolean push(Object element);
    /**
     * 出栈操作
     * @return 出栈元素
     */
    Object pop();
    /**
     * 栈的深度
     * @return 元素个数
     */
    int size();
}
