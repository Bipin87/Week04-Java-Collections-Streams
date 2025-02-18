package com.capgemini.annotations.intermediate_level.create_a_maxlength_annotation_for_field_validation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MaxLength {
    int value();
}