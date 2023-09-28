

public class Operators {
    public static void main(String[] args) {
        int i = 10;
        int f = 3;
        f += i;
        i -= f;
        System.out.println("Value of strings: i:" + i + " and f:" + f);
        System.out.println("Incremented 'i' by one, decremeted 'f' by 1");
        // increment & decrement 
        i++;
        f--;
        System.out.println("Value of strings: i:" + i + " and f:" + f);
        if (i % 2 == 0) {
            System.out.println("i is even");
        } else {
            System.out.println("i is false");
        }
    }
}