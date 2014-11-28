public class OrderedSarray extends Sarray {
    public OrderedSarray() {
	super();
	System.out.println(this);
	int c=this.size();
	for (int i=0;i<c;i++) {
	    for (int j=1;j<c;j++) {
		if (this.get(i).compareTo(this.get(j))<0) {
		    this.remove(i);
		    super.add(j-1,this.get(i));
		}
	    }
	}
    }

    public void order() {
	for (int i=0;i<this.last;i++) {
	    for (int j=1;j<this.last;j++) {
		if (this.get(i).compareTo(this.get(j))<0) {
		    this.remove(i);
		    super.add(j-1,this.get(i));
		}
	    }
	}
    }
}
