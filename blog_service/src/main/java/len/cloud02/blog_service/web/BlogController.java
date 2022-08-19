package len.cloud02.blog_service.web;

import com.alibaba.fastjson.JSONObject;
import len.cloud02.blog_service.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author mabl02 (mabl02@rd.netease.com)
 * @date 2022/8/19 13:46
 */
@Controller
@ResponseBody
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping("/getOneById")
    public JSONObject getBlogById(@RequestParam(required = true)Long id){
        return blogService.getBlogById(id);
    }
}
