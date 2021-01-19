package com.stoktakip.stoktakip.services;


import java.util.List;

import com.stoktakip.stoktakip.model.Iller;

public interface IllerService {

    public List<Iller> getAllIller();

    public Iller getIllerById(int id);

    public void addIller(Iller Iller);

    public void deleteIller(int id);


}
