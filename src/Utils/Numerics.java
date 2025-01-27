package Utils;

public class Numerics {
    public static boolean isPrime(int number) {
        int half = number/2 + 1;
        for (int i = 2; i <= half; i++) {
            if (number%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(341));  // debería dar false
        System.out.println(isPrime(3413));  // debería dar true
        System.out.println(isPrime(49));  // debería dar false
        System.out.println(isPrime(961));  // debería dar false
        System.out.println(isPrime(967));  // debería dar true
    }
}
