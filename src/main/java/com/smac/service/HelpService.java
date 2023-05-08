package com.smac.service;

import java.util.List;

import org.springframework.validation.BindingResult;

import com.smac.dto.HelpDTO2;
import com.smac.dto.HelpDto;
import com.smac.entity.Help;

import jakarta.validation.Valid;

public interface HelpService {

	List<HelpDTO2> getAll();

	Boolean update(long helpId, HelpDTO2 helpDTO) throws Exception;
	
	Boolean updateStatus(long helpId) throws Exception;

	Boolean delete(long helpId) throws Exception;

	Boolean create(@Valid HelpDTO2 helpDTO) throws Exception;

}
