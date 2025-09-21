package InterB;

public class MultiplechoiceQuestion extends Question {
	public int correctIndex;
	public String choices[];
	
	public MultiplechoiceQuestion(String text,String choices[] , int correctIndex) {
		super(text);
		this.choices= choices;
		this.correctIndex= correctIndex;

	}
@Override
public void ask() {

	super.ask();
	for (int i = 0; i < choices.length; i++) {
		System.out.println(i+1  + ")"+choices[i]);
	}
}
	@Override
	public boolean checkAnswer(String answerString) {
		int answer = Integer.parseInt(answerString.trim());
		return answer==correctIndex+1;
		


	}

}

