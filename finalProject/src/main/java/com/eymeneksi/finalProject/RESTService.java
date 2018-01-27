package com.eymeneksi.finalProject;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/haber")
/**
 * Bu sınıfta RESTServis aracılıgıyla
 * web'den bilgi alısverisi yapılır
 * @author Eymen Polat Eksi
 */
public class RESTService {
	
	private static final List<Haber>HABERLER=new ArrayList<Haber>();
	@RequestMapping("/ekle")
	/**
	 * haberEkle metodu haber eklememizi sağlar
	 * @param haberIcerik haberin içerigi
	 * @return haber1 sonucu oluşturulan ve 
	 * haber içeriğini tutan nesne döndürür
	 */
	public Haber haberEkle(String haberIcerik) {
		Haber haber1=new Haber(haberIcerik);
		HABERLER.add(haber1);
		return haber1;
	}
	@RequestMapping("/listele")
	/**
	 * haberLitele metodu listede tutulan
	 * haberlerin listelenmesini sağlar
	 * @return HABERLER listeye eklenen 
	 * tüm haberleri yazdırır
	 */
	public List<Haber> haberListele(){
		return HABERLER;
	}
	@RequestMapping("/sil")
	/**
	 * haberSil metodu listeden haber silmeyi sağlar
	 * @param id silme işlemi için id
	 */
	void haberSil(int id) {
		HABERLER.removeIf(argHaber->argHaber.getId()==id);
	}
	
}
