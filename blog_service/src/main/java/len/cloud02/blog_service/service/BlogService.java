package len.cloud02.blog_service.service;

import com.alibaba.fastjson.JSONObject;
import len.cloud02.blog_service.entity.Blog;
import len.cloud02.blog_service.mapper.BlogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public JSONObject getBlogListByPage(Integer pageNum, Integer pageSize){
        Integer startIndex = pageNum * pageSize;
        //
        List<Blog> blogList = blogMapper.getBlogListByPage(startIndex, pageSize);
        Integer total = blogMapper.countBlogListForPage();

        //
        JSONObject result = new JSONObject();
        result.put("list", blogList);
        result.put("pageNum", pageNum);
        result.put("pageSize", pageSize);
        result.put("pages", total / pageSize);
        result.put("size", blogList.size());
        result.put("total", total);
        return result;
    }
}
