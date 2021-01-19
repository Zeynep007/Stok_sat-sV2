package com.stoktakip.stoktakip.services;


import java.util.List;
import com.stoktakip.stoktakip.model.Kargofirmasi;
import com.stoktakip.stoktakip.model.Kargofirmasi;
import com.stoktakip.stoktakip.repository.KargofirmasiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
class KargofirmasiServiceImplementation implements KargofirmasiService {

    @Autowired
    KargofirmasiRepository kargofirmasiRepository;


    @Override
    public List<Kargofirmasi> getAllKargofirmasi() { return (List<Kargofirmasi>) kargofirmasiRepository.findAll();}

    @Override
    public Kargofirmasi getKargofirmasiById(int id) {
        return kargofirmasiRepository.findById(id).get();
    }

    @Override
    public void addKargofirmasi(Kargofirmasi kargofirmasi) {
        kargofirmasiRepository.save(kargofirmasi);
    }

    @Override
    public void deleteKargofirmasi(int id) {
        kargofirmasiRepository.deleteById(id);
    }


}