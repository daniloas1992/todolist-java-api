package br.com.daniloalves.todolist.user;

import lombok.Data;

@Data //Gera os getters e setters de todos atributos
public class UserModel {

    public String username;
    public String name;
    public String password; 

}
