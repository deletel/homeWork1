package main;

public class Main {
    public static void main(String[] args) {

        Book javany = new Book("javany");
        javany.setQuantityOfPages(601);
        javany.setGenre(Genre.Fantasy);

        Author luchshiy = new Author("Ivan", "4.07.1997", "Russia", javany);

        javany.setAuthor(luchshiy);

        System.out.println(javany);
        javany.timeOfReeding();


        System.out.println(luchshiy);
        int luchshiysAge = luchshiy.HowOldAuthor();
        System.out.println(luchshiysAge + " years old");

        User johnnyDepp = new User("random", "Johnny" , "Depp");
        User arnoldSchwarzenegger = new User("random", "Arnold" , "Schwarzenegger");
        User jimCarrey = new User("random", "Jim" , "Carrey");
        User emmaWatson = new User();
        emmaWatson.setName("random");
        emmaWatson.setSurname("Emma");
        emmaWatson.setSurname("Watson");

        System.out.println(User.totalOnline);
    }
}

