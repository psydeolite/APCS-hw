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
    public boolean addWordAll(String w, String direction, int row, int col) {
	boolean fin=false;
	int c=col;
	int r=row;
	/*------HORIZONTAL ADDING------*/
	//right
	if (direction.equals("r")){
	    if (col+w.length()>board.length) {
		System.out.println("RIGHT: length out of bounds: "+row+","+col);
	    } else {
		for (int i=0;i<w.length();i++) {
		    if (board[row][c]==w.charAt(i) || board[row][c]=='.') {
			board[row][c]=w.charAt(i);
			c++;
			fin=true;
		    } else {
			System.out.println("RIGHT: overlap error: "+row+","+c);
			break;
		    }
		}
		fin=true;
	    }
	}
	//left
	else if (direction.equals("l")) {
	    if (col-w.length()<0) {
		System.out.println("LEFT: length out of bounds: "+row+","+col);
	    } else {
		for (int i=0;i<w.length();i++){
		    if (board[row][c]==w.charAt(i) || board[row][c]=='.') {
			board[row][c]=w.charAt(i);
			c--;
			fin=true;
		    } else {
			fin=false;
			System.out.println("LEFT: overlap error: "+row+","+c);
			break;
		    }
		}
	    }
	}
	/*------VERTICAL ADDDING------*/
	//down
	else if (direction.equals("d")) {
	    if (row+w.length()>board[0].length) {
		System.out.println("DOWN: length out of bounds: "+row+","+col);
	    } else {
		for (int i=0;i<w.length();i++) {
		    if (board[r][col]==w.charAt(i) || board[r][col]=='.') {
			board[r][col]=w.charAt(i);
			r++;
			fin=true;
		    } else {
			fin=false;
			System.out.println("DOWN: overlap error: "+r+","+col);
			break;
		    }
		}
	    }
	}
	//up
	else if (direction.equals ("u")) {
	    if (row-w.length()<0) {
		System.out.println("UP: length out of bounds: "+row+","+col);
	    } else {
		for (int i=0;i<w.length();i++) {
		    if (board[r][col]==w.charAt(i) || board[r][col]=='.') {
			board[r][col]=w.charAt(i);
			r--;
			fin=true;
		    } else {
			fin=false;
			System.out.println("UP: overlap error: "+r+","+col);
			break;
		    }
		}
	    }
	}
	/*------DIAGONAL ADDING------*/
	//up-right
	else if (direction.equals("1")) {
	    if (row-w.length()>0 || col+w.length()>board.length) {
		System.out.println("UPRIGHT: length out of bounds: "+row+","+col);
	    } else {
		for (int i=0;i<w.length();i++) {
		    if (board[r][c]==w.charAt(i) || board[r][c]=='.') {
			board[r][c]=w.charAt(i);
			r--;
			c++;
			fin=true;
		    } else {
			fin=false;
			System.out.println("UPRIGHT: overlap error: "+r+","+c);
			break;
		    }
		}
	    }
	}
	//down-right
	else if (direction.equals("2")) {
	    if (row+w.length()>board[0].length || col+w.length()>board.length) {
		System.out.println("DOWNRIGHT: length out of bounds: "+row+","+col);
	    } else {
		for (int i=0;i<w.length();i++) {
		    if (board[r][c]==w.charAt(i) || board[r][c]=='.') {
			board[r][c]=w.charAt(i);
			r++;
			c++;
			fin=true;
		    } else {
			fin=false;
			System.out.println("DOWNRIGHT: overlap error: "+r+","+c); 
			break;
		    }
		}
	    }
	} 
	//down-left
	else if (direction.equals("3")) {
	     if (row+w.length()>board[0].length || col-w.length()>board.length) {
		System.out.println("DOWNLEFT: length out of bounds: "+row+","+col);
	     } else {
		 for (int i=0;i<w.length();i++) {
		    if (board[r][c]==w.charAt(i) || board[r][c]=='.') {
			board[r][c]=w.charAt(i);
			r++;
			c--;
			fin=true;
		    } else {
			fin=false;
			System.out.println("DOWNLEFT: overlap error: "+r+","+c); 
			break;
		    }
		}
	     }
	}
	//up-left
	else {
	     if (row-w.length()>board[0].length || col-w.length()>board.length) {
		System.out.println("UPLEFT: length out of bounds: "+row+","+col);
	     } else {
		 for (int i=0;i<w.length();i++) {
		    if (board[r][c]==w.charAt(i) || board[r][c]=='.') {
			board[r][c]=w.charAt(i);
			r--;
			c--;
			fin=true;
		    } else {
			fin=false;
			System.out.println("UPLEFT: overlap error: "+r+","+c); 
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
	int row=rand.nextInt(20);
	int col=rand.nextInt(40);
	String direction=directions[rand.nextInt(7)];
	boolean r=addWordAll(w,direction,row,col);
	return r;
    }
    //Driver
    public static void main(String[] args) {
	WordSearch w = new WordSearch(20,40);
	System.out.println(w);
	w.addWordAll("hello","r",3,15);
	System.out.println(w);
	w.addWordAll("olleh","l",4,15);
	System.out.println(w);	
	w.addWordAll("hello", "r",40,40); //outofbounds
	w.addWordAll("hi","l",3,15); //overlap
	System.out.println(w);	
	w.addWordAll("hello","d",80,10); //out of bounds
	w.addWordAll("hello","d",10,15); //overlap
	System.out.println(w);
	w.addWordAll("haythar","2",1,1); //diagonally
	System.out.println(w);
	w.addWordAll("oyvey","d",2,2);//test overlap
	w.addWord("loquacious"); //test all
	System.out.println(w);
    }
}
