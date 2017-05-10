/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loantable1015;

/**
 *
 * @author kms080
 */
import java.util.Scanner;
public class LoanTable1015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please input the principal for the loan: ");
        double loanPrincipal = in.nextDouble();
        System.out.print("Please input the length of years you will be paying this loan: ");
        int loanYear = in.nextInt();
        System.out.print("Please input a low interest rate: ");
        double lowRate = in.nextDouble();
        System.out.print("Please input a high interest rate: ");
        double highRate = in.nextDouble();
        System.out.print("Mortgage problem\n\n"
                + "Principal: $" + loanPrincipal
                + "\nTime: " + loanYear
                + "\nLow rate: " + lowRate + "%"
                + "\nHigh rate: " + highRate + "%\n\n");
        System.out.printf("%10s %20s", "Annual Interest Rate", "Monthly Payment");
        double annualRate = lowRate/100;
        for(double i = lowRate; i < highRate + 0.25; i+= 0.25) {
            System.out.print("\n");
            double monthlyRate = annualRate/12;
            double monthlyPayment = (loanPrincipal*(monthlyRate)*Math.pow(1+(monthlyRate),(loanYear*12)))/(Math.pow(1+(monthlyRate),(loanYear*12))-1);
            System.out.printf("%10.2f %25.2f", annualRate*100, monthlyPayment);
            annualRate += .0025;
        }
    }
}
