package com.stoktakip.stoktakip.services;


import java.util.List;
import com.stoktakip.stoktakip.model.Iller;
import com.stoktakip.stoktakip.repository.IllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
class IllerServiceImplementation implements IllerService {

    @Autowired
    IllerRepository illerRepository;


    @Override
    public List<Iller> getAllIller() { return (List<Iller>) illerRepository.findAll();}

    @Override
    public Iller getIllerById(int id) {
        return illerRepository.findById(id).get();
    }

    @Override
    public void addIller(Iller iller) {
        illerRepository.save(iller);
    }

    @Override
    public void deleteIller(int id) {
        illerRepository.deleteById(id);
    }


}