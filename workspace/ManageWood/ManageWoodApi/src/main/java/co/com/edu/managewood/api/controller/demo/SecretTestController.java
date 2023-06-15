package co.com.edu.managewood.api.controller.demo;

import java.util.Map;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecretTestController {
	
	@Value("${my-password}")
	private String myPassword;
	
	@GetMapping("/secret")
	public Map<String, String> secret(){
		
		Map<String, String>map = new HashMap<String, String>();
		map.put("myPassword", myPassword);
		return map;
	
	}
	


}
