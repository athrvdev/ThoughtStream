package BackendTS.code.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import BackendTS.code.model.BlogPost;
import BackendTS.code.repository.BlogPostRepository;

@Service
public class BlogPostService {
	
	@Autowired
	private BlogPostRepository blogPostRepository;
	
	public List<BlogPost> getAllPosts(){
		return blogPostRepository.findAll();
	}
	
	public Optional<BlogPost> getPostById(Long id){
		return blogPostRepository.findById(id);
	}
	public BlogPost savePost(BlogPost blogPost) {
		return blogPostRepository.save(blogPost);
	}
	public void deletePost(Long id) {
		blogPostRepository.deleteById(id);
	}
}
