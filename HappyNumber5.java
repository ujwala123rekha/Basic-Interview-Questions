//happy no: sum of the square of individual digits
//use set to do non continuos loops

import java.util.*;

public class Main{
    public static boolean happy(int n){
        HashSet<Integer> set = new HashSet<>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
            int sum =0;
            while(n>0){
                int digit = n%10;
                sum+=sum*10+digit;
                n = n/10;
            }
            n = sum;
        }
        return n ==1;
    }
	public static void main(String[] args) {
	    int n = 19;
	    System.out.print(happy(n));
	}
}
