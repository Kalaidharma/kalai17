import java.util.Scanner;
public class Digitscount {
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n,i,l,a,count=0;
	n=sc.nextInt();
	l=String.valueOf(n).length();
	for(i=0;i<l;i++){
		a=n%10;
		n=n/10;
		count++;
	}
	System.out.println(count);

}
	}
