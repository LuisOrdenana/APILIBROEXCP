package com.tuuniversidad.biblioteca.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import com.tuuniversidad.biblioteca.models.Libro;

@Repository
public class LibroRepository {
    private List<Libro> libros = new ArrayList<>();

    public LibroRepository(){
        libros.add(new Libro(1L, "1984", "George Orwell", "Signet Classics", 1949));
        libros.add(new Libro(2L, "Cien años de soledad", "Gabriel García Márquez", "Editorial Sudamericana", 1967));
        libros.add(new Libro(3L, "Matar a un ruiseñor", "Harper Lee", "J.B. Lippincott & Co.", 1960));
        libros.add(new Libro(4L, "El gran Gatsby", "F. Scott Fitzgerald", "Charles Scribner's Sons", 1925));
        libros.add(new Libro(5L, "Don Quijote de la Mancha", "Miguel de Cervantes", "Francisco de Robles", 1605));
        libros.add(new Libro(6L, "Ulises", "James Joyce", "Sylvia Beach", 1922));
        libros.add(new Libro(7L, "En busca del tiempo perdido", "Marcel Proust", "Grasset y Gallimard", 1913));
        libros.add(new Libro(8L, "Guerra y paz", "León Tolstói", "The Russian Messenger", 1869));
        libros.add(new Libro(9L, "Lolita", "Vladimir Nabokov", "Olympia Press", 1955));
        libros.add(new Libro(10L, "Hamlet", "William Shakespeare", "Nathaniel Butter", 1603));
    }
    
    

    public List<Libro> findAll() {
        return libros;
    }

    public Optional<Libro> findById(Long id) {
        return libros.stream().filter(libro -> libro.getId().equals(id)).findFirst();
    }

    public void save(Libro libro) {
        libros.add(libro);
    }
}
