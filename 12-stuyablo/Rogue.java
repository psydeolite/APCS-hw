public class Rogue extends BaseChar {

  protected void boostAttributes() {
    defense *= 1.5;
    speed *= 1.5;
  }

  //methods
  public void boost(){
    removeMana(30);
    speedMod += 20;
    defenseMod += 30;
  }

  public void special(BaseChar other) {
    removeMana(80);
    int damage = (int) (attack / 8 * (Math.random() + 1));
    other.removeHealth(damage);
    addHealth(damage);
  }
}
