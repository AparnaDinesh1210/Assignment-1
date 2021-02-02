package day2;

public class PrimeNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 10, last = 99;

        while (first < last) {
            boolean flag = false;

            for(int i = 2; i <= first/2; ++i) {
                
                if(first % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && first != 0 && first != 1)
                System.out.print(first + " ");

            ++first;
	   }
	}

}
