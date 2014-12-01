import java.util.*;
import java.io.*;
public class WordSearch {
    private char[][] board;
    private char[][] key;
    private Random rand=new Random();
    public WordSearch(int r, int c){
	board = new char[r][c];
	key=new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
		key[i][j]='.';
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
	w=w.toUpperCase();
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
	
	int row=rand.nextInt(board.length);
	int col=rand.nextInt(board[0].length);
	int dRow=rand.nextInt(3)-1;
	int dCol=rand.nextInt(3)-1;
	if (dRow==0 && dCol==0) {
	    return false;
	}
	boolean r=addWordAll(w,row,col,dRow,dCol);
	return r;
    }

    public void  makeBoard() {
	for (int i=0;i<board.length;i++) {
	    for (int j=0;j<board[i].length;j++) {
		key[i][j]=board[i][j];
	    }
	}
	ArrayList<Character> alphabet=new ArrayList<Character>();
	for (char alpha='A'; alpha<='Z';alpha++) {
	    alphabet.add(alpha);
	}
	for (int r=0;r<board.length;r++) {
	    for (int c=0;c<board[0].length;c++) {
		if (board[r][c]=='.') {
		    board[r][c]=alphabet.get(rand.nextInt(26));
		}
	    }
	}

    }

    public void makeFiles(String fname)throws IOException {
	File fsearch=new File(fname);
	fsearch.createNewFile();
	FileWriter fw = new FileWriter(fsearch);
	for (int i=0;i<board.length;i++) {
	    for (int j=0;j<board[i].length;j++) {
		fw.write(""+board[i][j]);
	    }
	    fw.write("\n");
	}
	fw.flush();
	fw.close();
	File fkey=new File(fname+"_key");
	fkey.createNewFile();
	FileWriter fkw = new FileWriter(fkey);
	for (int k=0;k<key.length;k++) {
	    for (int m=0;m<key[k].length;m++) {
		fkw.write(""+key[k][m]);
	    }
	    fkw.write("\n");
	}
	fkw.flush();
	fkw.close();
    }
    public String getKey() {
	String r="";
	for (int i=0;i<key.length;i++) {
	    for (int j=0;j<key[i].length;j++) {
		r+=key[i][j];
	    }
	    r+="\n";
	}
	return r;
    }
    /*
    public static void main(String[] args) {
	WordSearch w = new WordSearch(20,40);
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
	*/
	//w.fillIn();
	    
    
}
