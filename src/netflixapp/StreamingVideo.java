package netflixapp;

import java.util.List;

public class StreamingVideo {
    
protected String title;
protected String rating;
protected String description;
private List<String> casting;

public void setTitle(String videoTitle){
    this.title = videoTitle;
}

public String getTitle(){
    return title;
}

public void setRating(String viewerRating){
    rating = viewerRating;
}

public String getRating(){
    return rating;
}

public void setDescription(String description){
    this.description = description;
}

public String getDescription(){
    return description;
}

public void setCasting(List<String> cast){
    casting = cast;
}

public List getCasting(){
    return casting;
}
    
}
