package com.UST.RailwayTicketSystemKafka.controller;

import com.UST.RailwayTicketSystemKafka.entity.Train;
import com.UST.RailwayTicketSystemKafka.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trains")
public class TicketController {
    @Autowired
    private TrainRepository trainRepository;

    @GetMapping("/{id}")
    public Train getTrainById(@PathVariable Long id) {
        return trainRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Train createTrain(@RequestBody Train train) {
        return trainRepository.save(train);
    }

//    @PutMapping("/{id}")
//    public Train updateTrain(@PathVariable Long id, @RequestBody Train updatedTrain) {
//        if (trainRepository.existsById(id)) {
//            updatedTrain.setId(id);
//            return trainRepository.save(updatedTrain);
//        }
//        return null;
//    }
    @DeleteMapping("/{id}")
    public void deleteTrain(@PathVariable Long id) {
        trainRepository.deleteById(id);
    }
}

