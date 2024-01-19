package com.CK.service;

import com.CK.entity.Kazananlar;
import com.CK.repository.KazananlarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KazanalarService {
    @Autowired
    private KazananlarRepository kazananlarRepository;
    public void save(Kazananlar kazananlar){
        kazananlarRepository.save(kazananlar);
    }

    public List<Kazananlar> findAll(){
        return kazananlarRepository.findAll();
    }
}
