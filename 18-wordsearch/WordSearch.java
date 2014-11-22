public class WordSearch {
    private char[][] board;
    
    public WordSearch(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
    }
    public WordSearch() {
	this(20,40);
    }
    
    public String toString(){
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }

    public void addWordH(String w, String direction, int row, int col) {
	int c=col;
	if (col+w.length()>board.length || col-w.length()<0 || row>=board[0].length) {
	    System.out.println("out of bounds");
	} else {
	    if (direction.equals("r")){
		for (int i=0;i<w.length();i++) {
		    if (board[row][c]==w.charAt(i) || board[row][c]=='.') {
			board[row][c]=w.charAt(i);
			c++;
		    } else {
			System.out.println("overlap error");
		    }
		}
	    }
	    if (direction.equals("l")){
		for (int i=0;i<w.length();i++){
		    if (board[row][c]==w.charAt(i) || board[row][c]=='.') {
			board[row][c]=w.charAt(i);
			c--;
		    } else {
			System.out.println("overlap error");
		    }
		}
	    }
	}
    }

    public void addWordV(String w, String direction, int row, int col) {
	int r=row;
	if (row+w.length()>board[0].length ||  row-w.length()<0 || col>=board.length) {
	    System.out.println("out of bounds");
	} else {
	    if (direction.equals("d")) {
		for (int i=0;i<w.length();i++) {
		    if (board[r][col]==w.charAt(i) || board[r][col]=='.') {
			board[r][col]=w.charAt(i);
			r++;
		    } else {
			System.out.println("overlap error");
		    }
		}
	    } else if (direction.equals("u")) {
		for (int i=0;i<w.length();i++) {
		    if (board[r][col]==w.charAt(i) || board[r][col]=='.') {
			board[r][col]=w.charAt(i);
			r--;
		    } else {
			System.out.println("overlap error");
		    }
		}
	    }
	}
    }



    public static void main(String[] args) {
	WordSearch w = new WordSearch(20,40);
	System.out.println(w);
	w.addWordH("hello","r",3,15);
	System.out.println(w);
	w.addWordH("olleh","l",4,15);
	System.out.println(w);	
	w.addWordH("hello", "r",40,10); //outofbounds
	w.addWordH("hi","l",3,15); //overlap
	System.out.println(w);	
	w.addWordV("hello","d",40,10); //out of bounds
	w.addWordV("hello","d",10,15); //overlap
	System.out.println(w);
	
    }
}
