package org.javaweb.vuls.entity;

import java.io.Serializable;

/**
 * Created by yz on 2016/12/17.
 */
public class SysComments implements Serializable {

	/**
	 * 评论Id
	 */
	private Long commentId;

	/**
	 * 评论的文章Id
	 */
	private Long commentArticleId;

	/**
	 * 评论的用户ID(未登录的用户ID为0)
	 */
	private Long commentUserId;

	/**
	 * 评论者昵称
	 */
	private String commentAuthor;

	/**
	 * 评论内容
	 */
	private String commentContent;

	/**
	 * 评论发布时间
	 */
	private String commentDate;

	public Long getCommentId() {
		return commentId;
	}

	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}

	public Long getCommentArticleId() {
		return commentArticleId;
	}

	public void setCommentArticleId(Long commentArticleId) {
		this.commentArticleId = commentArticleId;
	}

	public Long getCommentUserId() {
		return commentUserId;
	}

	public void setCommentUserId(Long commentUserId) {
		this.commentUserId = commentUserId;
	}

	public String getCommentAuthor() {
		return commentAuthor;
	}

	public void setCommentAuthor(String commentAuthor) {
		this.commentAuthor = commentAuthor;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public String getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(String commentDate) {
		this.commentDate = commentDate;
	}

}