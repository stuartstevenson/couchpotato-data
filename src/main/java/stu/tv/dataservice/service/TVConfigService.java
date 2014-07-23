package stu.tv.dataservice.service;

import stu.tv.dataservice.domain.TeamTVConfig;

import java.util.Collection;

public interface TVConfigService {
    Collection<TeamTVConfig> get();

    TeamTVConfig getById(Long tvId);

    void post(TeamTVConfig teamTVConfig);
}
