package com.warpit.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.warpit.demo.domain.QRCode;

public interface QRCodeRepository extends JpaRepository<QRCode,Integer> {

}
