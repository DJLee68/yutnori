package controller;

import java.awt.event.ActionEvent;



import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import model.*;
import view.*;

public class Controller implements ActionListener{
	
	private model.Board board;
	private model.Game game;
	private MainFrame mainboard;
	private StartPage startpage;
	String[] yutname = {"./img/back_doe.png", "./img/doe.png", "./img/gae.png", "./img/gul.png", "./img/yoot.png", "./img/moe.png"}; 
	int[] click_cnt;

	
	public Controller() {
		startpage = new StartPage(this);
		mainboard = new MainFrame(this);
		game = new Game();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int player_num = 0;
		int horse_num = 0;
		int yut;
		if(e.getSource()==startpage.playerCombo) {
			String temp_player = startpage.playerCombo.getSelectedItem().toString();
			System.out.println(player_num);
			player_num = temp_player.charAt(0) - '0';
			game.setMaxPlayer(player_num);
			click_cnt = new int[player_num];
		}
		
		if(e.getSource()==startpage.horseCombo) {
			String temp_horse = startpage.horseCombo.getSelectedItem().toString();
			horse_num = temp_horse.charAt(0) - '0';
			game.setMaxHorse(horse_num);
		}
		
		if(e.getSource()==startpage.startGame) {
			mainboard.createPlayerSet(player_num, horse_num);
			System.out.println("aaa");
			startpage.setVisible(false);
			startpage.dispose();
			mainboard.setVisible(true);
		}
		
		if(e.getSource()==mainboard.buttonThrowYut) {
			yut = model.Yut.throwYut();
			String throwResult = yutname[yut];//������
	//		board.setIndex(throwResult);
			mainboard.lblResultThrowYut.setIcon(new ImageIcon(throwResult));
		}
		
		for(int i=0; i<6; i++) {
			if(e.getSource()==mainboard.throwBtns[i]) {
				yut = i;
				String throwResult = yutname[yut];
				mainboard.lblResultThrowYut.setIcon(new ImageIcon(throwResult));
				
			}
		}
		
		
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				
				//�̵��ϱ� ����, �� ���� Ŭ���ؼ� ���� �� �� �ִ��� ���� ���� ��
				if(e.getSource()==mainboard.pbtn[i][j] && click_cnt[game.get_player_num()]%2 == 0 )
				{
					if(game.HSLocation.contains([i,j])) {
						temp_idx[player_num] = [i, j];
						click_cnt[game.get_player_num()]++;
						can_move_idx = game.move(i, j, yut, player_num);
						for(int k=0; k<can_move_idx.length; k++) {
							int a, int b = can_move_idx[k][0], can_move_idx[k][1];
							mainboard.pbtn[a][b].setIcon(���� �� �� �ִٴ� ǥ��);
						}
					}
				}
				//�� ���� ���� �� �� �ִ��� Ȯ���ϱ� ���� ��ư�� �� �� ���� ���¿���, �� �� �ִ� ��ġ�� ��ư�� ������ ��
				if(e.getSource()==mainboard.pbtn[i][j] && click_cnt[game.get_player_num()]%2 == 1)
				{
					if(game.HSLocation.contains([i,j])) {
						
						//�ƹ��͵� ���� ��
						if(board.horseset[i][j] == Null){
							
							board.deleteIdx(temp_idx[player_num], player_num);
							mainboard.pbtn[temp_idx[player_num]].delete();
							board.setIdx(i, j, player_num);
							mainboard.pbtn[i][j].setIcon(������ ��);						
							
						}
						
						//���� �� ���� ���� ��
						else if(board.horseset[i][j] == game.get_player_num) {
							board.deleteIdx(temp_idx[player_num], player_num);
							mainboard.pbtn[temp_idx[player_num]].delete();
							board.setIdx(i, j, player_num);
							mainboard.pbtn[i][j].setIcon(������ ��);
						}
						
						
						//��� �� ���� ���� ��
						
					}
				}
			}
		}
		
	}		
		

	public static void main(String[] args) {
		int[][] a = new int[4][2];
		System.out.println(a.length);
		new Controller();
	}
}	
		

