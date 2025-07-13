package inter9;

public abstract class Question implements Answerable {
	
	protected String questionText;

	public Question(String questionText) {
		this.questionText = questionText;
	}
	
	@Override
	public void ask() {

		System.out.println(questionText);
	}
	
public String getText() {
	return questionText;

}
}
