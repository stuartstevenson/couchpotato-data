package stu.tv.dataservice.domain;

public class TeamTVURL {
    private String url;
    private int intervalInSeconds;

    public TeamTVURL() {
    }

    public TeamTVURL(String url, int intervalInSeconds) {
        this.url = url;
        this.intervalInSeconds = intervalInSeconds;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getIntervalInSeconds() {
        return intervalInSeconds;
    }

    public void setIntervalInSeconds(int intervalInSeconds) {
        this.intervalInSeconds = intervalInSeconds;
    }
}
