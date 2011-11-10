package com.linkedin.clustermanager.monitoring.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface HelixSensorAttribute
{
  public String description();

}
