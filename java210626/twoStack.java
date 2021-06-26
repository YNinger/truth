package java210626;

import java.util.Stack;

public class twoStack {
    //JZ5 用两个栈实现队列
    //用两个栈来实现一个队列，分别完成在队列尾部插入整数(push)和在队列头部删除整数(pop)的功能。
    //队列中的元素为int类型。保证操作合法，即保证pop操作时队列内已有元素。
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    //思路：将第一个栈作为入队列，第二个栈进行出队列
    //当第一个栈有元素时，就放第二个栈里边放
    //当第二个栈有元素时，就直接弹出
    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        //每次调用pop的时候，需要先判断stack2中有没有元素，如果有先弹出，再对stack1中的元素进行入栈
        //
        while (!stack2.isEmpty()){
            //每一次pop取出一个元素
            return stack2.pop();
        }

        //保证当pop的时候只有stack1中有元素，而stack2中没有的情况
        //先将stack1中的元素插入到stack2，再让stack2进行pop操作
        while (!stack1.isEmpty()){
            //当stack2中没有元素的时候
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
