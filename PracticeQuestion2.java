public class PracticeQuestion2 {
    public static void main(String[] args) {
      
        int[] arr = {1, 2, 3, 4, 5};

      
        int[] reversedArr = reverseArray(arr);

        
        System.out.print("Reversed Array: [");
        for (int i = 0; i < reversedArr.length; i++) {
            System.out.print(reversedArr[i]);
            if (i < reversedArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");  
    }

  
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length]; 

        for (int i = 0; i < arr.length; i++) {
    
            reversed[i] = arr[arr.length - 1 - i];
        }

        return reversed; 
    }

}

