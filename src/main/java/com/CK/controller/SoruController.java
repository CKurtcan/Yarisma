package com.CK.controller;

import com.CK.entity.Soru;
import com.CK.service.SoruService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/soru")
public class SoruController {
    @Autowired
    private SoruService soruService;
    @GetMapping("/save")
    public void save(String soru, Integer sure, Map<String, String> cevaplar, String dogruCevap, Integer puan) {
        soruService.save(Soru.builder()
                        .soru(soru)
                        .sure(sure)
                        .cevaplar(cevaplar)
                        .dogruCevap(dogruCevap)
                        .sure(sure)
                        .build());
    }
    @GetMapping("/find-all")
    public List<Soru> findAll() {
        return soruService.findAll();
    }
}
