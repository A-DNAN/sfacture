package com.facture.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.facture.bean.Secteur;

public interface SecteurRepository extends JpaRepository<Secteur, String> {

}
