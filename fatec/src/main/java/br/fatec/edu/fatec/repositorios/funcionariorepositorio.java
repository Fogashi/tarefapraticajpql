package br.fatec.edu.fatec.repositorios;

import br.fatec.edu.fatec.modelos.funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface funcionariorepositorio extends JpaRepository<funcionario,Long> {


}
