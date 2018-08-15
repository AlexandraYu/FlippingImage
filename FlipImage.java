public class FlipImage{
    public static int[][] flipAndInvertImage(int[][] A) {
        //row means each array 
        //column means how many elements in an arrays
        int rows = A.length;
        int cols = A[0].length;    

        
        //flip each array horizontally, do this for each array 
        flip(A, rows, cols);
        //revert means 1 becomes 0, and 0 becomes 1
        revert(A, rows, cols); 
        return A; 
    }        

    public static int[][] flip(int[][] A, int row, int col) {
        for(int x=0; x<row; x++) {
			int i=0, j=col-1, tmp=0;
            while(i<j) { 
                //flip horizontally simply means to exchange "tail" with "head" element until tail meets head;
                tmp=A[x][j];
                A[x][j]=A[x][i];
                A[x][i]=tmp;
                i++; 
                j--; 
            }
        }
        return A; 
    }
    
    public static int[][] revert(int[][] A, int row, int col) {
        for(int x=0; x<row; x++) {
            for(int y=0; y<col; y++) {
                if (A[x][y]==0) A[x][y]=1; 
                else A[x][y]=0; 
            }
        }
        return A; 
    }


    public static void main(String []args){
        int [][] array={{1,1,0,0},{1,0,0,1},{0,1,1,1}}; 
        flipAndInvertImage(array); 
        for (int i=0; i<3; i++) {
            System.out.print("\n");
            for (int j=0; j<4; j++) {
                System.out.print(array[i][j]+" "); 
            }
        }
    }
}