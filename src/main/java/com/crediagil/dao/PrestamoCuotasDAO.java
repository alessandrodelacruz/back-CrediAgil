package com.crediagil.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crediagil.entity.PrestamoCuotas;

@Repository
public interface PrestamoCuotasDAO extends JpaRepository<PrestamoCuotas, Integer> {
	
}
