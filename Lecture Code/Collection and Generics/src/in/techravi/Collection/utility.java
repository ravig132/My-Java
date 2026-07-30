package in.techravi.Collection;

import java.util.Collection;
import java.util.Objects;
import java.util.Scanner;

public class utility {
    public static <E> void print (Collection <E> collection){
        System.out.print("Collection is : ");
        for (Object coll : collection){
            System.out.print(coll+" ");
        }
        System.out.println();
    }

    public static <E> void entry(Collection<E> collection){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how much objects you want to add : ");
        int num = input.nextInt();

        for (int i = 0; i < num; i++) {
            collection.add((E) input.next());
        }

    }

}
