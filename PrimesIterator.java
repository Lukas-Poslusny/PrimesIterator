import java.util.ArrayList;
import java.util.Iterator;

public class PrimesIterator implements Iterator<Integer> {

    static ArrayList<Integer> primesList = new ArrayList<Integer>();
    private int i = 1;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        do {
            i++;
        } while (!isPrime(i));
        return i;
    }

    public static void main(String[] args) {
        for (int prime : new PrimesIterable()) {
            if (prime < 100)
            System.out.println(prime);
        }
    }

    private static boolean isPrime(int i) {
        int sqroot = (int) Math.sqrt(i);
        for (int prime: primesList) {
            if (prime > sqroot) break;
            if (i % prime == 0) {
                return false;
            }
        }
        primesList.add(i);
        return true;
    }
}
