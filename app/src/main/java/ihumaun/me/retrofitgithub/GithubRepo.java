package ihumaun.me.retrofitgithub;

/**
 * Created by CodesCave on 29-Nov-17.
 */

public class GithubRepo {
    String name;
    String owner;
    String url;

    @Override
    public String toString() {
        return(name + " " +  url);
    }
}