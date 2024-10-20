package za.ac.cput.service.impl;


import za.ac.cput.domain.User;
import za.ac.cput.dto.request.UserRequest;

public interface UserService extends BaseCrudService<User, Long>{
    User create(UserRequest form);

    User update(Long id, UserRequest form);

    User findByEmail(String email);
}
