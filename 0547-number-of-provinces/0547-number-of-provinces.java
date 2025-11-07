class Solution {
    private void dfs(int row, int[][] isConnected, boolean visited[]) {
        visited[row] = true;
        for(int i=0; i<isConnected.length; i++){
            if(isConnected[row][i]==1 && visited[i]==false){
                dfs(i, isConnected, visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean visited[] = new boolean[n];
        int provinces = 0;

        for(int i=0; i<n; i++){
            if(visited[i]==false){
                dfs(i, isConnected, visited);
                provinces = provinces+1;
            }
        }
        return provinces;
    }
}