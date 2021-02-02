package com.luv2code.samplePractice.Array;

/*
 * Simple treasure finding game.
 *
 * +------------------------+
 * , 34 , 21 , 32 , 41 , 25 ,
 * ------+----+----+----+---,
 * , 14 , 42 , 43 , 14 , 31 ,
 * ------+----+----+----+---,
 * , 54 , 45 , 52 , 42 , 23 ,
 * ------+----+----+----+---,
 * , 33 , 15 , 51 , 31 , 35 ,
 * ------+----+----+----+---,
 * , 21 , 52 , 33 , 13 , 23 ,
 * +------------------------+
 * Do you like treasure hunts? In this problem you are to write a program to explore the above array for a treasure. The values in the array are clues.
 * Each cell contains an integer between 11 and 55; for each value the ten's digit represents the row number and the unit's digit represents the column number of the cell containing the next clue.
 * Starting in the upper left corner (at 1,1), use the clues to guide your search of the array. (The first three clues are 11, 34, 42).
 * i.e. Cell (1,1) contains 34, which means go to cell 3, 4
 * Cell(3,4) contains 42 which means go to cell 4,2…..
 * The treasure is a cell whose value is the same as its coordinates.
 * Answered for : http://www.cramster.com/answers-may-12/computer-science/java-treasure-hunt-premise_2516915.aspx
 * Answered on : 7/5/12
 */

public class TwoDimensionArray {

    static int  noOfRows=5;
    static int noOfColumn=5;

    public static void main(String ar[])
    {
        treasureHunt();
    }

    static void treasureHunt()
    {
        int providedArray[][]=treasureHuntInsertion();
        int requiredNo=0;
        for(int i=0;i<noOfRows;i++) {
            for (int k = 0; k < noOfColumn; k++) {
                int val = providedArray[i][k];
                //System.out.println(val);
                int noAtOncePlace=val/10;
                int noAtTensePlace=val%10;
                //System.out.println(noAtOncePlace+"_"+noAtTensePlace);
                if(((noAtOncePlace-1) == i )&& ((noAtTensePlace-1)==k)) {
                    requiredNo=val;
                    break;
                }
            }
        }
        System.out.println(requiredNo);
    }

    static int[][] treasureHuntInsertion()
    {

        int inputVal[] = {34 , 21 , 32 , 41 , 25 ,14 , 42 , 43 , 14 , 31,54 , 45 , 52 , 42 , 23, 33 , 15 , 51 , 31 , 35, 21 , 52 , 33 , 13 , 23};

        int arrayCount=0;
        int arra[][] = new int[noOfRows][noOfColumn];
        for(int i=0;i<noOfRows;i++)
        {
            for(int k=0;k<noOfColumn;k++)
            {arra[i][k]=inputVal[arrayCount++];
                System.out.print(arra[i][k]+" ");
            }
            System.out.println("");

        }
        return arra;
    }
}
