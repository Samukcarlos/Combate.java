package Entites;

public class Champion {

	public String name;
	public int life;
	public int attack;
	public int armor;

	public void takeDamage() {
				
		life = (life - attack + armor);
		
		if (life <= 0) {
			life = 0;
		}		
		else { 
			if (((life - attack) + armor) < 1) {
				life -=1;
			}
		}
		}
	
	public String status() {
						
		String fim = null;
		
		if (life == 0) {

			return name + " : " + life + " de vida" + " (Morreu)";
		}
		else {
		return name + " : " + life + " de vida";
		}
	}
	public String toString() {
		
		return status();

		
	}

}
