package com.yun.system.util;

import java.util.Stack;

/**
 * ClassName Main
 * Description TODO
 * Author zhonghaigang
 * Date 2022/6/24 19:00
 * Version 1.0
 **/
public class StringUtils {

    /**
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
     *
     * 有效字符串需满足：
     *
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     * 注意空字符串可被认为是有效字符串。
     * 示例 1:
     * 输入: "()"
     * 输出: true
     *
     * 示例 2:
     * 输入: "()[]{}"
     * 输出: true
     *
     * 示例 3:
     * 输入: "(]"
     * 输出: false
     *
     * 示例 4:
     * 输入: "([)]"
     * 输出: false
     *
     * 示例 5:
     * 输入: "{[]}"
     * 输出: true
     *
     * 解题思路，利用栈解决
     * @param str
     * @return
     */
    public static boolean exec(String str){
        Stack<Character> stack =new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='{' ||str.charAt(i)=='['){
                stack.push(str.charAt(i));
            }else if(!str.isEmpty()&&str.charAt(i)==')'){
                if(stack.pop()!='('){
                    return false;
                }
            }else if(!str.isEmpty()&&str.charAt(i)=='}'){
                if(stack.pop()!='{'){
                    return false;
                }
            }else if(!str.isEmpty()&&str.charAt(i)==']'){
                if(stack.pop()!='['){
                    return false;
                }
            }else{
                return false;
            }

        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }

    }
}
