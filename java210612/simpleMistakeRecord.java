package java210612;

import java.util.*;
public class simpleMistakeRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new LinkedHashMap<>();
        while (sc.hasNext()){
            String str = sc.next();
            int n = sc.nextInt();
            String[] arr = str.split("\\\\");
            String s = arr[arr.length-1];
            if(s.length()>16){
                s = s.substring(s.length()-16);
            }
            String key = s+" "+n;
            //containsKey(判断是否包含key)
            //就是说判断map里边是否有这个错误文件
            if(!map.containsKey(key)){
                //put(设置key对应的value值n=1)
                map.put(key,1);
            }else{
                //get(返回 key 对应的 value)
                //已经存在了，在原来的基础上对n值+1
                map.put(key,map.get(key)+1);
            }
        }
        int count = 0;
        //keySet(返回所有 key 的不重复集合)
        //foreach遍历map.keySet()中的元素
        for (String string:map.keySet()) {
            count++;
            //输出最后面的8个元素
            //当集合有9个元素时，就从count==2时开始输出2，3，4，5，6，7，8，9刚好八个元素
            if(count>map.keySet().size()-8){
                System.out.println(string+" "+map.get(string));
            }
        }
    }
}

