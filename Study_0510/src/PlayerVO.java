
public class PlayerVO implements Comparable<PlayerVO>{
	private String name;
	private String position;
	private int regYear;
	
	public PlayerVO(String name, String position, int regYear) {
		this.name = name;
		this.position = position;
		this.regYear = regYear;
	}
	
	public String toString() {
		return this.name + ":" + this.position + ":" + this.regYear;
	}

	@Override
	public int compareTo(PlayerVO otherPlayer) {
		//정렬의 기준을 무엇으로 할꺼냐 - 여기에선 문자열 기준
		// TODO Auto-generated method stub
		System.out.println("정렬시도");
		return this.name.compareTo(otherPlayer.name);
//		여기는 이름 기준으로 sort
		
//		return this.position.compareTo(otherPlayer.position);
//		이 경우는 position기준으로 sort
		
//		return this.regYear - otherPlayer.regYear;
//		이 경우는 regYear기준으로 sort
		
// 		음수면 앞으로 보내고, 양수면 뒤로 보낸다
	}
}
