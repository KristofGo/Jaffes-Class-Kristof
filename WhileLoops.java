
public class WhileLoops
{
    public static void main(String[] args) {
        int i = 0;
        while (i < 15) {
            System.out.println("i is" + i + "but is less than 15");
            i = i + 1;
        }
        int k = 6;
        while (k > 5) {
            System.out.println("k is" + k + "but is greater than 5");
            k++;
        }
        int a = 0;
        int b = 0;
        while (a < 10 && b <= 20) {
            System.out.println("a is" + a + "but is less than 10");
            System.out.println("b is" + b + "but is less than or equal to 20");
        }
    }
}
