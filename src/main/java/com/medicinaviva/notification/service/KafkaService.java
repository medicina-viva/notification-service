package com.medicinaviva.notification.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.medicinaviva.notification.model.event.ConsultationEvent;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class KafkaService {

  @KafkaListener(topics = "consultationScheduledTopic")
  public void scheduleConsulatation(ConsultationEvent event) {
    log.info("Received notification for Consultation - {} ", event);
  }

  @KafkaListener(topics = "consultationConfirmedTopic")
  public void confirmConsulation(ConsultationEvent event) {
    log.info("Received notification for confirmed Consultation - {} ", event);
  }
}
