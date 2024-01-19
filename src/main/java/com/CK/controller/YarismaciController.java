package com.CK.controller;

import com.CK.entity.Yarismaci;
import com.CK.service.YarismaciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/yarismaci") // url: http://localhost:9090/yarismaci/
public class YarismaciController {
    @Autowired
    private YarismaciService yarismaciService;
    @GetMapping("/save")
    public void save(String ad, String username, String avatar, String email) {
        yarismaciService.save(Yarismaci.builder()
                        .ad(ad)
                        .username(username)
                        .avatar(avatar)
                        .email(email)
                        .build());
    }
    @GetMapping("/find-all")
    public List<Yarismaci> findAll() {
        return yarismaciService.findAll();
    } // <1>
}
