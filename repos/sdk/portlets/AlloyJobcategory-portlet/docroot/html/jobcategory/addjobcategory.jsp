<%@ include file="/html/jobcategory/init.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>jobcategory</title>
<portlet:actionURL var="savejobcategory" name="saveJobcategory">
</portlet:actionURL>
<portlet:resourceURL var="deletejobcategory" id="deleteJobcategory"/>
<portlet:renderURL var="listview">
	<portlet:param name="mvcPath" value="/html/jobcategory/addjobcategory.jsp" />
</portlet:renderURL>
<style type="text/css">
.table-first-header {
	width: 10%;
}
.table-last-header {
	width: 15%;
}
</style>
<aui:script>
AUI().use(
  'aui-node',
  function(A) {
    var node = A.one('#delete');
    node.on(
      'click',
      function() {
     var idArray = [];
      A.all('input[type=checkbox]:checked').each(function(object) {
      idArray.push(object.get("value"));
    
        });
       if(idArray==""){
			  alert("Please select records!");
		  }else{
			  var d = confirm("Are you sure you want to delete the selected jobcategory ?");
		  if(d){
		   var url = '<%=deletejobcategory%>';
          A.io.request(url,
         {
          data: {  
                <portlet:namespace />jobcategoryIds: idArray,  
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
    var node = A.one('#add');
    node.on(
      'click',
      function() {
         A.one('#jobadddelete').hide();
         A.one('#addJobcategoryForm').show();
                     
      }
    );
  }
);

 AUI().ready('event', 'node', function(A){

  A.one('#addJobcategoryForm').hide();
 });

AUI().use(
  'aui-node',
  function(A) {
    var node = A.one('#cancel');
    node.on(
      'click',
      function() {
         A.one('#jobadddelete').show();
         A.one('#addJobcategoryForm').hide();
                     
      }
    );
  }
);

</aui:script>
</head>

<body>
	<div id="jobadddelete" class="span12">
		<a href="#" id="add">Add</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="#" id="delete">Delete</a>

	</div>
	<div  id="addJobcategoryForm">
	<aui:form name="myForm" action="<%=savejobcategory.toString()%>">
		<aui:input name="jobcategoryId" type="hidden" id="jobcategoryId" />
		<div class="span12">
			<div class="span2">
				<label>Job Category</label>
		</div>
		<div class="span3">		
		 <input name="<portlet:namespace/>jobcategory" id="jobcategory" type="text" required = "required">
			</div>
		</div>
		
		<aui:button type="submit" value="Submit" />
		<aui:button  type="reset" value="Cancel" id ="cancel"/>
		
	</aui:form>
	</div>
	
	 <div><label style="color: white" >.</label></div>
	
</body>

<%

PortletURL iteratorURL = renderResponse.createRenderURL();
iteratorURL.setParameter("mvcPath", "/html/jobcategory/addjobcategory.jsp");
RowChecker rowChecker = new RowChecker(renderResponse);

PortalPreferences portalPrefs = PortletPreferencesFactoryUtil.getPortalPreferences(request); 
String sortByCol = ParamUtil.getString(request, "orderByCol"); 
String sortByType = ParamUtil.getString(request, "orderByType"); 
System.out.println("sortByCol == " +sortByCol);
System.out.println("sortByType == " +sortByType);
if (Validator.isNotNull(sortByCol ) && Validator.isNotNull(sortByType )) { 
	System.out.println("if block...");
 
portalPrefs.setValue("NAME_SPACE", "sort-by-col", sortByCol); 
portalPrefs.setValue("NAME_SPACE", "sort-by-type", sortByCol); 
 
} else { 
 
	
	sortByType = portalPrefs.getValue("NAME_SPACE", "sort-by-type ", "asc");   
}

System.out.println("after....");
System.out.println("sortByCol == " +sortByCol);
System.out.println("sortByType == " +sortByType);

%>
<%!
  com.liferay.portal.kernel.dao.search.SearchContainer<JobCategory> searchContainer;
%>
<div>
<liferay-ui:search-container orderByCol="<%=sortByCol %>"
	orderByType="<%=sortByType %>"
	rowChecker="<%= new RowChecker(renderResponse) %>" delta="5"
	emptyResultsMessage="No records is available for Jobcategory"
	deltaConfigurable="true" iteratorURL="<%=iteratorURL%>">
	<liferay-ui:search-container-results>

		<%
            List<JobCategory> jobcategoryList = JobCategoryLocalServiceUtil.getJobCategories(searchContainer.getStart(), searchContainer.getEnd());
            System.out.println("list size == " +jobcategoryList.size());
            OrderByComparator orderByComparator = CustomComparatorUtil.getJobcategoryrOrderByComparator(sortByCol, sortByType);         
  
           Collections.sort(jobcategoryList,orderByComparator);
  
          results = jobcategoryList;
          
            System.out.println("results == " +results);
           
     
               total = JobCategoryLocalServiceUtil.getJobCategoriesCount();
               System.out.println("total == " +total);
               pageContext.setAttribute("results", results);
               pageContext.setAttribute("total", total);
 %>

	</liferay-ui:search-container-results>
	<liferay-ui:search-container-row className="JobCategory"
		keyProperty="id" modelVar="JobCategory" rowVar="curRow"
		escapedModel="<%= true %>">
		<liferay-ui:search-container-column-text orderable="<%=true %>"
			name="Job Category" property="jobcategory"
			orderableProperty="jobcategory" />
		<liferay-ui:search-container-column-jsp name="Edit"
			path="/html/jobcategory/edit.jsp" />

	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />

</liferay-ui:search-container>
</div>

</html>