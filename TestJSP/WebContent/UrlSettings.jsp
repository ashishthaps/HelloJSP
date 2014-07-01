<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="UTF8" session="true"
	import="java.util.*, util.Constant ,com.binodata.URLSettingEntry"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="urlSettings" class="com.binodata.URLSettings" />
<div>

	<%
		if (urlSettings.getURLSettings().length > 0) {
	%>
	<table>
		<thead>
			<tr>
				<th>URL</th>
				<th>Include?</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="urlSetting" items="${urlSettings.URLSettings}">
				<tr>
					<td><input type="url" name="" value="${urlSetting.urlStr}" /></td>
					<td><c:choose>
							<c:when test="${urlSetting.includeOrExclude}">
								<input type="checkbox" name="" checked />
							</c:when>
							<c:otherwise>
								<input type="checkbox" name="" />
							</c:otherwise>
						</c:choose></td>
					<td></td>
				</tr>
			</c:forEach>


		</tbody>
	</table>
	<%
		} else {
	%>
	<span>No entries</span>
	<%
		}
	%>

</div>