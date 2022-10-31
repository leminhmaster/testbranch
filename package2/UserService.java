package package2;

import package1.User;

public class UserService {
    public void showAllUser(String username){
        User user = new User();
        user.setUsername(username);
        user.setPassword("Minh@1234");
        user.setEmail("minh@example.com");
        user.setAddress("HaNoi HCM City");

        System.out.println(user);
    }
}
