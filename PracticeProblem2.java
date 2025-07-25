public class PracticeQuestions1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 4, 6, 7, 8};
        int n = 4;
        System.out.println("The number " + n + " appears " + countOccurrences(arr, n) + " times.");
    }

    public static int countOccurrences(int[] arr, int n) {
        int count = 0; 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) { 
                count++; 
            }
        }
        return count; 
    }
}
