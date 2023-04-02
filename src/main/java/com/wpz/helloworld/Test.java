package com.wpz.helloworld;

import java.util.Deque;
import java.util.LinkedList;

class Test {
    public static void main(String[] args) {
        reverseWords("a  ex");
    }
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        int len = 0; // 维护当前sb的长度
        Deque<String> stack = new LinkedList<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch != ' '){
                // 如果当前字符不是空格就暂存进StringBuilder中

                sb.append(ch);
                len++;
            }else{
                stack.addLast(sb.toString());
                sb.delete(0, len); // 清空sb
            }
        }

        // 将最后一个单词输出到stack
        stack.addLast(sb.toString());
        sb.delete(0, len); // 清空sb

        // 再将stack内的单词出栈，构造结果
        while(!stack.isEmpty()){
            if(!stack.pollLast().equals("")){
                sb.append(stack.pollLast());
                sb.append(" ");
            }

        }

        return sb.toString().trim();

    }
}
