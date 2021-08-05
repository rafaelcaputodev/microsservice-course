package com.caputo.hrworker.repositories;

import com.caputo.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

@Repository
@Table(name = "tb_worker")
public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
