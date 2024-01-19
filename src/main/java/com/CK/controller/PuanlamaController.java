package com.CK.controller;

import com.CK.entity.Puanlama;
import com.CK.service.PuanlamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.ref.PhantomReference;
import java.util.List;

@RestController
@RequestMapping ("/puanlama")
public class PuanlamaController {
    @Autowired
    private PuanlamaService puanlamaService;
    @GetMapping("/save")
    public void save(Long yarismaciId, Long yarismaId, Long puan){
        puanlamaService.save(Puanlama.builder()
                        .yarismaciId(yarismaciId)
                        .yarismaId(yarismaId)
                        .puan(puan)
                        .build());

    }
    @GetMapping("/find-all")
    public List<Puanlama> findAll(){
        return puanlamaService.findAll();
    }
}
