class D {
	boolean flag = true; 
	void m1(){
		String str = "��"; //���̸� ���ܹ߻�, 10�� ������ ��ȯ�����ؼ� ���ܾƴ�.
		try{ //try+catch �ų� try+finally ������ �̷������ ��.
			System.out.println("#1");
			int i = Integer.parseInt(str);
			//if(flag) return;
			//flag�� Ʈ��� ����, �ƴϸ� �� ����.
			if(flag) System.exit(-1);
			//�ְ���, finally�� �ʿ����. ���� ��ü�� ���������. ���� ���ĵ� �ȶ�.
			System.out.println("#2");
			//flag�� Ʈ��� �굵 ������ϰ� ȣ���Ѱ����� ���ư��� ����
		}catch(NumberFormatException ne){
			System.out.println("#3");
			//���� str���� ���������ܸ�,
		}finally{ //�׻�����, try�� �־�� �����.
			System.out.println("#4"); 
		}// ������ return�� ��������, finally�� �����ϰ� ���ư�. 
	System.out.println("#5");
	//true���� ���� �ɷ�������, ��� �������� ����.
	// !!! �׷��� finally�� ����ȴ�.
	}
	public static void main(String[] args){
		D d = new D();
		d.m1();
		System.out.println("#6");
	}
}
