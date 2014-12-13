import java.util.*;
public class Driver {
    public static Random r = new Random();
    public static void main(String[] args) {
	Search zuko = new Search(10);
	for (int i=0;i<zuko.getLen();i++) {
	    zuko.additem(r.nextInt(20)+1);
	}
	System.out.println(zuko.toString());
	//zuko.sort();
	//System.out.println(zuko.lsearch(16));
	System.out.println(zuko.rbsearch(16));
	//System.out.println(zuko.toString());
    }
}
	
