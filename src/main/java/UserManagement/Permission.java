package UserManagement;

public class Permission {
    private int id;
    private String permissionName;
    private int roleId;

    public Permission(int id, String permissionName, int roleId) {
        this.id = id;
        this.permissionName = permissionName;
        this.roleId = roleId;
    }

    public int getId() {
        return id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}
