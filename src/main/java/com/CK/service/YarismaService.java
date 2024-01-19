package com.CK.service;

import com.CK.entity.Yarisma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YarismaService {
    @Autowired
    private YarismaService yarismaService;

    public void save(Yarisma yarisma) {
        yarismaService.save(yarisma);
    }

    public List<Yarisma> findAll() {
        return yarismaService.findAll();
    }
}
