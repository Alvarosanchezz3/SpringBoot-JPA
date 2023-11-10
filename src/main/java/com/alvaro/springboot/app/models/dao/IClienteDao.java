package com.alvaro.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.alvaro.springboot.app.models.entity.Cliente;

// No es necesario anotarlo para inyectarlo ya que hereda de CrudRepository
public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
