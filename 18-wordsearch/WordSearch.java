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

    //add words horizontally
    public boolean addWordH(String w, String direction, int row, int col) {
	boolean fin=false;
	int c=col;
	if (direction.equals("r")){
	    if (col+w.length()>board.length) {
		System.out.println("length out of bounds");
	    } else {
		for (int i=0;i<w.length();i++) {
		    if (board[row][c]==w.charAt(i) || board[row][c]=='.') {
			board[row][c]=w.charAt(i);
			c++;
			fin=true;
		    } else {
			System.out.println("overlap error");
			break;
		    }
		}
		fin=true;
	    }
	} else {
	    if (col-w.length()<0) {
		System.out.println("length out of bounds");
	    } else {
		for (int i=0;i<w.length();i++){
		    if (board[row][c]==w.charAt(i) || board[row][c]=='.') {
			board[row][c]=w.charAt(i);
			c--;
			fin=true;
		    } else {
			fin=false;
			System.out.println("overlap error");
			break;
		    }
		}
	    }
	}
	return fin;
    }

    //add words vertically
    public boolean addWordV(String w, String direction, int row, int col) {
	boolean fin=false;
	int r=row;
	if (direction.equals("d")) {
	    if (row+w.length()>board[0].length) {
		System.out.println("length out of bounds");
	    } else {
		for (int i=0;i<w.length();i++) {
		    if (board[r][col]==w.charAt(i) || board[r][col]=='.') {
			board[r][col]=w.charAt(i);
			r++;
			fin=true;
		    } else {
			fin=false;
			System.out.println("overlap error");
			break;
		    }
		}
	    }
	} else {
	    if (row-w.length()<0) {
		System.out.println("row out of bounds");
	    } else {
		for (int i=0;i<w.length();i++) {
		    if (board[r][col]==w.charAt(i) || board[r][col]=='.') {
			board[r][col]=w.charAt(i);
			r--;
			fin=true;
		    } else {
			fin=false;
			System.out.println("overlap error");
			break;
		    }
		}
	    }
	}
	return fin;
    }
    
    //add words diagonally
    //for ease of use, upright=1,downright=2,downleft=3,upleft=4
    public boolean addWordD(String w, String direction, int row, int col) {
	boolean fin=false;
	int r=row;
       	int c=col;
	if (direction.equals("1")) {
	    if (row-w.length()>board[0].length || col+w.length()>board.length) {
		System.out.println("length out of bounds");
	    } else {
		for (int i=0;i<w.length();i++) {
		    if (board[r][c]==w.charAt(i) || board[r][c]=='.') {
			board[r][c]=w.charAt(i);
			r--;
			c++;
			fin=true;
		    } else {
			fin=false;
			System.out.println("overlap error");
			break;
		    }
		}
	    }
	} else if (direction.equals("2")) {
	    if (row+w.length()>board[0].length || col+w.length()>board.length) {
		System.out.println("length out of bounds");
	    } else {
		for (int i=0;i<w.length();i++) {
		    if (board[r][c]==w.charAt(i) || board[r][c]=='.') {
			board[r][c]=w.charAt(i);
			r++;
			c++;
			fin=true;
		    } else {
			fin=false;
			System.out.println("overlap error"); 
			break;
		    }
		}
	    }
	} else if (direction.equals("3")) {
	     if (row+w.length()>board[0].length || col-w.length()>board.length) {
		System.out.println("length out of bounds");
	     } else {
		 for (int i=0;i<w.length();i++) {
		    if (board[r][c]==w.charAt(i) || board[r][c]=='.') {
			board[r][c]=w.charAt(i);
			r++;
			c--;
			fin=true;
		    } else {
			fin=false;
			System.out.println("overlap error"); 
			break;
		    }
		}
	     }
	} else {
	     if (row-w.length()>board[0].length || col-w.length()>board.length) {
		System.out.println("length out of bounds");
	     } else {
		 for (int i=0;i<w.length();i++) {
		    if (board[r][c]==w.charAt(i) || board[r][c]=='.') {
			board[r][c]=w.charAt(i);
			r--;
			c--;
			fin=true;
		    } else {
			fin=false;
			System.out.println("overlap error"); 
			break;
		    }
		}
	     }
	}
	return fin;
    }
    
    public boolean addWord(String w) {
	Random rand=new Random();
	String[] directions={"r","l","u","d","1","2","3","4"};
	int row=rand.nextInt(40);
	int col=rand.nextInt(40);
	String direction=directions[rand.nextInt(7)];
	boolean r=false;
	if (direction.equals("r") || direction.equals("l")) {
	    r=true;
	    addWordH(w,direction,row,col);
	} else if (direction.equals("u") || direction.equals("d")) {
	    r=true;
	    addWordV(w,direction,row,col);
	} else if (direction.equals("1") || direction.equals("2") || direction.equals("3") || direction.equals("4")) {
	    r=true;
	    addWordD(w,direction,row,col);
	}
    return r;
    }
    //Driver
    public static void main(String[] args) {
	WordSearch w = new WordSearch(20,40);
	System.out.println(w);
	w.addWordH("hello","r",3,15);
	System.out.println(w);
	w.addWordH("olleh","l",4,15);
	System.out.println(w);	
	w.addWordH("hello", "r",10,10); //outofbounds
	w.addWordH("hi","l",3,15); //overlap
	System.out.println(w);	
	w.addWordV("hello","d",10,10); //out of bounds
	w.addWordV("hello","d",10,15); //overlap
	System.out.println(w);
	w.addWordD("haythar","2",1,1); //diagonally
	System.out.println(w);
	w.addWordV("oyvey","d",2,2);//test overlap
	
    }
}
