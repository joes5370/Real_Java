import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class game {
	public static void main(String[] args) {
		
		//정의를 하는 이유는 여기서 바꾸기 위해서(설정)
		final int gameStartNumber = 1;
		final int gameEndNumber = 100;
		String[] names = {"짱구", "영희","철수"};
		gameSource[] players = new gameSource[names.length];
		
		for (int i = 0; i < names.length; i++) {
			players[i] = new gameSource(names[i]);
		}
		
		for (int i = 0; i < players.length; i++) {
			players[i].readyGame(players, i,gameStartNumber,gameEndNumber);
	     }
		
		players[0].gameStart();
		
		
		
		
		
		
		

		
	}
}
