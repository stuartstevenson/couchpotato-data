package stu.tv.dataservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TvUrl")
public class TvUrl implements Serializable {

	private Long id;
    private String url;
    private Integer interval;
	private Integer sequence;
	private TvConfig tvConfig;

    public TvUrl() {
    }

	public TvUrl(String url, Integer interval) {
		this.url = url;
		this.interval = interval;
	}

    public TvUrl(String url, Integer interval, TvConfig tvConfig) {
        this.url = url;
        this.interval = interval;
		this.tvConfig = tvConfig;
    }

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TV_URL_ID", unique = true, nullable = false)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "URL")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

	@Column(name = "INTERVAL")
    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

	@Column(name = "SEQUENCE")
	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TV_CONFIG_ID", nullable = false)
	@JsonIgnore
	public TvConfig getTvConfig() {
		return tvConfig;
	}

	public void setTvConfig(TvConfig tvConfig) {
		this.tvConfig = tvConfig;
	}

}
