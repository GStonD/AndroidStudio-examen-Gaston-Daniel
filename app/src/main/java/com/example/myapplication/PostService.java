package com.example.myapplication;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
public interface PostService {

    String API_ROUTE = "/api.php/10156112965520834/1";
    @GET(API_ROUTE)
    Call< List<Post> > getPost();

}
