package HomeWork0804;



import java.io.*;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Model {
    private Map<String, Film> films;
    private String filmBase;
    public Model() {
        this.filmBase = "filmBase.txt";
        this.films = loatData();
    }
    public void addFilm(Map dictFilm){
        Film film = new Film(dictFilm);
        films.put((String) dictFilm.get("название"), film);

    }
    public Collection getAllFilms(){
        return films.values();
    }
    public Map getSingleArticle(String userTitle){
        Film film = this.films.get(userTitle);
        Map<String, String> dictFilm = new LinkedHashMap<>();
        dictFilm.put("название фильма ", film.getTitle());
        dictFilm.put("жанр", film.getGenre());
        dictFilm.put("режиссер", film.getDirector());
        dictFilm.put("год выпуска", film.getYearOfRelease());
        dictFilm.put("длительность", film.getDuration());
        dictFilm.put("студия", film.getStudio());
        dictFilm.put("актеры", film.getActors());
        return dictFilm;
    }
    public Film removeFilm(String userTitle){
        return films.remove(userTitle);
    }
    public void saveData(){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(this.filmBase))){
            oos.writeObject(this.films);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public LinkedHashMap loatData(){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(this.filmBase))){
            return (LinkedHashMap) ois.readObject();
        }catch (Exception ex){
            return new LinkedHashMap<>();
        }
    }

}
class Film implements Serializable {
    private String title;
    private String genre;
   private String director;
   private String yearOfRelease;
   private String duration;
   private String studio;
   private String actors;

    public Film(Map dictFilm) {
        this.title = (String) dictFilm.get("название фильма");
        this.genre = (String) dictFilm.get("жанр");
        this.director = (String) dictFilm.get("режиссер");
        this.yearOfRelease = (String) dictFilm.get("год выпуска");
        this.duration = (String) dictFilm.get("длительность");
        this.studio = (String) dictFilm.get("студия");
        this.actors = (String) dictFilm.get("актеры");
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    public String getYearOfRelease() {
        return yearOfRelease;
    }

    public String getDuration() {
        return duration;
    }

    public String getStudio() {
        return studio;
    }

    public String getActors() {
        return actors;
    }

    @Override
    public String toString() {
        return this.title;
    }
}

