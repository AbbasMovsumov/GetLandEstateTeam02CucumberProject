package getLandEstate.pojos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)
public class RegisterPostPojo implements Serializable {

    private String firtsname;
    private String lastname;
    private int phone;
    private Object email;
    private Object enter_password;
    private Object confirm_password;

    public RegisterPostPojo() {
    }

    public RegisterPostPojo(String firtsname, String lastname, int phone, Object email, Object enter_password, Object confirm_password) {
        this.firtsname = firtsname;
        this.lastname = lastname;
        this.phone = phone;
        this.email = email;
        this.enter_password = enter_password;
        this.confirm_password = confirm_password;
    }

    public String getFirtsname() {
        return firtsname;
    }

    public void setFirtsname(String firtsname) {
        this.firtsname = firtsname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public Object getEnter_password() {
        return enter_password;
    }

    public void setEnter_password(Object enter_password) {
        this.enter_password = enter_password;
    }

    public Object getConfirm_password() {
        return confirm_password;
    }

    public void setConfirm_password(Object confirm_password) {
        this.confirm_password = confirm_password;
    }

    @Override
    public String toString() {
        return "RegisterPostPojo{" +
                "firtsname='" + firtsname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phone=" + phone +
                ", email=" + email +
                ", enter_password=" + enter_password +
                ", confirm_password=" + confirm_password +
                '}';
    }
}

