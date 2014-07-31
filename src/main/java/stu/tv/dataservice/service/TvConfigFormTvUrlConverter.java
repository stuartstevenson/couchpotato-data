package stu.tv.dataservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import stu.tv.dataservice.domain.TvConfig;
import stu.tv.dataservice.domain.TvConfigRepository;
import stu.tv.dataservice.domain.TvUrl;
import stu.tv.dataservice.domain.TvUrlRepository;
import stu.tv.dataservice.web.TvConfigForm;
import stu.tv.dataservice.web.TvUrlForm;

import java.util.HashSet;
import java.util.Set;

@Component
public class TvConfigFormTvUrlConverter implements Converter<TvConfigForm, Set<TvUrl>> {

	@Autowired
	private TvUrlRepository tvUrlRepository;

	@Override
	public Set<TvUrl> convert(TvConfigForm source) {
		Set<TvUrl> tvUrls = new HashSet<TvUrl>();
		for(TvUrlForm form : source.getUrls()){
			TvUrl tvUrl;
			if(form.getId() != null){
				tvUrl = tvUrlRepository.findOne(form.getId());
			}
			else{
				tvUrl = new TvUrl();
			}
			tvUrl.setUrl(form.getUrl());
			tvUrl.setInterval(form.getInterval());
			tvUrls.add(tvUrl);
		}
		return tvUrls;
	}

}
