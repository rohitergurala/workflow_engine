package com.craftsilicon.bpm.workflow.services;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.camunda.bpm.engine.RuntimeService;

/**
 * Service for executing the business rules
 */
@Service("dataEnrichmentService")
public class DataEnrichmentService implements JavaDelegate {

    @Autowired
    private RuntimeService runtimeService;

    private final Logger log = LoggerFactory.getLogger(DataEnrichmentService.class);

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        log.info("Inside execution of BusinessRuleEngineService:");
        //TODO: Call the data enrichment api
        //delegateExecution.setVariable("businessRuleCheckPassed", false);
    }
}
