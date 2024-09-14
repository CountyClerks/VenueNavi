package com.venuenavi.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//Controller class dealing with 
@RestController
public class VNController {

    @Autowired
    public TicketmasterService ticketmasterService;

    @GetMapping("/search-events")
    public String searchEvents(@RequestParam String keyword){
        return ticketmasterService.searchEvents(keyword);
    }
}
