public class Main{
    public static boolean armStrong(int a){
        int original = a;
        int p = String.valueOf(a).length();
        int sum =0;
        while(a>0){
            int digit = a%10;
            sum+=Math.pow(digit,p);
            a = a/10;
        }
        return original == sum;
    }
	public static void main(String[] args) {
	    int a = 153;
	    System.out.print(armStrong(a));
	}
}
