package com.devsuperior.dsclient.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsclient.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		
		list.add(new Client(1L, "Ana", "xxx.xxx.xxx-xx", 3500.75, "1996-07-29T14:20:05Z", 1));
		list.add(new Client(2L, "Diego", "yyy.yyy.yyy-yy", 3500.75, "1994-02-09T00:00:00Z", 2));
		list.add(new Client(3L, "Chewie", "www.www.www-ww", 3500.75, "2015-06-10T00:00:00Z", 3));
		
		return ResponseEntity.ok().body(list);
	}

}
