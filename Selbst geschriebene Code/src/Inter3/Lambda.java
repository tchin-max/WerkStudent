package Inter3;



public class Lambda  {


public static void main(String[] args) {
Printable pr = (s)-> {
	System.out.println("miaouw");
	return "miaouw" ;
	};
printthing(pr);

};
static void printthing(Printable p) {
p.print("!");	
}
 

}
