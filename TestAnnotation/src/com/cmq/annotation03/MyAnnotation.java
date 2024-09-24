package com.cmq.annotation03;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author: cmq
 * @date: 9/23/2024 - 09 - 23 - 6:23 PM
 * @version: 1.0
 */
@Retention(RetentionPolicy.SOURCE)
public @interface MyAnnotation {
    String[] value();
}
