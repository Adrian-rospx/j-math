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

        // check that the triangle is valid
        if(validTriangle(sides)) {
            System.out.println("The triangle is valid");

            double area = calculateArea(sides);
            System.out.printf("The triangle's area is %.2f cm^2", area);
        }
        else
            System.out.println("The triangle is not valid!");

        scanner.close();
    }

    static boolean validTriangle(int[] sides) {
        // check if it can be a triangle
        for(int i = 0; i < sides.length; i++) {
            int a = sides[i];
            int b = sides[(i+1)%3];
            int c = sides[(i+2)%3];

            if(a > b+c)
                return false;
        }
        return true;
    }

    static double calculateArea(int[] sides) {
        double semiPerimeter = 0;
        for(int side : sides) semiPerimeter += side;
        semiPerimeter /= 2;

        double area = 1;
        area *= semiPerimeter;
        for(int side : sides) {
            area *=  (semiPerimeter - side);
        }
        area = Math.sqrt(area);

        return area;
    }
}
