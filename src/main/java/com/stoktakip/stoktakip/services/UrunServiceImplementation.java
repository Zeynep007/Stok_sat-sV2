package com.stoktakip.stoktakip.services;


import java.util.List;
import com.stoktakip.stoktakip.model.Siparis;
import com.stoktakip.stoktakip.model.Urun;
import com.stoktakip.stoktakip.repository.UrunRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
class UrunImplementation implements UrunService {

    @Autowired
    UrunRepository urunRepository;


    @Override
    public List<Urun> getAllUrun() { return (List<Urun>) urunRepository.findAll();}

    @Override
    public Urun getUrunById(int id) {
        return urunRepository.findById(id).get();
    }

    @Override
    public void addUrun(Urun urun) {
        urunRepository.save(urun);
    }

    @Override
    public void deleteUrun(int id) {
        urunRepository.deleteById(id);
    }


}