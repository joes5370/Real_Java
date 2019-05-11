
public class gameSource {
	String name;
	gameSource[] players;
	
	int position = 0;
	int startNumber = 0;
	int endNumber = 0;
	int sayNumber = 0;

	gameSource(String name) {
		this.name = name;
	}

	public void readyGame(gameSource[] players, int position, int startNumber,int endNumber) {
		this.players = players;
		this.position = position;
		this.startNumber = startNumber;
		this.endNumber = endNumber;
	}
	
	public void sayNumber() {
		int prevPosition = this.position - 1;
		if(prevPosition < 0) {
			prevPosition = this.players.length -1;
		}
		
		if(this.sayNumber == -1) {
			this.sayNumber = this.startNumber;
		} else {
			this.sayNumber = this.players[prevPosition].sayNumber + 1;
		}
		
			
		String stringSayNumber = Integer.toString(sayNumber);
		int count = 0;
		String jjac = "짝";
		for(int i = 0; i< stringSayNumber.length(); i++) {
			char[] tempArr = String.valueOf(sayNumber).toCharArray();
			if(tempArr[i] == '3' || tempArr[i] == '6' || tempArr[i] == '9') {
				count++;
			}
		}
		
		if(count == 0 ) {
			System.out.println(this.name + " say " + this.sayNumber );
		}
		else if(count == 1) {
			System.out.println(this.name + " say " + jjac);
		}
		else {
			jjac = jjac + jjac;
			System.out.println(this.name + " say " + jjac);
		}
		
		
		int nextPosition = (this.position + 1) % this.players.length;
		if(this.sayNumber < this.endNumber){
			this.players[nextPosition].sayNumber();
		}
		
	}
	
	public void gameStart() {
		this.sayNumber = -1;
		this.sayNumber();
		
		
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
