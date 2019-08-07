package com.codeinvestigator.democonditional.space;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        boolean myenv = "enabled".equalsIgnoreCase(context.getEnvironment().getProperty("MYENV"));
        return myenv;
    }
}
