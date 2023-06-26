package com.crediagil.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crediagil.entity.SolicitudPrestamo;

@Repository
public interface SolicitudPrestamoDAO extends JpaRepository<SolicitudPrestamo, Integer> {

}
