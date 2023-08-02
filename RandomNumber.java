import java.util.Random;
import java.util.Scanner;
public class RandomNumberGame {
    public static void main(String[] args)throws Exception {
        //Limit the user attempts
        int attempts=10,i=1,score=10,userNum,a=1,b=101;
        System.out.println("\n\nGuess a number between 1 and 100");
        int random = getNum(a,b);
        while(i<=10) {
            Scanner sc=new Scanner(System.in);
            userNum = sc.nextInt();
            if(userNum == random)
            {
                System.out.println("YOUR GUESS IS CORRECT !!!\n");
                score = (score-i)+1;
                break;
            }
            else if(userNum > random)
            {
                System.out.println("YOUR GUESS IS TOO HIGH");
            }
            else if(userNum < random) {
                System.out.println("YOUR GUESS IS TOO LOW");
            }
            i++;
        }
        if(i == (attempts+1))
            System.out.println("Your attempts completed");
       
        //SCORE
        System.out.println("\nYOUR SCORE IS "+score+"/10");
    }
    int min,max;
    public static int getNum(int min,int max) {
        Random r = new Random();
        return r.ints(min,max).findFirst().getAsInt();
    }
}
