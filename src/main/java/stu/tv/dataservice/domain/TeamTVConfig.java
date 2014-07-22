package stu.tv.dataservice.domain;

import java.util.List;

public class TeamTVConfig {
    private String tvId;
    private List<String> urls;

    public TeamTVConfig() {
    }

    public TeamTVConfig(String tvId, List<String> urls) {
        this.tvId = tvId;
        this.urls = urls;
    }

    public String getTvId() {
        return tvId;
    }

    public void setTvId(String tvId) {
        this.tvId = tvId;
    }

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }
}
