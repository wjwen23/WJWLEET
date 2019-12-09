public class divide {
    protected static int divide(int dividend, int divisor) {
        if (dividend == 0 || divisor == 0){
            return 0;
        }
        int count = 0;
        int absdivided = Math.abs(dividend);
        int absdivisor = Math.abs(divisor);
        if(absdivided >= absdivisor){
            count = divide(absdivided - absdivisor, absdivisor);
            count = count + 1;
        }else{
            return 0;
        }
        if(((dividend < 0)&&(divisor > 0)) || ((dividend > 0)&&(divisor < 0))){
            return -count;
        }else{
            return count;
        }
        //return count;
    }


    public static void main(String args[]){
        System.out.println(divide(-6,2));
    }
}
