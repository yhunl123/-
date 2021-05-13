
public class PrimeNum {

	public static void main(String[] args) {
		
		int val = 13;
		
		if(Prime_Number(val) == true)
			System.out.println(val + " 소수입니다.");
		else
			System.out.println(val + " 합성수 입니다.");
		
	}

	public static boolean Prime_Number(int val) {
		
		int num = 2;
		boolean ispn = true;
		
		for(int i = 0;i < val-2;i++) {
			if(val % num == 0) {
				ispn = false;
				break;
			}
			num = num + 1;
			
		}
		if(val == 1)
			ispn = false;
		
		return ispn;
	}
	
}
