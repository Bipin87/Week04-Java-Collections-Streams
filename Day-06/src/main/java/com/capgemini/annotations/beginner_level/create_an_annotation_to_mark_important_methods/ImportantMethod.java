package com.capgemini.annotations.beginner_level.create_an_annotation_to_mark_important_methods;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
public @interface ImportantMethod {
    String level() default "HIGH";
}