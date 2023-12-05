package com.example.sysDevLtd.repository;
import com.example.sysDevLtd.entity.model.Assign_Master;
import com.example.sysDevLtd.entity.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface Assign_MasterRepository extends JpaRepository<Assign_Master,Integer> {

    @Query("SELECT am.department FROM Assign_Master am WHERE am.a_M_Id = :a_M_Id")
    Department findDepartmentByAMId(int a_M_Id);
}
