
public class O2 { // extends Object�� �����Ǿ� �ִ�.
	int name = 1;
	@Override //�θ� ������ �ִ� �޼ҵ带 ������ �Ҷ� �˷��ش�.
	public String toString() {
		// TODO Auto-generated method stub
		return "" + this.name;
		//toString ����� Hello�� �ٲ��.
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
