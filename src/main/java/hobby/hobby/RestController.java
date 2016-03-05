package hobby.hobby;

import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/api")
public class RestController {
	
	@RequestMapping("/product")
	public String test(){
		return "test";
	}
	
	@RequestMapping("/test")
	public String test2(){
		return "test2";
	}

}
