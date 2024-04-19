package kadai_026;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Jyanken_Chapter26 {

	//getMyChoiceメソッドで自分のじゃんけんの手を入力する　with Scanner()
	public String getMyChoice() {
				
		//自分のじゃんけんの手を入力する
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
			String playerMove = scanner.nextLine();
		
			//正しいじゃんけんの手であるか判定する
			if(playerMove.equals("r") || playerMove.equals("s") || playerMove.equals("p")) {
				scanner.close();
			} else {
				System.out.println("入力内容にエラーがあります");
				continue;
			}
			return playerMove;
		}
		
	}
		
	
	//getRandomメソッドで相手のじゃんけんの手を出力する with floor() and random()
	public String getRandom() {
		//配列にじゃんけんの手をセットする
		String[] opponentMove = {"r", "s", "p"};
		
		//乱数で対戦相手のじゃんけんの手を選ぶ
		int elementNumber = (int)(Math.floor(Math.random()*3));
		
		String opponent_move = opponentMove[elementNumber];
		
		return opponent_move;
	}
	
	//playGameメソッドでじゃんけんの結果を出力する with HashMap() and equals()
	public void playGame() {
		String myHand = getMyChoice();
		String opponentHand = getRandom();
		
		Map<String, String> rspHand = new HashMap<>();
		rspHand.put("r", "グー");
		rspHand.put("s", "チョキ");
		rspHand.put("p", "パー");
		
		System.out.println("");
		System.out.println("自分の手は" + rspHand.get(myHand) + "相手の手は" + rspHand.get(opponentHand));
		
		if(myHand.equals(opponentHand)) {
			System.out.println("あいこです");
		}else if((myHand == "r" && opponentHand == "s") || (myHand == "s" && opponentHand == "p") || (myHand == "p" && opponentHand == "g")){
			System.out.println("自分の勝ちです");
		}else
			System.out.println("自分の負けです");
	}
}
	
