package VechileRentalSystem;

import java.util.List;

public class VechileRentalSystemZoom {

    List<User> userList;
    List<Store> storeList;

    public VechileRentalSystemZoom(List<User> userList, List<Store> storeList) {
        this.userList = userList;
        this.storeList = storeList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Store> getStoreList() {
        return storeList;
    }

    public void setStoreList(List<Store> storeList) {
        this.storeList = storeList;
    }
}
