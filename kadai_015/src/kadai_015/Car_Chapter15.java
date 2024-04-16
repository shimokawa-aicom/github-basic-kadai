package kadai_015;

public class Car_Chapter15 {
	//フィールド内の定義
	private int gear = 1;  // ギア数
    private int speed = 10; // スピード
    
    //コンストラクタ（初期化）
    public Car_Chapter15 (int gear, int speed) {
    	gear = this.gear;
    	speed = this.speed;
    }
    
    //メソッド
    public void gearChange (int afterGear) {
    	this.gear = afterGear;
		//ギアの値
		this.speed = switch(this.gear) {
		case 1 -> 10;
		case 2 -> 20;
		case 3 -> 30;
		case 4 -> 40;
		case 5 -> 50;
		default -> 10;
		};
    }

    public void run() {
    	System.out.println("ギア1" + "から" +this.gear + "に切り替えました");
    	System.out.println("速度は時速" + this.speed + "kmです");
    }
    
}
