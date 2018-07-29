package com.wz;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangzhen on 2018/7/17.
 */
public class Test {
    public static void main(String[] args) {
        List<List<String>> example=new ArrayList<>();
        //第一行样本数据
        List<String> subExam1=new ArrayList<>();
        subExam1.add("D");
        subExam1.add("JUDH");
        //第二行样本数据
        List<String> subExam2=new ArrayList<>();
        subExam2.add("C");
        subExam2.add("PEND");

        example.add(subExam1);
        example.add(subExam2);

        //实际取到的数据
        List<List<String>> actualData=new ArrayList<>();
        //第一行样本数据
        List<String> subAct1=new ArrayList<>();
        subAct1.add("D");
        //这边故意搞一个不一样的数据
        subAct1.add("JUDH22");

        //第二行样本数据
        List<String> subAct2=new ArrayList<>();
        subAct2.add("C1");
        subAct2.add("PEND123");

        //第二行样本数据
        List<String> subAct3=new ArrayList<>();
        subAct3.add("C222");
        subAct3.add("PEND");

        actualData.add(subAct1);
        actualData.add(subAct2);
        actualData.add(subAct3);


        for(int i=0;i<actualData.size();i++){
                List<String> actRow=actualData.get(i);
                boolean flag=false;
                OUT:
                for(List<String> exampleRow:example){
                    //对比每一行，因为行数不一定对应
                    for(int m=0;m<exampleRow.size();m++){
                        if(!actRow.get(m).equals(exampleRow.get(m))){
                            flag=false;
                            break;
                        }else{
                            if(m==example.size()-1){
                                flag=true;
                                break OUT;
                            }
                        }
                    }
                }
                if(flag){
                    System.out.println("相同"+i);
                }else{
                    System.out.println("不相同"+i);
                }
        }
    }
}