package com.example.demo.controller;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Test {

//对字符串数组按字符串长度排序
    public static void main(String[] args) {
        String s ="李超，李超，李超，王五，大蘇打，大啊，發發，的";

        String[]  array = {"asd","asdasf","asfasgg","erty"};
        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        });
        for (String s1:array
             ) {
            System.out.println();
            System.out.printf("");
            System.out.println("Test.main");
            System.out.println("args = [" + args + "]");
            System.out.println("s1 = " + s1);
        }
        Arrays.sort(array,(s1,s2)->Integer.compare(s1.length(),s2.length()));
//        String[] tag2Array = s.split("(,|，| ){1,}");
//        Set<String> set = new HashSet<String>();
//        //遍历数组并存入集合,如果元素已存在则不会重复存入
//        for (int i = 0; i < tag2Array.length; i++) {
//            set.add(tag2Array[i]);
//        }
//        //返回Set集合的数组形式
//        String[] toArray =  set.toArray(new String[0]);
//
//        for (String s1:set
//             ) {
//            System.out.println(s1);
//        }

    }
}
