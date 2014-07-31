package stu.tv.dataservice.web;

import java.util.List;

public class TvConfigForm {

	private Long id;
	private String description;
	private List<TvUrlForm> urls;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<TvUrlForm> getUrls() {
		return urls;
	}

	public void setUrls(List<TvUrlForm> urls) {
		this.urls = urls;
	}
}
