public class Driver {
    public static void main(String[] args) {
	StringStuff w = new StringStuff();
	System.out.println("w.nonStart('ada','ire') returns "+w.nonStart("ada","ire"));
	System.out.println("w.makeAbba('dancing,'queen') returns "+w.makeAbba("dancing","queen"));
	System.out.println("w.diff21(32) returns "+w.diff21(32));
	System.out.println("w.lastDigit(25,34,45) returns "+w.lastDigit(25,34,45));
	System.out.println("w.teaParty(4,80) returns "+w.teaParty(4,80));
	System.out.println("w.nearHundred(98) returns "+w.nearHundred(98));
    }
}