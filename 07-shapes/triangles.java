//15 min
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

//30 min
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
}
    

