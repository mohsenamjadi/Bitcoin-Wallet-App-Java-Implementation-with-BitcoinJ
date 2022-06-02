package com.allstarsoft.walletapp.repository;

import java.util.Optional;

import com.allstarsoft.walletapp.models.ERole;
import com.allstarsoft.walletapp.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
