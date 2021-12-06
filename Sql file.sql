
CREATE TABLE `course` (
  `id` int(11) NOT NULL,
  `label` varchar(50) NOT NULL,
  `hours` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `score` (
  `student_id` int(11) NOT NULL,
  `course_id` int(11) NOT NULL,
  `student_score` double NOT NULL,
  `description` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE `student` (
  `id` int(11) NOT NULL,
  `first_name` varchar(20) NOT NULL,
  `last_name` varchar(20) NOT NULL,
  `sex` varchar(7) NOT NULL,
  `birthdate` date NOT NULL,
  `phone` varchar(14) NOT NULL,
  `dept_id` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE `students_attendance` (
  `student_id` int(10) NOT NULL,
  `first_name` varchar(20) NOT NULL,
  `last_name` varchar(20) NOT NULL,
  `date` date NOT NULL,
  `attendance` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE `dept` (
  `dept_id` varchar(50) NOT NULL,
  `dept_name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `dept` (`dept_id`, `dept_name`) VALUES
('CS', 'Computer Science'),
('EM', 'Economics and Math'),
('BBA', 'BBA'),
('SS', 'Social Sciences'),
('ECO', 'Economics'),
('ACF', 'Accounting & Finance');

CREATE TABLE `teacher` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `gender` varchar(6) NOT NULL,
  `date` date NOT NULL,
  `dept` varchar(30) NOT NULL,
  `phone` varchar(14) NOT NULL,
  `address` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `teachers_attendance` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `dept` varchar(30) NOT NULL,
  `date` date NOT NULL,
  `attendance` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `user_name` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


INSERT INTO `user` (`id`, `user_name`, `password`) VALUES
(1, 'admin', 'admin');

ALTER TABLE `course`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `score`
  ADD KEY `fk_score_student` (`student_id`),
  ADD KEY `fk_score_course` (`course_id`);

ALTER TABLE `student`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `students_attendance`
  ADD KEY `fk_student_students_attendance` (`student_id`);

ALTER TABLE `teacher`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `teachers_attendance`
  ADD KEY `fk_teacher_teachers_attendance` (`id`);

ALTER TABLE `student`
  ADD KEY `fk_teacher_teachers_attendance` (`id`);

ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);


ALTER TABLE `course`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1038;

ALTER TABLE `student`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

ALTER TABLE `teacher`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1035;

ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

ALTER TABLE `score`
  ADD CONSTRAINT `fk_score_course` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `fk_score_student` FOREIGN KEY (`student_id`) REFERENCES `student` (`id`) ON DELETE CASCADE;

ALTER TABLE `students_attendance`
  ADD CONSTRAINT `fk_student_students_attendance` FOREIGN KEY (`student_id`) REFERENCES `student` (`id`) ON DELETE CASCADE;


ALTER TABLE `teachers_attendance`
  ADD CONSTRAINT `fk_teacher_teachers_attendance` FOREIGN KEY (`id`) REFERENCES `teacher` (`id`) ON DELETE CASCADE;
COMMIT;

