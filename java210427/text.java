package java210427;

import java.util.ArrayList;
import java.util.Scanner;

public class text {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        int []res=new int[end+end];
        for(int k=0;k<end+1;k++)
            res[k]=1000;
        res[start]=0;
        for(int i=start;i<=end;i++)
        {
            if(res[i]==1000)
                continue;
            else
            {
                ArrayList<Integer> arr=yinshu(i);
                for(int j=0;j<arr.size();j++)
                {
                    int s=arr.get(j);
                    res[i+s]=Math.min(res[i+s], res[i]+1);
                }
            }
        }
        if(res[end]!=1000)
            System.out.println(res[end]);
        else
            System.out.println(-1);
    }
    public static ArrayList<Integer> yinshu(int n)
    {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                arr.add(i);
        }
        return arr;
    }
}
