public class MyMain {
    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        return (int)(Math.random()*6+1);
    }

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        // REPLACE WITH YOUR CODE HERE

        // Your code should roll 6 dice 10,000 times, so you should have a
        // for loop such as:
        int sixCount=0;
        int totalCounter=0;
        for (int i = 0; i < 10000; i++) {
            sixCount=0;
            for (int j=0;j<6;j++){
                int diceResult=rollDie();
                if (diceResult==6){
                    sixCount+=1;

                }
            }
            if (sixCount>=1){
                totalCounter++;
            }
            //System.out.println(totalCounter);
        }
        double totalCounterDouble=totalCounter;
        //System.out.println(totalCounterDouble);
        //System.out.println(totalCounterDouble);
        return (totalCounterDouble/10000*100);
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int sixCount=0;
        int totalCounter=0;
        for (int i = 0; i < 10000; i++) {
            sixCount=0;
            for (int j=0;j<12;j++){
                int diceResult=rollDie();
                if (diceResult==6){
                    sixCount+=1;

                }
            }
            if (sixCount>=2){
                totalCounter++;
            }
            //System.out.println(totalCounter);
        }
        double totalCounterDouble=totalCounter;
        //System.out.println(totalCounterDouble);
        //System.out.println(totalCounterDouble);
        return (totalCounterDouble/10000*100);
    }

    // Calculate the probability of rolling at least three 6's when rolling
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int sixCount=0;
        int totalCounter=0;
        for (int i = 0; i < 10000; i++) {
            sixCount=0;
            for (int j=0;j<18;j++){
                int diceResult=rollDie();
                if (diceResult==6){
                    sixCount+=1;

                }
            }
            if (sixCount>=3){
                totalCounter++;
            }
            //System.out.println(totalCounter);
        }
        double totalCounterDouble=totalCounter;
        //System.out.println(totalCounterDouble);
        //System.out.println(totalCounterDouble);
        return (totalCounterDouble/10000*100);
    }

    public static void main(String[] args) {
        // YOUR CODE HERE
    }
}
