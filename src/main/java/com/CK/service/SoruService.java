package com.CK.service;

import com.CK.entity.Soru;
import com.CK.repository.SoruRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoruService {
    @Autowired
    private SoruRepository soruRepository;

    public void save(Soru soru) {
        soruRepository.save(soru);
    }

    public List<Soru> findAll() {
        return soruRepository.findAll();
    }
}
