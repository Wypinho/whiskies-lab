package com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistilleryRepository extends JpaRepository<Distillery, Long>, DistilleryRepositoryCustom {

    List<Distillery> findByRegion(String region);

//    List<Distillery> findDistilleryByAge(int age);

    List<Distillery> findDistilleriesThatHaveWhiskiesOfAge(int age);
}
