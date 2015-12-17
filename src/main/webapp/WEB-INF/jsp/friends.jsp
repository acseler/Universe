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
            <div class="row border-of-entity">
                <div class="h4 text-center">You have ${friendList.size()} friends</div>
            </div>
            <div class="row">

                <%--<div class="border-of-entity">--%>
                    <c:forEach items="${friendList}" var="friend">
                        <div class="card">
                            <img class="card-img-top img-responsive img-rounded" src="${friend.base64}"
                                 alt="Card image cap" width="128" height="128">

                            <div class="card-block">
                                <h4 class="card-title">Card title</h4>

                                <p class="card-text">Some quick example text to build on the card title and make up the
                                    bulk of
                                    the card's content.</p>
                                <a href="#" class="btn btn-primary">Button</a>
                            </div>
                        </div>
                    </c:forEach>
                    </div>
                <%--</div>--%>

            </div>
        </div>
    </div>
</div>
<script src="/pages/scripts/jquery-1.11.3.min.js"></script>
<script src="/pages/scripts/bootstrap.min.js"></script>
<script src="/pages/scripts/script.js"></script>
</body>
</html>
