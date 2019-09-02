package com.study.hateos.exceptions;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "error")
@Data
public class ErrorResponse {

  public ErrorResponse(String message, List<String> details) {
    super();
    this.message = message;
    this.details = details;
  }

  //General error message about nature of error
  private String message;

  //Specific errors in API request processing
  private List<String> details;

}
