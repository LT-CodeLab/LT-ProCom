import java.util.*;

public class DrivingMadness {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        int r = sc.nextInt();
        int c = sc.nextInt();
        
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        sc.nextLine();
        
        int[][] map = new int[rows][cols];
        
        for(int i = 0; i < rows; i++) {
        
            String line = sc.nextLine();
            
            for(int j = 0; j < cols; j++) {
                
                map[i][j] = Integer.parseInt(line.substring(j, j+1));
                
            }
        
        }
    }

}
