package org.quarzt.dao;

import org.quarzt.entity.JobEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * Created by EalenXie on 2018/6/4 14:27
 */
@Component
public interface JobEntityRepository extends CrudRepository<JobEntity, Long> {
    JobEntity getById(Integer id);
}