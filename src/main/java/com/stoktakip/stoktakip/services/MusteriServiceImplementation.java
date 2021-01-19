package com.stoktakip.stoktakip.services;


import java.util.List;
import com.stoktakip.stoktakip.model.Musteri;
import com.stoktakip.stoktakip.repository.MusteriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
class MusteriServiceImplementation implements MusteriService {

    @Autowired
    MusteriRepository musteriRepository;


    @Override
    public List<Musteri> getAllMusteri() { return (List<Musteri>) musteriRepository.findAll();}

    @Override
    public Musteri getMusteriById(int id) {
        return musteriRepository.findById(id).get();
    }

    @Override
    public void addMusteri(Musteri kategori) {
        musteriRepository.save(kategori);
    }

    @Override
    public void deleteMusteri(int id) {
        musteriRepository.deleteById(id);
    }


}