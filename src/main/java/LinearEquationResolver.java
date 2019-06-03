import java.util.Scanner;
public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given an equation as 'ax + b = 0', please enter constants ");

        Scanner scanner = new Scanner(System.in);
        double a,b;
        System.out.println("a: ");
        a = scanner.nextDouble();

        System.out.println("b: ");
        b = scanner.nextDouble();

        if (a != 0) {
           double answer = b / a;
            System.out.printf("The solution is: %f!\n", answer);
        } else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
