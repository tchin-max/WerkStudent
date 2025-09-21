package InterB;

import java.util.Queue;

public class QuiyRunner {
	public QuiyRunner(Queue<Answerrable> question) {
		
		
	}
	public void run(){
		
	}
	public static void main(String[] args) {
		
	}
}
//package exam.prog2.sose25_01.quiz;
//
//import exam.prog2.sose25_01.container.Queue;
//import java.util.Scanner;
//
//public class QuizRunner {
//    private final Queue<Answerable> questions;
//
//    public QuizRunner(Queue<Answerable> questions) {
//        this.questions = questions;
//    }
//
//    public void run() {
//        Scanner scanner = new Scanner(System.in);
//        while (!questions.empty()) {
//            Answerable q = questions.pop_back();
//            q.ask();
//            System.out.print("Deine Antwort: ");
//            String input = scanner.nextLine();
//            if (q.checkAnswer(input)) {
//                System.out.println("✔️ Richtig!");
//            } else {
//                System.out.println("❌ Falsch.");
//            }
//            System.out.println();
//        }
//    }
//}
