public class Main{
    public static int reverse(int a){
        int ans = 0;
        while(a>0){
            int digit = a%10;
            ans = ans*10+digit;
            a = a/10;
        }
        return ans;
    }
	public static void main(String[] args) {
	    int a = 1234;
	    System.out.print(reverse(a));
	}
}
