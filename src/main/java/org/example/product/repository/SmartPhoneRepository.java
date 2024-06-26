package org.example.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.product.model.Smartphone;

public interface SmartPhoneRepository extends JpaRepository<Smartphone, Integer> {
}
