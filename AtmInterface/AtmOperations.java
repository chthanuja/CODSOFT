import java.util.HashMap;
import java.util.Map;
public class AtmOperations implements AtmInterface{
    ATM atm=new ATM();
    Map<Float,String> ministmt=new HashMap<>();
    @Override
    public void balance() {
        System.out.println("Available Balance is : "+atm.getBalance());
    }
    @Override
    public void withdraw(float wAmount) {
            if (wAmount <= atm.getBalance()) {
                System.out.println("Take your Cash " + wAmount);
                atm.setBalance(atm.getBalance() - wAmount);
                balance();
            } else {
                System.out.println("INSUFFICIENT BALANCE..");
            }
    }
    @Override
    public void deposit(float dAmount) {
        System.out.println(dAmount+" Deposited Successfully");
        atm.setBalance(atm.getBalance()+dAmount);
        balance();
    }
}
