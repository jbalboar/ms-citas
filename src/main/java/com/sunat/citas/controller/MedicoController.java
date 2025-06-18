package com.sunat.citas.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunat.citas.entities.Medico;
import com.sunat.citas.service.IMedicoService;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

	private IMedicoService medicoService;

	public MedicoController(IMedicoService medicoService) {
		this.medicoService = medicoService;
	}

	@GetMapping
	public Map<String, Object> listarTodos() {
		return Map.of("medicos", medicoService.listarTodos());
	}

	@PostMapping
	public ResponseEntity<Medico> agregarDeseo(@RequestBody Medico medico) {
		return ResponseEntity.ok(medicoService.guardarMedico(medico));
	}

}
