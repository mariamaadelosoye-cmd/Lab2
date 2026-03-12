import java.util.Random;

public class EvenOrNotEven {
    public int num;
    public void main(){
        Random rand = new Random();
        int num= rand.nextInt(101);
        System.out.println("Random Number: "+ num);

        if (num % 2==0)
        {
            System.out.println(num + " is an even number");
        }
        else{
            System.out.println(num+ " is an odd number");
        }
    }
}
