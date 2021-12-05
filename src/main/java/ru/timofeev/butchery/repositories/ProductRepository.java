package ru.timofeev.butchery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.timofeev.butchery.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
