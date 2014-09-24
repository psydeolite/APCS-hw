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
    public int teaParty(int tea, int candy) {
	if (tea >=5 && candy >=5) {
	   if (tea>=2*candy || candy>=2*tea)  {return 2;}
	   else {return 1;}
	}
	else {return 0;}
}

}