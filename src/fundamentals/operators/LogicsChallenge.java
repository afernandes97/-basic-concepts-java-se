package fundamentals.operators;

public class LogicsChallenge {
    public static void main(String[] args) {
        //work Tuesday (true or false)
        //work Thursday (true or false)

        //my answer
        boolean workTuesday = true;
        boolean workThursday = true;

        if(workTuesday ^ workThursday){
            System.out.println("You he can buy one 32' Tv and going to eat ice cream");
        }else if(workTuesday && workThursday){
            System.out.println("You he can buy one 50' Tv and going to eat ice cream");
        }else{
            System.out.println("Stay at home");
        }

        //teacher answer

        boolean workOne = true;
        boolean workTwo = false;

        boolean buyTv50 = workOne && workTwo;
        boolean buyTv32 = workOne ^ workTwo;
        boolean buyIceCream = workOne || workTwo;

        System.out.println("Buy a tv 50\"? " + buyTv50);
        System.out.println("Buy a tv 32\"? " + buyTv32);
        System.out.println("Buy a ice cream? " + buyIceCream);
        System.out.println("Buy a ice cream? " + buyIceCream);
        System.out.println("healthier?" + !buyIceCream );
    }
}
