package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {

    //serializable serve para permitir a transformação do prog em um sequência de bites

    //atributos

    private Integer id;
    private String name;

    public Department(){} //construtor vazio
    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    //getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //hashcode e equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    //toString

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
