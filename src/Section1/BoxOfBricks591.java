package Section1;

import java.util.Scanner;
class BoxOfBricks591 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int set = 1;
        while (true) {
            int n = input.nextInt(); // Stacks
            if (n == 0) {
                break;
            }
            int sum = 0;
            int stacks[] = new int[n];
            for (int i = 0; i < n; i++) {
                int h = input.nextInt();
                stacks[i] = h;
                sum += h;
            }
            int height = sum / n;
            int moves = 0;
            for (int j = 0; j < n; j++) {
                if (stacks[j] > height)
                    moves += stacks[j] - height;
            }
            System.out.println("Set #" + set);
            System.out.println("The minimum number of moves is " + moves + ".");
            System.out.println("");
            set++;
        }
        System.exit(0);
    }
}

