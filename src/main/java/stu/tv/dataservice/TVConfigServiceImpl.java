package stu.tv.dataservice;

import org.springframework.stereotype.Service;
import stu.tv.dataservice.domain.TeamTVConfig;

import java.util.*;

@Service
public class TVConfigServiceImpl implements TVConfigService {

    private static Map<String,TeamTVConfig> teamTVConfigs = new HashMap<String, TeamTVConfig>();

    @Override
    public Collection<TeamTVConfig> get() {
        return teamTVConfigs.values();
    }

    @Override
    public TeamTVConfig getById(String tvId) {
        return teamTVConfigs.get(tvId);
    }

    @Override
    public void post(TeamTVConfig teamTVConfig) {
        teamTVConfigs.put(teamTVConfig.getTvId(), teamTVConfig);
    }
}
