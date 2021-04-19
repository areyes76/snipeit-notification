package cl.argacme.snipeit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import cl.argacme.snipeit.model.LicenseSeats;

public interface LicenseSeatsRepository extends JpaRepository<LicenseSeats, Integer>{

	LicenseSeats findByLicenseIdAndAssignedTo(Integer licenseId,Integer assignedTo);
}
