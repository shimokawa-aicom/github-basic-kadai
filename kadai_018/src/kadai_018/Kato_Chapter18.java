//parent class

package kadai_018;

public abstract class Kato_Chapter18 {
	
	public String familyName = "加藤";  //姓を表す
	public String givenName;   //名を表す
	public String address = "東京都中野区〇×";     //住所を表す
	
	public void setGivenName (String givenName) {
		this.givenName = givenName;
	}
	
	public void commonIntroduce() {   //共通の紹介を出力する 
		System.out.print("名前は" + this.familyName + this.givenName + "です\n");
		System.out.print("住所は" + this.address + "です\n");
	}   
	
	abstract public void eachIntroduce();   //個別の紹介を出力する
	
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}           //紹介を実行する
}
