package guru.springframework.spring5webapp;

public class Greeting {

	private long id;
	private String content;
	private long id2;
	private long id3;

	public Greeting(long id, String content, long id2, long id3) {
		this.id = id;
		this.id2 = id2;
		this.id3 = id3;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public long getId2() {
		return id2;
	}
	public long getId3() {
		return id3;
	}

	public String getContent() {
		return content;
	}
}