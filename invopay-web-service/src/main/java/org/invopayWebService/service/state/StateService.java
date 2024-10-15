package org.invopayWebService.service.state;


import org.invopayWebService.entity.State;
import org.invopayWebService.repository.state.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService {
    @Autowired
    private StateRepository stateRepository;

    public List<State> getAllState(int id) {
        return stateRepository.findAllByRefCountryId(id);
    }

}
