public class tribonacci {
    public static int tribonacci(int n) {
        switch (n)
        {
            case 0:
                return 0;
                //break;
            case 1:
                return 1;
            case 2:
                return 1;
        }
        return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);

    }
}
