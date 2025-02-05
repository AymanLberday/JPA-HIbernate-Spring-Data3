package ma.ayman.JPA.service;

import ma.ayman.JPA.entities.Role;
import ma.ayman.JPA.entities.User;
public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUserName(String userName);
    Role findRoleByRoleName(String roleName);
    void addRoleToUser(String userName,String roleName);
    User authentificate(String userName,String password);
}