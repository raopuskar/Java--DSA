import java.util.Scanner;
public class FloydsTriangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
              System.out.print(m+" ");
              m++;
            }
            System.out.println();
        }
        sc.close();
    }
}