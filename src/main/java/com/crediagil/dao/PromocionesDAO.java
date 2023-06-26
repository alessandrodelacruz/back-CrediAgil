package com.crediagil.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crediagil.entity.Promociones;

@Repository
public interface PromocionesDAO extends JpaRepository<Promociones, Integer> {

}
