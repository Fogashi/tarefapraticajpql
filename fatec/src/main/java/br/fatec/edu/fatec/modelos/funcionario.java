package br.fatec.edu.fatec.modelos;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private double salary;

    @ManyToOne
    private departamento departamento;

    public funcionario() {}

    public funcionario(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public departamento getDepartment() {
        return departamento;
    }

    public void setDepartment(departamento department) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return (
                "Employee [id=" + id + ", name=" + name + " salary=" + salary + "]"
        );
    }
}
