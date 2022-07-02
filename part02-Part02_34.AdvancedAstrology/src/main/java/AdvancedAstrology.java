
public class AdvancedAstrology {

    public static void main(String[] args) {

        christmasTree(10);

    }

    public static void printStars(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                printSpaces(1);
            }
            for (int j = 1; j <= i; j++) {
                printStars(1);
            }
            System.out.println();
        }
    }

    public static void christmasTree(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                printSpaces(1);
            }
            for (int j = 1; j <= i; j++) {
                printStars(1);
            }
            for (int j = 1; j < i; j++) {
                printStars(1);
            }
            for (int j = 1; j <= height - i; j++) {
                printSpaces(1);
            }
            System.out.println();
        }
        for (int i = 1; i <= 2; i++) {
            printSpaces(height - 2);
            printStars(3);
            printSpaces(height - 2);
            System.out.println();
        }
    }
}
