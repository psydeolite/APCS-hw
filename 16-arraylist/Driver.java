import java.util.*;

public class Driver {
    public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	Random rand = new Random();
	for (int i=0;i<15;i++) {
	    al.add(rand.nextInt(5));
	}
	System.out.println(al);
	int last = al.get(0);
	for (int i=1;i<al.size();i++) {
	    if (al.get(i)==last) {
		al.remove(i);
		i--;
	    } else {
		last=al.get(i);
	    }
	}
	System.out.println(al);
    }
}
		   
    
