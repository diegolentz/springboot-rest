package ar.com.educacionit.feign;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ar.com.educacionit.entity.Info;

@org.springframework.cloud.openfeign.FeignClient(value= "Posts-api", url="https://jsonplaceholder.typicode.com")
public interface FeignClient {
  
    @RequestMapping(method = RequestMethod.GET, value = "/posts")
    List<Info> readPosts();
	
}