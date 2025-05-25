package Inter3;


public class Lambda  {


public static void main(String[] args) {

Printable pr = (d, s) -> {return d+s;} ; 
Printable prt = (d, s) -> {return d+s;};

System.out.println( printthing(pr));
}
 
public static String printthing (Printable p) {

return p.print(0, null);
	
}

}
