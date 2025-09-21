package InterF;

public class Command_Pattern {
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		
		Command TurnOn = new ConcreteTurOnLigthOption(receiver); 
		Command TurnOff = new ConcreteTurOffLigthOption(receiver);
		
		Invoker invoker = new Invoker();
		
		invoker.setCommand(TurnOn);
		invoker.pressButton();
		invoker.setCommand(TurnOff);
		invoker.pressButton();
	}
}
	interface Command{
		
		void execute();
	}

	class Receiver{		
		public void turnonLigth() {

			System.out.println("Das Licht ist AN");
		}
		public void turnoffLigth() {

			System.out.println("Das Licht ist AUS");
			
		}
	}
	
	class ConcreteTurOnLigthOption implements Command{

		private Receiver ligth ;
		
		public ConcreteTurOnLigthOption(Receiver ligth) {
			this.ligth = ligth;
		}

		@Override
		public void execute() {
ligth.turnonLigth();
			
		}
		
		
	}
	class ConcreteTurOffLigthOption implements Command{
private Receiver ligth;

		public ConcreteTurOffLigthOption(Receiver ligth) {
	this.ligth = ligth;
}

		@Override
		public void execute() {
			ligth.turnoffLigth();
			
		}
		
	}
	class Invoker{
		private Command command;

		
		
		public void setCommand(Command command) {
			this.command = command;
		}
		public void pressButton() {
	
			if (command!=null) {
				command.execute();
			}

		}
		
	}

	

