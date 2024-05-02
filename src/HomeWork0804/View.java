package HomeWork0804;


import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class View {
    Scanner input = new Scanner(System.in);
    public String waitUserAnswer(){
        System.out.println("===== Редактирование данных каталога фильмов =====");
        System.out.println("Действия с фильмами:");
        System.out.println("1- добавление фильма" +
                "\n2- каталог фильмов" +
                "\n3- просмотр определенного фильма" +
                "\n4- удаление фильма" +
                "\nq- Выход из программы");
        System.out.println("Выберите вариант действия: ");
        String userAnswer = input.nextLine();
        System.out.println("================================================");
        return userAnswer;
    }
    public Map addUserFilms(){
        Map<String, String> dictFilm = new LinkedHashMap<>();
        dictFilm.put("название фильма ", "");
        dictFilm.put("жанр", "");
        dictFilm.put("режиссер", "");
        dictFilm.put("год выпуска", "");
        dictFilm.put("длительность", "");
        dictFilm.put("студия", "");
        dictFilm.put("актеры", "");
        System.out.println("========== Добавление фильма ==========");
        dictFilm.forEach((key, value)-> {
            System.out.print("Введите " + key + " фильма: ");
            dictFilm.put(key, input.nextLine());
        });
        System.out.println("=====================================");
        return dictFilm;
    }
    public void showAllFilms(Collection films){
        System.out.println("========== Каталог фильмов ==========");
        films.forEach((element) -> {
            System.out.println(element);
        });
        System.out.println("===========================================");
    }

    public String getUserFilm(){
        System.out.println("========== Ввод названия фильма ==========");
        System.out.println("-> ");
        String userFilm = input.nextLine();
        System.out.println("=================================");
        return userFilm;
    }
    public void showSingleFilm(Map film){
        System.out.println("========== Просмотр определенного фильма ==========");
        film.forEach((key, value)-> {
            System.out.println(key + ": " + value);
        });
        System.out.println("===================================");
    }
    public void showIncorrectTitleError(String userTitle){
        System.out.println("========== Сообщение об ошибке ==========");
        System.out.println("Фильма с названием " + userTitle + " не существует");
        System.out.println("===================================");
    }
    public void removeSingleFilm(Film film){
        System.out.println("========== Удаление фильма ==========");
        System.out.println("Фильм " + film + " был удален");
        System.out.println("===================================");
    }
    public void showIncorrectAnswerError(String answer){
        System.out.println("========== Сообщение об ошибке ==========");
        System.out.println("Варианта " + answer + " не существует");
        System.out.println("===================================");
    }
}
