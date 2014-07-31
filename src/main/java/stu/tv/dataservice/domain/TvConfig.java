package stu.tv.dataservice.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "TvConfig")
public class TvConfig implements Serializable {

	private Long id;
	private String description;
	private Set<TvUrl> urls;

	public TvConfig() {
	}

	public TvConfig(String description, Set<TvUrl> urls) {
		this.description = description;
		this.urls = urls;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TV_CONFIG_ID", unique = true, nullable = false)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "DESCRIPTION")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tvConfig")
	public Set<TvUrl> getUrls() {
		return urls;
	}

	public void setUrls(Set<TvUrl> urls) {
		this.urls = urls;
	}

}
