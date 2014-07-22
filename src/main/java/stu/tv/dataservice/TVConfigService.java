package stu.tv.dataservice;

import stu.tv.dataservice.domain.TeamTVConfig;

import java.util.Collection;

public interface TVConfigService {
    Collection<TeamTVConfig> get();

    TeamTVConfig getById(String tvId);

    void post(TeamTVConfig teamTVConfig);
}
