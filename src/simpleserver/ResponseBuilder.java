package simpleserver;

public class ResponseBuilder {

  public static String EarlParser (String earl){
    String Pearl = earl;

    String dl = "/";

    if (Pearl.startsWith("GET ")){
      Pearl = Pearl.substring(5);
    }

    String[] parce = Pearl.split(dl);

    if (Pearl.startsWith("User")){


    }






    return parce[0];
  }

}
