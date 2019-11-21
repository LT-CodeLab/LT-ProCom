import java.util.Scanner;
class ShapeFinder {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numPoints = sc.nextInt();
        
        int[][] points = new int[numPoints][2];
          
        for(int i = 0; i < numPoints; i++) {
          points[i][0] = sc.nextInt();
          points[i][1] = sc.nextInt();
        }
    }
}
