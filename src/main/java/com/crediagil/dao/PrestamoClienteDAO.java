package com.crediagil.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crediagil.entity.PrestamoCliente;

@Repository
public interface PrestamoClienteDAO extends JpaRepository<PrestamoCliente, Integer> {

}
