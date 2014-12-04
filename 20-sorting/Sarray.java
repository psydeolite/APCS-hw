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
	for (int a=0;a<last;a++) {
	    newVal=data[a];
	    for (i=a;i>0 && newVal.compareTo(data[i-1])<0;i--) {
		data[i]=data[i-1];
	    }
	    data[i]=newVal;
	}
     }
    
    public void ssort() {
	int mind=0;
	String current;
	for (int i=0;i<last;i++) {
	    for (int j=i;j<last;j++) {
		if (data[mind].compareTo(data[j])>0) {
		    mind=j;
		}
	    }
	    current=data[i];
	    data[i]=data[mind];
	    data[mind]=current;
	    System.out.println(toString());
	}
    }

}	    
	   
	    