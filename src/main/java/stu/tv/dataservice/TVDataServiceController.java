package stu.tv.dataservice;

import org.springframework.web.bind.annotation.*;
import stu.tv.dataservice.domain.TeamTVConfig;
import stu.tv.dataservice.service.TVConfigService;

import javax.inject.Inject;
import java.util.Collection;

@RestController
public class TVDataServiceController {

    @Inject
    private TVConfigService tvConfigService;

    @RequestMapping("/")
    public String index() {
        return "Welcome to Couchpotato";
    }

    @RequestMapping("/tvconfig")
    public Collection<TeamTVConfig> getAll() {
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
