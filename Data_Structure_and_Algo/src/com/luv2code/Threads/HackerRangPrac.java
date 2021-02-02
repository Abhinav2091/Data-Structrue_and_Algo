package com.luv2code.Threads;

import java.util.*;

public class HackerRangPrac {

    public static void main(String ar[])
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter no");
        int no=myObj.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arry = new int[no];
        for(int i=0; i<no; i++)
        {
//reading array elements from the user
            arry[i]=myObj.nextInt();
        }
        List<Integer> finalResult =proxy(no,arry);
for(int a:finalResult)
        System.out.print(a+" ");
    }
    static List<Integer> proxy(int no,int[] proxys)
    {
        Set<Integer> proxysSet = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for(int proxy:proxys)
        {
            if(proxy<=no)
                proxysSet.add(proxy);

        }
        for(int i=1;i<=no;i++)
        {
            if(!proxysSet.contains(i))
                result.add(i);

        }
        return  result;
    }
}
