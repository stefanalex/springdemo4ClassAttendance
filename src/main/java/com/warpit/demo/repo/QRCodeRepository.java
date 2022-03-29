package com.warpit.demo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.warpit.demo.domain.QRCode;

public interface QRCodeRepository extends JpaRepository<QRCode,Integer> {

	
	Optional<QRCode> findByQrCodeKey(String qrCodeKey);
	Optional<QRCode> findByStudentAttendeeFirstName(String firsName);
	List<QRCode> findByClassroomName(String classroomName);
}
