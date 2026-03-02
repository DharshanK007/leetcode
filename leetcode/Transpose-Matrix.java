1class Solution {
2    public int[][] transpose(int[][] matrix) {
3        int row = matrix.length;
4        int col = matrix[0].length;
5        int arr [][] =new int [col][row];
6        for (int i=0;i<row;i++){
7            for (int j=0;j<col;j++){
8                arr[j][i]=matrix[i][j];
9            }
10        }
11        return arr;
12        }
13}
14
15 
16