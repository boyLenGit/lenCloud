package len.cloud02.front.service;

import com.alibaba.fastjson.JSONObject;
import len.cloud02.front.entity.Blog;
import len.cloud02.front.utils.HttpClientUtils;
import len.cloud02.front.utils.LenText;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author mabl02 (mabl02@rd.netease.com)
 * @date 2022/8/21 22:50
 */
@Service
public class BlogService {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${boyLen_blogService_url}")
    private String blogServiceUrl;

    public JSONObject getBlogList(Integer pageNum, Integer pageSize){
        // 生成URL
        String url = blogServiceUrl + "/blog/getListByPage";
        Map<String, String> map = new HashMap<>();
        map.put("pageNum", String.valueOf(pageNum));
        map.put("pageSize", String.valueOf(pageSize));
        url = HttpClientUtils.urlAddParams(url, map);
        // 处理结果
        return restTemplate.getForObject(url, JSONObject.class);
    }

    public void initBlogList(List<Blog> list){
        for (Blog blog: list){
            if (blog.getInfo() == null){
                blog.setInfo(LenText.makeBlogInfo(blog.getContent()));
            }
        }
    }
}
