
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
	for (int height=h-2;height>=0;height--) {
	    for (int j=0;j<h-height-1;j++) {
		s+=".";
	       }
	    for (int i=0;i<2*height+1;i++) {
		s+="*";
	    }
	    s+="\n";
	}
	 return s;
    }
   
    public String diamond(int h) {
	int m=h/2;
	String s=tri3(h-m);
	for (int height=m-1;height>=0;height--) {
	    for (int j=0;j<h-height-m-1;j++) {
		s+=" ";
	       }
	    for (int i=0;i<2*height+1;i++) {
		s+="*";
	    }
	    s+="\n";
	}
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