package in.ravi.executorServices.future;

import java.util.concurrent.Callable;

public class fetchName implements Callable<String> {


    private final String name;

    public fetchName(String name){
        this.name = name ;
    }
    @Override
    public String call() throws Exception {
        System.out.printf("\n Getting full name of %s from server ",name);
        Thread.sleep(4000);
        return name + " Gangwar";
    }
}
