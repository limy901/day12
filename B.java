class MyException extends Exception {
	void mym(){
		System.out.println("예외처리를 도와주는 메소드1 입니다. ");
	}
}

class YourException extends RuntimeException {
	void yourm(){
		System.out.println("예외처리를 도와주는 메소드2 입니다. ");
	}
}

class B { // 예외는 생성자, 메소드 두군데서 발생함.
	boolean flag = true; // 예외는 이것에 따라 결정됨. (조건문때문에)
	//메소드 test해보려면, 먼저 이거 false로 잡아줌.
	B() throws MyException { // API에, 이 생성자는 발생할수도 있어! 라고 표식하는 것. 
		if(flag){
			//flag의 true, false에 따라 생성자 호출시 예외가 발생할지 말지가 결정됨.
			throw new MyException(); //예외부를때는 throw 로 부름.
			//if없이 쓰면, 100퍼 발생
		}
	}
	void use1() throws YourException { //예외를 발생시키므로, 미리 알려주기. 
		throw new YourException(); //런타임에러는 컴파일은 되지만, 실행되면 예외처리.
		//throw 이므로, use라는 메소드를 쓰면 무조건 이 예외가 발생함.
	}
	void use2() throws Exception {
		throw new Exception();
	}
}

class BUser
{
	void test1(){
		//형제까지는 catch순서 상관X
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
		}catch(MyException me){ //자식
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
			//생성을 해주어야 객체가 만들어짐. 생성안하고 use사용하면 null를 사용한다로 떠서 예외처리 됨.
			b.use1();
			//b의 use메소드를 실행하기.
		}catch(MyException me){
			me.mym();
		}
		}catch(YourException ye){//마이,유얼이 자식이라 상위익셉션으로 형변환 가능.
			//범위가 넓어서 넓게 처리하지만, 
			//System.out.println("예외처리"+e.toString()); //e라는 예외객체를 스트링타입으로 변환시킴.
			ye.yourm(); // 내가 catch에서 예외타입으로 정한 객체의 메소드를 실행함. 
		}
		//b.use();*/
	}
}