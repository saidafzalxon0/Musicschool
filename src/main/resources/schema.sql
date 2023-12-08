CREATE TABLE IF NOT EXISTS admin (
                                     id BIGSERIAL PRIMARY KEY,
                                     login VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
    );


INSERT INTO admin (login, password)
SELECT 'admin', '1'
    WHERE NOT EXISTS (SELECT 1 FROM admin WHERE login = 'admin');



