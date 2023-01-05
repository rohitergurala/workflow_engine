package com.craftsilicon.bpm.workflow.services;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Service for executing the business rules
 */
@Service("regularUnderWritingService")
public class RegularUnderWritingService implements JavaDelegate {
    private final Logger log = LoggerFactory.getLogger(RegularUnderWritingService.class);

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        log.info("Inside execution of RegularUnderWritingService:");
        //TODO: Add the logic for 'Regular Underwriting Queue'.
    }
}
