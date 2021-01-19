package com.stoktakip.stoktakip.services;


import java.util.List;

import com.stoktakip.stoktakip.model.Fatura;
import com.stoktakip.stoktakip.repository.FaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class FaturaServiceImplementation implements FaturaService {

    @Autowired
    FaturaRepository faturaRepository;


    @Override
    public List<Fatura> getAllFatura() {
        return (List<Fatura>) faturaRepository.findAll();
    }

    @Override
    public Fatura getFaturaById(int id) {
        return faturaRepository.findById(id).get();
    }

    @Override
    public void addFatura(Fatura fatura) {
        faturaRepository.save(fatura);
    }

    @Override
    public void deleteFatura(int id) {
        faturaRepository.deleteById(id);
    }


}