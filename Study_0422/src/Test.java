import java.util.Calendar;

public class Test {
	public static void main(String[] args) {
		StringBuffer b = new StringBuffer("Hello");
		b.append(" world");
		System.out.println(b);
		
		System.out.println(System.currentTimeMillis());
		// õ���� 1�� ������ �����ش�.
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		double randNum = Math.random();
		System.out.println(randNum);
		double choice = Math.floor(randNum *5);
		//0���� 4���� ������ ���� �߻�
		System.out.println(choice);
		
		Integer q = Integer.valueOf(10);
		int w = q;
		System.out.println(w);
		
		java.util.Random rand = new java.util.Random();
		//���� �̸��� Ŭ������ �ΰ��̻� ���� �� ���� ���� ����
		//�ʹ� ���� import�� ���� ���� ��
		
		try {
			//���⼭ �ڵ带 �ۼ��Ѵ�.
			//try�ȿ� �ִ� �ڵ�� �߿� �ϳ��� ������ ���� catch�� ������.
			//�� �߿� �������� ������ ���� �׿� �����ϴ� catch���� �������� ���ش�.
			//���α׷��� ���� ���� �ȵǱ� ������ ������� ������ � ���� ����Ѵ�.
		} catch (Exception e) {
			// try�� ������ �κп� ���� ���� ó���̴�.
			// Exception�� ��� ������ ���ܵ��� ������ ���´�.
		}
		
	}
}
