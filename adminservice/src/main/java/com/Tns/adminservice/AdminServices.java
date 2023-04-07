package com.Tns.adminservice;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class AdminServices {

	@Autowired
	
	private AdminServicesRepository repo;
	public List <admin> listAll(){
		return repo.findAll();
		
	}
	public admin get(Integer ad_id) {
		return repo.findById(ad_id).get();
	}
	public void delete(Integer ad_id) {
		repo.deleteById(ad_id);
		
	}
	public void save(admin adm) {
		repo.save(adm);
	}
	}
