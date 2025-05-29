import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Java triangle area calculator!");

        // declaration of sides
        int[] sides = new int[3];

        // enter each side
        System.out.println("Type in the dimensions of each side:");
        for(int i = 0; i < sides.length; i++) {
            System.out.printf("Side number %d = ", i+1);
            sides[i] = scanner.nextInt();
        }
        scanner.nextLine();

        // display dimensions
        for(int side : sides) {
            System.out.printf("%d cm\n", side);
        }

        scanner.close();
    }
}
