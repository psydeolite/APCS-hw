public class Rogue extends BaseChar {

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
}
