import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int i = 1;

        while (Math.pow(i, 2) <= n) {
            System.out.println((int) Math.pow(i, 2));
            i++;
        }

    }
}