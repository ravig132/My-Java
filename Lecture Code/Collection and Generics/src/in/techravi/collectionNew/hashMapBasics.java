package in.techravi.collectionNew;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashMapBasics {
    public static void main (String [] args ){

        Map<String ,String > map = new HashMap<>();

        // insertion -> put()

        map.put("in"," India ");
        map.put("en"," England ");
        map.put("aus"," Australia ");
        map.put("us"," United States ");

        System.out.println(map);


        // fetching -> .get(object key)

        System.out.println(map.get("in"));

        //deletion -> .remove(object key)

        map.remove("aus");
        System.out.println("After deletion"+map);

        map.putIfAbsent("aus"," Australia ");
        System.out.println(map);

        System.out.println(map.values());

        Set<String> keySet = map.keySet();
        System.out.println(keySet);






    }
}
