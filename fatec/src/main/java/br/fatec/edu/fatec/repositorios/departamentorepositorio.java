package br.fatec.edu.fatec.repositorios;

import br.fatec.edu.fatec.modelos.departamento;
import br.fatec.edu.fatec.modelos.funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface departamentorepositorio extends JpaRepository<departamento,Long> {
    List<departamento> findByName(String name);

    @Query(
            "SELECT DISTINCT d FROM Department d JOIN d.employees e WHERE e.name = :employeeName"
    )
    List<departamento> findByEmployeeName(String employeeName);

    @Query(
            "SELECT e FROM Department d JOIN d.employees e WHERE d.name = :departmentName AND e.salary > :salary"
    )
    List<funcionario> findEmployeesWithSalaryGreaterThanInDepartment(
            double salary,
            String departmentName
    );
}
