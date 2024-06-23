package io.github.jonaskahn.controller.users;

@io.jooby.annotation.Path(value = {"/users"})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lio/github/jonaskahn/controller/users/UserController;", "", "userService", "Lio/github/jonaskahn/services/UserService;", "(Lio/github/jonaskahn/services/UserService;)V", "all", "", "Lio/github/jonaskahn/entity/User;", "register", "", "request", "Lio/github/jonaskahn/controller/users/RegisterUserRequest;", "backend"})
public final class UserController {
    @org.jetbrains.annotations.NotNull()
    private final io.github.jonaskahn.services.UserService userService = null;
    
    @com.google.inject.Inject()
    public UserController(@org.jetbrains.annotations.NotNull()
    io.github.jonaskahn.services.UserService userService) {
        super();
    }
    
    @io.jooby.annotation.POST(value = {"/register"})
    public final void register(@org.jetbrains.annotations.NotNull()
    io.github.jonaskahn.controller.users.RegisterUserRequest request) {
    }
    
    @io.jooby.annotation.GET(value = {"/all"})
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.github.jonaskahn.entity.User> all() {
        return null;
    }
}