package ba.unsa.etf.rpr.t1;

import java.util.Scanner;

public class Main {

    private static int sumaCifara(int x){
        int c=0;
        while(x!=0){
            c=c+(x%10);
            x=x/10;
        }
        return c;
    }

    public static void main(String[] args) {
	    int n;
	    Scanner ulaz = new Scanner(System.in);
	    System.out.print("Unesite broj: ");
	    n=ulaz.nextInt();
	    for(int i=1; i<n; i++){
	        if(i%(sumaCifara(i))==0){
	            System.out.printf("%d ", i);
            }
        }
    }
}
