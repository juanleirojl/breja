package com.leiro.breja.service;

import java.util.List;

import com.leiro.breja.model.Breja;

public interface BrejaService {

	public abstract Breja findById(Long id);

	public abstract Breja save(Breja breja);

	public abstract int remove(Long id);

	public abstract List<Breja> findAllBrejas();

	public abstract Breja update(Breja breja);

}
