package inter5;

import java.util.Optional;

public class OptionalTest {
	
	public static class p{
		private String name;
		private String email;
		public p(String name, String email) {
			super();
			this.name = name;
			this.email = email;
		}
		public Optional< String> getName() {
			return Optional.ofNullable(name);
		}
		
		public String getEmail() {
			return email;
		}
	}
		
		
//		public static Optional<Cat> catname(String nam) {
//			Cat cc = new Cat("jojo", 5);
//			return Optional.empty();
//		
//	}

//Optional<Cat> c =		catname("jojo");
//c.ifPresentOrElse(t -> t.getName(),() -> Optional.ofNullable(null));
//
//c.map(Cat::getName).orElse("gogg");//return ein OPtional, das das Ergebnis der Methode GetAge in c
//
//c.orElse(new Cat("UNKNOWN", 0));// gibt das Element zurück wennes nicht leer ist ansonsten"UNKNOWN"
//c.orElseThrow();//wenn das Element nicht vorhanden wird eine NSEException geworfen. D.h wenn wenn unsere c einen Wert hat && getage auch einen Wert hat , dann wird in die Console ausgegeben. Ansonsten orElse(0)
////c.orElseGet(() -> );//wird von Lambdas genutzt
//
//if(c.isPresent()) {
//	System.out.println(	c.get().getAge());
//
//}else {
//Optional.empty();
//}


		public static void main(String[] args) {
		
		Optional<String> op = Optional.ofNullable(null);
//		System.out.println(op.isEmpty());
//		System.out.println(op.isPresent());
		
		//String ol = op.map(String::toUpperCase).orElseThrow(IllegalThreadStateException::new);
//op.ifPresent(t -> System.out.println(t));
op.ifPresentOrElse(System.out::println, () -> System.out.println("world") );

		p person = new p(null, "joe.gamil.com");
		System.out.println(person
				.getName()
				.map(String::toUpperCase)
				.orElse("not provided"));
				
	
	}
	

}
