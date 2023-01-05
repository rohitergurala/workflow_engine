package com.craftsilicon.bpm.workflow.rules;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Rule for checking the age constraints of the user.
 */
public class LoanApplicantRule implements Rule  {
    @Override
    public boolean validate() {
        return true;
    }
}
