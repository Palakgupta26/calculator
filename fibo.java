public class fibo {
    public static int fib(int n){
        if( n==0){
            return 0;
        }
        if( n==1){
            return 1;
        }

        int c = fib(n-1)+fib(n-2);
        return c;
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
        System.out.println("Number:");
        System.out.println(fib(7));
    }
}