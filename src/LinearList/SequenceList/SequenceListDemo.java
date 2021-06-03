package LinearList.SequenceList;

import LinearList.SequenceList.SequenceList;

/**
 * @author Data
 * @Project
 * @Date  2021-02-05
 * @Version
 * @Description 测试顺序表
 */
public class SequenceListDemo {
    public static void main(String[] args){
        /*
          线性表的最大容量
         */
        int maxSize = 15;
        SequenceList sequenceList = new SequenceList(maxSize);
        System.out.println("向顺序表添加元素");
        // 测试 insert、size、get方法
        for (int i = 0;i < maxSize;i++){
            sequenceList.insert(sequenceList.size(),i);
        }
        for(int i =0;i<sequenceList.size();i++){
            System.out.print(sequenceList.get(i)+" ");
        }
        System.out.println();
        System.out.println("顺序表已满");
        try{
            // 测试顺序表满了后能否插入元素
            sequenceList.insert(0,100);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println();

        // 测试delete、isEmpty方法
        sequenceList.delete(0);
        System.out.println("顺序表是否为空");
        System.out.println(sequenceList.isEmpty());
        System.out.println("顺序表删除元素后");
        for (int i=0 ;i < sequenceList.size();i++){
            System.out.print(sequenceList.get(i)+" ");
        }
        System.out.println();
        sequenceList.insert(-1,15);
        for (int i = 0;i<sequenceList.size();i++){
            System.out.print(sequenceList.get(i)+" ");
        }
        System.out.println();
        sequenceList.delete(-1);
        for (int i = 0;i<sequenceList.size();i++){
            System.out.print(sequenceList.get(i)+" ");
        }
        System.out.println();
        System.out.println(sequenceList.get(13));
    }
}
