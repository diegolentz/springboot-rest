

package ar.com.educacionit.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import ar.com.educacionit.entity.Sites;

//import ar.com.educationit.entity.Categoria;


@RestController
public class mlController{

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/sites")
	public ResponseEntity<List<Sites>> getApi() {
		String url = "https://api.mercadolibre.com/sites";
		Sites [] sites = restTemplate.getForObject(url, Sites[].class);
	
		return ResponseEntity.ok(Arrays.asList(sites));
	}

}