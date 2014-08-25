<%@ include file="/html/membership/init.jsp"%>

<portlet:actionURL var="saveMemberships" name="saveMembership">
</portlet:actionURL>
<portlet:resourceURL var="deleteMemberships" id="deleteMembership"/>
<portlet:renderURL var="listview">
	<portlet:param name="mvcPath" value="/html/membership/add.jsp" />
</portlet:renderURL>
<style type="text/css">
.table-first-header {
	width: 10%;
}
.table-last-header {
	width: 15%;
}
.table {
}

</style>
<aui:script>
AUI().use(
  'aui-node',
  function(A) {
    var node = A.one('#deleteMembership');
    node.on(
      'click',
      function() {
     	var idArray = [];
      	A.all('input[name=<portlet:namespace />rowIds]:checked').each(function(object) {
      	idArray.push(object.get("value"));
        });
       if(idArray==""){
			  alert("Please select records!");
		  }else{
			  var d = confirm("Are you sure you want to delete the selected membership ?");
		  if(d){
		   var url = '<%=deleteMemberships%>';
          A.io.request(url,
         {
          data: {  
                <portlet:namespace />membershipIds: idArray,  
                 },
          on: {
               success: function() { 
                   alert('deleted successfully');
                   window.location='<%=listview%>';
              },
               failure: function() {
                  
                 }
                }
                 }
                );
		  																		
		  console.log(idArray);
	  
      return true;
  }
  else
    return false;
}             
      }
    );
  }
);
</aui:script>
<aui:script>
AUI().use(
  'aui-node',
  function(A) {
    var node = A.one('#addMembership');
    node.on(
      'click',
      function() {
         A.one('#membershipAddDelete').hide();
         A.one('#addMembershipForm').show();
                     
      }
    );
  }
);

 AUI().ready('event', 'node', function(A){

  A.one('#addMembershipForm').hide();
 });

AUI().use(
  'aui-node',
  function(A) {
    var node = A.one('#cancelMembership');
    node.on(
      'click',
      function() {
         A.one('#membershipAddDelete').show();
         A.one('#addMembershipForm').hide();
                     
      }
    );
  }
);

</aui:script>
</head>

<body>
	<div class="row-fluid">
	<div id="membershipAddDelete" class="span12">
		<div class="pull-right">
		<button id="addMembership" class="btn btn-success" type="button"><i class="icon-plus"></i> Add </button>
		<button id="deleteMembership" class="btn btn-danger" type="button"><i class="icon-trash"></i> Delete </button> 
		</div>
	</div>
	</div>
	<div id="addMembershipForm"  class="form-horizontal">
	<aui:form name="myForm" action="<%=saveMemberships.toString()%>" >
		<aui:input name="membershipId" type="hidden" id="membershipId" />
		<div class="control-group">
			<label class="control-label">Membership Name</label>
			<div class="controls">
				<input name="<portlet:namespace/>membership_name" type="text" required = "required">
			</div>
		</div>
		<div class="control-group">
			<div class="controls">
				<aui:button type="submit" value="Submit" />
				<aui:button  type="reset" value="Cancel" id ="cancelMembership"/>
			</div>
		</div>
	</aui:form>
	</div>

	
</body>

<%

PortletURL iteratorURL = renderResponse.createRenderURL();
iteratorURL.setParameter("mvcPath", "/html/membership/add.jsp");
RowChecker rowChecker = new RowChecker(renderResponse);

PortalPreferences portalPrefs = PortletPreferencesFactoryUtil.getPortalPreferences(request); 
String sortByCol = ParamUtil.getString(request, "orderByCol"); 
String sortByType = ParamUtil.getString(request, "orderByType"); 

if (Validator.isNotNull(sortByCol ) && Validator.isNotNull(sortByType )) { 
	
 
portalPrefs.setValue("NAME_SPACE", "sort-by-col", sortByCol); 
portalPrefs.setValue("NAME_SPACE", "sort-by-type", sortByCol); 
 
} else { 
 
	
	sortByType = portalPrefs.getValue("NAME_SPACE", "sort-by-type ", "asc");   
}

%>
<%!
  com.liferay.portal.kernel.dao.search.SearchContainer<Membership> searchContainer;
%>
<div>
<liferay-ui:search-container orderByCol="<%=sortByCol %>"
	orderByType="<%=sortByType %>"
	rowChecker="<%= new RowChecker(renderResponse) %>" delta="5"
	emptyResultsMessage="No records are available for Memberships"
	deltaConfigurable="true" iteratorURL="<%=iteratorURL%>">
	<liferay-ui:search-container-results>

		<%
            List<Membership> membershipList = MembershipLocalServiceUtil.getMemberships(searchContainer.getStart(), searchContainer.getEnd());
		OrderByComparator orderByComparator =  CustomComparatorUtil.getMembershipOrderByComparator(sortByCol, sortByType);
   
               Collections.sort(membershipList,orderByComparator);
  
               results = membershipList;
               total = MembershipLocalServiceUtil.getMembershipsCount();
               pageContext.setAttribute("results", results);
               pageContext.setAttribute("total", total);

 %>

	</liferay-ui:search-container-results>
	<liferay-ui:search-container-row className="Membership"
		keyProperty="id" modelVar="id" rowVar="curRow"
		escapedModel="<%= true %>">
		<liferay-ui:search-container-column-text orderable="<%=true %>"
			name="name" property="membershipName"
			orderableProperty="membershipName" />
	
		<liferay-ui:search-container-column-jsp name="Edit"
			path="/html/membership/editClick.jsp" />

	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />

</liferay-ui:search-container>
</div>

