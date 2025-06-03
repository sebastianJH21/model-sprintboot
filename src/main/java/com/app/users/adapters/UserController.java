package com.app.users.adapters;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.users.domain.IUserService;
import com.app.users.domain.User;
import com.app.auth.infrastructure.dto.ApiResponse;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    // GET all users
    @GetMapping
    public ResponseEntity<ApiResponse<List<User>>> getAllUsers() {
        List<User> users = userService.findAll();
        return ResponseEntity.ok(new ApiResponse<>(true, "Lista de usuarios", users));
    }

    // GET user by ID
    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<User>> getUserById(@PathVariable Long id) {
        User user = userService.findById(id);
        return ResponseEntity.ok(new ApiResponse<>(true, "Usuario encontrado", user));
    }

    // CREATE a new user
    @PostMapping
    public ResponseEntity<ApiResponse<User>> createUser(@RequestBody User user) {
        User newUser = userService.save(user);
        return ResponseEntity.ok(new ApiResponse<>(true, "Usuario creado", newUser));
    }

    // UPDATE an existing user
    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<User>> updateUser(@PathVariable Long id, @RequestBody User user) {
        User updatedUser = userService.update(user, id);
        return ResponseEntity.ok(new ApiResponse<>(true, "Usuario actualizado", updatedUser));
    }

    // DELETE a user
    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> deleteUser(@PathVariable Long id) {
        userService.deleteById(id);
        return ResponseEntity.ok(new ApiResponse<>(true, "Usuario eliminado", null));
    }
}
