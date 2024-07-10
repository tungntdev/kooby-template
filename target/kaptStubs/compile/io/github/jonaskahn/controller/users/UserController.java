package io.github.jonaskahn.controller.users;

@io.jooby.annotation.Path(value = {"/users"})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lio/github/jonaskahn/controller/users/UserController;", "", "userService", "Lio/github/jonaskahn/services/UserService;", "(Lio/github/jonaskahn/services/UserService;)V", "all", "", "Lio/github/jonaskahn/entity/User;", "get", "id", "", "login", "", "body", "Lio/github/jonaskahn/controller/users/RegisterUserRequest;", "register", "", "request", "backend"})
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
    
    @io.jooby.annotation.POST(value = {"/login"})
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String login(@org.jetbrains.annotations.NotNull()
    io.github.jonaskahn.controller.users.RegisterUserRequest body) {
        return null;
    }
    
    @io.jooby.annotation.GET(value = {"/info/{id}"})
    @org.jetbrains.annotations.Nullable()
    public final io.github.jonaskahn.entity.User get(@io.jooby.annotation.PathParam(value = "id")
    int id) {
        return null;
    }
}