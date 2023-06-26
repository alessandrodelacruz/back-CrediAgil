package com.crediagil.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crediagil.entity.PagoCuotas;

@Repository
public interface PagoCuotasDAO extends JpaRepository<PagoCuotas, Integer> {

}
