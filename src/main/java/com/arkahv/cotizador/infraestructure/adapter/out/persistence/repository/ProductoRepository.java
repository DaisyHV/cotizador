package com.arkahv.cotizador.infraestructure.adapter.out.persistence.repository;

import com.arkahv.cotizador.infraestructure.adapter.out.persistence.entity.ProductoEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductoRepository extends ReactiveCrudRepository<ProductoEntity, Integer> {
}
