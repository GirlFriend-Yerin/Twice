package sysproj.seonjoon.twice;

import org.json.JSONArray;
import org.json.JSONObject;

public interface DataLoadCompleteCallback {

    void Complete(boolean isSuccess, JSONObject result);
}
