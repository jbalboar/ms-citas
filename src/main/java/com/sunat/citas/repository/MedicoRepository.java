package com.sunat.citas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunat.citas.entities.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long>  { 

}
