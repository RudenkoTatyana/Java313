package HomeWork0804;


import java.util.Collection;
import java.util.Map;

public class Controller {
    private Model filmModel;
    private View userInterface;

    public Controller() {
        this.filmModel = new Model();
        this.userInterface = new View();
    }

    public void run(){
        String answer = "";
        while (!answer.equals("q")){
            answer = this.userInterface.waitUserAnswer();
            checkUserAnswer(answer);
        }
    }
    public void checkUserAnswer(String answer){
        if (answer.equals("1")){
            Map films = this.userInterface.addUserFilms();
            this.filmModel.addFilm(films);
        } else if (answer.equals("2")){
            Collection films = this.filmModel.getAllFilms();
            this.userInterface.showAllFilms(films);
        }else if (answer.equals("3")) {
            String filmTitle = this.userInterface.getUserFilm();
            try {
                Map film = this.filmModel.getSingleArticle(filmTitle);
                this.userInterface.showSingleFilm(film);
            } catch (NullPointerException npe) {
                this.userInterface.showIncorrectTitleError(filmTitle);
            }
        }else if (answer.equals("4")){
            String filmTitle = this.userInterface.getUserFilm();
            try {
                Film title = this.filmModel.removeFilm(filmTitle);
                this.userInterface.removeSingleFilm(title);
            } catch (NullPointerException npe) {
                this.userInterface.showIncorrectTitleError(filmTitle);
            }

        } else if (answer.equals("q")){
            this.filmModel.saveData();
        }else{
            this.userInterface.showIncorrectAnswerError(answer);
        }
    }
}
