
public class SumMachine {
	public void makeSum(int startValue, int endValue) {
		int sum = 0;
// ������ ���ְ� �ص� �������. ���� ���� �ȴٸ� �Է°��� �������
		
		for(int i = startValue; i <=endValue; i++) {
			sum = sum + i;
		}
		
		System.out.println("���۰�: "+ startValue+"���ᰪ: "+ endValue);
		System.out.println("�� ��: "+ sum);
	}
	

}
