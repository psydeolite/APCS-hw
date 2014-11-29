import java.util.Arrays;
public class OrderedSarray extends Sarray {
    public OrderedSarray(String[] words) {
	super(words);
	Arrays.sort(data);
    }

    public OrderedSarray() {
	super();
	Arrays.sort(data);
    }

    public boolean add(String el) {
	boolean added=false;
	super.add(el);
	String[] nd=new String[data.length];
	for (int h=0;h<data.length;h++) {
	    nd[h]=data[h];
	}
	for (int i=0;i<data.length;i++) {
	    if (el.compareTo(data[i])<0 && !added) {
		nd[i]=el;
		added=true;
	    } else if (added) {
		nd[i]=data[i-1];
	    } 
	}
	data=nd;
	return true;
    }

    public String set(int index, String el) {
	String old = remove(index);
	last--;
	String[] nd= new String[last];
	for (int i=0;i<nd.length;i++) {
	    nd[i]=data[i];
	}
	data=nd;
	add(el);
	return old;
    }
}
