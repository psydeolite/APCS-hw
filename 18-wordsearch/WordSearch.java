import java.util.*;
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

    //all possibilities of adding words, returns true if it adds 
    public boolean addWordAll(String w, int row, int col, int dRow, int dCol) {
	int c=col;
	int r=row;
	for (int i=0;i<w.length();i++) {
	    try {
		if (board[r][c]!=w.charAt(i) && board[r][c]!='.') {
		    return false;
		}
	    } catch (Exception e) {
		return false;
	    }
	    c=c+dCol;
	    r=r+dRow;
	}
	r=row;
	c=col;
	for (int i=0;i<w.length();i++) {
	    board[r][c]=w.charAt(i);
	    c=c+dCol;
	    r=r+dRow;	    
	}
	return true;
    }
    
    public boolean addWord(String w) {
	Random rand=new Random();
	int row=rand.nextInt(board.length);
	int col=rand.nextInt(board[0].length);
	int dRow=rand.nextInt(3)-1;
	int dCol=rand.nextInt(3)-1;
	if (dRow==0 && dCol==0) {
	    return false;
	}
	boolean r=addWordAll(w,row,col,dRow,dCol);
	System.out.println("row:"+row+" col:"+col+" dRow:"+dRow+" dCol:"+dCol);
	return r;
    }
    //Driver
    public static void main(String[] args) {
	WordSearch w = new WordSearch(20,40);
	System.out.println(w);
	//w.addWordAll("hello","r",3,15,1,1);
	//System.out.println(w);
	//w.addWordAll("olleh","l",4,15);
	//System.out.println(w);	
	//w.addWordAll("hello", "r",40,40); //outofbounds
	//w.addWordAll("hi","l",3,15); //overlap
	//System.out.println(w);	
	//w.addWordAll("hello","d",80,10); //out of bounds
	//w.addWordAll("hello","d",10,15); //overlap
	//System.out.println(w);
	//w.addWordAll("haythar","2",1,1); //diagonally
	//System.out.println(w);
	//w.addWordAll("oyvey","d",2,2);//test overlap
	//System.out.println(w.addWord("loquacious")); //test all
	System.out.println(w);
	w.addWordAll("oyvey",10,10,1,0);
	w.addWordAll("oyvey",10,10,1,1);
	w.addWordAll("oyvey",10,10,0,1);
	w.addWordAll("oyvey",10,10,-1,0);
	w.addWordAll("oyvey",10,10,-1,-1);
	w.addWordAll("oyvey",10,10,0,-1);
	w.addWordAll("oyvey",10,10,0,-1);
	w.addWordAll("oyvey",10,10,1,-1);
	w.addWordAll("oyvey",10,10,-1,1);
	
	System.out.println(w);
	    
    }
}
