package in.techravi.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class collectionTest {
    public static void main (String [] args ){
        System.out.print("Enter the amount of number you want to add : ");
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();

        List<Integer> list = new ArrayList<>() ;
        for (int i = 0; i < amount; i++) {
            System.out.print("Enter the number : ");
            list.add(input.nextInt()) ;
        }

        for (Integer i : list) {
            System.out.println(i);

        }

        System.out.println(  list.contains(3));



    }

}
