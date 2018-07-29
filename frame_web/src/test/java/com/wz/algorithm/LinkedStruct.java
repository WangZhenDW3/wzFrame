//package com.wz.algorithm;
//
///**
// * Created by wangzhen on 2018/7/11.
// */
//public class LinkedStruct {
//    public static void main(String[] args) {
//        LinkedNode head=new LinkedNode();
//        head.nodeData=new DataObj("1","wz");
//        LinkedTool.appendNode(head,new DataObj("2","sy"));
//        LinkedTool.printAllElemenet(head);
//        LinkedTool.insertNode(head,1,);
//    }
//}
//class DataObj{
//    String key;
//    String name;
//
//    public DataObj(String key, String name) {
//        this.key = key;
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "DataObj{" +
//                "key='" + key + '\'' +
//                ", name='" + name + '\'' +
//                '}';
//    }
//}
//class LinkedNode{
//    DataObj nodeData;
//    LinkedNode nextNode;
//}
//class LinkedTool{
//    public static LinkedNode appendNode(LinkedNode head,DataObj nodeData){
//        LinkedNode node=new LinkedNode();
//        node.nextNode=null;
//        node.nodeData=nodeData;
//        if(head==null){
//            head=node;
//            return head;
//        }else{
//            LinkedNode tempNode=head;
//            while(tempNode.nextNode!=null){
//                tempNode=tempNode.nextNode;
//            }
//            tempNode.nextNode=node;
//            return node;
//        }
//    }
//
//    public static LinkedNode insertNode(LinkedNode head,int index,DataObj nodeData){
//        LinkedNode tempNode=head;
//        int i=0;
//        while(tempNode.nextNode!=null){
//            if(i==index){
//                DanodeData
//                node.nextNode=tempNode.nextNode;
//                tempNode.nextNode=node;
//                return tempNode;
//            }
//            tempNode=tempNode.nextNode;
//            i++;
//        }
//        return tempNode;
//    }
//
//    public static void printAllElemenet(LinkedNode head){
//        LinkedNode tempNode=head;
//        while (tempNode.nextNode!=null){
//            System.out.print(tempNode.nodeData+"-->");
//            tempNode=tempNode.nextNode;
//        }
//        System.out.print(tempNode.nodeData);
//    }
//}