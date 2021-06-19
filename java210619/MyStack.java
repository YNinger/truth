package java210619;

public class MyStack {
    //基于顺序表实现栈
    int capacity;
    private int[] data = new int[capacity];
    private int size =0;

    //1.基本操作
    //入栈
    public void push(int val){
        if (size>data.length){
            //扩容
            capacity = 2*capacity;
            int[] newData = new int[capacity];
            for (int i = 0; i <data.length ; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
        data[size] = val;
        size++;
    }
    //出栈
    public Integer pop(){
        if (size==0){
            return null;
        }
        //出栈的元素元素就是栈顶元素，最后一个
        int ret = data[size-1];
        size--;
        return  ret;
    }
    //取栈顶元素
    public Integer peek(){
        if (size==0){
            return null;
        }
        return data[size-1];
    }
}
