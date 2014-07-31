package stu.tv.dataservice.web;

import org.springframework.web.bind.annotation.*;
import stu.tv.dataservice.domain.TvConfig;
import stu.tv.dataservice.service.TvConfigService;

import javax.inject.Inject;
import java.util.Collection;

@RestController
public class TvConfigController {

    @Inject
    private TvConfigService tvConfigService;

    @RequestMapping("/")
    public String index() {
        return "Welcome to Couchpotato";
    }

    @RequestMapping("/tvconfig")
    public Collection<TvConfig> getAll() {
        return tvConfigService.get();
    }

    @RequestMapping("/tvconfig/{tvId}")
    public TvConfig get(@PathVariable("tvId") Long tvId) {
        return tvConfigService.getById(tvId);
    }

    @RequestMapping(value = "/tvconfig",method = RequestMethod.POST)
    public TvConfig save(@RequestBody TvConfigForm teamTvConfigForm) {
        return tvConfigService.save(teamTvConfigForm);
    }
}
