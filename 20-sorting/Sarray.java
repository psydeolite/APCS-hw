import java.util.*;

public class Sarray {
    String[] data;
    int last;
    public Sarray () {
	Random rand=new Random();
	last=10;
	data=new String[10];
	for (int i=0;i<last;i++) {
	    data[i]=""+rand.nextInt(10)+1;
	}
    }

    public Sarray(String[] words) {
	last=words.length;
	data=new String[words.length];
	for (int i=0;i<words.length;i++) {
	    data[i]=words[i];
	}
    }
    public int size() {
	System.out.println(data.length);
	return last;
    }

    public String get(int index) {
	return data[index];
    }
    
    public String[] makeLonger(String[] small) {
	String[] result=new String[small.length+1];
	for (int i=0;i<small.length;i++) {
	    result[i]=small[i];
	}
	return result;
    }

    public boolean add(String i) {
	last++;
	if (last>data.length) {
	    data=makeLonger(data);
	    data[data.length-1]=""+i;
	} else {
	    data[last]=i+"";
	}
	return true;
    }

    public void add(int index, String i) {
	last++;
	String[] newdata = new String[last];
	for (int h=0;h<index;h++) {
	    newdata[h]=data[h];
	}
	newdata[index]=""+i;
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

    public String set(int index, String i) {
	String old=data[index];
	data[index]=i;
	return old;
    }

    public String remove(int index) {
	String old=data[index];
	String[] newdata=new String[data.length];
	for (int h=0;h<index;h++) {
	    newdata[h]=data[h];
	}
	for (int j=index;j<newdata.length-1;j++) {
	    newdata[j]=data[j+1];
	}
	data=newdata;
	return old;
    }

    public void isort() {
	String newVal;
	int i;
	int comp=0;
	//int as=0;
	for (int a=0;a<last;a++) {
	    newVal=data[a];
	    comp++;
	    //as++;
	    for (i=a;i>0 && newVal.compareTo(data[i-1])<0;i--) {
		data[i]=data[i-1];
		//as++;
		comp+=2;
	    }
	    data[i]=newVal;
	    //as++;
	}
	//System.out.println(as);
	System.out.println(comp);
     }
    
    public void ssort() {
	int mind=0;
	String current="";
	//int as=0;
	for (int i=0;i<last;i++) {
	    comp++;
	    mind=i;
	    current=data[i];
	    //as+=2;
	    for (int j=i;j<last;j++) {
		comp++;
		if (data[mind].compareTo(data[j])>0) {
		    comp++;
		    current=data[j];
		    mind=j;
		    //as+=2;
		}
	    }
	    data[mind]=data[i];
	    data[i]=current;
	    //as+=2;
	}
	//System.out.println(as);
	System.out.println(comp);
    }
    
    public void bsort() {
	String current;
	String toSwap;
	//int as=0;
	for (int j=0;j<last;j++) {
	    comp++;
	    for (int i=0;i<last-1;i++) {
		comp++;
		if (data[i].compareTo(data[i+1])>0) {
		    comp++;
		    current=data[i];
		    toSwap=data[i+1];
		    data[i+1]=current;
		    data[i]=toSwap;
		    //as+=4;
		}
	    }
	}
	//System.out.println(as);
	System.out.println(comp);
    }	 
}   
	   
	    
