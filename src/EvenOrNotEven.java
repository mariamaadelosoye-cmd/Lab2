import java.util.Random;

public class EvenOrNotEven {
    public int num;
    public void main(){
        Random rand = new Random();
        int num= rand.nextInt(101); //generating random number between 1 and 100
        System.out.println("Random Number: "+ num);

        if (num % 2==0) // Checking if remainder after division is 0
        {
            System.out.println(num + " is an even number");
        }
        else{
            System.out.println(num+ " is an odd number");
        }
    }
}
