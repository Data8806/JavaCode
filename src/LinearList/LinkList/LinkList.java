package LinearList.LinkList;

import LinearList.List;
import org.w3c.dom.Node;


/**
 * @author Data
 * @Project
 * @Date 2021-02-08 ~ 2021-02-10
 * @Version v2.0
 * @Description 单链表的实现
 */
public class LinkList implements List {
    /**
     * 定义一个内部类Node，代表单链表的结点
     */
    private static class Node {
        /**
         * 保存单链表结点数据
         */
        private Object data;
        /**
         * 指向下一结点的引用
         */
        private Node next;

        /**
         * 无参构造方器
         */
        public Node() {
        }

        /**
         * @param element 结点数据
         * @param next    下一结点的引用
         */
        public Node(Object element, Node next) {
            this.data = element;
            this.next = next;
        }
    }

    /**
     * 单链表的头节点
     */
    private Node header;

    /**
     * 单链表的长度
     */
    private int size;

    /**
     * 单链表无参构造器
     */
    public LinkList() {
        this.header = null;
    }

    /**
     * 单链表有参构造器
     *
     * @param element 元素值
     */
    public LinkList(Object element) {
        this.header = new Node(element, null);
        // 只有一个节点，头节点、尾节点都指向它
        size++;
    }
    /**
     * 索引处理
     * @param index 索引
     */
    private void handleIndex(int index){
        if (index < 0 || index > this.size) {
            throw new RuntimeException("索引非法");
        }
    }

    /**
     * 根据索引值查找链表结点
     *
     * @param index 索引
     * @return Node 结点
     */
    private Node findByIndex(int index) {
        // 检验索引是否合法
        this.handleIndex(index);
        // 从头开始便利
        Node current = this.header;
        // 从单链表头结点向后查找index位置上的Node节点
        for (int i = 0; i < size && current != null; i++) {
            if (i == index) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    /**
     * 查询单链表长度
     *
     * @return 单链表长度
     */
    @Override
    public int size() {
        return this.size;
    }

    /**
     * 判断单链表是否为空
     *
     * @return false：非空,ture： 空
     */
    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * 插入元素
     *
     * @param index   元素位置
     * @param element 元素值
     */
    @Override
    public void insert(int index, Object element) {
        // 判断索引是否合法
        this.handleIndex(index);
        //创建新结点
        Node newNode = new Node(element, null);

        // 判断链表链表是否为空
        if (this.isEmpty()) {
            this.header = newNode;
        }
        else if (index == 0) {
            // 新结点的next指向头结点
            newNode.next = this.header;
            // 新结点作为头结点
            this.header = newNode;
        }
        // 其他插入
        else {
                // 获取前一个结点
                Node prev = findByIndex(index - 1);
                // 让prev的next指向新结点，新结点的next指向prev下一结点
            assert prev != null;
            prev.next = new Node(element, prev.next);
            }
        size++;
        }


    /**
     * 根据索引删除元素
     *
     * @param index 索引
     */
    @Override
    public void delete(int index) {
        // 判断索引是否合法
        this.handleIndex(index);
        Node del;
        // 如果删除的是头结点；
        if (index == 0) {
            this.header = this.header.next;
        } else {
            // 获取待删除结点的前一个结点
            Node prev = this.findByIndex(index - 1);
            // 获取待删除结点
            assert prev != null;
            del = prev.next;
            // 删除结点
            prev.next = del.next;
            // 将删除结点的next引用变为null
            del.next = null;
        }
        size--;
    }

    /**
     * 查询指定位置的元素
     *
     * @param index 索引
     */

    @Override
    public Object get(int index) {
        // 找到目标结点
        Node node = this.findByIndex(index);
        assert node != null;
        if (node.data != null) {
            return node.data;
        }
        return null;
    }

    /**
     *按索引改变链表的元素
     * @param index 索引
     * @param element 元素
     */
    public void setElement(int index ,Object element){
        // 判断索引是否合法
        this.handleIndex(index);
        // 找到要修改的结点
        Node count = this.findByIndex(index);
        assert count != null;
        count.data = element;
    }
    /**
     * 重写toString方法，打印整个链表
     * @return 字符形式的链表
     */
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        for (int i = 0;i<this.size;i++){
            str.append(this.get(i)).append(" ");
        }
        return str.toString();
    }
    /**
     * 按元素查索引
     * @param element 元素
     * @return 索引
     */
    public int index(Object element){
        Node count =this.header;
        int index = 0;
        while(count.data != element&& index!=size){
            count = count.next;
            index++;
        }
        if (count == null){
            throw new RuntimeException("元素不存在");
        }
        return index;
    }

    /**
     * 按元素删除结点
     * @param element 元素
     */
    public void remove(Object element){
        int index = index(element);
        delete(index);
    }

    /**
     * 链表的最后添加元素
     * @param element 元素
     */
    public void append(Object element){
        this.insert(this.size,element);
    }
    /**
     * 链表的的颠倒
     */
    public void reverse(){
        Node cur = this.header;
        Node pre = null;
        while (cur != null){
            Node n = cur.next;
            cur.next = pre;
            pre = cur;
            cur = n;
        }
        this.header = pre;
    }
}
