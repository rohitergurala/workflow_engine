package com.craftsilicon.bpm.workflow.services;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Service for executing the business rules
 */
@Service("businessRulesService")
public class BusinessRuleEngineService implements JavaDelegate {
    private final Logger log = LoggerFactory.getLogger(BusinessRuleEngineService.class);

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        log.info("Inside execution of BusinessRuleEngineService:");
        //TODO: Call all the (16) business rules and
        //TODO: Set the 'businessRuleCheckPassed' variable after executing the business rules
        //delegateExecution.setVariable("businessRuleCheckPassed", false);
    }
}
