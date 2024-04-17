package kadai_21;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		
		//辞書クラスのインスタンス化
		Dictionary_Chapter21 englishDictionary = new Dictionary_Chapter21();
		
		//調べる英単語の配列をセット
		String[] words = {"apple", "banana", "grape", "orange"};
		
		//辞書を調べる
		englishDictionary.wordList(words);
}
}