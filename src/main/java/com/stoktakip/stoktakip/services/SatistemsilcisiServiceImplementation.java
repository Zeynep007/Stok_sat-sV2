package com.stoktakip.stoktakip.services;


import java.util.List;
import com.stoktakip.stoktakip.model.Satistemsilcisi;
import com.stoktakip.stoktakip.repository.SatistemsilcisiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
class SatistemsilcisiImplementation implements SatistemsilcisiService {

    @Autowired
    SatistemsilcisiRepository satistemsilcisiRepository;


    @Override
    public List<Satistemsilcisi> getAllSatistemsilcisi() { return (List<Satistemsilcisi>) satistemsilcisiRepository.findAll();}

    @Override
    public Satistemsilcisi getSatistemsilcisiById(int id) {
        return satistemsilcisiRepository.findById(id).get();
    }

    @Override
    public void addSatistemsilcisi(Satistemsilcisi satistemsilcisi) {
        satistemsilcisiRepository.save(satistemsilcisi);
    }

    @Override
    public void deleteSatistemsilcisi(int id) {
        satistemsilcisiRepository.deleteById(id);
    }


}