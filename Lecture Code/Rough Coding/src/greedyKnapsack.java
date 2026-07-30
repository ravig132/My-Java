import javax.xml.crypto.dsig.keyinfo.KeyName;
import java.util.Scanner;

public class greedyKnapsack {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("          Greedy Method        ");
        System.out.println("WELCOME TO THE KNAPSACK PROBLEM");
        System.out.print("Enter the Capacity of the Knapsack : ");
        int cap = input.nextInt();
        System.out.print("Enter the total no. of elements : ");
        int noOfElements = input.nextInt();
        int[] profit = new int[noOfElements];
        int[] coWeight = new int[noOfElements];
        for (int i = 0; i < noOfElements; i++) {
            System.out.print("Enter the value of profit : ");
            profit[i] = input.nextInt();
            System.out.print("Enter the corresponding weight : ");
            coWeight[i] = input.nextInt();
        }
        int[] fractionArr = finalArray(noOfElements,profit,coWeight);
        int[] DOArr = sortedArr.DObubbleSort(fractionArr,noOfElements,coWeight);
        int[] knapSackArr = knapSack(cap,noOfElements,DOArr);
        for (int m = 0; m < noOfElements; m++) {
            System.out.print( knapSackArr[m] + " ");
        }


    }
    public static int[] knapSack(int cap,int noOfElement,int[] coWeight){
        int maxCap = cap ;
        int[] knapsack = new int[noOfElement];
        for (int j = 0; j < noOfElement; j++) {
            if (coWeight[j]>maxCap){
                break;
            } else {
                knapsack[j] = 1 ;
                maxCap = maxCap - coWeight[j];
            }
            if ( 1 > maxCap ){
                knapsack[j] = maxCap/coWeight[j];
            }

        }

        return knapsack;
    }


    public static int[] finalArray(int noOfElements,int[] profit,int[] coWeight){
        int[] fractionArr = new int[noOfElements];
        for (int i = 0; i < noOfElements; i++) {
            fractionArr[i] = profit[i]/coWeight[i];
        }
        return fractionArr ;
    }
}
