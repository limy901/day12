import java.io.*;

class A {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//���ó�� ���δ����� ���� �� ����.
	void m1(){//ioexception ���ϸ� ������ �ȵ�. ������ ����.
		try{
			System.out.print("����� ��̸� �Է��ϼ���. : ");
			String line = br.readLine();
			System.out.println("�� : "+line);
		}catch(IOException ie){ //������ �ͼ��� 
			//IOException is a compile Exception (���)
			//���ϴ� ���ܻ���� ����� ����
			System.out.println("���ܰ� �߻��߽��ϴ�.");
		}
	}

	void m2(){
		String str = "��";
		try{
			System.out.println("#1");
			int i = Integer.parseInt(str); //1�����ϰ� ���ϴٰ� ���⼭ �ɷ��� �ͼ������� �Ѿ. 
			System.out.println("#2");
			System.out.println("i : "+i);
			System.out.println("#3");
		}catch(NumberFormatException ne){ //��Ÿ�� ����
			//NumberFormatException is a Runtime Exception (���)
			System.out.println("���ܰ� �߻��߽��ϴ�.");
			System.out.println("#4");
		}
	}


	public static void main(String[] args) {
		A a = new A();
		//a.m1();
		a.m2();
	}
}
