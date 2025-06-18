package com.sunat.citas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sunat.citas.entities.Medico;
import com.sunat.citas.repository.MedicoRepository;

@Service
public class MedicoServiceImpl implements IMedicoService {
	
	private final MedicoRepository medicoRepository;
	
	public MedicoServiceImpl(MedicoRepository medicoRepository) {
		this.medicoRepository = medicoRepository;
	}

	@Override
	public List<Medico> listarTodos() {
		return medicoRepository.findAll();
	}

	@Override
	public Medico guardarMedico(Medico medico) {
		return medicoRepository.save(medico);
	}

}
