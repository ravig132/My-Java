package com.challenge97;

public enum Day {
     SUNDAY(false)
    ,MONDAY(true)
    ,TUESDAY(true)
    ,WEDNESDAY(true)
    ,THURSDAY(true)
    ,FRIDAY(true)
    ,SATURDAY(false);

     private boolean isWeekDay ;

     Day(boolean isWeekDay){
         this.isWeekDay = isWeekDay ;
     }

    public boolean isWeekDay() {
        if (isWeekDay){
            return true ;
        }else {
            return false;
        }
    }
}
