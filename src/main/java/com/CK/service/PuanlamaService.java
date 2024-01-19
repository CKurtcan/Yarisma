package com.CK.service;

import com.CK.entity.Puanlama;
import com.CK.repository.PuanlamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PuanlamaService {
    @Autowired
    private PuanlamaRepository puanlamaRepository;

    public void save(Puanlama puanlama){
        puanlamaRepository.save(puanlama);
    }

    public List<Puanlama> findAll(){
        return puanlamaRepository.findAll();
    }
}
