package com.stoktakip.stoktakip.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.stoktakip.stoktakip.model.Satistemsilcisi;
import com.stoktakip.stoktakip.services.SatistemsilcisiService;

@Controller
@RequestMapping(value="/satistemsilcisi")
public class SatistemsilcisiController{

    @Autowired
    SatistemsilcisiService satistemsilcisiService;

    @RequestMapping(value="/satistemsilcisi_login", method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute("satistemsilcisi") Satistemsilcisi satistemsilcisi){
        ModelAndView model = new ModelAndView();
        List<Satistemsilcisi> satistemsilcileri = satistemsilcisiService.getAllSatistemsilcisi();
        for(Satistemsilcisi satistemsilcisi1 : satistemsilcileri){
            if(satistemsilcisi1.getKullaniciadi().equals(satistemsilcisi.getKullaniciadi()) && satistemsilcisi1.getSifre().equals(satistemsilcisi.getSifre())) {
                model.addObject("satistemsilcisi", satistemsilcisi1);
                model.setViewName("satistemsilcisi_anasayfa");
                return model;
            }
        }
        model.setViewName("redirect:/satistemsilcisi/satistemsilcisi_login");
        return model;
    }

    @RequestMapping(value = "/satistemsilcisi_login", method = RequestMethod.GET)
    public ModelAndView loginPage(){
        ModelAndView model = new ModelAndView("satistemsilcisi_login");
        return model;
    }


    @RequestMapping(value="/list", method=RequestMethod.GET)
    public ModelAndView list() {

        ModelAndView model = new ModelAndView("satistemsilcisi_list"); //
        List<Satistemsilcisi> satistemsilcisiList = satistemsilcisiService.getAllSatistemsilcisi();
        model.addObject("satistemsilcisiList", satistemsilcisiList);

        return model;
    }



    @RequestMapping(value="/addSatistemsilcisi/", method=RequestMethod.GET)
    public ModelAndView addSatistemsilcisi() {

        ModelAndView model = new ModelAndView();
        Satistemsilcisi satistemsilcisi = new Satistemsilcisi();
        model.addObject("satistemsilcisiForm", satistemsilcisi);
        model.setViewName("satistemsilcisi_form");

        return model;
    }



    @RequestMapping(value="/editSatistemsilcisi/{id}", method=RequestMethod.GET)
    public ModelAndView editSatistemsilcisi(@PathVariable int id) {
        ModelAndView model = new ModelAndView();

        Satistemsilcisi satistemsilcisi = satistemsilcisiService.getSatistemsilcisiById(id);
        model.addObject("satistemsilcisiForm", satistemsilcisi);
        model.setViewName("satistemsilcisi_form");

        return model;
    }


    @RequestMapping(value="/addSatistemsilcisi", method=RequestMethod.POST)
    public ModelAndView add(@ModelAttribute("satistemsilcisiForm") Satistemsilcisi satistemsilcisi) {

        satistemsilcisiService.addSatistemsilcisi(satistemsilcisi);
        return new ModelAndView("redirect:/satistemsilcisi/list");

    }

    @RequestMapping(value="/deleteSatistemsilcisi/{id}", method=RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") int id) {

        satistemsilcisiService.deleteSatistemsilcisi(id);
        return new ModelAndView("redirect:/satistemsilcisi/list");

    }



}