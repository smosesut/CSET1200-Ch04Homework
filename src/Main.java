import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a alphabetical character to convert: ");
        Scanner scnr = new Scanner(System.in);
        char input = scnr.next().charAt(0);
        int n = 0;
        switch (Character.toUpperCase(input)) {
            case 'A': case 'B': case 'C':
                n = 2;
                break;
            case 'D': case 'E': case 'F' :
                n = 3;
                break;
            case 'G': case 'H': case 'I':
                n = 4;
                break;
            case 'J': case 'K': case 'L':
                n = 5;
                break;
            case 'M': case 'N': case 'O':
                n = 6;
                break;
            case 'P': case 'Q': case 'R': case 'S':
                n = 7;
                break;
            case 'T': case 'U': case 'V':
                n = 8;
                break;
            case 'W': case 'X': case 'Y': case 'Z':
                n = 9;
                break;
            default:
                System.out.println("Invalid character");
                System.exit(1);
        }
        System.out.println(n);
    }
}