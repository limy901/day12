class MyException extends Exception {
	void mym(){
		System.out.println("����ó���� �����ִ� �޼ҵ�1 �Դϴ�. ");
	}
}

class YourException extends RuntimeException {
	void yourm(){
		System.out.println("����ó���� �����ִ� �޼ҵ�2 �Դϴ�. ");
	}
}

class B { // ���ܴ� ������, �޼ҵ� �α����� �߻���.
	boolean flag = true; // ���ܴ� �̰Ϳ� ���� ������. (���ǹ�������)
	//�޼ҵ� test�غ�����, ���� �̰� false�� �����.
	B() throws MyException { // API��, �� �����ڴ� �߻��Ҽ��� �־�! ��� ǥ���ϴ� ��. 
		if(flag){
			//flag�� true, false�� ���� ������ ȣ��� ���ܰ� �߻����� ������ ������.
			throw new MyException(); //���ܺθ����� throw �� �θ�.
			//if���� ����, 100�� �߻�
		}
	}
	void use1() throws YourException { //���ܸ� �߻���Ű�Ƿ�, �̸� �˷��ֱ�. 
		throw new YourException(); //��Ÿ�ӿ����� �������� ������, ����Ǹ� ����ó��.
		//throw �̹Ƿ�, use��� �޼ҵ带 ���� ������ �� ���ܰ� �߻���.
	}
	void use2() throws Exception {
		throw new Exception();
	}
}

class BUser
{
	void test1(){
		//���������� catch���� ���X
		B b = null;
		try{
			b = new B();
			b.use1();
		}catch(MyException me){
			me.mym();
		}catch(YourException ye){
			ye.yourm();
		}
	}

	void test2(){
		B b = null;
		try{
			b = new B();
			b.use2();
		}catch(MyException me){ //�ڽ�
			me.mym();
		}catch(Exception e){ 
			System.out.println(e.toString());
		}
	}
	public static void main(String args[]){

		BUser bu = new BUser();
		bu.test2();
	/*	B b = null;
		try{
			b.use();
		}catch(MyException me){
			me.m1();
		}
		try{
			b = new B();
			//������ ���־�� ��ü�� �������. �������ϰ� use����ϸ� null�� ����Ѵٷ� ���� ����ó�� ��.
			b.use1();
			//b�� use�޼ҵ带 �����ϱ�.
		}catch(MyException me){
			me.mym();
		}
		}catch(YourException ye){//����,������ �ڽ��̶� �����ͼ������� ����ȯ ����.
			//������ �о �а� ó��������, 
			//System.out.println("����ó��"+e.toString()); //e��� ���ܰ�ü�� ��Ʈ��Ÿ������ ��ȯ��Ŵ.
			ye.yourm(); // ���� catch���� ����Ÿ������ ���� ��ü�� �޼ҵ带 ������. 
		}
		//b.use();*/
	}
}