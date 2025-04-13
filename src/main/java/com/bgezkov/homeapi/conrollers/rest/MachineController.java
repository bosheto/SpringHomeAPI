package com.bgezkov.homeapi.conrollers.rest;

import com.bgezkov.homeapi.models.Machine;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MachineController {

    private Machine machine;

    public MachineController(){
        this.machine = new Machine();
    }

    @GetMapping("/")
    public String root(){
        machine.setIPv4("10.0.0.6");

        return machine.getIPv4();
    }
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }


}
