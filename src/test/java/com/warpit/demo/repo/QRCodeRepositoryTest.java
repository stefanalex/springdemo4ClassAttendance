package com.warpit.demo.repo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.warpit.demo.domain.QRCode;

@DataJpaTest
class QRCodeRepositoryTest {
	
	@Autowired
	private QRCodeRepository qrCodeRepository;

	@Test
	public void injectedComponentsAreNotNull(){
		  assertThat(qrCodeRepository).isNotNull();
	}
	
	@Test
	public void createQRCode() {
		QRCode qrCode = new QRCode("QAZWSX");
		qrCodeRepository.save(qrCode);
		assertThat(qrCodeRepository.findById(qrCode.getId())).hasValue(qrCode);
	}

	
	@Test
	public void findByQrCodeKey() {
		QRCode qrCode = new QRCode("QAZWSX");
		qrCodeRepository.save(qrCode);
		assertThat(qrCodeRepository.findByQrCodeKey("QAZWSX")).hasValue(qrCode);
	}
	
}
