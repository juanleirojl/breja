package com.leiro.breja.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leiro.breja.model.Breja;
import com.leiro.breja.repository.BrejaRepository;

@Service
public class BrejaServiceImpl implements BrejaService {

	public static final Log LOG = LogFactory.getLog(BrejaServiceImpl.class);

	@Autowired
	private BrejaRepository brejaRepository;

	@Override
	public Breja findById(Long id) {
		return this.brejaRepository.findOne(id);
	}

	@Override
	public Breja save(Breja breja) {
		return this.brejaRepository.save(breja);
	}

	@Override
	public int remove(Long id) {
		this.brejaRepository.delete(id);
		return 0;
	}

	@Override
	public List<Breja> findAllBrejas() {
		return this.brejaRepository.findAll();
	}

	@Override
	public Breja update(Breja breja) {
		return this.brejaRepository.save(breja);
	}

}
