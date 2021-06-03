package LinearList;

/**
 * @author Data
 * @Project
 * @Date 时间2021-02-05
 * @Version 版本:v1.0
 * @Description :线性表统一接口
 */
public interface List {
    /**
     * 查询线性表长度
     * @return 线性表长度
     */
    int size();

    /**
     * 判断线性表是否为空
     * @return true:为空 false：不为空
     */
    boolean isEmpty();

    /**
     * 插入元素
     * @param index 位置
     * @param object 元素
     */
    void insert(int index,Object object);

    /**
     * 删除元素
     * @param index 位置
     */
    void delete(int index);

    /**
     * 查询指定位置的元素
     * @param index 位置
     * @return 元素
     */
    Object get(int index);
}
