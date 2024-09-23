package com.venuenavi.demo;

import com.venuenavi.demo.model.Event;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketmasterService {

    private static final Logger logger = LoggerFactory.getLogger(TicketmasterService.class);

    @Value("${ticketmaster.api.key}")
    private String apiKey;

    @Value("${ticketmaster.api.url}")
    private String apiUrl;

    private final RestTemplate restTemplate = new RestTemplate();

    public List<Event> searchEvents(String keyword) {
        try {
            // Construct the URL with the API key and keyword
            String url = String.format("%sapikey=%s&keyword=%s", apiUrl, apiKey, keyword);
            logger.info("Requesting URL: {}", url);

            // Send a GET request to the Ticketmaster API
            ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

            if (response.getStatusCode().is2xxSuccessful()) {
                logger.info("Successfully received response from Ticketmaster");

                // Parse the JSON response
                ObjectMapper objectMapper = new ObjectMapper();
                JsonNode root = objectMapper.readTree(response.getBody());

                // Navigate to the events node
                List<Event> events = new ArrayList<>();
                JsonNode eventsNode = root.path("_embedded").path("events");

                // Extract specific fields for each event
                for (JsonNode eventNode : eventsNode) {
                    Event event = new Event();
                    event.setName(eventNode.path("name").asText());
                    event.setDate(eventNode.path("dates").path("start").path("localDate").asText());
                    event.setTime(eventNode.path("dates").path("start").path("localTime").asText());
                    event.setVenue(eventNode.path("_embedded").path("venues").get(0).path("name").asText());
                    event.setLink(eventNode.path("url").asText());
                    event.setImage(eventNode.path("images").get(0).path("url").asText());
                    event.setTicketDate(eventNode.path("sales").path("public").path("startDateTime").asText());
                    event.setPreTicketDate(eventNode.path("sales").path("presales").get(0).path("startDateTime").asText());
                    event.setGenreID(eventNode.path("classifications").get(0).path("segment").path("name").asText());
                    event.setGenreSubID(eventNode.path("classifications").get(0).path("genre").path("name").asText());
                    event.setTicketPrice(eventNode.path("priceRanges").get(0).path("min").asInt());
                    event.setCurrency(eventNode.path("priceRanges").get(0).path("currency").asText());
                    event.setTimezone(eventNode.path("dates").path("timezone").asText());

                    // Add event to the list
                    events.add(event);
                }

                return events;
            } else {
                logger.error("Failed to fetch data from Ticketmaster: {}", response.getStatusCode());
                return new ArrayList<>();
            }
        } catch (Exception e) {
            logger.error("Exception occurred while calling Ticketmaster API", e);
            return new ArrayList<>();
        }
    }
}



// package com.venuenavi.demo;

// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.http.ResponseEntity;
// import org.springframework.stereotype.Service;
// import org.springframework.web.client.RestTemplate;

// @Service
// public class TicketmasterService {

//     //Pulling api key and url from application.properties
//     @Value("${ticketmaster.api.key}")
//     private String apiKey;

//     @Value ("${ticketmaster.api.url}")
//     private String apiUrl;

//     //Creating an object for HTTP request.
//     private final RestTemplate restTemplate = new RestTemplate();

//     //Method searchEvent that takes keywords and the variables declared within the class to build a url and pull body response from url 
//     public String searchEvents(String keyword) {
//         String url = String.format("%s?apikey=%s&keyword=%s", apiUrl, apiKey, keyword);

//         ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
//         return response.getBody();
//     }
// }

// //So this class above could be like a general search but I want to have another search that uses something like date or location I would create another service class.
// // In the service class, we can possible add weather reports to the application if the event is an outdoor event. Same thing for Google since thats what clerk is looking into.