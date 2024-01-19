package com.CK.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_soru")
public class Soru {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(length = 800)
    String soru;
    Integer sure;
    /**
     * cevaplar.put("A","bu dogru cevap mıdır?");
     * cevaplar.put("B","bu dogru cevap mıdır?");
     * cevaplar.put("C","bu dogru cevap mıdır?");
     * cevaplar.put("D","bu dogru cevap mıdır?");
     */
    @CollectionTable(name = "tbl_cevap", joinColumns = @JoinColumn(name = "soru_id"))
    Map<String, String> cevaplar;
    // dogru cevap için cevaplar map inin keyi kullanılacak
    String dogruCevap;
    Integer puan;

}
