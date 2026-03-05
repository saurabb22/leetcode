/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
var rotate = function(matrix) {
    let n = matrix.length;
    let ans = new Array(n).fill(0).map(() => new Array(n));


    let ind=0;
    for(let i=n-1; i>=0; i--){
        for(let j=0; j<n; j++){
            ans[j][i] = matrix[ind][j];
        }
        ind++;
    }

    for(let i=0; i<n; i++){
        for(let j=0; j<n; j++){
            matrix[i][j]=  ans[i][j];
        }
    }
    return

};