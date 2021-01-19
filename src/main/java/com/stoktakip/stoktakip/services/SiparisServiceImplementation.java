package com.stoktakip.stoktakip.services;


import java.util.List;
import com.stoktakip.stoktakip.model.Siparis;
import com.stoktakip.stoktakip.repository.SiparisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
class SiparisImplementation implements SiparisService {

    @Autowired
    SiparisRepository siparisRepository;


    @Override
    public List<Siparis> getAllSiparis() { return (List<Siparis>) siparisRepository.findAll();}

    @Override
    public Siparis getSiparisById(int id) {
        return siparisRepository.findById(id).get();
    }

    @Override
    public void addSiparis(Siparis siparis) {
        siparisRepository.save(siparis);
    }

    @Override
    public void deleteSiparis(int id) {
        siparisRepository.deleteById(id);
    }


}