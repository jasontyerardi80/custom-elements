package com.mulesoft.training;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import org.mule.api.annotations.param.*;

public class MuleComponent {
  int count;
  
  public MuleComponent() {
	  count = 1;
  }
	
  public Map<String,String> processMap(Map<String,String> input) {
    // processMap implementation
	input.put("processedBy", "processMap");
    return input;
  }

  public Map<String,String> processArray(List<String> input) {
    // processArray implementation
	  Map<String,String> output = new HashMap<String,String>();
	  output.put("processedBy", "processArray");
	  output.put("message", input.get(0));
	  return output;
  }

  public Map<String,String> processString(String input) {
	// processString implementation
	  Map<String,String> output = new HashMap<String,String>();
	  output.put("processedBy", "processString");
	  output.put("message", input);
	  return output;
  }

  public Map<String,String> processAll(
		  @Payload Object input,
		  @InboundHeaders("http.method") String method) {
	// processString implementation
	  Map<String,String> output = new HashMap<String,String>();
	  output.put("processedBy", "processAll");
	  output.put("message", input.toString());
	  output.put("http.method", method);
	  output.put("currentCount", "" + count);
	  count++;
	  return output;
  }
  
  public Map<String,String> processString2() {
    // processString2 implementation
    return null;
  }

} 
