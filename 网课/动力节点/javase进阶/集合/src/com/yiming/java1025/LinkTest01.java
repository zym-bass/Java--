package com.yiming.java1025;

public class LinkTest01 {
    public static void main(String[]  args){

    }
}
/*
    单链表中的节点
    节点是单向链表中的基本单元
    每个节点Node都有两个属性
        一个属性：是存储的数据
        另一个属性：是下一个节点的内存地址
*/
class Node{
    //存储的数据
    Object element;
    //下一个节点的内存地址
    Node next;
    public Node(){
        super();
    }
    public Node(Object element , Node next){
        this.element = element;
        this.next = next;
    }

}
class Link{
    //头节点
    Node header ;

    //向链表中添加元素的方法
    public void add(Object data) {
        if (header == null) {//说明此时节点为未节点
            header = new Node(data,null);
        }else{
            //说明头是空！
            //头节点已经存在
            //找出当前末尾节点，让当前末尾节点的next是新节点
            Node currentLastNode = findLast(header);
            currentLastNode.next = new Node(data,null);
        }
    }

    /**
     * 专门查找末尾节点
     * @return
     */
    private Node findLast(Node node) {
        if(node.next ==null){
            return node;
        }
        return findLast(node.next);
    }

    //删除链表中某个数据的方法
    public void remove(){

    }

    //修改链表中的某个元素 modify
    public void modify(Object newObj){

    }
}
