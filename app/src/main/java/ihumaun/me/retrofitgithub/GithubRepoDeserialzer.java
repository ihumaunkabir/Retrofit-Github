package ihumaun.me.retrofitgithub;

/**
 * Created by CodesCave on 29-Nov-17.
 */

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

public class GithubRepoDeserialzer implements JsonDeserializer<GithubRepo> {

    @Override
    public GithubRepo deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        GithubRepo githubRepo = new GithubRepo();

        JsonObject repoJsonObject =  json.getAsJsonObject();
        githubRepo.name = repoJsonObject.get("name").getAsString();
        githubRepo.url = repoJsonObject.get("url").getAsString();

        JsonElement ownerJsonElement = repoJsonObject.get("owner");
        JsonObject ownerJsonObject = ownerJsonElement.getAsJsonObject();
        githubRepo.owner = ownerJsonObject.get("login").getAsString();

        return githubRepo;
    }
}