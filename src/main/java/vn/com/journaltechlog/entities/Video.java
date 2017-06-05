package vn.com.journaltechlog.entities;

public class Video {
	private String id;
	private String path;
	private int length;
	private long size;
	private long dateUpload;
	private User user;
	public Video(String id, String path, int length, long size, long dateUpload, User user) {
		super();
		this.id = id;
		this.path = path;
		this.length = length;
		this.size = size;
		this.dateUpload = dateUpload;
		this.user = user;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	public long getDateUpload() {
		return dateUpload;
	}
	public void setDateUpload(long dateUpload) {
		this.dateUpload = dateUpload;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
