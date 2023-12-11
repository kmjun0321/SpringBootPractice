<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            table {
                width: 100%;
                border : 1px solid black;
                border-collapse: collapse;
            }
            th, td {
                border: 1px solid black;
            }
        </style>
    </head>
    <body>
        <div style="text-align: center;">
            <table style="margin:auto;">
                <tr>
                    <th>DomainID</th>
                    <th>PolicyID</th>
                    <th>PolicyName</th>
                    <th>RegDate</th>
                    <th>LastModifyDate</th>
                    <th>Memo</th>
                </tr>
                <c:forEach var="totalPolicies" items="${totalPoliciesList}">
                    <tr>
                        <td>${totalPolicies.domainID}</td>
                        <td>${totalPolicies.policyID}</td>
                        <td>${totalPolicies.policyName}</td>
                        <td>${totalPolicies.regDate}</td>
                        <td>${totalPolicies.lastModifyDate}</td>
                        <td>${totalPolicies.memo}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>