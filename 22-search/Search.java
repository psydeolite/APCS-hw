import java.util.*;

public class Search {
    private static Random rand = new Random();
    private Integer[] intarray;
    public Search(int n) {
	intarray=new Integer[n];
	for (int i=0;i<n;i++) {
	    intarray[i]=rand.nextInt(20)+1;
	}
	Arrays.sort(intarray);
    }
    
    public Integer lin_search(Integer n) {
	for (int i=0;i<intarray.length;i++) {
	    if (intarray[i]==n) {
		return intarray[i];
	    }
	}
	return null;
    }

    public Integer bin_search(Integer n) {
	int low=0;
	int high=intarray.length;
	int mid=high/2;
	while (mid!=n || mid>0) {
	    if (intarray[mid]==n) {
		return intarray[mid];
	    } else {
		if (intarray[mid]>n) {
		    mid=high-(mid/2);
		    low=high/2;
		} else {
		    mid=low+(mid/2);
		    high=high/2;
		}
	    }
	}
	return null;
    }
	
	
    
}
