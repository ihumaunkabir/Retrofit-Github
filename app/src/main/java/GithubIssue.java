package ihumaun.me.retrofitgithub;

/**
 * Created by CodesCave on 29-Nov-17.
 */
import com.google.gson.annotations.SerializedName;

public class GithubIssue {

    String id;
    String title;
    String comments_url;

    @SerializedName("body")
    String comment;

    @Override
    public String toString() {
        return id +  " - " + title;
    }
}