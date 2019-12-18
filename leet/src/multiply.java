public class multiply {
    public static String multiply(String num1, String num2) {
        int num1_int = StringtoInt(num1);
        int num2_int = StringtoInt(num2);
        int num3_int = num1_int * num2_int;
        return Integer.toString(num3_int);
    }

    static int StringtoInt(String str){
        char[] arr = str.toCharArray();
        int toInt = 0;
        //return String.();
        int length = arr.length;
        for(int i = 0;i < arr.length;i++){
            int num10 = (int)Math.pow(10, length - 1 - i);
            toInt += Integer.parseInt(String.valueOf(arr[i])) * num10;
        }
        return toInt;

    }

    public static void main(String[] args){
        String a = "12";
        String b = "4";
        System.out.println(multiply(a, b));
    }
}
