import java.io.*;

class A {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//사람처럼 라인단위로 읽을 수 있음.
	void m1(){//ioexception 안하면 컴파일 안됨. 컴파일 예외.
		try{
			System.out.print("당신의 취미를 입력하세요. : ");
			String line = br.readLine();
			System.out.println("답 : "+line);
		}catch(IOException ie){ //컴파일 익셉션 
			//IOException is a compile Exception (상속)
			//일하다 예외생기면 여기로 보내
			System.out.println("예외가 발생했습니다.");
		}
	}

	void m2(){
		String str = "돈";
		try{
			System.out.println("#1");
			int i = Integer.parseInt(str); //1수행하고 일하다가 여기서 걸려서 익셉션으로 넘어감. 
			System.out.println("#2");
			System.out.println("i : "+i);
			System.out.println("#3");
		}catch(NumberFormatException ne){ //런타임 예외
			//NumberFormatException is a Runtime Exception (상속)
			System.out.println("예외가 발생했습니다.");
			System.out.println("#4");
		}
	}


	public static void main(String[] args) {
		A a = new A();
		//a.m1();
		a.m2();
	}
}
