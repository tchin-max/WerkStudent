package inter9;

import java.util.Arrays;
import java.util.Scanner;

public class QuizRunner {
	public Queue<Answerable> question;

	public QuizRunner(Queue<Answerable> question) {
		this.question = question;
	}
	public  void run(){
		while (!question.empty()) {
Scanner sc = new Scanner(System.in);
Answerable q = question.pop_back();
if (q!=null) {
	

q.ask();
System.out.println("Antwort: ");
String input = sc.nextLine();
if (q.checkAnswer(input)) {
	System.out.println("gute Antwort");
}else {
	System.out.println("Incorrect");

}
		}
		
		}}
public static void main(String[] args) {
	Queue<Answerable> a = new QueueList<>();
	a.push_front(new FreeTextQuestion("what is the main City of France", "Paris"));
	String s []= {"80","59","31"};
	a.push_front(new MultipleChoiceQuestion("What is 15+56", s, 2));
	
	QuizRunner qr = new QuizRunner(a);
	qr.run();
	
}
} 
