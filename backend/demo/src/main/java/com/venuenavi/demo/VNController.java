package com.venuenavi.demo;

import com.venuenavi.demo.model.Event;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


//Controller class dealing with 
@RestController
public class VNController {

    @Autowired
    private TicketmasterService ticketmasterService;

    @GetMapping("/search-events")
    public List<Event> searchEvents(@RequestParam String keyword){
        return ticketmasterService.searchEvents(keyword);
    }
}
