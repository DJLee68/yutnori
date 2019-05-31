package model;

public class Player {
	private int name; // �÷��̾��� �̸� 1,2,3,4 ���ڷ� �̷���� 
	private int horseNum; //��ü ���� ����
	private int waitHorse; // ������� ������
	private int finishHorse; // ������ ���� ����
	private int throwNum; // ������ �ִ� ��ȸ
	private int[] yutResults; //����������� �迭 
	
	public  Player(int _name, int _horseNum ) {
		this.name = _name;
		this.horseNum = _horseNum;
		this.waitHorse = _horseNum;
		this.finishHorse = 0;
		this.throwNum = 0;
		
	}
	public int gethorseNum() {
		return this.horseNum;
	}
	public int getWaittingHorse() {
		return this.waitHorse;
	}
	public int getFinishedHorse() {
		return this.finishHorse;
	}
	public int getThrowNum() {
		return this.throwNum;
	}
	public void setThrowNum(int setNum) {
		this.throwNum = setNum;
	}
	public void addThrowNum() {
		this.throwNum++;
	}
	public void delThrowNum() {
		this.throwNum--;
	}
}
