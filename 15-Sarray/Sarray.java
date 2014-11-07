public class Sarray {
    int[] data;
    int last;
    public Sarray () {
	Random rand=new Random();
	last=10;
	data=new int[20];
	for (int i=0;i<last;i++) {
	    data[i]=rand.nextInt(10)+1;
	}
	    
    }

    public int size() {
	return last;
    }

    public int get(int index) {
	return data[index];
    }

    public boolean add(int i) {
	if (last==data.length-1) {
	    int[] newdata=new int[data.lenbgth+1];
	    
	    
	    
			  
	
	