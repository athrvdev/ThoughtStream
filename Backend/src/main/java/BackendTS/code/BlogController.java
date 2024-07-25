package BackendTS.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import BackendTS.code.model.BlogPost;
import BackendTS.code.service.BlogPostService;

@Controller
@RequestMapping("/blog")
public class BlogController {
	
	@Autowired
	private BlogPostService blogPostService;
	
	//Get all the blog posts
	@GetMapping
	public String getAllPosts(Model model) {
		List<BlogPost> posts = blogPostService.getAllPosts();
		model.addAttribute("posts", posts);
		return "blog/list";
	}
	
	//Get a single post by id
	@GetMapping("/{id}")
	public String getPostById(@PathVariable Long id, Model model) {
		BlogPost post = blogPostService.getPostById(id).orElse(null);
		model.addAttribute("post", post);
		return "blog/view";
	}
	
	//Create a new Blog Post
	@PostMapping
	public String createPost(@ModelAttribute BlogPost post) {
		blogPostService.savePost(post);
		return "redirect:/blog";
	}
	
	//Show form to edit an existing blog post
	@GetMapping("/edit/{id}")
	public String showEditForm(@PathVariable Long id, Model model) {
		BlogPost post = blogPostService.getPostById(id).orElse(null);
		model.addAttribute("post", post);
		return "blog/edit";
	}
	
	//Update an existing blog post
	@PostMapping("/edit")
	public String updatePost(@ModelAttribute BlogPost post) {
		blogPostService.savePost(post);
		return "redirect:/blog";
	}
	
	//Delete an existing blog post
	@GetMapping("/delete/{id}")
	public String deletePost(@PathVariable Long id) {
		blogPostService.deletePost(id);
		return "redirect:/blog";
	}
}
