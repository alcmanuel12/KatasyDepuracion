package tamagotchi;

public class Tamagotchi {

	private int hunger = 4;
	private int energy = 4;
	private int mood = 4;
	
	public Tamagotchi( int hunger,int energy,int mood ) {
		
		this.hunger = hunger;
		this.energy = energy;
		this.mood = mood;	
	}

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public int getMood() {
		return mood;
	}

	public void setMood(int mood) {
		this.mood = mood;
	}
	
	
	
	
	public void juega() {		
		hunger += 1;
		energy -= 1;
		mood += 1;
		
		if (mood > 8) {
			System.out.println("El tamagotchi esta contento :) ");
		} else if (energy < 3) {
			System.out.println("El tamagotchi esta cansado (-.-)");
		} else if (energy == 0) {
			System.out.println("El tamagotchi esta durmiendo (-_-)Zzzz");
		} else if (mood < 2) {
			System.out.println("El tamagotchi esta de mal humor ఠ_ఠ");
		} else {
			System.out.println("El tamagotchi esta normal :-|");
		}
		
	}
	
	public void come() {
		hunger -=2;
		energy -=1;
	
	
	if (mood > 8) {
		System.out.println("El tamagotchi esta contento :) ");
	} else if (energy < 3) {
		System.out.println("El tamagotchi esta cansado (-.-)");
	} else if (energy == 0) {
		System.out.println("El tamagotchi esta durmiendo (-_-)Zzzz");
	} else if (mood < 2) {
		System.out.println("El tamagotchi esta de mal humor ఠ_ఠ");
	} else {
		System.out.println("El tamagotchi esta normal :-|");
	}
	
}
	
	public void duerme() {
		
		energy += 2;
		System.out.println("El tamagotchi esta durmiendo (-_-)Zzzz");
		
	
		
	}
	
	public static void main(String[] args) {
		Tamagotchi tamagotchi = new Tamagotchi(4,4,4);
		//tamagotchi.come();
		//tamagotchi.duerme();
		tamagotchi.juega();
		tamagotchi.juega();
		tamagotchi.juega();
		tamagotchi.juega();
		tamagotchi.juega();
	}
	
	
}
