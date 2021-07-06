package com.example.yapilacaklar.entity;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Yapilacaklar {
	
	@Id
	@GeneratedValue
	
	private Long id;
	private String ist;
	private String aciklama;
	private boolean tamam;
	
	public Yapilacaklar(){
		
	}
	
	public Yapilacaklar (Long id,String ist, String aciklama,boolean tamam) {
		this.id = id;
		this.ist = ist;
		this.aciklama = aciklama;
		this.tamam = tamam;
		
		
		
	}

	public Yapilacaklar(String ist, String aciklama,boolean tamam) {
		this.ist = ist;
		this.aciklama = aciklama;
		this.tamam = tamam;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIst() {
		return ist;
	}

	public void setIs(String ist) {
		this.ist = ist;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	public boolean isTamam() {
		return tamam;
	}

	public void setTamam(boolean tamam) {
		this.tamam = tamam;
	}
	
	@Override
    public String toString() {
        return "Yapılacaklar {" +
                "id=" + id +
                ", İş='" + ist + '\'' +
                ", Açıklama='" + aciklama + '\'' +
                ", Tamamlandı mı=" + tamam +
              
                '}';
    }

	
	
}
