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

}	    
	   
	    
