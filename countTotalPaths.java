public class countTotalPaths {
    public static void main(String args[]){
        int mat[][] = new int[3][3];
        for(int i = 0;i < mat.length;i++){
            for(int j = 0;j < mat[0].length;j++){
                mat[i][j] = 0;
            }
        }
        int totalPaths = countPaths(mat, 0, 0);
        System.out.println(totalPaths);
    }

    public static int countPaths(int mat[][], int i, int j){

        if(i >= mat.length || j >= mat[0].length){
            return 0;
        }

        if(i == mat.length-1 && j == mat.length-1){
            return 1;
        }

        int down = countPaths(mat, i+1, j);
        int right = countPaths(mat, i, j+1);
        return down + right;

    }

}
