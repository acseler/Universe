<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>First JSP</title>
    <link rel="stylesheet" href="/pages/css/bootstrap.min.css">
    <link rel="stylesheet" href="/pages/css/style.css"/>
    <meta name="viewport" content="width=device-width,
									initial-scale=1.0,
									maximum-scale=1.0,
									user-scalable=no">
</head>

<body>

<div class="container">
    <jsp:include page="patterns/header.jsp"/>
    <div class="row">
        <jsp:include page="patterns/navigation.jsp"/>
        <div class="col-lg-9 col-md-9 margin-10">
            <div class="row">
                <c:forEach items="${friendList}" var="friend">
                    <p>${friend.firstName}</p>

                    <p>${friend.lastName}</p>

                    <p>${friend.eMail}</p>
                    <img src="${friend.base64}" alt="ava"/>

                    <p>${friend.status}</p>
                </c:forEach>
            </div>
        </div>
    </div>
</div>
<script src="/pages/scripts/jquery-1.11.3.min.js"></script>
<script src="/pages/scripts/bootstrap.min.js"></script>
<script src="/pages/scripts/script.js"></script>
</body>
</html>