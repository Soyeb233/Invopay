package org.invopayWebService.service.userGroup;

import org.invopayWebService.entity.User;
import org.invopayWebService.entity.UserGroup;
import org.invopayWebService.repository.userGroup.UserGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserGroupService {

    @Autowired
    private UserGroupRepository userGroupRepository;

    public List<UserGroup> getAllUserGroup() {
        return userGroupRepository.findAllUserGroup();
    }
    public boolean changeDeleteStatus(int id) {

        Optional<UserGroup> userGroupItem = userGroupRepository.findById(id);
        if (userGroupItem.isPresent()) {

            userGroupRepository.deleteStaus(id,1);

        } else {
            return false;
        }

        return true;
    }

}
