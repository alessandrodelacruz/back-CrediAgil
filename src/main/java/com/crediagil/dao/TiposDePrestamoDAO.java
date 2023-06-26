package com.crediagil.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crediagil.entity.TiposDePrestamo;

@Repository
public interface TiposDePrestamoDAO extends JpaRepository<TiposDePrestamo, Integer> {

}
