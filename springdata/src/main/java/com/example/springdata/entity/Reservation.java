package com.example.springdata.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="RESERVATION")
public class Reservation {
    @Id
    @GeneratedValue
    @Column(name="RESERVATION_ID")
    private Integer id; //colaoana pentru reservation_Id

    @Column(name="ROOM_ID")
    private Integer roomID; //colaoan ROOM_ID

    @Column(name="GUEST_ID")
    private Integer guestID; //coalana GUEST_ID

    @Column(name="RES_DATE")
    private Date date; //coloana RES_DATE

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoomID() {
        return roomID;
    }

    public void setRoomID(Integer roomID) {
        this.roomID = roomID;
    }

    public Integer getGuestID() {
        return guestID;
    }

    public void setGuestID(Integer guestID) {
        this.guestID = guestID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    //adaugati adnotarile in Reservation + adnotarile id si generatedvalue
    //creati in pachetul repository: ReservationRepository
    //creati in pachetul controller: ReservationController
    //testati metoda din controller in browser
}
