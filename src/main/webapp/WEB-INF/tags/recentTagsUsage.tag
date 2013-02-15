<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@attribute name="tagsUsage" type="java.util.List" required="true" %>
<ol class="tags-usage">
	<c:forEach items="${tagsUsage}" var="tagUsage">
		<li><tags:tag tag="${tagUsage.tag}"/> x ${tagUsage.usage}</li>
	</c:forEach>
</ol>