
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BookShelf bookShelf = new BookShelf(4);	// bookShelfを新しく用意、maxsizeは引数で渡す
		bookShelf.appendBook(new Book("Around the World in 80 Days"));	// 新しいBook型の要素を追加
		bookShelf.appendBook(new Book("Bible"));	// BookShelfクラスで定義されたappendBookが利用可
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("Daddy-Long-Legs"));
		Iterator it = bookShelf.iterator();	// itでhasNext()やnext()のメソッドを利用可に
		while(it.hasNext() == true) {		// 次の本があれば処理を繰り返す
			Book book = (Book)it.next();	// 次の本の情報をbookに格納する
			System.out.println(book.getName());	// bookの情報の中から書名を抜き出して出力する
		}
	}

}

/* メモ
 * 14行目 Iterator it = bookShelf.iterator(); では実際はBookShelfIterator型をインスタンス化している
 * よってBookShelfIteratorクラスのhasNext()やnext()のメソッドが使える
 */
