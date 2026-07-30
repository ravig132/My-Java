package in.techravi.Collection;

import java.util.HashSet;
import java.util.Set;

public class setTest {
    public static void main (String [] args ) {
        Set<String> Names = new HashSet<>();
        Names.add("Ravi");
        Names.add("Bobby");
        Names.add("Gyanwati");
        utility.print(Names);
        System.out.println(Names.add("Ravi"));
        System.out.println(Names.size());
        Names.remove("Gyanwati");
        System.out.println(Names);
        System.out.println(Names.remove("Gyanwati"));
    }
}
