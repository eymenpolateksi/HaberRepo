package com.eymeneksi.finalProject;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/haber")
public class RESTService {
	
	private static final List<Haber>HABERLER=new ArrayList<Haber>();
	@RequestMapping("/ekle")
	public Haber haberEkle(String haberIcerik) {
		Haber haber1=new Haber(haberIcerik);
		HABERLER.add(haber1);
		return haber1;
	}
	@RequestMapping("/listele")
	public List<Haber> haberListele(){
		return HABERLER;
	}
	@RequestMapping("/sil")
	void haberSil(int id) {
		HABERLER.removeIf(argHaber->argHaber.getId()==id);
	}
	
}