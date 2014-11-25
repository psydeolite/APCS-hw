import java.io.*;
import java.util.*;
public class Driver {
    public static void main(String[] args) {
	WordSearch ws = new WordSearch(20,40);
	Scanner sc=null;
	ArrayList<String> wordlist = new ArrayList<String>();
	try {
	    sc=new Scanner(new File("words.txt"));
	} catch (Exception e) {
	    System.out.println("No such file");
	    System.exit(0);
	}
	while (sc.hasNext()) {
	    wordlist.add(sc.next());
	}
	for (int i=0;i<wordlist.size();i++) {
	    while (!ws.addWord(wordlist.get(i))) {
		ws.addWord(wordlist.get(i));
	    }
	}
	//ws.fillIn();
	System.out.println(ws);
    }
}
