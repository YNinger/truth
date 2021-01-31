package java0131;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());

        //1.增加
        arrayList.add("我爱你");
        arrayList.add("中国");
        arrayList.add("五星红旗");
        arrayList.add("航空母舰");
        arrayList.add("北京");
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        System.out.println("第一次add的结果"+arrayList);
        arrayList.add(2,"脉动");
        System.out.println("第二次add的结果"+arrayList);

        //2.删除
        arrayList.remove(2);//删除下标为2的元素
        System.out.println("按照下标删除后的结果"+arrayList);
        arrayList.remove("航空母舰");//删除"航空母舰"
        System.out.println("按照名字删除后的结果"+arrayList);

        //3.查找
        boolean ret = arrayList.contains("我爱你");
        System.out.println("查找我爱你的结果:"+ret);
        int index = arrayList.indexOf("中国");
        System.out.println("查找中国的位置:"+index);

        //4.获取修改元素
        String ele = arrayList.get(0);
        System.out.println("0号元素为："+arrayList);
        arrayList.set(0,"我一直爱你");
        System.out.println("修改0号元素后的结果："+arrayList);

        //5.遍历
        //A
        System.out.println("通过下标来遍历：");
        for(int i =0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        //B.通过迭代器来进行遍历
        System.out.println("通过迭代器遍历");
        //先通过iterator方法获取到迭代器对象
        Iterator<String> iterator = arrayList.iterator();
        //通过while循环来进行遍历
        while(iterator.hasNext()){
            String e = iterator.next();
            System.out.println(e);
        }
        //C.通过for each来遍历
        System.out.println("通过for-each遍历");
        for(String e : arrayList){
            System.out.println(e);
        }

    }
}
