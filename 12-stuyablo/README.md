Getting This Repository To Show Up In Your HW Repo
==================================================
1. Enter your HW Repo
```bash
    cd apcs_hw
```
2. Clone the Stuyablo repo as a submodule
```bash
    git submodule add git@github.com:jbaum98/stuyablo 12-stuyablo
```
3. Now push the changes (you've added some files after all)
```bash
    git add --all
    git commit -m 'added stuyablo submodule'
    git push
```
4. Now to update it (pull) you do
```bash
    git submodule update
```
5. If you ever clone your HW repo again, you have to run this for git to realize there's a submodule
```bash
    git submodule init
    git submodule update
```
More info: http://git-scm.com/book/en/Git-Tools-Submodules


Changes
=======
Okay, so I changed a couple of things

### Protected Attributes
Instead of all the getters and setters, my friend told me there's a thing called `protected` attributes which are like `private` attributes except they are available to sub-classes. Which eliminates the need for getters and setters in most cases and chops our `BaseChar` in half.

### Attack Types
Reading through our code I realized we never actually used mAttack or mDefense, because all the attacks were based on `baseAttack`, which was a phyiscal attack. So I scrapped them and just made `attack` and `defense`.

### Rogues not Mages
As a result of scrapping `mAttack` and `mDefense`, `Mage`s and `Warrior`s weren't different at all. So I made the `Warrior` focus on `attack` and `accuracy` and the `Mage` focus on `defense` and `speed`. But then it didn't really feel like a mage anymore it felt like a Rogue so I changed it to `Rogue`. Hope that's cool we can change it back if you don't like it.

### Attacks
I also realized our lives would be a whole lot easier if `Rogue`s and `Warrior`s had the same methods for attacking, but we just printed out different things so the users think they're different. In some cases the methods are actually the same and in those cases I defined them in `BaseChar`, but in other cases the methods are _named_ the same thing but are defined seperately in `Warrior` and `Rogue` classes, with an abstract method in `BaseChar`. You guys should probably modify these methods to print things when you're doing the Driver.

### Constructors
Finally, I realized we were had the code that modified the base attributes in the constructors written twice, once in each constructor. So since you should never write code twice, I made a private method `boostAttributes` only to be called from the constructors so if we change how the attributes are boosted, you only have to do it in one spot. Then I realized the constructors for `Warrior` and `Rogue` were identical:
```java
public Class {
    super();
    boostAttributes();
} 
```
So I defined an abstract method `boostAttributes` in `BaseChar`, and changed the `BaseChar` constructors to call `boostAttributes`, but `boostAttributes` itself is defined individually in each subclass.
