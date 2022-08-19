package len.cloud02.blog_service.service;

import com.alibaba.fastjson.JSONObject;
import len.cloud02.blog_service.mapper.BlogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mabl02 (mabl02@rd.netease.com)
 * @date 2022/8/19 13:45
 */
@Service
public class BlogService {
    @Autowired
    private BlogMapper blogMapper;

    public JSONObject getBlogById(Long id){
        JSONObject res = new JSONObject();
        res.put("list", blogMapper.getBlogById(id));
        return res;
    }
}
