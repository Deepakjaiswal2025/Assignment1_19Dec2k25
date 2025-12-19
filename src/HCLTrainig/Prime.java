package HCLTrainig;
import java.util.*;
public class Prime {
	public static void main(String[] agrs) {
		System.out.println("TAke Inpute from Usser");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(isPrime(num));
		
		
	}
	public static boolean isPrime(int n) {
		int count = 0;
		if(n<1)
			return false;
        for (int i=1;i*i<=n;i++){
            if (n%i==0){
                count =count+1;
                if (n/i!=i)
                    count+=1;


            }
            if (count>2) break;
        }
        if (count==2)
            return true;
        else
        return false;
	}

}
