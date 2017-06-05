package vn.com.journaltechlog.entities;

import java.util.List;

public class Comment {
	private String name;
	private long dateTime;
	private String content;
	private List<Comment> replyList;
	public Comment(String name, long dateTime, String content) {
		super();
		this.name = name;
		this.dateTime = dateTime;
		this.content = content;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getDateTime() {
		return dateTime;
	}
	public void setDateTime(long dateTime) {
		this.dateTime = dateTime;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public List<Comment> getReplyList() {
		return replyList;
	}
	public void setReplyList(List<Comment> replyList) {
		this.replyList = replyList;
	}
	public void addReply(Comment reply) {
		this.replyList.add(reply);
	}
}
