package in.techravi.Collection;

import java.util.ArrayList;
import java.util.List;

public class listTest {
    public static  void main (String[] args){
        List <String> strList = new ArrayList<>();
        strList.add("Ravi Kumar Gangwar");
        strList.add("Bobby Gangwar");
        strList.add(1,"Sompal Gangwar");
        strList.add(2,"Gyanwati Gangwar");
        System.out.println(strList);
        strList.remove("Bobby Gangwar");
        System.out.println(strList);
        strList.add(1,"Bobby Gangwar");
        System.out.println(strList);
        System.out.println(strList.get(3));
        for (String str : strList){
            System.out.println(str);
        }

        strList.clear();
        System.out.println(strList);
        strList.add("Gyanwati Gangwar");

        System.out.println(strList);
        if (strList.contains("Bobby Gangwar")){
            System.out.println("Bhai Hai Mera");
        }else if (strList.contains("Sompal Gangwar")){
            System.out.println("Papa Hai Mere");
        }else if (strList.contains("Gyanwati Gangwar")){
            System.out.println("Mummy Hai Meri");
        }else {
            System.out.println("Mai Khud Hu");
        }


    }
}
