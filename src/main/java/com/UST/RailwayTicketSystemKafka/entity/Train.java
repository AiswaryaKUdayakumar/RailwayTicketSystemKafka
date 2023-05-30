package com.UST.RailwayTicketSystemKafka.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Train {
    @Id
    @GeneratedValue
    private Long id;

    private String trainNumber;

    private String trainName;
}
