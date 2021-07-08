package com.andy.java.demo.sample.event.dao;

import com.andy.java.demo.sample.event.po.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * @author li-ning
 */
@Transactional
public interface AccountDao extends PagingAndSortingRepository<EventEntity, Long>, JpaSpecificationExecutor<EventEntity>, JpaRepository<EventEntity,Long>
{
    /**
     *
     * @param id
     * @return
     */
    @Override
    Optional<EventEntity> findById(Long id);
}
