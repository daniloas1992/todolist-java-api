package br.com.daniloalves.todolist.user;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Data //Gera os getters e setters de todos atributos
@Entity(name="tb_users") //Mapear em uma tabela no banco
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    public String username;
    public String name;
    public String password;

    @CreationTimestamp
    private LocalDateTime createdAt;

}
