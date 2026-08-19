package in.techravi.collectionNew;

import java.awt.datatransfer.FlavorListener;
import java.util.*;

public class listCollection {
    public static void main (String [] args ){
//        List<Integer> list = new ArrayList<>();
//
//        //add
//        list.add(7);
//        list.add(4);
//        list.add(3);
//
//        System.out.println(list);
//
////        list.remove(0);
////        System.out.println(list);
//
//
//        //addAll
//
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(101);
//        list1.add(102);
//        list1.add(109);
//
//        list1.addAll(list);
//
//        System.out.println(list1);
//
//        list1.removeAll(list);
//
//        System.out.println(list1);
//
//        // i want to traverse list using iterator
//
//        Iterator<Integer> iterator = list.iterator();
//
//        while (iterator.hasNext()){
//            System.out.println("Element : "+iterator.next());
//        }
//
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(12);
//        list2.add(13);
//        list2.add(14);
//
//        System.out.println(list2.get(2));
//
//        list2.set(0,87);
//        System.out.println(list2);
//
//        Object[] arr = list2.toArray();
//        for (Object obj : arr){
//            System.out.print(obj+" ");
//        }
//        System.out.println();
//        System.out.println(list2.contains(87));


        ArrayList<Integer> list = new ArrayList<>() ;

        list.add(34);
        list.add(56);
        list.add(89);
        list.add(21);
        list.add(90);
        list.add(45) ;
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.indexOf(90));

        ArrayList<Integer> list1 = (ArrayList<Integer>) list.clone();
            System.out.println(list1);

            








    }
}
