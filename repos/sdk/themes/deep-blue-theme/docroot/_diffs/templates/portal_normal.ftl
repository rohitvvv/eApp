<!DOCTYPE html>

<#include init />

<html class="${root_css_class}" dir="<@liferay.language key="lang.dir" />" lang="${w3c_language_id}">

<head>
	<title>${the_title} - ${company_name}</title>

	<meta content="initial-scale=1.0, width=device-width" name="viewport" />

	${theme.include(top_head_include)}
</head>

<body class="${css_class}">

<a href="#main-content" id="skip-to-content"><@liferay.language key="skip-to-content" /></a>

${theme.include(body_top_include)}

<#if is_signed_in>
	<@liferay.dockbar />
</#if>

<div class="container-fluid" id="wrapper">
	<header id="banner" role="banner">
		

		<#if !is_signed_in>
			<a href="${sign_in_url}" data-redirect="${is_login_redirect_required?string}" id="sign-in" rel="nofollow">${sign_in_text}</a>
		</#if>

		<#if has_navigation || is_signed_in>
			<#include "${full_templates_path}/navigation.ftl" />
		</#if>
	</header>

	<div id="content">
		<nav id="breadcrumbs"><@liferay.breadcrumbs /></nav>

		<#if selectable>
			${theme.include(content_include)}
		<#else>
			${portletDisplay.recycle()}

			${portletDisplay.setTitle(the_title)}

			${theme.wrapPortlet("portlet.ftl", content_include)}
		</#if>
	</div>

	<footer id="footer" role="contentinfo">
		<p class="powered-by">
			<@liferay.language key="powered-by" /> <a href="http://www.rknowsys.com" rel="external">R-Knowsys</a>
		</p>
	</footer>
</div>

${theme.include(body_bottom_include)}

${theme.include(bottom_include)}

</body>

</html>