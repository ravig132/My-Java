package com.challenge104;

public class task implements Runnable{

    private final String name ;


    public task(String name ){
        this.name = name ;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            Thread current = Thread.currentThread();
            System.out.printf("Current thread is : %s",current.getName());
            System.out.printf("%s Gangwar \n",name);
            try {
                Thread.sleep(getRandom() * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    private int getRandom(){
        int random = (int) (Math.random()*5 + 1);
        return random;
    }
}
