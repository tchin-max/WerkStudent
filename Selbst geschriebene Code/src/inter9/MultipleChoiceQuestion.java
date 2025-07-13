package inter9;

public class MultipleChoiceQuestion extends Question {
	public String choices[];
	public int correctIndex;

	public MultipleChoiceQuestion(String questionText,String choices[],int correctIndex) {
		super(questionText);
		this.choices= choices;
		this.correctIndex= correctIndex;

	}

	@Override
	public boolean checkAnswer(String answerString) {

int answer = Integer.parseInt(answerString.trim());
	
		return answer==correctIndex+1  ;
	}
@Override
public void ask() {
	super.ask();
	for (int i = 0; i < choices.length; i++) {
		System.out.println(i+1 +")" + choices[i] );
	}
}
}
 