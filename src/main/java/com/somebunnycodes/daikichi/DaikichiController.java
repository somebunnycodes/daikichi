package com.somebunnycodes.daikichi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	
	@RequestMapping("/")
	public String welcome() {
		return "Welcome!";
	}
	
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavours!";
	}
	
	@RequestMapping("/tomorrow")
	public String herald() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@RequestMapping("/travel/{city}")
	public String travel (@PathVariable String city) {
		return "Congratulations! You will soon travel to " + city;
	}
	
	@RequestMapping("/lotto/{lottoNumber}")
	public String lotto (@PathVariable int lottoNumber) {
		if (lottoNumber %2==0) { 
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		} else { 
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
	}
}
