package Section1;

import java.util.Scanner;
class EcologicalPremium10300 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sqm, ani, envo;
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {       //Testcases n
            int f = input.nextInt();
            double sum = 0;
            for (int j = 0; j < f; j++) {   //Farmers
                sqm      = input.nextInt();
                ani      = input.nextInt();
                envo     = input.nextInt();
                double avgSqm   = (double)sqm / (double)ani;
                double premium  = avgSqm * (double)envo;
                double premiumTotal = premium * (double)ani;
                sum += premiumTotal;
            }
            System.out.println((int)sum);
        }
    }
}