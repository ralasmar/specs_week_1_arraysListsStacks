package com.globalsoftwaresupport;

import java.util.LinkedList;
import java.util.List;

public class linkedList {

    public static void main(String[] args){
        List<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(10);
        list.add(5);
        list.add(3);



        System.out.println("Size: " + list.size());

        for(Integer num : list)
            System.out.println(num);
    }
}