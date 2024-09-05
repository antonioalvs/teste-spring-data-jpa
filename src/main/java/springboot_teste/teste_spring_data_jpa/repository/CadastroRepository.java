package springboot_teste.teste_spring_data_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot_teste.teste_spring_data_jpa.model.Cadastro;

public interface CadastroRepository extends JpaRepository<Cadastro, Integer>{

}
