import java.util.Scanner;

public class MLIAreas {

    public static void main(String[] args) {
    
    
        Scanner sc = new Scanner(System.in);
        
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        int[][] data = new int[rows][cols];
        
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                data[i][j] = sc.nextInt();
            }
        }
 
    }

}
