package com.andy.java.demo.sample.ddd.infrastructure.repository.mysql;

import com.andy.java.demo.sample.ddd.infrastructure.po.UserEntityOld;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author li-ning
 */
@Repository("userMysqlRepository")
public interface UserMysqlRepository extends PagingAndSortingRepository<UserEntityOld, Long>,
                                             JpaSpecificationExecutor<UserEntityOld>,
                                             JpaRepository<UserEntityOld,Long>
{
    /**
     *
     * @param userEntityOld
     * @return
     */
    @Override
    UserEntityOld save(UserEntityOld userEntityOld);

    /**
     *
     * @param id
     * @return
     */
    @Override
    Optional<UserEntityOld> findById(Long id);
}