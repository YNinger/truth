package java210619;

public class MyQueue2 {
    //环形队列的实现
    private int[] data = new int[100];
    //队列有效区间[head,tail)
    private int head =0;
    private int tail =0;
    private int size =0;
    //入队列
    public boolean push(int val){
        if(size==data.length){
            //队列满了
            return false;
        }
        //把新元素放到tail对应的下标上
        data[tail] = val;
        tail++;
        //如果tail到达了队列的末尾让他回到零
        if (tail==data.length){
            tail=0;
        }
        size++;
        return true;
    }
    //2.出队列
    public Integer pop(){
        if(size==0){
            //空队列
            return null;
        }
        int ret = data[head];
        head++;
        if (head==data.length){
            head=0;
        }
        size--;
        return ret;
    }
    //3.查找队首元素
    public Integer peek(){
        if (size==0){
            return null;
        }
        return data[head];
    }
}
