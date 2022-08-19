package len.cloud02.blog_service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog {

    private Long id;  //

    private String title;  // 标题

    private String content;  // 内容

    private String info; // 简介

    private Long views;  // 浏览次数

    private Long likes;  // 点赞数

    private Integer state;  // 发布\草稿

    private Date createTime;  // 创建时间

    private Date updateTime;  // 更新时间

    // 关联
    private Long typeId;

    private Long userId;
}
