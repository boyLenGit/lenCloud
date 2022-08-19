package len.cloud02.blog_service.mapper;

import len.cloud02.blog_service.entity.Blog;
import org.springframework.stereotype.Repository;

/**
 * @author mabl02 (mabl02@rd.netease.com)
 * @date 2022/8/19 00:01
 */
@Repository
public interface BlogMapper {
    Blog getBlogById(Long id);
}
