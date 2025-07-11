package inter9;


public interface FiFO {
	public Object get() ;
	void put(Object o);
	boolean empty();
default void	clear() {
while (!empty()) {
	get();
}	
};

}
