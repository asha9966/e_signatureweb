package com.esignature.project.repositories;

import com.esignature.project.Entities.InviteeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InviteeRepository extends JpaRepository<InviteeEntity, String> {
}
