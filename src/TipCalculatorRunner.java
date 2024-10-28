import java.util.Scanner;

public class TipCalculatorRunner {
    public static void main(String[] args) {
        System.out.println("|----------------------------------------|");
        System.out.println("|        Do not type in symbols!         |");
        System.out.println("|----------------------------------------|");
        System.out.println();
        System.out.println("------------------------------");

        Scanner s = new Scanner(System.in);
        System.out.print("Please enter your bill($): ");
        double bill = s.nextDouble();

        Scanner x = new Scanner(System.in);
        System.out.print("Please enter your tip percent: ");
        double tip = x.nextDouble();

        Scanner y = new Scanner(System.in);
        System.out.print("Please enter the amount of people: ");
        int ppl = y.nextInt();

        TipCalculator tC = new TipCalculator(bill, tip, ppl);

        System.out.println("------------------------------");
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("Total tip amount: $" + tC.amountOfTip());
        System.out.println("Total bill cost: $" + tC.totalBill());
        System.out.println("Tip per person: $" + tC.tipPerPpl());
        System.out.println("Total bill per person: $" + tC.totalPerPpl());
        System.out.println("------------------------------");
    }
}
