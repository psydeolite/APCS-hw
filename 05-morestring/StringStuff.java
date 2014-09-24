public class StringStuff {
    public String nonStart(String a, String b) {
	String a1 = a.substring(1);
	String b1 = b.substring(1);
	return a1+b1;
    }

    public String makeAbba(String a, String b) {
	return a+b+b+a;
    }

    public int diff21(int n) {
	int result = Math.abs(n-21);
	if (n>21) return result*2;
	else return result;
    }
    //working
    public int teaParty(int tea, int candy) {
	if (tea >=5 && candy >=5) {
	   if (tea>=2*candy || candy>=2*tea)  {return 2;}
	   else {return 1;}
	}
	else {return 0;}

    }
    //working
    public boolean lastDigit(int a, int b, int c) {
	int a1 = a % 10;
	int b1 = b % 10;
	int c1 = c % 10;
	if (a1 == b1 || a1 == c1 || b1 == c1) return true;
	else return false;
    }
    //working
    public boolean nearHundred(int n) {
	if ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10)){
	    return true;
	} else {
	    return false;
	}
    }
}

