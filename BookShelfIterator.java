
public class BookShelfIterator implements Iterator {
	private BookShelf bookShelf;
	private int index;
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}
	public boolean hasNext() {
		if(index < bookShelf.getLength()) {
			return true;
		}
		else {
			return false;
		}
	}
	public Object next() {
		Book book = bookShelf.getBookAt(index);	// BookShelfクラスのgetBookAt()メソッドを使ってindex番目の本の情報を得る
		index++;	// 次に備えてindexの番号をインクリメント
		return book;	// 本の情報を返す
	}
}

/* メモ
 * 2行目 implementsでインターフェースを継承(使用可に)する
 * これによってIterator.javaで記述したメソッドが利用できる
 */