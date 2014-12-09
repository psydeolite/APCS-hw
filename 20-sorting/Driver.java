public class Driver {
    public static void main(String[] args) {
	String[] content={"4","2","3","1","5","6","7"};
	Sarray sorry=new Sarray(content);
	System.out.println(sorry.toString());
	//System.out.print("isort: ");
	//sorry.isort();
	//System.out.println("ssort: ");
	//sorry.ssort();
	System.out.println("bsort: ");
	sorry.bsort();
	System.out.println(sorry.toString());
    }
}
