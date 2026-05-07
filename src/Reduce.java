public class Reduce {
    public static void main(String [] args) {
        System.out.println("Steps taken to reduce to 100: ");
        System.out.print(helper(100));
    }

    public static int helper(int n){
        int steps_taken = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2;
            }
            if (n % 2 == 1) {
                n -= 1;
            }
            steps_taken++;
        }
        return steps_taken;
    }
}
