CREATE TABLE IF NOT EXISTS roles (
                                     id INTEGER PRIMARY KEY AUTOINCREMENT,
                                     role_name TEXT NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS users (
                                     id INTEGER PRIMARY KEY AUTOINCREMENT,
                                     username TEXT NOT NULL UNIQUE,
                                     email TEXT NOT NULL UNIQUE,
                                     role_id INTEGER,
                                     FOREIGN KEY (role_id) REFERENCES roles(id)
    );

CREATE TABLE IF NOT EXISTS permissions (
                                           id INTEGER PRIMARY KEY AUTOINCREMENT,
                                           permission_name TEXT NOT NULL UNIQUE,
                                           role_id INTEGER,
                                           FOREIGN KEY (role_id) REFERENCES roles(id)
    );
