
public class Shapes {
    public String box(int r, int c) {
	String s = "";
	while (r>0){
	    int cc = 0;
	    while (cc < c){
		s += "*";
		cc += 1;
	    }
	    s = s + "\n";
	    r--;
	}

	return s;
    }
    
    public String tri1(int h) {
	String out = "";
	int hc=1;
	int hh=1;
	while (hc<=h) {
	    while (hh>0) {
		out+="*";
		hh-=1;
	    }
	out+="\n";
	hc+=1;
	hh=hc;
	}
	return out;
    }

        public String tri2(int h) {
	String out = "";
	int rinc=0;
	int w=rinc;
	int winc=h;
	while (rinc<h) {
	    while (winc>=0) {
		if (winc>w) {
		    out+=" ";
		    }
		else {
		    out+="*";
		    }
		winc-=1;
	    }
	out+="\n";
	rinc+=1;
	w=rinc;
	winc=h;
	}
	return out;
    }

    public String tri3(int h) {
	String s="";
	int width=(2*h)-1;
	int height;
	int r1=h-1;
	int r2=h-1;
	int j;
	for (height=0;height<h;height++) {
	    for (j=0;j<=width;j++) {
		if (j>=r1 && j<=r2) {
		    s+="*";
		}
		else {
		    s+=" ";
		}
	    }
	    s+="\n";
	    r1-=1;
	    r2+=1;
	}
	return s;
    }
   
     public String tri3rev(int h) {
	String s="";
	int width=(2*h);
	int height;
	int r1=0;
	int r2=width;
	int j;
	for (height=0;height<h;height++) {
	    for (j=0;j<=width;j++) {
		if (j>=r1 && j<=r2) {
		    s+="*";
		}
		else {
		    s+=".";
		}
	    }
	    s+="\n";
	    r1+=1;
	    r2-=1;
	}
	return s;
    }
    //doesn't work correctly for odd h, will finish later for sleep reasons
    public String diamond(int h) {
	String s="";
	int m;
	
	if (h%2==0) {
	    m=(h/2)+1;
	}
	else {
	    m=(h+1)/2;
	}
	int i=h-m;
	s=tri3(m);
	s+=tri3rev(h-m+1);
	    
	return s;
    }

    //reference to Timon Luo
    public String tri4(int h) {
	String s="";
	int i,j,k;
	for (i=0;i<h;i++) {
	    for (j=h;j>(h-i);j--) {
		s=s+" ";
	    }
	    for (k=h;k>i;k--) {
		s=s+"*";
	    }
	    s=s+"\n";
	}
	return s;
    }

    
}