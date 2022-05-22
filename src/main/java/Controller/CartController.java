package Controller;

import common.ApiResponse;
import dto.cart.AddToCartDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    //post api
    @PostMapping("/add")
    public ResponseEntity<ApiResponse> addToCart(@RequestBody AddToCartDto addToCartDto){

        cartService.addToCart(addToCartDto);
        return new ResponseEntity<>(new ApiResponse(true,"added to your cart"), HttpStatus.CREATED);
    }

    //gel all card item



     //delete a cart item
    @DeleteMapping("/deleItem")
    public ResponseEntity<ApiResponse> deleteCartItem(@RequestBody AddToCartDto addToCartDto){

        return new ResponseEntity<>(new ApiResponse(true,"removed successfully"), HttpStatus.OK);
    }

}
