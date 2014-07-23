package stu.tv.dataservice.service;

import org.springframework.stereotype.Service;
import stu.tv.dataservice.domain.TeamTVConfig;

import java.util.*;

@Service
public class TVConfigServiceImpl implements TVConfigService {

    private static Map<Long,TeamTVConfig> teamTVConfigs = new HashMap<Long, TeamTVConfig>();

    @Override
    public Collection<TeamTVConfig> get() {
        return teamTVConfigs.values();
    }

    @Override
    public TeamTVConfig getById(Long tvId) {
        return teamTVConfigs.get(tvId);
    }

    @Override
    public void post(TeamTVConfig teamTVConfig) {
        teamTVConfigs.put(teamTVConfig.getId(), teamTVConfig);
    }
}
