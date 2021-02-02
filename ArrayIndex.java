package Assignment2;

public class ArrayIndex {
	public static int findIndex(int arr[], int t) 
    { 
  
        
        if (arr == null) { 
            return -1; 
        } 
  
        
        int len = arr.length; 
        int i = 0; 
  
    
        while (i < len) { 
  
            if (arr[i] == t) { 
                return i; 
            } 
            else { 
                i = i + 1; 
            } 
        } 
        return -1; 
    } 
  
    
    public static void main(String[] args) 
    { 
        int[] my_array = { 1,2,3,5,7,13,345,45,56}; 
  
        
        System.out.println("Index position of 56 is: "
                           + findIndex(my_array, 56)); 
  
       
        System.out.println("Index position of 345 is: "
                           + findIndex(my_array, 345)); 
    } 
}

