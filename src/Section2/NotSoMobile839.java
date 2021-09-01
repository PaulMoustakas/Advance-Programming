package Section2;

import java.util.Scanner;

class Main {
    Scanner input = new Scanner(System.in);
    public boolean equilibrium;

    public static void main(String[] args) {
        new Main().start();
    }

    public void start () {
        int n = input.nextInt(); // Test cases

        while (n-- != 0) {
            input.nextLine();   //Pop the empty line
            equilibrium = true;
            equilibriumCheck();
            if (equilibrium)    System.out.println("YES");
            else                System.out.println("NO");
            if (n != 0)         System.out.println();
        }
    }

    private int equilibriumCheck() {
        int wl, dl, wr, dr;
        wl = input.nextInt();
        dl = input.nextInt();
        wr = input.nextInt();
        dr = input.nextInt();
        if (wl == 0) wl = equilibriumCheck();
        if (wr == 0) wr = equilibriumCheck();
        if (wl*dl == wr*dr) return wl + wr;
        else equilibrium = false;
        return 0;
    }
}
