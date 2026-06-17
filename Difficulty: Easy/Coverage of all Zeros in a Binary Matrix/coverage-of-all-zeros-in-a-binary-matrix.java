class Solution {
    public int findCoverage(int[][] mat) {
        int c=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    
                    for(int k=j-1;k>=0;k--){
                        if(mat[i][k]==1){
                            c++;
                            break;
                        }
                    }
                    
                    for(int k=j+1;k<mat[0].length;k++){
                        if(mat[i][k]==1){
                            c++;
                            break;
                        }
                    }
                    for(int k=i-1;k>=0;k--){
                        if(mat[k][j]==1){
                            c++;
                            break;
                        }
                    }
                    for(int k=i+1;k<mat.length;k++){
                        if(mat[k][j]==1){
                            c++;
                            break;
                        }
                    }
                    
                }
            }
        }
        return c;
    }
}