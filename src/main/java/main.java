import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input:");
        int n = sc.nextInt();

        tree newtree = new tree(n);
        newtree.growAtree();

    }
}
