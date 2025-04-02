CREATE TABLE empJavatest (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(100) NOT NULL,
    emp_age INT NOT NULL,
    emp_department VARCHAR(50),
    emp_salary DECIMAL(10, 2),
    emp_join_date DATE
);

INSERT INTO empJavatest (emp_id, emp_name, emp_age, emp_department, emp_salary, emp_join_date)
VALUES
(1, 'John Doe', 30, 'IT', 60000.00, '2022-01-15'),
(2, 'Jane Smith', 25, 'HR', 50000.00, '2023-03-10'),
(3, 'Alice Johnson', 35, 'Finance', 75000.00, '2021-07-20'),
(4, 'Bob Brown', 28, 'Marketing', 55000.00, '2024-02-05');

SELECT * FROM empJavatest;