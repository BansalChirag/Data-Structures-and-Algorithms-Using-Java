import java.util.Scanner;

public class InvertedStarPyramid {
    void printStarPyramid(int n){
        for (int rows = 0; rows < n; rows++) {
            for (int spaces = 0; spaces < rows; spaces++) {
                System.out.print(" ");
            }
            for (int star = 0; star < 2*(n-rows)-1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        new InvertedStarPyramid().printStarPyramid(n);
        sc.close();
    }
}
