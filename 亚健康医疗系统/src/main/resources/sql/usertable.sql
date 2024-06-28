create table usertable
(
    id             int auto_increment
        primary key,
    username       varchar(50)  not null,
    password       varchar(100) not null,
    age            int          null,
    gender         varchar(10)  null,
    blood_pressure varchar(20)  null,
    lung_capacity  varchar(20)  null,
    role           varchar(50)  null
);

INSERT INTO ms.usertable (id, username, password, age, gender, blood_pressure, lung_capacity, role) VALUES (1, '张三', '123', 12, '男', '110/70', '4800ml', '管理员');
INSERT INTO ms.usertable (id, username, password, age, gender, blood_pressure, lung_capacity, role) VALUES (2, '李四', '123456', 30, '女', '110/70', '4800ml', '用户');
INSERT INTO ms.usertable (id, username, password, age, gender, blood_pressure, lung_capacity, role) VALUES (3, '王五', '888888', 28, '男', '130/85', '5200ml', '管理员');
INSERT INTO ms.usertable (id, username, password, age, gender, blood_pressure, lung_capacity, role) VALUES (4, '赵六', '654321', 32, '女', '115/75', '4900ml', '用户');
INSERT INTO ms.usertable (id, username, password, age, gender, blood_pressure, lung_capacity, role) VALUES (5, '小明', 'password', 22, '男', '118/78', '5100ml', '管理员');
INSERT INTO ms.usertable (id, username, password, age, gender, blood_pressure, lung_capacity, role) VALUES (6, '小红', 'qwerty', 27, '女', '125/82', '4900ml', '用户');
INSERT INTO ms.usertable (id, username, password, age, gender, blood_pressure, lung_capacity, role) VALUES (7, '张小强', 'abc123', 29, '男', '122/80', '5000ml', '管理员');
