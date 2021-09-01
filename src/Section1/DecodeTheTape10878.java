package Section1;

import java.util.Scanner;
class DecodeTheTape10878 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder output = new StringBuilder();

        while (input.hasNextLine()) {
            String line = input.nextLine();
            if (line.charAt(0) == ('_')) {
                continue;
            }

            StringBuilder bytes = new StringBuilder();
            for ( int i = 2; i < line.length()-1; i++) {
                if (line.charAt(i) == ' ') {
                    bytes.append("0");
                }
                else if (line.charAt(i) == 'o') {
                    bytes.append("1");
                }
                else continue;
            }
            int charCode = Integer.parseInt(bytes.toString(), 2);
            char convertedChar = (char)charCode;
            output.append(convertedChar);
        }
        System.out.print(output);
    }
}


