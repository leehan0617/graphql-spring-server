CREATE TABLE coffee (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(400) NOT NULL,
    price INT NOT NULL
);
CREATE TABLE user (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(400) NOT NULL,
    age INT NULL,
    phone VARCHAR(40)
);