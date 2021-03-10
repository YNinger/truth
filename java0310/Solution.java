package java0310;

import java.util.Stack;

public class Solution {

    //给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
    //有效字符串需满足：
    //左括号必须用相同类型的右括号闭合。
    //左括号必须以正确的顺序闭合。
    //思路：创建一个栈，先用循环接收字符串里边的字符，当出现的字符时左括号的时候进行入栈
    //如果接受的不是左括号就要判定是否字符串为空，如果为空说明出现错误
    public boolean isValid(String s) {
        //先创建一个栈
        Stack<Character> stack = new Stack<>();
        //遍历字符串
        for(int i = 0;i<s.length();i++){
            //接收字符串里边的字符
            char c = s.charAt(i);

            if(c=='['||c=='{'||c=='('){
                stack.push(c);
                continue;
            }
            // 标准库的 Stack, 在针对空栈进行 peek 的时候会直接抛异常.
            if(stack.empty()){
                return false;
            }
            // 此处直接使用 pop, 把栈顶元素出栈. 一旦匹配的情况, 就直接 continue 进入下次循环就好了
            Character pop = stack.pop();
            if(pop=='{'&&c=='}'){
                continue;
            }
            if(pop=='['&&c==']'){
                continue;
            }
            if(pop=='('&&c==')'){
                continue;
            }
            //如果程序执行到这，则说明出现非法情况
            return false;
        }
        //此时循环结束
        //但是还需要判定一下栈是否为空
        if(stack.empty()){
            return true;
        }
        return false;

    }
}
