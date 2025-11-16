<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <!-- 	tailwind cdn  -->
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>

    <link rel="stylesheet" href="/css/style.css">
    <link rel="stylesheet" href="/css/main.css">
</head>
<body>
<div class="container mx-auto mt-8 px-3">
    <table class="w-[100%] border border-gray-200">
        <thead class="bg-blue-700 text-white">
        <tr>
            <th scope="col" class="px-4 py-2 border-b">eno</th>
            <th scope="col" class="px-4 py-2 border-b">ename</th>
            <th scope="col" class="px-4 py-2 border-b">job</th>
            <th scope="col" class="px-4 py-2 border-b">hiredate</th>
        </tr>
        </thead>
        <tbody>
        <tr class="hover:bg-gray-50">
            <!-- jsp 반복문 -->
            <c:forEach var="data" items="${list}">
                <td class="px-4 py-2 border-b text-center">${data}</td>
            </c:forEach>
        </tr>
        </tbody>
    </table>
</div>

</body>
</html>