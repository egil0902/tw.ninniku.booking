package tw.ninniku.timeline;

public class Group {

	public Group(int id, String content) {
		super();
		this.id = String.valueOf(id);
		this.content = content;
	}
	public String getId() {
		return id;
	}
	public void setId(int id) {
		this.id = String.valueOf(id) ;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	String  id;
	String content;
}
