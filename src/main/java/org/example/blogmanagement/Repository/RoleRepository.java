
package org.example.blogmanagement.Repository;

import org.example.blogmanagement.Models.Role;
import org.example.blogmanagement.Service.UserServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
