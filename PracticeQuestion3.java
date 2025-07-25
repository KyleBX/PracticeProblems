public class PracticeQuestion3 {
    public static void main(String[] args) {

        double[][] grid = {
            {1.5, 2.5, 3.5},
            {4.5, 5.5, 6.5},
            {7.5, 8.5, 9.5}
        };
           double result = sumGrid(grid);
        System.out.println("The sum of the grid elements is: " + result);
    }

    public static double sumGrid(double[][] grid) {
        double sum = 0.0; 
        
       
        for (int i = 0; i < grid.length; i++) { 
            for (int j = 0; j < grid[i].length; j++) {
                sum += grid[i][j]; 
        }
        
        return sum; 
    }
            return sum;
} 
}
