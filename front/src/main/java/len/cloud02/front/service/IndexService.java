package len.cloud02.front.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import len.cloud02.front.entity.Blog;
import len.cloud02.front.utils.HttpClientUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author mabl02 (mabl02@rd.netease.com)
 * @date 2022/8/19 22:50
 */
@Service
public class IndexService {
    public List<Blog> getBlogList(Integer pageNum, Integer pageSize){
        String url = "http://blog_service/blog/getListByPage";
        Map<String, String> map = new HashMap<>();
        map.put("pageNum", String.valueOf(pageNum));
        map.put("pageSize", String.valueOf(pageSize));
        JSONObject jsonObject = HttpClientUtils.get(url, map, null);
        JSONArray jsonArray = jsonObject.getJSONArray("list");
        return jsonArray.toJavaList(Blog.class);
    }
}
