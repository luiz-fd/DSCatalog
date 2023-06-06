package com.luizfd.dscatalog.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luizfd.dscatalog.dto.CategoryDTO;
import com.luizfd.dscatalog.entities.Category;
import com.luizfd.dscatalog.repositories.CategoryRepository;
import com.luizfd.dscatalog.services.exceptions.ResourceNotFoundException;


@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Transactional(readOnly = true)
	public List<CategoryDTO> findAll() {
		List<Category> resultado = categoryRepository.findAll();
		return resultado.stream().map(x -> new CategoryDTO(x)).toList();		
	}

	@Transactional(readOnly = true)
	public CategoryDTO findById(Long id) {
		Optional<Category> resultado = categoryRepository.findById(id);
		Category entity = resultado.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new CategoryDTO( entity);		
	}

}
