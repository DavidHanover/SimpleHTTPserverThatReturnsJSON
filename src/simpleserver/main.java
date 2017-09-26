package simpleserver;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class main {

  public static void getUsers(){
    Gson gson = new Gson();
    BufferedReader br;
    try {
      br = new BufferedReader(new FileReader("src/data.json"));
      JsonParser jsonParser = new JsonParser();
      JsonObject obj = jsonParser.parse(br).getAsJsonObject();

      User[] users = gson.fromJson(obj.get("users"), User[].class);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  public static void getPosts(){
    Gson gson = new Gson();
    BufferedReader br;
    try {
      br = new BufferedReader(new FileReader("src/data.json"));
      JsonParser jsonParser = new JsonParser();
      JsonObject obj = jsonParser.parse(br).getAsJsonObject();

      Post[] posts = gson.fromJson(obj.get("posts"), Post[].class);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  public static void getComments(){
    Gson gson = new Gson();
    BufferedReader br;
    try {
      br = new BufferedReader(new FileReader("src/data.json"));
      JsonParser jsonParser = new JsonParser();
      JsonObject obj = jsonParser.parse(br).getAsJsonObject();

      Comment[] comments = gson.fromJson(obj.get("comments"), Comment[].class);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }



  public static void main(String[] args) {


getUsers();
getPosts();
getComments();




    SimpleServer server = SimpleServer.Run();
  }
}
