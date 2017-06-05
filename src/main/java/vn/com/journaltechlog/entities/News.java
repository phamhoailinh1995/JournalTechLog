package vn.com.journaltechlog.entities;

import java.util.List;

public class News {
	private String id;
	private String content;
	private User user;
	private long dateTimeUpload;
	private List<Video> videoList;
	private List<Picture> pictureList;
	private List<Comment> commentList;
	private long watch;
	private long like;
	private long dislike;
	public News(String id, String content, User user, long dateTimeUpload, List<Video> videoList,
			List<Picture> pictureList) {
		super();
		this.id = id;
		this.content = content;
		this.user = user;
		this.dateTimeUpload = dateTimeUpload;
		this.videoList = videoList;
		this.pictureList = pictureList;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public long getDateTimeUpload() {
		return dateTimeUpload;
	}
	public void setDateTimeUpload(long dateTimeUpload) {
		this.dateTimeUpload = dateTimeUpload;
	}
	public List<Video> getVideoList() {
		return videoList;
	}
	public void setVideoList(List<Video> videoList) {
		this.videoList = videoList;
	}
	public List<Picture> getPictureList() {
		return pictureList;
	}
	public void setPictureList(List<Picture> pictureList) {
		this.pictureList = pictureList;
	}
	public List<Comment> getCommentList() {
		return commentList;
	}
	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}
	public long getWatch() {
		return watch;
	}
	public void setWatch(long watch) {
		this.watch = watch;
	}
	public long getLike() {
		return like;
	}
	public void setLike(long like) {
		this.like = like;
	}
	public long getDislike() {
		return dislike;
	}
	public void setDislike(long dislike) {
		this.dislike = dislike;
	}
	public void addComment(Comment newComment) {
		this.commentList.add(newComment);
	}
	public void incrementLikeByOne() {
		this.like++;
	}
	public void incrementDislikeByOne() {
		this.dislike++;
	}
	public void decrementLikeByOne() {
		this.like--;
	}
	public void decrementDislikeByOne() {
		this.dislike--;
	}
	public void incrementWatchByOne() {
		this.watch++;
	}
	public void decrementWatchByOne() {
		this.watch--;
	}
}
