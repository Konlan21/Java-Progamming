
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
//      Mortgage Calculator;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        double principal = scanner.nextDouble();

//        Annual Interest Rate
        System.out.print("Annual Interest Rate: ");
        float interestRate = scanner.nextFloat();
        interestRate /= 100;


//        Monthly Interest Rate
        float monthlyRate = interestRate / 12;

//        Period in Years
        System.out.print("Period (Years): ");
        int years = scanner.nextInt();

//        Number of payments
        double numberOfPayments = years * 12;

        double mortgage = principal * ((monthlyRate * (Math.pow(1 + monthlyRate, numberOfPayments))) / (Math.pow(1 + monthlyRate, numberOfPayments) - 1));
//        double mortgage = principal * ((monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments)) / (Math.pow(1 + monthlyRate, numberOfPayments) - 1));
        Math.round(mortgage);
        System.out.println("Mortgage: " + "$"+mortgage);
    }
}

