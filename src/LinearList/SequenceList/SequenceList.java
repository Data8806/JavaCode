package LinearList.SequenceList;

import LinearList.List;

/**
 * @Author Data
 * @Project
 * @Date ：2021-02-05
 * @Version 2.0
 * @Description :顺序表实现
 */
public class SequenceList implements List {
    /**
     * 顺序表的容量
     */
    private int maxSize;

    /**
     * 顺序表的实际长度
     */
    private int length;

    /**
     * 定义一个Object数组来存放元素
     */
    private Object[] list;

    /**
     * 构造函数
     * @param size 顺序表的初始容量
     */
    public SequenceList(int size){
        // 如果容量小于等于0时，抛出异常
        if (size <= 0) {
            throw new RuntimeException("顺序表容量异常");
        }
        this.maxSize = size;
        this.length = 0;
        this.list = new Object[size];
    }
    /**
     * 默认构造函数
     */
    public SequenceList(){
        this(10);
    }

    /**
     * 查询顺序表的长度
     * @return 线性表长度
     */
    @Override
    public int size(){
        return this.length;
    }

    /**
     * 判断顺序表是否为空
     * @return true：空，false:非空
     */
    @Override
    public boolean isEmpty(){
        return this.length==0;
    }

    /**
     * 插入元素
     * @param index 位置
     * @param object 元素
     */
    @Override
    public void insert(int index,Object object){
        // 判满
        if (this.length == this.maxSize){
            throw new RuntimeException("顺序表已满，无法插入元素");
        }
        // 处理索引
        index = this.processingIndex(index);
        // 从最后一个元素开始往后移动，给要插入元的位置留空
        for (int i = length-1; i >= index;i--){
            list[i+1] = list[i];
        }
        list[index] = object;
        this.length++;
    }
    /**
     * 删除元素
     * @param index 索引
     */
    @Override
    public void delete(int index){
        // 判空
        if (isEmpty()){
            throw new RuntimeException("顺序表为空，无法删除");
        }
        //处理索引
        index = this.processingIndex(index);
        // 移动index位置后的元素，覆盖index处的位置，达到删除元素的效果
        for (int i = index; i < this.length-1;i++){
            list[i] = list[i+1];
        }
        this.length--;
    }
    /**
     * 查询指定位置的元素
     * @param index 位置
     * @return 元素
     */
    @Override
    public Object get(int index){
        if (index < -length || index > length) {
            throw new RuntimeException("非法索引");
        }
        if(index <0){
            index +=length;
        }
        return list[index];
    }
    /**
     * 判断索引是否合法，引进负索引
     * @param index :索引
     */
    public int processingIndex(int index) {
        if (index < -maxSize || index > maxSize) {
            throw new RuntimeException("非法索引");
        }
        if(index <0){
            index +=maxSize;
        }
        return index;
    }
}
