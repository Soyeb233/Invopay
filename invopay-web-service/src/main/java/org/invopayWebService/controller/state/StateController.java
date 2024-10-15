package org.invopayWebService.controller.state;

import org.invopayWebService.entity.State;
import org.invopayWebService.service.state.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class StateController {
    @Autowired
    private StateService stateService;
    @GetMapping("/getAllState/{id}")
    public List<State> getAllState(@PathVariable int id) {              
        System.out.println("I got Hit");
        return  stateService.getAllState(id);
    }


}
