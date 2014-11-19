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
		    board[row][c]=w.charAt(i);
		    c--;
		}
<<<<<<< HEAD
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
    }
=======
 
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

		public void addWordH(String w, int row, int col){
				int c = col;
				for (int i=0; i < w.length();i++){
						board[row][c] = w.charAt(i);
						c++;
				}
		}
		
		public static void main(String[] args) {
				WordSearch w = new WordSearch();
				System.out.println(w);
				w.addWordH("hello",3,15); // should work
				w.addWordH("look",3,14); // test illegal overlap
				//w.addWordH("look",3,18); // test legal overlap
				//w.addWordH("look",-3,20); // test illegal row
				//w.addWordH("look",3,55); // test illegal col
				// etc
				System.out.println(w);
		}
>>>>>>> fedea11ddf2d60064d2252533788adba1afdf417
}
