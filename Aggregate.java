
public interface Aggregate {
	public abstract Iterator iterator();
}

/* メモ
 * interfaceではどんなことをするものがあるのかを大まかに定義しておく
 * 実装はまた別なクラスなどで行う
 * abstractとは抽象型で、とりあえずメソッド名を定義しておいて中身は別なところで記述できる
 */
