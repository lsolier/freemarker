<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Student List</title>
</head>
<body>
    <h3>Student Gade Table</h3>
    <table>
        <tr>
            <td>Student ID</td>
            <td>Student Name</td>
            <td>Grade</td>
        </tr>
        <#list list as student>
        <tr>
            <td>${student.id}</td>
            <td>${student.studentName}</td>
            <td>${student.grade}</td>
        </tr>
        </#list>
    </table>

</body>
</html>