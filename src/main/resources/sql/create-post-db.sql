DROP TABLE IF EXISTS post;
DROP TABLE IF EXISTS users;

CREATE TABLE post (
    id INT AUTO_INCREMENT PRIMARY KEY,
    device_id VARCHAR(255),
    user_id VARCHAR(255),
    title VARCHAR(255),
    body TEXT,
    memo TEXT,
    rating INT,
    created_at VARCHAR(255),
    updated_at VARCHAR(255)
);
CREATE TABLE users (
    id VARCHAR(255) PRIMARY KEY,
    last_name VARCHAR(255),
    first_name VARCHAR(255),
    email VARCHAR(255),
    created_at VARCHAR(255),
    updated_at VARCHAR(255)
);