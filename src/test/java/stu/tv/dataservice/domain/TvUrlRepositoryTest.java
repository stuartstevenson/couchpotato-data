package stu.tv.dataservice.domain;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;

import static com.google.common.collect.Sets.newHashSet;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TvUrlRepositoryTest extends IntegrationTest {

	@Autowired
	private TvUrlRepository tvUrlRepository;

	@Autowired
	private TvConfigRepository tvConfigRepository;

	@Test
	public void fieldsShouldBeMappedCorrectly() throws Exception {
		TvConfig tvConfig = new TvConfig("Description", new HashSet<TvUrl>());
		tvConfig = tvConfigRepository.save(tvConfig);

		TvUrl rightmove = new TvUrl("www.rightmove.co.uk", 30, tvConfig);
		rightmove = tvUrlRepository.save(rightmove);
		tvConfig.setUrls(newHashSet(rightmove));

		TvUrl foundTvUrl = tvUrlRepository.findOne(rightmove.getId());
		assertThat(foundTvUrl.getId(), is(rightmove.getId()));
		assertThat(foundTvUrl.getUrl(), is(rightmove.getUrl()));
		assertThat(foundTvUrl.getInterval(), is(rightmove.getInterval()));
	}

}