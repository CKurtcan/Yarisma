package com.CK.controller;

import com.CK.entity.Kazananlar;
import com.CK.service.KazanalarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/kazananlar")
public class KazananlarController {
    @Autowired
    private KazanalarService kazanalarService;
    @GetMapping("/save")
    public void save(Long yarismaciId,Long yarismaId,Integer siralama,String odul){
        kazanalarService.save(Kazananlar.builder()
                        .yarismaciId(yarismaciId)
                        .yarismaId(yarismaId)
                        .siralama(siralama)
                        .odul(odul)
                        .build());
    }
    @GetMapping("/find-all")
    public List<Kazananlar> findAll(){
        return kazanalarService.findAll();
    }
}
