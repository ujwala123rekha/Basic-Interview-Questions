//original == sum of fact
public class Main{
    public static int fact(int n){
        if(n==0 || n==1)return 1;
        return n*fact(n-1);
    }
    public static boolean strong(int n){
        int original = n;
        int pro = 1;
        while(n>0){
            int digit = n%10;
            pro+=fact(digit);
            n=n/10;
        }
        return original == pro;
    }
	public static void main(String[] args) {
	    int n = 145;
	    System.out.print(strong(n));
	}
}
