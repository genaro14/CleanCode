import java.util.Scanner;
//Boom:  1.000.000.000

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value to generate primes: ");
        int maxValue = scanner.nextInt();

        int[] primes = GeneratePrimes.generatePrimes(maxValue);

        System.out.println("Primes:");
        for (int prime : primes) {
            System.out.println(prime);
        }
    }
}