package com.Tns.adminservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.NoResultException;

@RestController
public class AdminServiceController {
   @Autowired
   private AdminServices a;
   
   @GetMapping("/AdminServices")
   public List<admin> list(){
	   return a.listAll();
   }
   @GetMapping("/AdminServices/(ad_id)")
   		public ResponseEntity<admin> get (@PathVariable Integer ad_id){
	   try {
		   admin ad=a.get(ad_id);
		   return new ResponseEntity<admin>(ad,HttpStatus.OK);
		   
	   }
	   catch(NoResultException e) {
		   return new ResponseEntity<admin>(HttpStatus.NOT_FOUND);
	   }
   }
   
   @PostMapping("/AdminServices")
   public void add(@RequestBody admin adm) {
	   a.save(adm);
   }
   @PutMapping("/AdminServices/(ad_id)")
   public ResponseEntity<?> update(@RequestBody admin adm,@PathVariable Integer ad_id){
//	   admin existadmin = a.get(ad_id);
	   a.save(adm);
	   return new ResponseEntity<>(HttpStatus.OK);
   }
   
   @DeleteMapping("/AdminServices/(ad_id)")
   
   public void delete(@PathVariable Integer ad_id) {
	   a.delete(ad_id);
   }
   }
