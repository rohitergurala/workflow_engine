package com.craftsilicon.bpm.workflow.services;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Service for Risk Categorization
 */
@Service("riskCategorizationService")
public class RiskCategorizationService implements JavaDelegate {
    private final Logger log = LoggerFactory.getLogger(RiskCategorizationService.class);

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        log.info("Inside execution of RiskCategorizationService:"+delegateExecution.getVariables());
        //TODO: Set the 'riskCategory' variable after executing the Risk Categorization logic
        //delegateExecution.setVariable("riskCategory", "LOW_RISK");
    }
}
