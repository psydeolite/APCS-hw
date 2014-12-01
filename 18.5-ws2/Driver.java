import java.io.*;
import java.util.*;
public class Driver {
    public static void main(String[] args)throws IOException {
	WordSearch ws = new WordSearch(20,40);
	Scanner sc;
	ArrayList<String> wordlist = new ArrayList<String>();
	boolean run=true;
	boolean filled=false;
	int c=1;
	boolean possible=true;
	System.out.println("Welcome to the Word Search Creator.");
	while (run) {
	    sc=new Scanner(System.in);
	    System.out.println("Options:");
	    System.out.println("1: See board");
	    System.out.println("2: Add words");
	    System.out.println("3: See words");
	    System.out.println("4: Finish and write to text file");
	    String input=sc.nextLine();
	    if (input.equals("2")) {
		System.out.println("From file(F) or manual(M): ");
		String fm = sc.nextLine();
		if (fm.equals("F") || fm.equals("f")) {
		    System.out.println("Enter filename: ");
		    String filename=sc.nextLine();
		    try {
			sc=new Scanner(new File(filename));
			System.out.println("File selected");
			while (sc.hasNext()) {
			    wordlist.add(sc.next());
			}
			for (int i=0;i<wordlist.size();i++) {
			    while (!ws.addWord(wordlist.get(i))) {
				ws.addWord(wordlist.get(i));
			    }
			}
		    } catch (Exception e) {
			System.out.println("No such file");
			System.exit(0);
		    }
		} else {
		    possible=true;
		    System.out.println("Enter 'd' to finish entering words");
		    while (possible) {
			System.out.println("Enter word "+c+": ");
			String word=sc.nextLine();
			if (word.equals("d")) {
			    System.out.println(word);
			    possible=false;
			    break;   
			}
			boolean done=false;
			for (int i=0;i<30;i++) {
			    done=ws.addWord(word);
			    possible=done;
			    if (done) {
				wordlist.add(word);
				break;
			    }
			}
			c++;
		    }
		    System.out.println("addingwords");
		}
	    } else if (input.equals("1")) {
		System.out.println(ws.toString());
	    } else if (input.equals("3")) {
		System.out.println(wordlist);
	    } else if (input.equals("4")) {
		ws.makeBoard();
		System.out.println("Enter wordsearch name:");
		String fname=sc.nextLine();
		ws.makeFiles(fname+".txt");
		File fwords = new File(fname+"_wordlist");
		fwords.createNewFile();
		FileWriter fww = new FileWriter(fwords);
		for (int i=0;i<wordlist.size();i++) {
		    fww.write(wordlist.get(i)+"\n");
		}
		fww.flush();
		fww.close();
		System.out.println("Done!");
		break;
	    } else {
		System.out.println("Try again");
	    }
	}
    }
}
 

