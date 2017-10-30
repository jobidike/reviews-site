package com.reviewssite.reviewssite;

public class Review {

	private long id; // key
	private String title; // value
	private String imageUrl;
	private String category;
	private String content;
	private String date;

	public Review(long id, String title, String imageUrl, String category, String content, String date) {

		this.id = id;
		this.title = title;
		this.imageUrl = imageUrl;
		this.category = category;
		this.content = content;
		this.date = date;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getCategory() {
		return category;
	}

	public String getContent() {
		return content;
	}

	public String getDate() {
		return date;
	}

}
