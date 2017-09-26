package simpleserver;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class main {

public static String allUsers = null;
public static String allPosts = null;
public static String allComments = null;

  public static void initializeUsers(){
    Gson gson = new Gson();
    BufferedReader br;
    try {
      br = new BufferedReader(new FileReader("src/data.json"));
      JsonParser jsonParser = new JsonParser();
      JsonObject obj = jsonParser.parse(br).getAsJsonObject();

      User[] users = gson.fromJson(obj.get("users"), User[].class);
      allUsers = gson.toJson(users);
      for(int i = 0 ; i < users.length ; i++ ){ users[i] = new User(users[i].getUsername(), users[i].getUserid());}
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  public static void initializePosts(){
    Gson gson = new Gson();
    BufferedReader br;
    try {
      br = new BufferedReader(new FileReader("src/data.json"));
      JsonParser jsonParser = new JsonParser();
      JsonObject obj = jsonParser.parse(br).getAsJsonObject();

      Post[] posts = gson.fromJson(obj.get("posts"), Post[].class);
      allPosts = gson.toJson(posts);
      for(int i = 0 ; i < posts.length ; i++ ){ posts[i] = new Post(posts[i].getData(), posts[i].getUserId(), posts[i].getPostId());}
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  public static void initializeComments(){
    Gson gson = new Gson();
    BufferedReader br;
    try {
      br = new BufferedReader(new FileReader("src/data.json"));
      JsonParser jsonParser = new JsonParser();
      JsonObject obj = jsonParser.parse(br).getAsJsonObject();

      Comment[] comments = gson.fromJson(obj.get("comments"), Comment[].class);
      for(int i = 0 ; i < comments.length ; i++ ){ comments[i] = new Comment(comments[i].getData(), comments[i].getUserID(), comments[i].getPostID());}
      allComments = gson.toJson(comments);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

  }

  public static String getUsers(){ return allUsers;}
  public static String getPosts(){return allPosts;}
  public static String getComments(){return allComments;}



  public static void main(String[] args) {


initializeUsers();
initializePosts();
initializeComments();




    SimpleServer.Run();
  }
}
