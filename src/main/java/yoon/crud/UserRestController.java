package yoon.crud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserRestController {

    Map<Long, User> db = new HashMap<>();

    public UserRestController() {
        db.put(10L,new User("윤찬영", "yoon", "yooncy", "1234"));
        db.put(11L,new User("김찬영", "kim", "kimcy", "1235"));
        db.put(12L,new User("박찬영", "bak", "bakcy", "1236"));
    }

    @GetMapping("/profile/{userId}")
    UserResponse getProfile(@PathVariable Long userId) {
        User user = db.get(userId);
        return new UserResponse(user.getName(), user.getLoginId(), user.getNickName());
    }
}

