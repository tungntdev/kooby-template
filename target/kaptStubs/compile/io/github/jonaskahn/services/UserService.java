package io.github.jonaskahn.services;

@com.google.inject.ImplementedBy(value = io.github.jonaskahn.services.UserServiceImpl.class)
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH&J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\f"}, d2 = {"Lio/github/jonaskahn/services/UserService;", "", "addUser", "Lio/github/jonaskahn/entity/User;", "user", "deleteUser", "", "id", "", "getAllUsers", "", "getUserById", "backend"})
public abstract interface UserService {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.github.jonaskahn.entity.User> getAllUsers();
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.github.jonaskahn.entity.User getUserById(int id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.github.jonaskahn.entity.User addUser(@org.jetbrains.annotations.NotNull()
    io.github.jonaskahn.entity.User user);
    
    public abstract boolean deleteUser(int id);
}