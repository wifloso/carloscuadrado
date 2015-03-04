/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prgitejemplo;

/**
 *
 * @author alumno: <escribe tu nombre aqui>
 */
public class GitEjemploMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Clase principal del programa
        System.out.println("Estoy en la clase Main");
        GitAux git = new GitAux();
        
        // Llamamops a los metodos del la clase auxiliar
        git.metodoAlumno1();
        git.metodoAlumno2();
        git.metodoComunitario();
                     
    }
    
}
