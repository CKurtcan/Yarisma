package com.CK.service;

import com.CK.entity.Yarismaci;
import com.CK.repository.YarismaciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YarismaciService {
    @Autowired
    private YarismaciRepository yarismaciRepository;

    public void save(Yarismaci yarismaci) {
        yarismaciRepository.save(yarismaci);
    }

    public List<Yarismaci> findAll() {
        return yarismaciRepository.findAll();
    }
}
