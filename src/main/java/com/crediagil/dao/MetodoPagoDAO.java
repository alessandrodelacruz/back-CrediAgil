package com.crediagil.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crediagil.entity.MetodoPago;

@Repository
public interface MetodoPagoDAO extends JpaRepository<MetodoPago, Integer> {

}
