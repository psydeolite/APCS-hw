public class WordSearch {
    private char[][] board;

    public WordSearch(int r, int c) {
	board=new char[r][c];
	for (int i=0;i<board.length;i++) {
	    for (int j=0; j<board[0].length;j++) {
		board[i][j]='.';
	    }
	}
    }
					   
    public WordSearch() {
	this(20, 40);
    }

    public String toString() {
	String r="";
	for (int i=0;i<board.length;i++) {
	    for (int j=0;j<board[i].length;j++) {
		r+=board[i][j];
	    }
	    r+="\n";
	}
	return r;
    }
}
