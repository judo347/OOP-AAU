package problem7;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        BankAccount accountMikkel = new BankAccount(400);

        try{
            accountMikkel.withdrawel(500);
            accountMikkel.withdrawel(-100);
        }catch (InsufficientFundsException e){
            System.out.println("You are short: " + e.getDeficit());
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
