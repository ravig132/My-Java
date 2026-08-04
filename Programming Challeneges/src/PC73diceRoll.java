public class PC73diceRoll {

    int roll(){
        double random = Math.random() * 6;
        return (int) Math.ceil(random);
    }
    public static void main (String [] args){

        PC73diceRoll Dice = new PC73diceRoll();
        for (int i = 0 ; i < 10 ; i++) {
            System.out.println(Dice.roll());
        }
    }
}
