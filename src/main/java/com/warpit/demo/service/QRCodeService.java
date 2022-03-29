package com.warpit.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warpit.demo.domain.QRCode;
import com.warpit.demo.repo.QRCodeRepository;

@Service
public class QRCodeService {

	@Autowired
	private QRCodeRepository qrCodeRepository;
	
	/**
	 * create QRCode	
	 * @param qrCodeKey
	 * @return
	 */
	public QRCode createQRCode(String qrCodeKey) {
		return qrCodeRepository.findByQrCodeKey(qrCodeKey).orElse(qrCodeRepository.save(new QRCode(qrCodeKey)));
	}
	
	
	/**
	 * Lookup all QRCodes packages
	 * @return
	 */
	public Iterable<QRCode> allQRCodes(){
		return qrCodeRepository.findAll();
	}
	
	
	
	
	
}
