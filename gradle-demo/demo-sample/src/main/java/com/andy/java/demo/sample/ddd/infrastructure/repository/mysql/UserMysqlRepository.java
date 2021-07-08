package com.andy.java.demo.sample.ddd.infrastructure.repository.mysql;

import com.andy.java.demo.sample.ddd.infrastructure.po.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author li-ning
 */
@Repository("userMysqlRepository")
public interface UserMysqlRepository extends PagingAndSortingRepository<UserEntity, Long>,
                                             JpaSpecificationExecutor<UserEntity>,
                                             JpaRepository<UserEntity,Long>,
                                             MysqlRepository
{
    /**
     *
     * @param userEntity
     * @return
     */
    @Override
    UserEntity save(UserEntity userEntity);

    /**
     *
     * @param id
     * @return
     */
    @Override
    Optional<UserEntity> findById(Long id);
}