package LinearList.LinkList;

import LinearList.LinkList.LinkList;

/**
 * @author Data
 * @Project
 * @Date 2021-02-10
 * @Version 1.0
 * @Description 单链表测试
 */

public class LinkListDemo {
    public static void main(String[] args){
        int size =10;
        LinkList linkList = new LinkList();
        System.out.println("向单链表添加元素");
        // 测试insert、get、size方法
        for(int i = 0; i<size;i++){
            linkList.insert(i,i);
        }
        System.out.println(linkList);
        // 从单链表中删除元素
        linkList.delete(0);
        System.out.println("单链表是否为空");
        System.out.println(linkList.isEmpty());
        System.out.println("单链表删除元素后");
        System.out.println(linkList);
        // 测试setElement方法
        System.out.println("替换第一个元素");
        linkList.setElement(0,0);
        System.out.println(linkList);
        // 测试index方法
        System.out.println(linkList.index(9));
        // 测试 remove方法
        linkList.remove(0);
        System.out.println(linkList);
        linkList.append(10);
        System.out.println(linkList);
        linkList.reverse();
        System.out.println(linkList);
    }
}
