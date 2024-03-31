INSERT INTO post (device_id, user_id, title, body, memo, rating, created_at, updated_at)
VALUES 
('device1', 'nemouid', 'Sample Title 1', 'Sample Body 1', 'Sample Memo 1', 5, '2022-01-01 00:00:00', '2022-01-01 00:00:00'),
('device2', 'nemouid', 'Sample Title 2', 'Sample Body 2', 'Sample Memo 2', 4, '2022-01-02 00:00:00', '2022-01-02 00:00:00'),
('device3', 'nemouid', 'Sample Title 3', 'Sample Body 3', 'Sample Memo 3', 3, '2022-01-03 00:00:00', '2022-01-03 00:00:00'),
('device4', 'nemouid', 'Sample Title 4', 'Sample Body 4', 'Sample Memo 4', 2, '2022-01-04 00:00:00', '2022-01-04 00:00:00'),
('device5', 'nemouid', 'Sample Title 5', 'Sample Body 5', 'Sample Memo 5', 1, '2022-01-05 00:00:00', '2022-01-05 00:00:00');

INSERT INTO users (id, last_name, first_name, email, created_at, updated_at)
VALUES
('a1b2c3d4-e5f6-g7h8-i9j0-k1l2m3n4o5p6', '山田', '太郎', 'taro.yamada@example.com', '2024-03-31T08:00:00', '2024-03-31T08:00:00'),
('q7r8s9t0-u1v2-w3x4-y5z6-a7b8c9d0e1f2', '佐藤', '花子', 'hanako.sato@example.com', '2024-03-31T09:00:00', '2024-03-31T09:00:00'),
('g3h4i5j6-k7l8-m9n0-o1p2-q3r4s5t6u7v8', '鈴木', '一郎', 'ichiro.suzuki@example.com', '2024-03-31T10:00:00', '2024-03-31T10:00:00'),
('w9x0y1z2-a3b4-c5d6-e7f8-g9h0i1j2k3l4', '田中', '次郎', 'jiro.tanaka@example.com', '2024-03-31T11:00:00', '2024-03-31T11:00:00'),
('m5n6o7p8-q9r0-s1t2-u3v4-w5x6y7z8a9b0', '伊藤', '三郎', 'saburo.ito@example.com', '2024-03-31T12:00:00', '2024-03-31T12:00:00');
