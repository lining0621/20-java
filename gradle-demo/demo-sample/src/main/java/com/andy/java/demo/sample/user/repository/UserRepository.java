package com.andy.java.demo.sample.user.repository;

import com.andy.java.demo.sample.user.po.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * @author li-ning
 */
@Transactional
public interface UserRepository extends PagingAndSortingRepository<UserEntity, Long>, JpaSpecificationExecutor<UserEntity>, JpaRepository<UserEntity,Long>
{
    /**
     *
     * @param id
     * @return
     */
    @Override
    Optional<UserEntity> findById(Long id);
}
