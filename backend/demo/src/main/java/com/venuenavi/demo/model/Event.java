package com.venuenavi.demo.model;

public class Event {
    private String name;
    private String date;
    private String venue;
    private String link;
    private String image;
    private String ticketDate;
    private String preTicketDate;
    private String genreID;
    private String genreSubID;
    private int ticketPrice;
    private String currency;
    private String timezone;
    private String time;

    // Getters and Setters for each field
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTicketDate() {
        return ticketDate;
    }

    public void setTicketDate(String ticketDate) {
        this.ticketDate = ticketDate;
    }

    public String getPreTicketDate() {
        return preTicketDate;
    }

    public void setPreTicketDate(String preTicketDate) {
        this.preTicketDate = preTicketDate;
    }

    public String getGenreID() {
        return genreID;
    }

    public void setGenreID(String genreID) {
        this.genreID = genreID;
    }

    public String getGenreSubID() {
        return genreSubID;
    }

    public void setGenreSubID(String genreSubID) {
        this.genreSubID = genreSubID;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getCurrency(){
        return currency;
    }
    
    public void setCurrency(String currency){
        this.currency = currency;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}