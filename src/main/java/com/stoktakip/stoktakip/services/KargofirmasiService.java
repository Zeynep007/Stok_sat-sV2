package com.stoktakip.stoktakip.services;


import java.util.List;

import com.stoktakip.stoktakip.model.Kargofirmasi;
import com.stoktakip.stoktakip.model.Kargofirmasi;


public interface KargofirmasiService {

    public List<Kargofirmasi> getAllKargofirmasi();

    public Kargofirmasi getKargofirmasiById(int id);

    public void addKargofirmasi(Kargofirmasi Kargofirmasi);

    public void deleteKargofirmasi(int id);

}

