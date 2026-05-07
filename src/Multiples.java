public class Multiples {
    static void main() {
        int num1 = 3;
        int num2 = 5;
        int count = 0;
        for (int i = 1; i < 1000; i++){
            if ( i  % 3 == 0 || i % 5 == 0){
               count ++;
            }
        }
        System.out.println(count);
    }

}
