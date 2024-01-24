CREATE TABLE post (
    id INT AUTO_INCREMENT PRIMARY KEY,
    device_id VARCHAR(255),
    user_id INT,
    title VARCHAR(255),
    body TEXT,
    memo TEXT,
    rating INT,
    created_at VARCHAR(255),
    updated_at VARCHAR(255)
);