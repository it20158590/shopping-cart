package service;


import Repository.Categoryrepository;
import model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

         @Autowired
    Categoryrepository categoryrepository;

         public void createCategory(Category category){
             categoryrepository.save(category);
         }

         public List<Category> listCategory(){
            return categoryrepository.findAll();
         }

}
