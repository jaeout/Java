package JavaStudy;

/*
 ������ �����͸� �����ϴ� �����̴�. 
 ������ �����ϸ� Ÿ�� ũ���� �޸𸮰� �Ҵ�Ǹ�, 
 ���α׷��� ���� �߿� ���� ���� �д� �������� ����Ѵ�.  
 */


//���ͷ�(literal) 
/*
 ���ͷ��̶� ���α׷��� ���� ǥ���� ���� ���Ѵ�.
 ����, �Ǽ�, ����, ����, ���ڿ� Ÿ�� ��� ���ͷ��� ������ 
 ���� ��� ������ ����
 
34, 42.195, '%', true, "Hello" 
 */
//���� ���ͷ��� int Ÿ������ �ڵ� �����ϵȴ�.
//���� longŸ������ �����Ϸ��� ���� �ڿ� L�Ǵ� l�� ���̸� �ȴ�
public class ex2_2 {

//��� PI�� �����ϰ� ���� ������ ���ϴ� ���α׷��� �ۼ��϶�
	public static void main(String[] args) {
		final double PI = 3.14; //�������� ����� ����

	double radius = 10.0; //���� ������
	double circleArea = radius*radius*PI; //���� ���� ���
	
	//���� ������ ȭ�鿡 ���
	System.out.println("���� ���� = " + circleArea);
	}
}