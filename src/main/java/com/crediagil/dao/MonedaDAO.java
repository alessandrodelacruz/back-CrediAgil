package com.crediagil.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crediagil.entity.Moneda;
import com.crediagil.entity.TiposDeCambio;

@Repository
public interface MonedaDAO extends JpaRepository<Moneda, Integer> {

}
