import java.util.*;
import java.io.*;

public class Driver {
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    String line;
    Boolean running = true;
    String choice = ""; // needs an initial value otherwise Java worries it might not be set
    String playerchoice="";
    Boolean choosing = true;
    while (running) {
	while (choosing) {
        // creates player type
	    System.out.println("Choose your class:");
	    System.out.println("\tr: Rogue");
	    System.out.println("\tw: Warrior");
	    System.out.print("Your class: ");
	    line=sc.nextLine();
	    if (line.toLowerCase().equals("warrior") || line.toLowerCase().equals("w")) {
		choice = "w";
		choosing = false;
	    } else if (line.toLowerCase().equals("rogue") || line.toLowerCase().equals("r")) {
		choice = "r";
		choosing = false;
	    } else {
		System.out.println("Invalid name\n");
	    }
	}
	
	// create player
      BaseChar player;
      if (choice.equals("w"))
        player = new Warrior();
      else // if (choice.equals("r")) // needs to be else otherwise Java worries it might not be set
        player = new Rogue();
      
      //choosing name
      System.out.print("\nChoose your name: ");
      line = sc.nextLine();
      player.setName(line);
      System.out.println("Welcome " + player);
      
      try {
	  Thread.sleep(1000);                 
      } catch(Exception e) {}
      System.out.print(".");
      try {
	  Thread.sleep(1000);                 
      } catch(Exception e) {}
      System.out.print(".");
       try {
	  Thread.sleep(1000);                 
      } catch(Exception e) {}
       System.out.print(".");
        try {
	  Thread.sleep(1000);                 
      } catch(Exception e) {}
	System.out.println(" ");
       
      BaseChar CPU;
      int compchoiceA = r.nextInt(2);
      if (compchoiceA == 0){
	  CPU = new Warrior();
	  System.out.println("A Warrior attacks you!");
      } else {
	  CPU = new Rogue();
	  System.out.println("A Rogue attacks you!");
      }
      
      Boolean battle = true;
      
      while (battle) { 
	  System.out.println("Whatever will you do?     (LIST): ");
	  if (choice.equals("w")) {
	      System.out.println("0: Basic Attack");
	      System.out.println("1: Revitalize");
	      System.out.println("2: Get Pumped");
	      System.out.println("3: Paralyzer");
	      System.out.println("4: Ambush");
	      System.out.println("5: Double Strike");
	      System.out.println("6: Finisher");
	      System.out.println("7: Special Warrior Attack");
	  }
	  else {
	      System.out.println("0: Basic Attack");
	      System.out.println("1: Replenish");
	      System.out.println("2: Meditate");
	      System.out.println("3: Curse");
	      System.out.println("4: Surprise");
	      System.out.println("5: Double Strike");
	      System.out.println("6: Demolisher");
	      System.out.println("7: Special Rogue Attack");
	  }
	  //user chooses action
	  Boolean pchoose = true;
	  while (pchoose) {
	      playerchoice=sc.nextLine();
	      if (playerchoice.equals("0")) {
		  player.baseAttack(CPU);
		  System.out.println("You hit your opponent");
		  pchoose=false;
	      } else if (playerchoice.equals("1")) {
		  player.rest();
		  System.out.println("You boosted your health");
		  pchoose=false;
	      } else if (playerchoice.equals("2")) {
		  if (player.getMana()>=30) {
		      player.boost();
		      System.out.println("You boosted your stats");
		      pchoose=false;
		  } else {
		      System.out.println("Not enough mana, try again");
		  }
	      } else if (playerchoice.equals("3")) {
		  if (player.getMana()>=50) {
		      player.stun(CPU);
		      System.out.println("You stunned your opponent");
		      pchoose=false;
		  } else {
		      System.out.println("Not enough mana, try again");
		  }
	      } else if (playerchoice.equals("4")) {
		  if (player.getMana()>=40) {
		      player.sneak(CPU);
		      System.out.println("You sneak attacked your opponent");
		      pchoose=false;
		  } else {
		      System.out.println("Not enough mana, try again");
		  }
	      } else if (playerchoice.equals("5")) {
		  if (player.getMana()>=20) {
		      player.doubleAttack(CPU);
		      System.out.println("You hit your opponent twice");
		      pchoose=false;
		  } else {
		      System.out.println("Not enough mana, try again");
		  }
	      } else if (playerchoice.equals("6")) {
		  if (player.getMana()>=60) {
		      player.superAttack(CPU);
		      System.out.println("You super attacked your opponent");
		      pchoose=false;
		  } else {
		      System.out.println("Not enough mana, try again");
		  }
	      } else if (playerchoice.equals("7")) {
		  if (player.getMana()>=80) {
		      player.special(CPU);
		      System.out.println("You special attacked your opponent");
		      pchoose=false;
		  } else {
		      System.out.println("Not enough mana, try again");
		  }
	      } else {
		  System.out.println("invalid attack, try again");
	      }
	  }
	  //System.out.println("Your opponent has "+CPU.getHealth()+" health and "+CPU.getMana()+" mana");
	   if (CPU.getHealth() <= 0) {
	    running=false;
	    System.out.println("You win!");
	    break;
	   }
	   try {
	       Thread.sleep(1000);                
	   } catch(Exception e) {}
	  System.out.println("Your opponent has "+CPU.getHealth()+" health and "+CPU.getMana()+" mana");
	  try {
	       Thread.sleep(1000);                
	  } catch(Exception e) {}    
     
	  Boolean cpuChoosing = true;
	  int compchoiceB = r.nextInt(7);
	  while (cpuChoosing) {
	       if (compchoiceB == 0) {
		  CPU.baseAttack(player);
		  System.out.println("Your opponent hits you");
		  cpuChoosing = false;
	      } else if (compchoiceB == 1) {
		  if (CPU.getMana()>=30) {
		      CPU.boost();
		      System.out.println("Your opponent boosted their stats");
		      cpuChoosing = false;
		  } else {
		      compchoiceB = r.nextInt(7);
		  }
	      } else if (compchoiceB == 2) {
		  if (CPU.getMana()>=50) {
		      CPU.stun(player);
		      System.out.println("Your opponent stuns you");
		      cpuChoosing = false;
		  } else {
		      compchoiceB = r.nextInt(7);	    
		  }
	      } else if (compchoiceB == 3) {
		  if (CPU.getMana()>=40) {
		      CPU.sneak(player);
		      System.out.println("Your opponent attacked you by surprise");
		      cpuChoosing = false;
		  } else {
		      compchoiceB =r.nextInt(7);
		  }
	      } else if (compchoiceB == 4) {
		  if (CPU.getMana()>=20) {
		      CPU.doubleAttack(player);
		      System.out.println("Your opponent hit you twice");
		      cpuChoosing = false;
		  } else {
		      compchoiceB = r.nextInt(7);
		  }
	      } else if (compchoiceB == 5) {
		  if (CPU.getMana()>=60) {
		      CPU.superAttack(player);
		      System.out.println("Your opponent super attacked you");
		      cpuChoosing = false;
		  } else {
		      compchoiceB = r.nextInt(7);
		  }
	      } else {
		  if (CPU.getMana()>=80) {
		      CPU.special(player);
		      System.out.println("Your opponent special attacked you");
		      cpuChoosing = false;
		  } else {
		      compchoiceB = r.nextInt(7);
		  }
	       }
	  }
	  if (player.getHealth() <= 0) {
	      running=false;
	      System.out.println("Game over!");
	      break;
	  }
	  try {
	       Thread.sleep(1000);                
	  } catch(Exception e) {}        
	  System.out.println("You have "+player.getHealth()+" health and "+player.getMana()+" mana");
	  //System.out.println("Your opponent has "+CPU.getHealth()+" health and "+CPU.getMana()+" mana");
      }
      running=false;
    }
  }
}
