public class Driver {
    public static void main(String[] args) {
	String s="mike zamansky";
	int space=s.indexOf(" ");
	String[] firstlast = s.split(" ");
	String first = firstlast[0];
	String last = firstlast[1];
        System.out.println("The index of the space is "+ space+".");
	System.out.println("The name's "+last+". "+first+" "+last+".");
		    }    
}
