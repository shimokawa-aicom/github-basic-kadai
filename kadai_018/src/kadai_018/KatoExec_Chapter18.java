//main class

package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		
		Kato_Chapter18 hanako = new KatoHanako_Chapter18();
		Kato_Chapter18 ichiro = new KatoIchiro_Chapter18();
		Kato_Chapter18 taro = new KatoTaro_Chapter18();
		
		hanako.setGivenName("花子");
		ichiro.setGivenName("一郎");
		taro.setGivenName("太郎");
		
		hanako.execIntroduce();
		ichiro.execIntroduce();
		taro.execIntroduce();

	}

}
