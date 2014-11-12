import java.util.*;

public class  Arraystuff {

    /*--------------------- Instance Variables --------------------*/ 

    private int[] a;
    Random rnd;
    // By making x final, we can set it once but then never change it
    // private final int x = 123;

    /*--------------------- Constructors --------------------*/ 

    public Arraystuff(int n){
	rnd = new Random();
	a = new int[n];
	for (int i=0; i<a.length;i++){
	    a[i] = 75+rnd.nextInt(76);
	}
    }

    public Arraystuff(){
	this(100);
    }
    

    /*--------------------- Methods --------------------*/ 
 
    public String toString(){
	String s = "";
	for (int i = 0; i < a.length; i++) {
	    s = s + a[i]+", ";
	}
	return s;}
   
    public int find(int n) {
	int r=-1;
	int c=0;
	boolean found=false;
	while ((!found) &&  c<a.length) {
	    if (a[c]==n) {
		r=c;
		found=true;
	    } else {
		c++;
	    }
	}
	return r;
    }

    public int max() {
	int max=a[0];
	for (int i=1;i<a.length;i++) {
	    if (a[i]>max) {
		max=a[i];
	    }
	}
	return max;
    }

    //slightly altered on 11-5 for convenience in mode function    
    public int freq(int i){
	int freak = i;
	int c = 0;
	for (int x = 0; x < a.length; x++){
	    if (a[x] == freak){
		c++;
	    }
	}
	return c;
    }

    //na
    public int mode() {
	int r=a[0];
	int c=0;
	int[] tested=new int[a.length];
	for (int i=0;i<a.length;i++) {
	    if (!(find(a[i])>-1)) {
		      if (freq(a[i]) > r) {
			  r=a[i];
			  tested[c]=a[i];
			  c++;
		      }
		  }
	}
	return r;
    }

	 
	    
	    
    
    /*--------------------- Main --------------------*/ 

    public static void main(String[] args) {
	Arraystuff as = new Arraystuff();
	System.out.println(as);
	System.out.println(as.max());
	System.out.println(as.find(100));
	System.out.println(as.mode());
	
    }
    
}
