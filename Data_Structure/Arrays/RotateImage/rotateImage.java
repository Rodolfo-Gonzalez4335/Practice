int[][] rotateImage(int[][] a) {
    int[][] b = new int[a.length][a.length];
    for (int i=0; i<a.length; i++){
        for (int j=0; j<a[i].length; j++)
        {
            b[i][j]= a[(a[i].length-j-1)][i];
        }
    }
    return b;
}
