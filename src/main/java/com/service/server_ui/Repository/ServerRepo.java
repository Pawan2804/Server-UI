package com.service.server_ui.Repository;

import com.service.server_ui.Models.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServerRepo extends JpaRepository<Service, Long> {
}
