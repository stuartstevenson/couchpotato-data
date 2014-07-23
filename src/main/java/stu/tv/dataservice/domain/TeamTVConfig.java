package stu.tv.dataservice.domain;

import java.util.List;

public class TeamTVConfig {
    private Long id;
    private String description;
    private List<TeamTVURL> urls;

    public TeamTVConfig() {
    }

    public TeamTVConfig(Long id, String description, List<TeamTVURL> urls) {
        this.id = id;
        this.description = description;
        this.urls = urls;
    }

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

    public List<TeamTVURL> getUrls() {
        return urls;
    }

    public void setUrls(List<TeamTVURL> urls) {
        this.urls = urls;
    }
}
