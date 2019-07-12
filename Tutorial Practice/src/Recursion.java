public class Recursion {

    public static int Summation(int n){
        //Base case:
        if (n<= 0){
            return 0;
        }
        //Recursive Case: Keep going until reaching Base case:
        else {
            return n + Summation(n-1);
        }
    }

    public static int Factorial (int n) {
        //Base Case:
        if (n <= 1){
            return 1;
        }
        //Recursive Call:
        else {
            return n * Factorial(n-1);
        }
    }

    public static int Exponentiation(int n, int p){
        // Base Case:
        if( p <= 0){
            return 1;
        }
        else{
            return n * Exponentiation(n,p-1);
        }
    }

    public static void main(String[] args){
        System.out.printf("Summation of 3: %5d \n",Summation(3));
        System.out.printf("Factorial of 3: %5d \n",Factorial(3));
        System.out.printf("5^3           : %5d \n",Exponentiation(5,3));

    }
}
