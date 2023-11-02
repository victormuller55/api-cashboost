package com.api.soamer.repository;

import com.api.soamer.model.RegistrarVendaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrarVendaRepository  extends JpaRepository<RegistrarVendaModel, Integer> {
    boolean existsByNFECode(String nfeCode);
}