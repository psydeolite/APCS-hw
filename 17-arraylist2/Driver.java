import java.util.*;
public class Driver {
    public static void main(String[] args) {
	Random rand = new Random();
	ArrayList<Integer> al  = new ArrayList<Integer>();
	for (int i=1;i<=5;i++) {
	    al.add(i);
	}
	System.out.println(al);
	
	for (int h=0;h<al.size();h++) {
	    int x = al.get(rand.nextInt(5));
	    int indx = al.indexOf(x);
	    int valh = al.get(h);
	    al.set(h,x);
	    al.set(indx,valh);
	}
	System.out.println(al);
	    
    }
}