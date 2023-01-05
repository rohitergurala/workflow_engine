package com.craftsilicon.bpm.workflow.services;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Service for executing the business rules
 */
@Service("notificationService")
public class NotificationService implements JavaDelegate {
    private final Logger log = LoggerFactory.getLogger(NotificationService.class);

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        log.info("Inside execution of NotificationService:");
    }
}
