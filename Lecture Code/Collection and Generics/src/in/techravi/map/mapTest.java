package in.techravi.map;

import java.util.HashMap;
import java.util.Map;

public class mapTest {
    public static void main(String [] args){
        Map<Integer,String> mapList = new HashMap<>();
        mapList.put(105,"Apple");
        mapList.put(204,"Realme");
        mapList.put(307,"Oppo");
        mapList.put(409,"Vivo");
        mapList.put(501,"Nokia");

        System.out.println(mapList.get(105));
        System.out.println(mapList.containsKey(105));
        System.out.println(mapList.keySet());
        System.out.println(mapList.values());

        for (Integer i : mapList.keySet()) {
            System.out.printf("Value of key %d is %s \n",i,mapList.get(i));

        }

    }
}
