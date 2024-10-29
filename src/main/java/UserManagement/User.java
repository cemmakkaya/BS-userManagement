package UserManagement;

public class User {
    private int id;
    private String username;
    private String email;
    private int roleId;

    public User(int id, String username, String email, int roleId) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.roleId = roleId;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}
