package com.venuenavi.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TicketmasterService {

    //Pulling api key and url from application.properties
    @Value("${ticketmaster.api.key}")
    private String apiKey;

    @Value ("${ticketmaster.api.url}")
    private String apiUrl;

    //Creating an object for HTTP request.
    private final RestTemplate restTemplate = new RestTemplate();

    //Method searchEvent that takes keywords and the variables declared within the class to build a url and pull body response from url 
    public String searchEvents(String keyword) {
        String url = String.format("%s?apikey=%s&keyword=%s", apiUrl, apiKey, keyword);

        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        return response.getBody();
    }
}

//So this class above could be like a general search but I want to have another search that uses something like date or location I would create another service class.
// In the service class, we can possible add weather reports to the application if the event is an outdoor event. Same thing for Google since thats what clerk is looking into.