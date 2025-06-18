package com.sunat.citas.service;

import java.util.List;

import com.sunat.citas.entities.Medico;

public interface IMedicoService {
	public List<Medico> listarTodos() ;

	public Medico guardarMedico(Medico medico);
}
