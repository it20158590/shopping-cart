package dto;

import com.sun.istack.NotNull;

public class CheckOutDto {

    private @NotNull String fullName;
    private @NotNull String email;
    private @NotNull Integer PhNumber;
    private @NotNull String city;
    private @NotNull String address;
    private @NotNull Integer userid = 123;

    public CheckOutDto(){

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhNumber() {
        return PhNumber;
    }

    public void setPhNumber(Integer phNumber) {
        PhNumber = phNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
