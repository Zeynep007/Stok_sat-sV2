package com.stoktakip.stoktakip.services;


import java.util.List;

import com.stoktakip.stoktakip.model.Kategori;

public interface KategoriService {

    public List<Kategori> getAllKategori();

    public Kategori getKategoriById(int id);

    public void addKategori(Kategori Kategori);

    public void deleteKategori(int id);


}
