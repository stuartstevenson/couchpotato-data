package stu.tv.dataservice.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TvConfigRepository extends CrudRepository<TvConfig, Long> {
}
