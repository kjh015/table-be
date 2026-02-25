package com.john.table.global.config.swagger;

import com.john.table.global.apiPayload.code.ErrorCode;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiErrorCodeExamples {

    // ErrorCode
    ErrorCode[] value() default {};
}
