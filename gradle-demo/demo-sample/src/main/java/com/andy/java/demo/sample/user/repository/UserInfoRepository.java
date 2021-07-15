package com.andy.java.demo.sample.user.repository;

import com.andy.java.demo.sample.user.po.UserEntity;
import com.andy.java.demo.sample.user.po.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * @author li-ning
 */
@Transactional
public interface UserInfoRepository extends PagingAndSortingRepository<UserInfoEntity, Long>, JpaSpecificationExecutor<UserInfoEntity>, JpaRepository<UserInfoEntity,Long>
{
    /**
     * fetch data by rule id
     *
     * @param userId-userId
     * @return Result<XxxxDO>
     */
    @Override
    Optional<UserInfoEntity> findById(Long userId);
}
