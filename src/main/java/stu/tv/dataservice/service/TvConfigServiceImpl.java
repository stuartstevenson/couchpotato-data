package stu.tv.dataservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stu.tv.dataservice.domain.TvConfig;
import stu.tv.dataservice.domain.TvConfigRepository;
import stu.tv.dataservice.domain.TvUrl;
import stu.tv.dataservice.domain.TvUrlRepository;
import stu.tv.dataservice.web.TvConfigForm;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.Set;

import static com.google.common.collect.Lists.newArrayList;

@Service
@Transactional
public class TvConfigServiceImpl implements TvConfigService {

	@Autowired
	private TvConfigRepository tvConfigRepository;

	@Autowired
	private TvUrlRepository tvUrlRepository;

	@Autowired
	private TvConfigFormTvConfigConverter tvConfigFormTvConfigConverter;

	@Autowired
	private TvConfigFormTvUrlConverter tvConfigFormTvUrlConverter;

	@Override
	public Collection<TvConfig> get() {
		return newArrayList(tvConfigRepository.findAll());
	}

	@Override
	public TvConfig getById(Long tvId) {
		return tvConfigRepository.findOne(tvId);
	}

	@Override
	public TvConfig save(TvConfigForm tvConfigForm) {
		TvConfig tvConfig = tvConfigFormTvConfigConverter.convert(tvConfigForm);
		Set<TvUrl> tvUrls = tvConfigFormTvUrlConverter.convert(tvConfigForm);

		tvConfig = tvConfigRepository.save(tvConfig);

		for(TvUrl tvUrl : tvUrls){
			tvUrl.setTvConfig(tvConfig);
		}
		tvUrlRepository.save(tvUrls);

		tvConfig.setUrls(tvUrls);
		return tvConfig;
	}
}
