import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Random ayn = new Random();
	Rogue[] jail = new Rogue[10];
	for (int i=0;i<10;i++) {
	    jail[i]=new Rogue(""+(char)(ayn.nextInt(26)+'a'));
	}
	System.out.println(Arrays.toString(jail));
	Arrays.sort(jail);
	System.out.println(Arrays.toString(jail));
    }
}
			       
	    