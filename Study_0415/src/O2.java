
public class O2 { // extends Object가 생략되어 있다.
	int name = 1;
	@Override //부모가 가지고 있는 메소드를 수정을 할때 알려준다.
	public String toString() {
		// TODO Auto-generated method stub
		return "" + this.name;
		//toString 결과를 Hello로 바꿨다.
	}
	

//	@Override
//	public boolean equals(Object obj) {
//		O2 obj2 = (O2)obj;
	public boolean equals(O2 obj) {
		O2 obj2 = (O2)obj;
		if(this.name == obj2.name) {
			return true;
		}
		// TODO Auto-generated method stub
		return false;
		// return this.name == obj2.name
	}
}
