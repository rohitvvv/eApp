
<%@ include file="/html/membership/init.jsp" %>

<%ResultRow rslt=(ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

Membership membership= (Membership)rslt.getObject();

String prk=String.valueOf(membership.getPrimaryKey());
%>
<liferay-ui:icon-menu>
<portlet:actionURL var="editMemberships" name="editMembership">
<portlet:param name="membershipId" value="<%=prk %>"/>
</portlet:actionURL>
<style type="text/css">
	.edit-icon {
		background:#67c2f1;
		padding:5px;
		color:#fff !important;
	}
	.edit-icon:hover {
		text-decoration:none;
	}
</style>

<a href="#" class="edit-icon" onclick="window.location='<%=editMemberships.toString()%>'">
<%-- <img
					width="18px" height="18px" alt="loading..." 
					src="<%=request.getContextPath() %>/images/pencil.jpg"> --%>
					<i class="icon-edit"></i>
					</a> 
</liferay-ui:icon-menu>
