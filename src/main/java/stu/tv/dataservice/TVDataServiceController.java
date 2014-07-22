package stu.tv.dataservice;

import org.springframework.web.bind.annotation.*;
import stu.tv.dataservice.domain.TeamTVConfig;

import javax.inject.Inject;
import java.util.Collection;
import java.util.List;

@RestController
public class TVDataServiceController {

    @Inject
    private TVConfigService tvConfigService;

    @RequestMapping("/tvconfig")
    public Collection<TeamTVConfig> index() {
        return tvConfigService.get();
    }

    @RequestMapping("/tvconfig/{tvId}")
    public TeamTVConfig get(@PathVariable("tvId") String tvId) {
        return tvConfigService.getById(tvId);
    }

    @RequestMapping(value = "/tvconfig",method = RequestMethod.POST)
    public TeamTVConfig post(@RequestBody TeamTVConfig teamTVConfig) {
        tvConfigService.post(teamTVConfig);
        return teamTVConfig;
    }
}
