class D {
	boolean flag = true; 
	void m1(){
		String str = "돈"; //돈이면 예외발생, 10은 정수로 변환가능해서 예외아님.
		try{ //try+catch 거나 try+finally 조합이 이루어져야 함.
			System.out.println("#1");
			int i = Integer.parseInt(str);
			//if(flag) return;
			//flag가 트루면 리턴, 아니면 쭉 진행.
			if(flag) System.exit(-1);
			//최강자, finally도 필요없음. 제어 자체가 사라져버림. 메인 이후도 안뜸.
			System.out.println("#2");
			//flag가 트루면 얘도 실행안하고 호출한곳으로 돌아가야 정상
		}catch(NumberFormatException ne){
			System.out.println("#3");
			//만약 str값이 숫자형예외면,
		}finally{ //항상찍힘, try가 있어야 실행됨.
			System.out.println("#4"); 
		}// 강력한 return을 만나더라도, finally를 수행하고 돌아감. 
	System.out.println("#5");
	//true여서 리턴 걸려있으면, 얘는 수행하지 못함.
	// !!! 그래도 finally는 수행된다.
	}
	public static void main(String[] args){
		D d = new D();
		d.m1();
		System.out.println("#6");
	}
}
