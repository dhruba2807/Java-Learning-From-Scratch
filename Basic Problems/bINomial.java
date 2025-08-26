public class bINomial {

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static int binomial(int n, int r) {
        int binomial_n = factorial(n);
        int binomial_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int biocoefficient = binomial_n / (binomial_r * fact_nmr);

        return biocoefficient; 
    }

    public static void main(String[] args) {
        System.out.println(binomial(5, 2)); // Example output: 10
    }
}
