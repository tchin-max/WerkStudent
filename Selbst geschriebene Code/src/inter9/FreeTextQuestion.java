package inter9;

public class FreeTextQuestion extends Question {
public String answer;
	public FreeTextQuestion(String questionText,String answer) {
		super(questionText);
		this.answer= answer;

	}

	@Override
	public boolean checkAnswer(String answerString) {

		return answer.equalsIgnoreCase(answerString.trim());
	}

	
}
