package java210516;

public class Bonus {
    public int getMost(int[][] board) {
        // write code here
        for(int i =0;i<board.length;i++){
            for(int j =0;j<board[0].length;j++){
                if(i==0&&j==0){
                    //此时在原点不需要考虑点从上边还是左边过来的
                }else if(i==0){
                    //此时在上边界
                    board[i][j] += board[i][j-1];
                }else if(j==0){
                    //此时在左边界
                    board[i][j] += board[i-1][j];
                }else{
                    //此时在中间
                    //需要判断此时这个点是从哪边过来的
                    int tmpup = board[i-1][j];
                    int tmpleft = board[i][j-1];
                    if(tmpup>tmpleft){
                        board[i][j] += tmpup;
                    }else{
                        board[i][j] += tmpleft;
                    }
                }
            }
        }
        return board[board.length-1][board[0].length-1];
    }
}
