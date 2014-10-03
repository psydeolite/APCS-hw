public class ShapeString {
 //5 min
    public String frame(int h,int w) {
	String s="";
	int i,j;
	for (i=0;i<h;i++) {
	    if (i==0 || i==h-1) {
		for (j=0;j<w;j++) {
		    s+="*";
		}
	    } else {
		for (j=0;j<w;j++) {
		    if (j==0 || j==w-1) {
			s+="*";
		    }
		    else {
			s+=" ";
		    }
		}
	    }
	    s+="\n";
	}
	return s;
    }

    //3 min
    public String stringSplosion(String str) {
	String s="";
	for (int i=0;i<=str.length();i++) {
	    s=s+str.substring(0,i);
	}
	return s;
    }
	
    public String stringX(String str) {
	String out="";
	for (int i=0;i<str.length();i++) {
	    if (!(str.charAt(i)==('x'))) 
		{out+=str.charAt(i);}
	    else
		{ if (i==0 || i+1==str.length()) 
			{out+=str.charAt(i);}
		}
	}
	return out;
    }

}