package com.medicinaviva.notification.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.medicinaviva.notification.model.event.ConsultationEvent;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class KafkaService {

    @KafkaListener(topics = "consultationScheduledTopic")
    public void consume(ConsultationEvent event){
      log.info("Received notification for Consultation of patient - {} ", event.getPatientId());
    }
}
