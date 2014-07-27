package stu.tv.dataservice.domain;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;

import static com.google.common.collect.Sets.newHashSet;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

public class TvConfigRepositoryTest extends IntegrationTest {

	@Autowired
	private TvConfigRepository tvConfigRepository;

	@Autowired
	private TvUrlRepository tvUrlRepository;

	@Test
	public void fieldsShouldBeMappedCorrectly() throws Exception {
		TvConfig entity = new TvConfig("description", new HashSet<TvUrl>());
		TvConfig tvConfig = tvConfigRepository.save(entity);

		TvUrl rightmove = new TvUrl("www.rightmove.co.uk", 30, tvConfig);
		rightmove = tvUrlRepository.save(rightmove);
		TvUrl bbc = new TvUrl("www.bbc.co.uk", 30, tvConfig);
		bbc = tvUrlRepository.save(bbc);

		tvConfig.setUrls(newHashSet(rightmove, bbc));

		TvConfig foundConfig = tvConfigRepository.findOne(tvConfig.getId());
		assertThat(foundConfig.getDescription(), is(tvConfig.getDescription()));
	}

}