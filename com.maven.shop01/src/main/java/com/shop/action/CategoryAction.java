package com.shop.action;

import com.opensymphony.xwork2.ActionSupport;
import com.shop.model.Category;
import com.shop.service.CategoryService;

public class CategoryAction extends ActionSupport {  
	
	private Category category;//设置一个私有成员变量接收url带过来的参数，注意下面要写好get和set方法 
	
    private CategoryService categoryService; //设置categoryService是为了很直观的看出与Spring整合前后的不同  
      
    public void setCategoryService(CategoryService categoryService) {  
        this.categoryService = categoryService;  
    }  
      
    public String update() {  
        System.out.println("----update----");  
        System.out.println(categoryService); //整合前后输出不同  
        categoryService.update(category); //新加一条语句，来更新数据库 
        return "index";  
    }  
      
    public String save() {  
        System.out.println("----save----");  
        System.out.println(categoryService);//整合前后输出不同  
        return "index";  
    }  
    
    public Category getCategory() {  
        return category;  
    }  
  
    public void setCategory(Category category) {  
        this.category = category;  
    }  
}  
