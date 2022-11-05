package com.optfs.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.optfs.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
	
	@Query("from Admin a where a.id=:id")
	public Admin getAdminById(@Param(value="id")Integer id );

}
