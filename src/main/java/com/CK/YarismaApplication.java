package com.CK;

import com.CK.controller.SoruController;
import com.CK.controller.YarismaciController;
import com.CK.entity.Soru;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YarismaApplication {

	public static void main(String[] args) {

		SpringApplication.run(YarismaApplication.class, args);
	}


	public static void yarismaciOlustur(){
		YarismaciController yarismaciController = new YarismaciController();

		yarismaciController.save("Ali","alli","ali.png","ali@ali.com");
		yarismaciController.save("Veli","veli","veli.png","veli@veli.com");
		yarismaciController.save("Can","can","can.png","can@can.com");
	}

	public static void soruOlustur(){
		SoruController soruController = new SoruController();
		Soru soru1 = soruController.save("Uzaya çıkan ilk türk",20,);
		soru1.setCevaplar;
	}
}

/**
 * Soru
 *
 * Repositoryler oluşturulacak
 * Controller ve Servic katmanlarında methodları şimdilik bir birisinin kopyası olacak şekilde yazılsın
 * -> Controller -> Save();
 * -> Service -> Save();
 *
 * 1. adet yarisma oluşturulacak
 * 10 adet soru
 * 3 adet yarısmaci
 * 1 adet ödül olacak kazanan bir kişi kazanalar tablosuna eklenecek
 * her bir yarismaciya puan verilecek. 1,2,3 şeklinde sıralanacak
 * ----------------
 * Sorgular:
 * - yarısmaların kazanaları kimlerdir? yarısma adı, tarihi, kazanan kullanıcı // yarisma tablosu çekilecek
 * - tüm zamanların en yüksek puanını alan yarısmacı kimdir? // puanlama tablosunda max ile bulunacak
 * - en çok yarısma kazanan kullanıcı kimdir? // kazanlar tablosunda count ile bulunacak
 */
