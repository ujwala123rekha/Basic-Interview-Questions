//perfect number sum of factors same number (6)

import java.util.*;

public class Main{
    public static boolean perfect(int n){
        int sum =0;
        for(int i =1 ;i<=n/2;i++){
          if(n%i==0){
            sum+=i;
          }
        }
        return sum == n;
    }
	public static void main(String[] args) {
	   System.out.print(perfect(6));
	}
}
