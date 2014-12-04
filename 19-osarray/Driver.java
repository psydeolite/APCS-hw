public class Driver {
    public static void main(String[] args) {
	String[] werds = {"a","bold","chef","does","green","excellent"};
	OrderedSarray ordah = new OrderedSarray(werds);
	System.out.println(ordah.toString());
	System.out.println("org: "+ordah.toString());
	ordah.add("hummus");
	System.out.println("add: "+ordah.toString());
	ordah.set(5,"fruit");
	System.out.println("set: "+ordah.toString());
    }
}
