package com.stoktakip.stoktakip.services;


import java.util.List;

import com.stoktakip.stoktakip.model.Urun;
import com.stoktakip.stoktakip.model.Urun;

public interface UrunService {

    public List<Urun> getAllUrun();

    public Urun getUrunById(int id);

    public void addUrun(Urun Urun);

    public void deleteUrun(int id);


}
