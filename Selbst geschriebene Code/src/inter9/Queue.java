package inter9;

public interface Queue<T> {
	void push_front(T element);
	T pop_back();
	boolean empty();
default	void clear() {
	while (!empty()) {
		pop_back();
	}
}

}
