package len.cloud02.front.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mabl02 (mabl02@rd.netease.com)
 * @date 2022/8/19 22:49
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String index(Model model){
        return "index";
    }
}
