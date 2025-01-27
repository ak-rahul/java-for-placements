public class Patterns{
    public static void main(String args[]){
        // Create a Butterfly pattern
        int n = 5;
        for (int i = 1; i <= 2*n; i++){ 
            if(i <= n){
                System.out.println("*".repeat(i) + " ".repeat(2 * n - 2 * i) + "*".repeat(i));
            } else {
                System.out.println("*".repeat(2*n - i) + " ".repeat(2 * i - 2*n) + "*".repeat(2*n - i));
            }
        }

        //Create a Parallelogram of stars
        n = 5;
        for(int i = 0; i<n; i++){
            System.out.println(" ".repeat(n - i) + "*".repeat(n) + " ".repeat(i));
        }
    }
}