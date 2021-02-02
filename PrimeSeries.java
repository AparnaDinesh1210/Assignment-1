package Assignment;

public class PrimeSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int first = 2, last = 17;

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


