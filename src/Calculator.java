import java.util.Scanner;

public class Calculator {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int[] denominations = {100,50,20,10,5,1};

        System.out.println("Enter the amount: ");
        int amount = input.nextInt();

        System.out.println("Denominations required: ");
        for(int denomination : denominations){
            if(amount >= denomination){
                int count = amount / denomination;

                amount %= denomination;
                System.out.println(denomination + ":" + count);
            }
        }

        input.close();
    }
}
