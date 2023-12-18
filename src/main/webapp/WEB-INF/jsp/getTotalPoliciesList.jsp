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
            .td_border {
                border: 1px solid black;
            }
        </style>
    </head>
    <body>
        <a href="/">Home</a>
        <br>
        <br>
        <h3>추가</h3>
        <form action="insertTotalPolicies" mothod="post">
            <input type="hidden" name="DomainID" value="1000000000000"/>
            <table style="float:left; border:none; width:50%;">
                <tr>
                    <td>PolicyID :  <input type="text" name="PolicyID"/></td>
                    <td>PolicyName : <input type="text" name="PolicyName"/></td>
                    <td>Memo : <input type="text" name="Memo"/></td>
                    <td><input type="submit" value="submit"/></td>
                </tr>
            </table>
        </form>
        <br>
        <hr>
        <br>
        <div style="text-align: center;">
            <table style="margin:auto;">
                <tr>
                    <th>DomainID</th>
                    <th>PolicyID</th>
                    <th>PolicyName</th>
                    <th>RegDate</th>
                    <th>LastModifyDate</th>
                    <th>Memo</th>
                    <th></th>
                </tr>
                <c:forEach var="totalPolicies" items="${totalPoliciesList}">
                    <tr>
                        <td class="td_border">${totalPolicies.domainID}</td>
                        <td class="td_border">${totalPolicies.policyID}</td>
                        <td class="td_border">${totalPolicies.policyName}</td>
                        <td class="td_border">${totalPolicies.regDate}</td>
                        <td class="td_border">${totalPolicies.lastModifyDate}</td>
                        <td class="td_border">${totalPolicies.memo}</td>
                        <td class="td_border"><a href="deleteTotalPolicies?seq=${totalPolicies.seq}&policyID=${totalPolicies.policyID}">삭제</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>