package InterB;

public abstract class  Question implements Answerrable{

	protected String questionText;

	public Question(String questionText) {

		this.questionText = questionText;
	}
	@Override

	public void ask() {
		System.out.println( questionText);
	}
public String getText() {
	return questionText;

}

}
