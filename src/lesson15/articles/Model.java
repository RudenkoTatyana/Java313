package lesson15.articles;

import java.io.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Model {
private Map<String, Article> articles;
private String dbName;

    public Model() {
        this.dbName = "db.txt";
        this.articles = loatData();
    }
    public void addArticle(Map dictArticle){
        Article article = new Article(dictArticle);
        articles.put((String) dictArticle.get("название"), article);

    }
    public Collection getAllArticles(){
        return articles.values();
    }
    public Map getSingleArticle(String userTitle){
        Article article = this.articles.get(userTitle);
        Map<String, String> dictArticle = new LinkedHashMap<>();
        dictArticle.put("название", article.getTitle());
        dictArticle.put("автор", article.getAuthor());
        dictArticle.put("кол-во страниц", article.getPage());
        dictArticle.put("описание", article.getDestription());
        return dictArticle;
    }
    public Article removeArticle(String userTitle){
        return articles.remove(userTitle);
    }
    public void saveData(){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(this.dbName))){
            oos.writeObject(this.articles);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public LinkedHashMap loatData(){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(this.dbName))){
            return (LinkedHashMap) ois.readObject();
        }catch (Exception ex){
            return new LinkedHashMap<>();
        }
    }

}
class Article implements Serializable {
    private String title;
    private String author;
    private String page;
    private String destription;

    public Article(Map dictArticle) {
        this.title = (String) dictArticle.get("название");
        this.author = (String) dictArticle.get("автора");
        this.page = (String) dictArticle.get("кол-во страниц");
        this.destription = (String) dictArticle.get("описание");
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPage() {
        return page;
    }

    public String getDestription() {
        return destription;
    }

    @Override
    public String toString() {
        return this.title + " (" + this.author + ")";
    }
}
