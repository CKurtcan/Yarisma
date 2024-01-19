package com.CK.controller;

import com.CK.entity.Yarisma;
import com.CK.service.YarismaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/yarisma")
public class YarismaController {
    @Autowired
    private YarismaService yarismaService;
    @GetMapping("/save")
    public void save(String ad, Long baslangicTarihi, Long sure) {
        yarismaService.save(Yarisma.builder()
                        .ad(ad)
                        .baslangicTarihi(baslangicTarihi)
                        .sure(sure)
                        .build());
    }
    @GetMapping("/find-all")
    public List<Yarisma> findAll() {
        return yarismaService.findAll();
    }
}
