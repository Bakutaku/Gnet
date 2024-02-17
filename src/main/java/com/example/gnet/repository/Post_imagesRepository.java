package com.example.gnet.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gnet.domain.Post_images;


public interface Post_imagesRepository extends JpaRepository<Post_images, Integer>{

    // List<Post_images> findByPostid(Posts postid);
    // List<Post_images> findByImageid(Images imageid);
    
}
