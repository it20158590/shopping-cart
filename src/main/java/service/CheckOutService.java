package service;

import Repository.CheckOutRepository;
import dto.CheckOutDto;
import model.CheckOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckOutService {


    @Autowired
    CheckOutRepository checkOutRepository;

    public void insertCheckedItems(CheckOutDto checkOutDto) {
        CheckOut checkOut = new CheckOut();
        checkOut.setFullName(checkOutDto.getFullName());
        checkOut.setEmail(checkOutDto.getEmail());
        checkOut.setPhNumber(checkOutDto.getPhNumber());
        checkOut.setAddress(checkOutDto.getAddress());
        checkOutRepository.save(checkOut);

    }
}
