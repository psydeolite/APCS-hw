import java.util.*;

public class Search {
    private static Random rand = new Random();
    private Comparable[] array;
    private int len;
    public Search(int n) {
	array=new Comparable[n];
	len=n;
    }
    private int last=0;
    public void additem(Comparable c) {
	array[last]=c;
	last++;
    }

    public int getLen() {
	return this.len;
    }

    public void sort() {
	Arrays.sort(array);
    }

    public String toString() {
	String r="[";
	for (int i=0;i<array.length;i++) {
	    r+=array[i]+", ";
	}
	return r+"]";
    }

    public Comparable lsearch(Comparable c) {
	for (int i=0;i<array.length;i++) {
	    if (array[i]==c) {
		return array[i];
	    }
	}
	return null;
    }

    public Comparable bsearch(Comparable c) {
	sort();
	int low=0;
	int high=array.length-1;
	int mid;
	while (low<=high) {	
	    mid=(low+high)/2;
	    if (c.compareTo(array[mid])==0) {
		return array[mid];
	    } else if (c.compareTo(array[mid])>0) {
		low=mid+1;
	    } else {
		high=mid-1;		
	    }	    
	}
	return null;
    }

    public Comparable rbinsearch(Comparable c, int low, int high) {
	int mid=(low+high)/2;
	if (low>high) {
	    return null;
	} else if (c.compareTo(array[mid])==0) {
	    return array[mid];
	} else if (c.compareTo(array[mid])>0) {
	    return rbinsearch(c,mid+1,high);
	} else {
	    return rbinsearch(c,low,mid-1);
	}
    }

    public Comparable rbsearch(Comparable c) {
	sort();
	return rbinsearch(c,0,array.length-1);
    }
	
    
}
