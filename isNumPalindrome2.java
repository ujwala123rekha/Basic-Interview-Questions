public class Main{
    public static boolean reverse(int a){
        int ans = 0;
        int original = a;
        while(a>0){
            int digit = a%10;
            ans = ans*10+digit;
            a = a/10;
        }
        return ans==original;
    }
	public static void main(String[] args) {
	    int a = 12321;
	    System.out.print(reverse(a));
	}
}
