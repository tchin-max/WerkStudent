package InterE;

public class CocreteObserver implements Observer {

	public concreteObserveble co;
	public String name;
	
	
	public CocreteObserver(concreteObserveble co, String name) {
		this.co = co;
		co.add(this);
	}


	@Override
	public void updade() {
		System.out.println(this.name + co.getState());
		
	}
	public static void main(String[] args) {
		concreteObserveble cobserveble = new concreteObserveble();
		CocreteObserver concreteobserver = new CocreteObserver(cobserveble,"Hans" );
		
		cobserveble.setState("isst");
		cobserveble.setState("schläft");
	}

}
