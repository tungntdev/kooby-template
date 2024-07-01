package io.github.jonaskahn.repositories;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lio/github/jonaskahn/repositories/UserRepositoryImpl;", "Lio/github/jonaskahn/repositories/UserRepository;", "entityManager", "Ljakarta/persistence/EntityManager;", "(Ljakarta/persistence/EntityManager;)V", "addUser", "Lio/github/jonaskahn/entity/User;", "user", "deleteUser", "", "id", "", "getAllUsers", "", "getUserById", "login", "username", "", "password", "backend"})
public final class UserRepositoryImpl implements io.github.jonaskahn.repositories.UserRepository {
    @org.jetbrains.annotations.NotNull()
    private final jakarta.persistence.EntityManager entityManager = null;
    
    @com.google.inject.Inject()
    public UserRepositoryImpl(@org.jetbrains.annotations.NotNull()
    jakarta.persistence.EntityManager entityManager) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.github.jonaskahn.entity.User> getAllUsers() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public io.github.jonaskahn.entity.User login(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public io.github.jonaskahn.entity.User getUserById(int id) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.github.jonaskahn.entity.User addUser(@org.jetbrains.annotations.NotNull()
    io.github.jonaskahn.entity.User user) {
        return null;
    }
    
    @java.lang.Override()
    public boolean deleteUser(int id) {
        return false;
    }
}