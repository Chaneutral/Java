package d9;

public class MessageDTO {

	String to;
	String title;
	String content;
	
	
	
	public MessageDTO(String to, String title, String content) {
		super();
		this.to = to;
		this.title = title;
		this.content = content;
	}


	@Override
	public String toString() {
		return "MessageDTO [to=" + to + ", title=" + title + ", content=" + content + "]";
	}
	
	
	
	
}
