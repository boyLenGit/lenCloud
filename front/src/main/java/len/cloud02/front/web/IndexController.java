package len.cloud02.front.web;

import len.cloud02.front.entity.Blog;
import len.cloud02.front.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author mabl02 (mabl02@rd.netease.com)
 * @date 2022/8/19 22:49
 */
@Controller
public class IndexController {
    @Autowired
    private IndexService indexService;

    @GetMapping("/")
    public String index(Model model){
        List<Blog> blogList = indexService.getBlogList(1, 10);
        System.out.println(blogList.size());
        return "index";
    }
}
