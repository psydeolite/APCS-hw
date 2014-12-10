class Rogue extends BaseChar implements Comparable {

    protected void boostAttributes() {
	defense *= 1.5;
	speed *= 1.5;
    }
    
    //methods
    public void boost(){
	removeMana(30);
	speedMod += 20;
	defenseMod += 5;
    }
    
    public void special(BaseChar other) {
	removeMana(80);
	int damage = (int) (Math.random()*attack / 2);
	other.removeHealth(damage);
	addHealth(damage);
    }

    public static void main(String[] args) {
	Rogue[] rog = new Rogue[10];
	for (int i=0;i<10;i++) {
	    rog[i]=new Rogue();
	}
    }

    public abstract int compareTo(Rogue other) {
	
}
