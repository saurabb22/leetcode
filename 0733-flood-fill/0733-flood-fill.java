class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if(image[sr][sc] != color){
            dfs(image,sr,sc,color,originalColor);
        }else{
            return image;
        }
        return image;
    }
    void dfs(int image[][], int i, int j, int color, int originalColor) {
        if(i >= image.length || i<0 || j < 0 || j >=image[0].length) return;
        if(image[i][j] != originalColor) return;
        image[i][j] = color;
        dfs(image, i, j + 1, color, originalColor); 
        dfs(image, i, j - 1, color, originalColor);
        dfs(image, i + 1, j, color, originalColor);
        dfs(image, i - 1, j, color, originalColor);

    }
}