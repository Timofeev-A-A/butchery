package ru.timofeev.butchery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.timofeev.butchery.entities.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request, Integer>{

}
