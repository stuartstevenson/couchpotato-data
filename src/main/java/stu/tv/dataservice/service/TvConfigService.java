package stu.tv.dataservice.service;

import stu.tv.dataservice.domain.TvConfig;
import stu.tv.dataservice.web.TvConfigForm;

import java.util.Collection;

public interface TvConfigService {
    Collection<TvConfig> get();

    TvConfig getById(Long tvId);

    TvConfig save(TvConfigForm teamTvConfigForm);

}
