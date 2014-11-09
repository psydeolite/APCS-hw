public class Driver {
    public static void main(String[] args) {
	Sarray supah=new Sarray();
	System.out.println(supah.toString());
	System.out.println(supah.size());
	System.out.println(supah.get(1));
	System.out.println(supah.add(5));
	System.out.println(supah.toString());
	System.out.println(supah.get(10));
	supah.add(0,3);
	System.out.println(supah.toString());
	supah.remove(5);
	System.out.println(supah.toString());
    }
}