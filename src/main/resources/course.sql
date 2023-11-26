-- Users
INSERT INTO Users (user_id, username, password, name, surname, email, date) VALUES  ('Nat123', 'Nattakit123', '12345678', 'Nattakit', 'wongpracha', 'Natta001@gmail.com, '2023-01-01’);
INSERT INTO Users (user_id, username, password, name, surname, email, date) VALUES  (‘AA010’, ‘Ashi11’, ’88888888’, 'Alice', 'Smith', ’a6531503059@gmail.com’, '2023-11-20’);
INSERT INTO Users (user_id, username, password, name, surname, email, date) VALUES  (‘BB’101, ‘Bobobe11, 'pass123', ‘Emmy', 'yos', ‘b6531503059@gmail.com', '2023-01-01’);


-- Tutor
INSERT INTO Tutor (tutor_id, name, surname, email, description, detail) VALUES ('ptao001', 'Ptaotutor', 'Sukjai', 'TaoTutor0022@gamil.com', 'Experienced in Mathematics', 'Number 1 tutor of Thailand.');


-- Course
INSERT INTO Course (course_id, tutor_id, name, description, detail, difficulty, url) VALUES ('eng0001', 'ptao001', 'English', 'Introduction', 'This course covers basic English.', 3, 'https://drive.google.com/file/d/1d3MqUuxiJkIPu-esaXSz0yIq-ZFXlWSb/view?usp=drivesdk');
INSERT INTO Course (course_id, tutor_id, name, description, detail, difficulty, url) VALUES ('bio0001', 'ptao001', 'Biology', 'Introduction', 'Explore the basics of biological science.', 2, 'https://drive.google.com/file/d/10xK8ZrOBvQ0fv1zSPRxP87chLDEE2dfD/view?usp=sharing');
INSERT INTO Course (course_id, tutor_id, name, description, detail, difficulty, url) VALUES ('math0001', 'ptao001', 'Mathematics', 'Introduction', 'Math concepts.', 1, 'https://drive.google.com/file/d/1RSat0v7aA8TK7ZhXIMTVPNk-o6ExRCEk/view?usp=sharing');


--Enrollment
INSERT INTO Enrollment (enrollment_id, user_id, course_id, date) VALUES ('enr1234', ‘Nattakit123', 'eng0001', '2023-11-25’);
INSERT INTO Enrollment (enrollment_id, user_id, course_id, date) VALUES ('enr1260’, ‘Ashi11’, 'eng0001', '2023-11-26');


--AuthGroup
INSERT INTO AuthGroup (authgroup_id, username, user_id) VALUES ('AG1', 'Nattakit123', 'Nat123’);
INSERT INTO AuthGroup (authgroup_id, username, user_id) VALUES ('AG2', 'Ashi11', 'AA010’);