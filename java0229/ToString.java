package java0229;

public class ToString {
    //实现一个方法 toString, 把一个整型数组转换成字符串.
    //例如数组 {1, 2, 3} , 返回的字符串为 "[1, 2, 3]", 注意逗号的位置和数量.
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(toString(arr));
    }

    public static String toString(int[] arr) {
        String ret="[";
        for(int i=0;i<arr.length;i++){
            if(i<arr.length-1){
                ret+=arr[i]+",";
            }
            else if(i==arr.length-1){
                ret+=arr[i]+"]";
            }
        }
        return ret;
    }
}
