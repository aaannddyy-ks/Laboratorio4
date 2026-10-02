public class Main {
    public static void main(String[] args) {
        System.out.println("=== PARTE 1, 2 Y 3: VEHÍCULOS ===");
        ElectricVehicle myEV = new ElectricVehicle("Tesla", "Model 3", 50000, 75, 500);

        myEV.start();
        myEV.displayInfo();
        myEV.displayRange();
        myEV.stop();

        System.out.println("\n=== DESAFÍO: AUTOR Y LIBRO ===");
        
        Author autor = new Author("Gabriel García Márquez");

        
        autor.addBook("Cien años de soledad", 25.50);

    
        Book libro2 = new Book("El amor en los tiempos del cólera", autor, 20.00);
        autor.addBook(libro2);

    
        System.out.println("Libros escritos por " + autor.getName() + ":");
        for (Book b : autor.getBooks()) {
            b.getInfo();
        }
    }
}