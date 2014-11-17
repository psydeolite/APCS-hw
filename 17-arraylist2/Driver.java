import java.util.*;
public class Driver {
    //toString for later use
    public String toString(int[] ar) {
	String r = "[";
	for (int i=0;i<ar.length;i++) {
	    r+=ar[i]+", ";
	}
	r=r.substring(0,r.length()-2)+"]";
	return r;
    }
    public static void main(String[] args) {
	Random rand = new Random();

	//creates arraylist
	ArrayList<Integer> al  = new ArrayList<Integer>();
	for (int i=1;i<=5;i++) {
	    al.add(i);
	}
	System.out.println(al);
	
	//randomizes
	for (int h=0;h<al.size();h++) {
	    int indx = rand.nextInt(5);
	    int x = al.get(indx);
      	    int valh = al.get(h);
	    al.set(h,x);
	    al.set(indx,valh);
	}
	System.out.println(al);

	//for stringing purposes
	Driver stringer = new Driver();

	//creates array
	int[] ale = new int[5];
	for (int i=0;i<5;i++) {
	    ale[i]=i+1;
	}
       System.out.println(stringer.toString(ale));
	
	//randomizes
	for (int h=0;h<ale.length;h++) {
	    int indx = rand.nextInt(5);
	    int x = ale[indx];
	    int valh = ale[h];
	    ale[h]=x;
	    ale[indx] = valh;
	}
       	System.out.println(stringer.toString(ale));	    
    }
}