package dev.miprimeraclasejava;
import dev.miprimeraclasejava.models.Person;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        
            Person personOne= new Person("Javier", "Perez", "95241235R", 1950, "Suiza", 'H');
            Person personTwo = new Person("Maria", "Silva", "23456789H", 1985, "Alemania", 'M');
    
    
    
    
    
            personOne.printToScreen();
            personTwo.printToScreen();
        
        }
    }

