import java.util.ArrayList;

public class Main {

    public static ArrayList<Film> films = new ArrayList<>();

    public static void main(String[] args) {

        Film a = new Film("ZPZ", "Martin", "Sunny", true);
        Film b = new Film("Bicycle", "Martin", "Bunny", false);
        Film c = new Film("Bira - mira", "Penka", "Sunny", true);
        Film d = new Film("Jega - mega", "Penka", "Mara", true);
        Film e = new Film("Titanic - mitanic", "Dragan", "Petkan", true);
        Film f = new Film("Reana", "Gosho", "Diado Koleda", false);

        films.add(a);
        films.add(b);
        films.add(c);
        films.add(d);
        films.add(e);
        films.add(f);

        match("Sunny");
    }

    public static void match(String director) {
        for (Film film : films) {
            if (film.getDirector().equals(director)) {
                System.out.println(film.getTitle() + ", " + film.getLeadActor());
            }
        }
    }
}