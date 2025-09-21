package InterB;

public class FreeTextQuestion extends Question{
	private final String answer;
	public FreeTextQuestion(String text,String answer) {
		super(text);
		this.answer= answer;

	}

	@Override
	public boolean checkAnswer(String answerString) {
	return answer.equalsIgnoreCase(answerString.trim());
	}

}

