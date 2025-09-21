package InterE;


public interface Observable {
	
	abstract void add(Observer o);
	abstract void remove(Observer o);
	public abstract void notif();
	
}
