package com.cmq.annotation03;

import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * @author: cmq
 * @date: 9/24/2024 - 09 - 24 - 2:19 PM
 * @version: 1.0
 */
@Target({TYPE,FIELD,CONSTRUCTOR,METHOD})
public @interface MyAnnotation4 {
}
