package com.warpit.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.warpit.demo.domain.QRCode;

public interface QRCodeRepository extends JpaRepository<QRCode,Integer> {

	
	Optional<QRCode> findByQrCodeKey(String qrCodeKey);
}
