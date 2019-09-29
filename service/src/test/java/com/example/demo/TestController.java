package com.example.demo;

/**
 * @author wjx
 * @create 2019-09-09 16:40
 **/

public class TestController {


    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("1024");
        sb.append("Mr ")
                .append("Bob")
                .append("!")
                .insert(0, "Hello, ");
        System.out.println(sb.toString());

    }


}
