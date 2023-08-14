import java.util.*;
public class AtmMachine {
    public static void main(String[] args)throws Exception {
        AtmInterface a=new AtmOperations();
        Scanner sc =new Scanner(System.in);
        System.out.print("\n\nEnter your Atm Number : ");
        int atmNumber=sc.nextInt();
        System.out.print("Enter Pin: ");
        int pin=sc.nextInt();
            while(true){
                System.out.println("1...Check Balance\n2...Withdraw Amount\n3...Deposit Amount\n4...Exit");
                System.out.println("\nEnter your Choice : ");
                int ch=sc.nextInt();
                switch(ch){
                    case 1:
                    a.balance();
                    break;

                    case 2:
                    System.out.println("Enter the amount to withdraw ");
                    float wAmount=sc.nextFloat();
                    a.withdraw(wAmount);
                    break;

                    case 3:
                    System.out.println("Enter Amount to Deposit :");
                    float dAmount=sc.nextFloat();
                    a.deposit(dAmount);
                    break;
                    
                    case 4:
                    System.out.println("\nDon't forget to Collect your ATM Card\nTHANKU FOR VISITING !!!\n");
                    System.exit(0);
                    break;
                    
                    default:
                    System.out.println("INVALID CHOICE");
                    break;
                }
            }

    }
}
