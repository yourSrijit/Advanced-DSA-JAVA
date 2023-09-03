package BackTracking;

public class Grid_Way {
    public static int countGridWay(int i,int j,int n,int m){
        if(i==n-1 && j==m-1){
            return 1;
        }
        else if(i==n ||j==m){
            return 0;
        }
        int way1=countGridWay(i+1,j,n,m);
        int way2=countGridWay(i,j+1,n,m);
        return (way1+way2);
    }
   public static void main(String[] args) {
   int row=3;
    int col=7;
    int ans=countGridWay(0,0,row,col);
       System.out.println("Total possible way to reach "+ans);

  }
 }
