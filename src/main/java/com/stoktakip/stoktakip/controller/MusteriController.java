package com.stoktakip.stoktakip.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.stoktakip.stoktakip.model.Musteri;
import com.stoktakip.stoktakip.services.MusteriService;

@Controller
@RequestMapping(value="/musteri")
public class MusteriController{

    @Autowired
    MusteriService musteriService;
    @RequestMapping(value="/musteri", method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute("musteri") Musteri musteri){
        ModelAndView model = new ModelAndView();
        List<Musteri> personeller = musteriService.getAllMusteri();
        for(Musteri musteri1 : personeller){
            if(musteri1.getKullaniciadi().equals(musteri.getKullaniciadi()) && musteri1.getSifre().equals(musteri.getSifre())) {
                model.addObject("musteri", musteri1);
                model.setViewName("musteri_anasayfa");
                return model;
            }
        }
        model.setViewName("redirect:/musteri/musteri_login");
        return model;
    }

    @RequestMapping(value = "/musteri_login", method = RequestMethod.GET)
    public ModelAndView loginPage(){
        ModelAndView model = new ModelAndView("musteri_login");
        return model;
    }



    @RequestMapping(value="/list", method=RequestMethod.GET)
    public ModelAndView list() {

        ModelAndView model = new ModelAndView("musteri_list");
        List<Musteri> musteriList = musteriService.getAllMusteri();
        model.addObject("musteriList", musteriList);

        return model;
    }



    @RequestMapping(value="/addMusteri/", method=RequestMethod.GET)
    public ModelAndView addMusteri() {

        ModelAndView model = new ModelAndView();
        Musteri musteri = new Musteri();
        model.addObject("musteriForm", musteri);
        model.setViewName("musteri_form");

        return model;
    }



    @RequestMapping(value="/editMusteri/{id}", method=RequestMethod.GET)
    public ModelAndView editMusteri(@PathVariable int id) {
        ModelAndView model = new ModelAndView();

            Musteri musteri = musteriService.getMusteriById(id);
        model.addObject("musteriForm", musteri);
        model.setViewName("musteri_form");

        return model;
    }


    @RequestMapping(value="/addMusteri", method=RequestMethod.POST)
    public ModelAndView add(@ModelAttribute("musteriForm") Musteri musteri) {

        musteriService.addMusteri(musteri);
        return new ModelAndView("redirect:/musteri/list");

    }

    @RequestMapping(value="/deleteMusteri/{id}", method=RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") int id) {

        musteriService.deleteMusteri(id);
        return new ModelAndView("redirect:/musteri/list");

    }



}