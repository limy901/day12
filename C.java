class C {
	void test() throws Exception, MyException, YourException { 
		//throws 여러개 + 나열순서는 상관없음.
		//try-catch안하고 exception 하나로 처리도 가능
		// 여러개의 익셉션 을 throws로 넘겨주는것도 가능

		B b = null;
			b = new B(); //my
			b.use1(); //your
			b.use2(); //exception 총 3개

	}

	public static void main(String[] args) throws Exception, MyException, YourException {
		//throws 여러개 + 나열순서는 상관없음.
		C c = new C();
		c.test();
	}
}
