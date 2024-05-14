package br.fatec.edu.fatec.modelos;

import jakarta.persistence.*;

import java.util.ArrayList;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;


@Entity
public class departamento {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        private String name;

        @OneToMany(
                mappedBy = "department",
                cascade = CascadeType.ALL,
                fetch = FetchType.EAGER
        )
        private List<funcionario> employees = new ArrayList<>();

        public departamento() {
        }

        public departamento(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<funcionario> getEmployees() {
            return employees;
        }

        public void setEmployees(funcionario employees) {
            employees.setDepartment(this);
            this.employees.add(employees);
        }

        @Override
        public String toString() {
            return (
                    "Department [id=" +
                            id +
                            ", name=" +
                            name +
                            ", employees=" +
                            employees +
                            "" +
                            "]"
            );
        }

    }


