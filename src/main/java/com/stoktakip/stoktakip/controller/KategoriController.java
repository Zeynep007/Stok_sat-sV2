package com.stoktakip.stoktakip.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.stoktakip.stoktakip.model.Kategori;
import com.stoktakip.stoktakip.services.KategoriService;

@Controller
@RequestMapping(value="/kategori")
public class KategoriController{

    @Autowired
    KategoriService kategoriService;


    @RequestMapping(value="/list", method=RequestMethod.GET)
    public ModelAndView list() {

        ModelAndView model = new ModelAndView("kategori_list"); //.jsp yazılmayacak
        List<Kategori> kategoriList = kategoriService.getAllKategori();
        model.addObject("kategoriList", kategoriList);

        return model;
    }



    @RequestMapping(value="/addKategori/", method=RequestMethod.GET)
    public ModelAndView addKategori() {

        ModelAndView model = new ModelAndView();
        Kategori kategori = new Kategori();
        model.addObject("kategoriForm", kategori);
        model.setViewName("kategori_form");

        return model;
    }



    @RequestMapping(value="/editKategori/{id}", method=RequestMethod.GET)
    public ModelAndView editKategori(@PathVariable int id) {
        ModelAndView model = new ModelAndView();

        Kategori kategori = kategoriService.getKategoriById(id);
        model.addObject("kategoriForm", kategori);
        model.setViewName("kategori_form");

        return model;
    }


    @RequestMapping(value="/addKategori", method=RequestMethod.POST)
    public ModelAndView add(@ModelAttribute("kategoriForm") Kategori kategori) {

        kategoriService.addKategori(kategori);
        return new ModelAndView("redirect:/kategori/list");

    }

    @RequestMapping(value="/deleteKategori/{id}", method=RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") int id) {

        kategoriService.deleteKategori(id);
        return new ModelAndView("redirect:/kategori/list");

    }



}