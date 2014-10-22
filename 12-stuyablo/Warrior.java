public class Warrior extends BaseChar {

  protected void boostAttributes() {
    attack *= 1.5;
    accuracy *= 1.5;
  }

  //methods
  public void boost(){
    removeMana(30);
    accuracyMod += 20;
    attackMod += 30;
  }

  public void special(BaseChar other) {
    removeMana(80);
    while (Math.random() > .7) {
      int damage = (int) (Math.random() / 2);
      other.removeHealth(damage);
    }
  }
}
