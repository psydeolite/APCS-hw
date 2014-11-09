import java.util.*;

public class Sarray {
    int[] data;
    int last;
    public Sarray () {
	Random rand=new Random();
	last=10;
	data=new int[10];
	for (int i=0;i<last;i++) {
	    data[i]=rand.nextInt(10)+1;
	}
	    
    }

    public int size() {
	System.out.println(data.length);
	return last;
    }

    public int get(int index) {
	return data[index];
    }
    
    public int[] makeLonger(int[] small) {
	int[] result=new int[small.length+1];
	for (int i=0;i<small.length;i++) {
	    result[i]=small[i];
	}
	return result;
    }

    public boolean add(int i) {
	last++;
	if (last>data.length) {
	    data=makeLonger(data);
	    data[data.length-1]=i;
	} else {
	    data[last]=i;
	}
	return true;
    }

    public void add(int index, int i) {
	last++;
	int[] newdata = new int[last];
	boolean added=false;
	for (int h=0;h<index;h++) {
	    newdata[h]=data[h];
	}
	newdata[index]=i;
	for (int j=index;j<data.length;j++) {
	    newdata[j+1]=data[j];
	}
	data=newdata;
    }

public String toString() {
    String r="[";
    for (int i=0;i<data.length;i++) {
	r+=""+data[i]+", ";
    }
    return r+="]";
}

    public int set(int index, int i) {
	int old=data[index];
	data[index]=i;
	return old;
    }

    public int remove(int index) {
	int old=data[index];
	int[] newdata=new int[data.length];
	for (int h=0;h<index;h++) {
	    newdata[h]=data[h];
	}
	for (int j=index;j<newdata.length-1;j++) {
	    newdata[j]=data[j+1];
	}
	data=newdata;
	return old;
    }

}	    
	   
	    
			  
	
	