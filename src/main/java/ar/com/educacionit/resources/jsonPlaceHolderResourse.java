package ar.com.educacionit.resources;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ar.com.educacionit.entity.Info;
import ar.com.educacionit.feign.FeignClient;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/feign")
@RequiredArgsConstructor
public class jsonPlaceHolderResourse {

	    private final FeignClient feignClient;
	    @GetMapping
	    public ResponseEntity readData (@RequestParam(required = false) List<Info> posts) {
	
	        return ResponseEntity.ok(feignClient.readPosts());
	    }
	
	
}