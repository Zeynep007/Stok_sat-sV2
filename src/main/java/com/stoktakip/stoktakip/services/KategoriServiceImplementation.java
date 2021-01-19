package com.stoktakip.stoktakip.services;


import java.util.List;
import com.stoktakip.stoktakip.model.Kategori;
import com.stoktakip.stoktakip.repository.KategoriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
class KategoriServiceImplementation implements KategoriService {

    @Autowired
   KategoriRepository kategoriRepository;


    @Override
    public List<Kategori> getAllKategori() { return (List<Kategori>) kategoriRepository.findAll();}

    @Override
    public Kategori getKategoriById(int id) {
        return kategoriRepository.findById(id).get();
    }

    @Override
    public void addKategori(Kategori kategori) {
        kategoriRepository.save(kategori);
    }

    @Override
    public void deleteKategori(int id) {
        kategoriRepository.deleteById(id);
    }


}