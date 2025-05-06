package Inter3;

public class BookSearc {
	private final String keybord;
	private final String author ;
	private final int publicationear;

	
	public BookSearc(Builder builder) {
	
		this.keybord = builder.keybord ;
		this.author = builder.author;
		this.publicationear = builder.publicationear;
	}



	private static class Builder{
		
		private final String keybord;
		private String author = null ;
		private final int publicationear = Integer.MAX_VALUE;
		
		public Builder(String keybord) {
			
			this.keybord = keybord;
			// TODO Auto-generated constructor stub
			
			
		}
		public Builder author(String author) {
			this.author = author;
			return this;
		}

	}
	

}
