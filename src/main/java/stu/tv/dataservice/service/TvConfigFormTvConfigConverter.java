package stu.tv.dataservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import stu.tv.dataservice.domain.TvConfig;
import stu.tv.dataservice.domain.TvConfigRepository;
import stu.tv.dataservice.domain.TvUrl;
import stu.tv.dataservice.web.TvConfigForm;
import stu.tv.dataservice.web.TvUrlForm;

import java.util.List;
import java.util.Set;

import static com.google.common.collect.Sets.newHashSet;

@Component
public class TvConfigFormTvConfigConverter implements Converter<TvConfigForm, TvConfig> {

	@Autowired
	private TvConfigRepository tvConfigRepository;

	@Override
	public TvConfig convert(TvConfigForm source) {
		TvConfig tvConfig;
		if(source.getId() != null && !source.getId().equals(-1L) ){
			tvConfig = tvConfigRepository.findOne(source.getId());
		}
		else{
			tvConfig = new TvConfig();
		}
		tvConfig.setDescription(source.getDescription());
		return tvConfig;
	}

}
