class C {
	void test() throws Exception, MyException, YourException { 
		//throws ������ + ���������� �������.
		//try-catch���ϰ� exception �ϳ��� ó���� ����
		// �������� �ͼ��� �� throws�� �Ѱ��ִ°͵� ����

		B b = null;
			b = new B(); //my
			b.use1(); //your
			b.use2(); //exception �� 3��

	}

	public static void main(String[] args) throws Exception, MyException, YourException {
		//throws ������ + ���������� �������.
		C c = new C();
		c.test();
	}
}
