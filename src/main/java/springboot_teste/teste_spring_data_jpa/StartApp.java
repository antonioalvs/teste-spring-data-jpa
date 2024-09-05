package springboot_teste.teste_spring_data_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Component;

import springboot_teste.teste_spring_data_jpa.model.Cadastro;
import springboot_teste.teste_spring_data_jpa.repository.CadastroRepository;

@Component
public class StartApp implements CommandLineRunner{
    @Autowired
    private CadastroRepository repository;

    @Override
    public void run(String... args) throws Exception {
        Cadastro cadastro = new Cadastro();

        cadastro.setName("Antonio");
        cadastro.setAge(22);
        cadastro.setUsername("aalvs");
        cadastro.setPassword("testeaula2024");

        
        repository.save(cadastro);

        for(Cadastro u: repository.findAll()){
            System.out.println(u);
        }
    }



}
