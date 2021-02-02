package com.luv2code.samplePractice.challenges;

public class HashFunctionToRetrivetheNumber {
    public static void main(String ar[])
    {
        int[] inputArray =new int[10];
        int[] numToAdd ={59382,43,6894,500,99,-58};
        
        for(int i=0;i<numToAdd.length;i++)
        {
            inputArray[hash(numToAdd[i])] =numToAdd[i];

        }

        for(int i=0;i<inputArray.length;i++)
        {
            System.out.println(inputArray[i]);
        }

    }

    public static int hash(int num)
    {
        return Math.abs(num%10);
    }
}
