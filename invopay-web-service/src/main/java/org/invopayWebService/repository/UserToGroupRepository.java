package org.invopayWebService.repository;

import org.invopayWebService.entity.UserToGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserToGroupRepository extends JpaRepository<UserToGroup, Integer>,
    JpaSpecificationExecutor<UserToGroup> {
	Long countByRefUserGroupId(int id);
}