package Controller;

import Repository.UserRepository;
import common.ApiResponse;
import dto.CheckOutDto;
import model.Category;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.CheckOutService;

import java.util.Optional;

@RestController
@RequestMapping("/checkout")
public class CheckOutController {

    @Autowired
    CheckOutService checkOutService;

    @Autowired
    UserRepository userRepository;


    //post method to checkout the products
    @PostMapping( "/complete")
    public ResponseEntity<ApiResponse> completeCheckOut(@RequestBody CheckOutDto checkOutDto){
        Optional<User> optionalCategory = userRepository.findById(checkOutDto.getUserid());
            if(!optionalCategory.isPresent()){
                return new ResponseEntity<ApiResponse> (new ApiResponse(false, "category does not found"), HttpStatus.BAD_REQUEST);
            }

        checkOutService.insertCheckedItems(checkOutDto);
         return new ResponseEntity<ApiResponse>(new ApiResponse(true, "your items have succesfully checked out"), HttpStatus.OK);

    }
}
