package model;
import java.util.Random;


public class Yut {
	private int state;
	public Yut() {
		state = -1;
	}
	public int throwYut() {
		Random random = new Random();
		float ran_num = random.nextFloat();
		
		if(ran_num<=0.1152) {
			state = 0; //��
	
		}
		else if(ran_num>0.1152 && ran_num<=0.4608) {
			state = 1; //��
			

		}
		else if(ran_num>0.4608 && ran_num<=0.8064) {
			state = 2; //��
			

		}
		else if(ran_num>0.8064 && ran_num<=0.936) {
			state = 3; //��
		
		}
		else if(ran_num>0.936 && ran_num<=0.9616) {
			state = 4; //��
		}
		else if(ran_num>0.9616 && ran_num<=1) {
			state = 5;  //�鵵
	
		} 
		
		return state;
	}
	public int throwDoe() {
		state = 0;
		return state;
	}
	public int throwGe() {
		state = 1;
		return state;
	}
	public int throwGul() {
		state = 2;
		return state;
	}
	public int throwYoot() {
		state = 3;
		return state;
	}
	public int throwMoe() {
		state = 40;
		return state;
	}
	public int throwBackDoe() {
		state = 5;
		return state;
	}
}