<!DOCTYPE html><html lang="en"><head><meta charset="utf-8"><meta http-equiv="X-UA-Compatible" content="IE=edge"><title>Source of Room.java - group28 - Bitbucket</title><script>
window.WRM=window.WRM||{};window.WRM._unparsedData=window.WRM._unparsedData||{};window.WRM._unparsedErrors=window.WRM._unparsedErrors||{};
WRM._unparsedData["com.atlassian.bitbucket.server.bitbucket-webpack-INTERNAL:user-keyboard-shortcuts-enabled.data"]="true";
WRM._unparsedData["com.atlassian.bitbucket.server.bitbucket-client-web-fragments:comments-action-links._unused_"]="null";
WRM._unparsedData["com.atlassian.bitbucket.server.bitbucket-client-web-fragments:file-source-toolbar-secondary-location._unused_"]="null";
WRM._unparsedData["com.atlassian.bitbucket.server.bitbucket-client-web-fragments:comments-info-panels._unused_"]="null";
WRM._unparsedData["com.atlassian.bitbucket.server.config-wrm-data:page.max.source.lines.data"]="{\u0022value\u0022:\u00225000\u0022,\u0022key\u0022:\u0022page.max.source.lines\u0022,\u0022type\u0022:\u0022NUMBER\u0022}";
WRM._unparsedData["com.atlassian.plugins.atlassian-clientside-extensions-runtime:runtime.atlassianDevMode"]="false";
WRM._unparsedData["com.atlassian.bitbucket.server.feature-wrm-data:bidi.character.highlighting.data"]="true";
WRM._unparsedData["com.atlassian.bitbucket.server.config-wrm-data:content.upload.max.size.data"]="{\u0022value\u0022:\u00225242880\u0022,\u0022key\u0022:\u0022content.upload.max.size\u0022,\u0022type\u0022:\u0022NUMBER\u0022}";
WRM._unparsedData["com.atlassian.bitbucket.server.bitbucket-client-web-fragments:file-source-toolbar-primary-location._unused_"]="null";
WRM._unparsedData["com.atlassian.bitbucket.server.config-wrm-data:display.max.source.lines.data"]="{\u0022value\u0022:\u002220000\u0022,\u0022key\u0022:\u0022display.max.source.lines\u0022,\u0022type\u0022:\u0022NUMBER\u0022}";
WRM._unparsedData["com.atlassian.bitbucket.server.bitbucket-client-web-fragments:branch-layout-actions-dropdown-location._unused_"]="null";
WRM._unparsedData["com.atlassian.bitbucket.server.bitbucket-client-web-fragments:comments-extra-panels-internal._unused_"]="null";
WRM._unparsedData["com.atlassian.bitbucket.server.bitbucket-client-web-fragments:file-content-diff-view-options._unused_"]="null";
WRM._unparsedData["com.atlassian.bitbucket.server.bitbucket-webpack-INTERNAL:date-format-preference.data"]="\u0022\u0022";
WRM._unparsedData["com.atlassian.bitbucket.server.bitbucket-client-web-fragments:clone-dialog-options-location._unused_"]="null";
WRM._unparsedData["com.atlassian.bitbucket.server.feature-wrm-data:attachments.data"]="true";
WRM._unparsedData["com.atlassian.bitbucket.server.bitbucket-webpack-INTERNAL:determine-language.syntax-highlighters"]="{\u0022text/x-ruby\u0022:{\u0022x\u0022:[\u0022ruby\u0022]},\u0022application/json\u0022:{\u0022e\u0022:[\u0022ipynb\u0022]},\u0022text/x-objectivec\u0022:{\u0022e\u0022:[\u0022m\u0022]},\u0022text/x-python\u0022:{\u0022x\u0022:[\u0022python\u0022]},\u0022text/javascript\u0022:{\u0022x\u0022:[\u0022node\u0022]},\u0022text/x-sh\u0022:{\u0022e\u0022:[\u0022makefile\u0022,\u0022Makefile\u0022],\u0022x\u0022:[\u0022sh\u0022,\u0022bash\u0022,\u0022zsh\u0022]},\u0022text/x-perl\u0022:{\u0022x\u0022:[\u0022perl\u0022]},\u0022text/velocity\u0022:{\u0022e\u0022:[\u0022vm\u0022]},\u0022text/x-erlang\u0022:{\u0022x\u0022:[\u0022escript\u0022]}}";
WRM._unparsedData["com.atlassian.bitbucket.server.bitbucket-client-web-fragments:file-diff-toolbar-primary-location._unused_"]="null";
WRM._unparsedData["com.atlassian.bitbucket.server.config-wrm-data:attachment.upload.max.size.data"]="{\u0022value\u0022:\u002210485760\u0022,\u0022key\u0022:\u0022attachment.upload.max.size\u0022,\u0022type\u0022:\u0022NUMBER\u0022}";
WRM._unparsedData["com.atlassian.bitbucket.server.bitbucket-client-web-fragments:file-diff-toolbar-secondary-location._unused_"]="null";
WRM._unparsedData["com.atlassian.analytics.analytics-client:programmatic-analytics-init.programmatic-analytics-data-provider"]="false";
WRM._unparsedData["com.atlassian.plugins.atlassian-plugins-webresource-plugin:context-path.context-path"]="\u0022\u0022";
WRM._unparsedData["com.atlassian.analytics.analytics-client:policy-update-init.policy-update-data-provider"]="false";
WRM._unparsedData["com.atlassian.bitbucket.server.bitbucket-jira:is-jira-linked.is-jira-linked-id"]="true";
WRM._unparsedData["com.atlassian.bitbucket.server.feature-wrm-data:user.time.zone.onboarding.data"]="true";
WRM._unparsedData["com.atlassian.bitbucket.server.bitbucket-mirroring-upstream:preferred-mirror.preferred-mirror-id"]="\u0022\u0022";
if(window.WRM._dataArrived)window.WRM._dataArrived();</script>
<link rel="stylesheet" href="/s/27d4a29ddb8c7c847855732d1c99857c-CDN/-1302501016/352b195/n1cn5w/5bda11a0a28217d39f1e90eee8349b72/_/download/contextbatch/css/_super/batch.css" data-wrm-key="_super" data-wrm-batch-type="context" media="all">
<link rel="stylesheet" href="/s/3f45ef2aa6f89de13ffa89f5d0ed3080-CDN/-1302501016/352b195/n1cn5w/9d4e40ebe0f71ce6f01634744bc7c3c3/_/download/contextbatch/css/bitbucket.page.repository.fileContent,bitbucket.feature.files.fileHandlers,bitbucket.layout.files,bitbucket.layout.branch,bitbucket.layout.repository,atl.general,bitbucket.layout.base,bitbucket.layout.entity,-_super/batch.css?awesome.graphs.isLoggedIn=true&amp;feature.smart.mirrors.enabled=true" data-wrm-key="bitbucket.page.repository.fileContent,bitbucket.feature.files.fileHandlers,bitbucket.layout.files,bitbucket.layout.branch,bitbucket.layout.repository,atl.general,bitbucket.layout.base,bitbucket.layout.entity,-_super" data-wrm-batch-type="context" media="all">
<script src="/s/6fceaac93e75ca52af0290f9a6cf30e2-CDN/-1302501016/352b195/n1cn5w/5bda11a0a28217d39f1e90eee8349b72/_/download/contextbatch/js/_super/batch.js?locale=en-US" data-wrm-key="_super" data-wrm-batch-type="context" data-initially-rendered></script>
<script src="/s/8eb9264aa890a6c247b0d2a91466fe6d-CDN/-1302501016/352b195/n1cn5w/9d4e40ebe0f71ce6f01634744bc7c3c3/_/download/contextbatch/js/bitbucket.page.repository.fileContent,bitbucket.feature.files.fileHandlers,bitbucket.layout.files,bitbucket.layout.branch,bitbucket.layout.repository,atl.general,bitbucket.layout.base,bitbucket.layout.entity,-_super/batch.js?awesome.graphs.isLoggedIn=true&amp;feature.smart.mirrors.enabled=true&amp;locale=en-US" data-wrm-key="bitbucket.page.repository.fileContent,bitbucket.feature.files.fileHandlers,bitbucket.layout.files,bitbucket.layout.branch,bitbucket.layout.repository,atl.general,bitbucket.layout.base,bitbucket.layout.entity,-_super" data-wrm-batch-type="context" data-initially-rendered></script>
<script>(function(loader) {loader.load('bitbucket.web.repository.clone.dialog.options', {"com.atlassian.bitbucket.server.bitbucket-mirroring-upstream:mirroring-clone-urls":{"serverCondition":false}});loader.load('bitbucket.file-content.source.toolbar.primary', {"com.stiltsoft.stash.graphs:file-contributors-button":{"serverCondition":true}});loader.load('bitbucket.file-content.diff.toolbar.secondary', {});loader.load('bitbucket.file-content.diff-view.options', {});loader.load('bitbucket.comments.info', {});loader.load('bitbucket.file-content.diff.toolbar.primary', {});loader.load('bitbucket.comments.extra', {});loader.load('bitbucket.file-content.source.toolbar.secondary', {"com.atlassian.bitbucket.server.bitbucket-client-web-fragments:source-file-edit":{"serverCondition":true},"com.atlassian.bitbucket.server.bitbucket-git-lfs:source-file-lock":{"serverCondition":true}});loader.load('bitbucket.comments.actions', {});loader.load('bitbucket.layout.repository', {"com.atlassian.bitbucket.server.bitbucket-repository-shortcuts:repository-shortcuts-url-scheme-whitelist-provider":{"urlSchemeWhitelist":["http://","https://","ftp://","ftps://","mailto:","skype:","callto:","facetime:","git:","irc:","irc6:","news:","nntp:","feed:","cvs:","svn:","mvn:","ssh:","itms:","notes:","smb:","hipchat://","sourcetree:","urn:","tel:","xmpp:","telnet:","vnc:","rdp:","whatsapp:","slack:","sip:","sips:","magnet:"]},"com.atlassian.bitbucket.server.bitbucket-page-data:markup-extension-provider":{"extensions":["md","markdown","mdown","mkdn","mkd","txt","text",""],"extensionsRaw":["txt","text",""],"name":"README"}});loader.load('bitbucket.branch.layout.actions.dropdown', {"com.atlassian.bitbucket.server.bitbucket-sourcetree:sourcetree-checkout-action-branch-layout":{"serverCondition":true},"com.atlassian.bitbucket.server.bitbucket-client-web-fragments:download-branch-action":{"serverCondition":true},"com.atlassian.bitbucket.server.bitbucket-branch:create-branch-action":{"serverCondition":true}});}(_PageDataPlugin));</script><meta name="application-name" content="Bitbucket"><link rel="shortcut icon" type="image/x-icon" href="/s/-1302501016/352b195/n1cn5w/1.0/_/download/resources/com.atlassian.bitbucket.server.bitbucket-webpack-INTERNAL:favicon/favicon.ico" /><link rel="search" href="https://repo.csd.uwo.ca/plugins/servlet/opensearch-descriptor" type="application/opensearchdescription+xml" title="Bitbucket code search"/></head><body class="aui-page-sidebar bitbucket-theme"><ul id="assistive-skip-links" class="assistive"><li><a href="#aui-sidebar-content">Skip to sidebar navigation</a></li><li><a href="#aui-page-panel-content-body">Skip to content</a></li></ul><div id="page"><!-- start #header --><header id="header" role="banner"><section class="notifications"></section><nav class="aui-header aui-dropdown2-trigger-group" aria-label="site"><div class="aui-header-inner"><div class="aui-header-before"><button class=" aui-dropdown2-trigger app-switcher-trigger aui-dropdown2-trigger-arrowless" aria-controls="app-switcher" aria-haspopup="true" role="button" data-aui-trigger href="#app-switcher"><span class="aui-icon aui-icon-small aui-iconfont-appswitcher">Linked Applications</span></button><div id="app-switcher" class="aui-dropdown2 aui-style-default" role="menu" hidden data-is-user-admin="false" data-is-switcher="true"><div class="app-switcher-loading">Loading&hellip;</div></div></div><div class="aui-header-primary"><span id="logo" class="aui-header-logo bitbucket-header-logo"><a href="https://repo.csd.uwo.ca"><img src="/s/-1302501016/352b195/n1cn5w/1.0/_/download/resources/com.atlassian.bitbucket.server.bitbucket-webpack-INTERNAL:bitbucket-logo/images/logo/bitbucket.svg" alt="Bitbucket"/></a></span><ul class="aui-nav"><li class=" dashboard-link"><a href="/dashboard"class="dashboard-link" data-web-item-key="com.atlassian.bitbucket.server.bitbucket-server-web-fragments:dashboard-menu">Your work</a></li><li class=" projects-link"><a href="/projects"class="projects-link" data-web-item-key="com.atlassian.bitbucket.server.bitbucket-server-web-fragments:projects-menu">Projects</a></li><li class="selected recent-repositories"><a id="repositories-menu-trigger"  class=" aui-dropdown2-trigger" aria-controls="com.atlassian.bitbucket.server.bitbucket-server-web-fragments-repositories-menu" aria-haspopup="true" role="button" tabindex="0" data-aui-trigger>Repositories</a><div id="com.atlassian.bitbucket.server.bitbucket-server-web-fragments-repositories-menu" class="aui-dropdown2 aui-style-default" role="menu" hidden data-aui-dom-container="body"><div class="aui-dropdown2-section recent-repositories-section"><span aria-hidden="true" class="aui-dropdown2-heading">Recently viewed</span><div role="group" aria-label="Recently viewed"><ul class="aui-list-truncate" role="presentation"></ul></div></div></div></li><li class=""><a id="people-menu-trigger"  class=" aui-dropdown2-trigger" aria-controls="com.stiltsoft.stash.graphs-people-menu" aria-haspopup="true" role="button" tabindex="0" data-aui-trigger>People</a><div id="com.stiltsoft.stash.graphs-people-menu" class="aui-dropdown2 aui-style-default" role="menu" hidden data-aui-dom-container="body"><div class="aui-dropdown2-section people-section"><span aria-hidden="true" class="aui-dropdown2-heading">Recently viewed</span><div role="group" aria-label="Recently viewed"><ul class="aui-list-truncate" role="presentation"></ul></div></div><div class="aui-dropdown2-section people-link-section"><ul class="aui-list-truncate" role="presentation"><li role="presentation"><a href="/plugins/servlet/people" data-web-item-key="com.stiltsoft.stash.graphs:people-link">All users</a></li></ul></div></div></li></ul></div><div class="aui-header-secondary"><ul class="aui-nav"><li><div id="quick-search-loader"></div><script>jQuery(document).ready(function () {require(['bitbucket-plugin-search/internal/component/quick-search/quick-search-loader'], function (loader) {loader.onReady('#quick-search-loader');}) ;}) ;</script></li><li class=" help-link"title="Help"><a class=" aui-dropdown2-trigger aui-dropdown2-trigger-arrowless" aria-controls="com.atlassian.bitbucket.server.bitbucket-server-web-fragments-help-menu" aria-haspopup="true" role="button" tabindex="0" data-aui-trigger><span class="aui-icon aui-icon-small aui-icon-small aui-iconfont-question-circle">Help</span></a><div id="com.atlassian.bitbucket.server.bitbucket-server-web-fragments-help-menu" class="aui-dropdown2 aui-style-default" role="menu" hidden data-aui-dom-container="body"><div class="aui-dropdown2-section help-items-section"><ul class="aui-list-truncate" role="presentation"><li role="presentation"><a href="https://docs.atlassian.com/bitbucketserver/docs-089/Bitbucket+Data+Center+and+Server+documentation?utm_campaign=in-app-help&amp;amp;utm_medium=in-app-help&amp;amp;utm_source=stash" title="Go to the online documentation for Bitbucket" data-web-item-key="com.atlassian.bitbucket.server.bitbucket-server-web-fragments:general-help">Online help</a></li><li role="presentation"><a href="https://www.atlassian.com/git?utm_campaign=learn-git&amp;utm_medium=in-app-help&amp;utm_source=stash" title="Learn about Git commands &amp; workflows" data-web-item-key="com.atlassian.bitbucket.server.bitbucket-server-web-fragments:learn-git">Learn Git</a></li><li role="presentation"><a href="/getting-started"class="getting-started-page-link" title="Overview of Bitbucket features" data-web-item-key="com.atlassian.bitbucket.server.bitbucket-server-web-fragments:getting-started-page-help-link">Welcome to Bitbucket</a></li><li role="presentation"><a href="/#"class="keyboard-shortcut-link" title="Discover keyboard shortcuts in Bitbucket" data-web-item-key="com.atlassian.bitbucket.server.bitbucket-server-web-fragments:keyboard-shortcuts-help-link">Keyboard shortcuts</a></li><li role="presentation"><a href="https://go.atlassian.com/bitbucket-server-whats-new?utm_campaign=in-app-help&amp;utm_medium=in-app-help&amp;utm_source=stash" title="Learn about what&#39;s new in Bitbucket" data-web-item-key="com.atlassian.bitbucket.server.bitbucket-server-web-fragments:whats-new-link">What&#39;s new</a></li><li role="presentation"><a href="https://go.atlassian.com/bitbucket-server-community?utm_campaign=in-app-help&amp;utm_medium=in-app-help&amp;utm_source=stash" title="Explore the Atlassian community" data-web-item-key="com.atlassian.bitbucket.server.bitbucket-server-web-fragments:community-link">Community</a></li><li role="presentation"><a href="/about" title="About Bitbucket" data-web-item-key="com.atlassian.bitbucket.server.bitbucket-server-web-fragments:about">About</a></li></ul></div></div></li><li class=" alerts-menu"title="View system alerts"><a href="#alerts" id="alerts-trigger"class="alerts-menu" title="View system alerts" data-web-item-key="com.atlassian.bitbucket.server.bitbucket-server-web-fragments:global-alerts-menu-item">Alerts</a></li><li class="inbox-menu" title="View your unapproved pull requests"><a href="#inbox" id="inbox-trigger" data-aui-trigger aria-controls="inline-dialog-inbox-pull-requests-content" aria-label="View your unapproved pull requests" ><span class="aui-icon aui-icon-small aui-iconfont-tray">Inbox</span></a><aui-inline-dialog id="inline-dialog-inbox-pull-requests-content" alignment="bottom right" data-aui-dom-container="body"><aui-spinner size="medium" /></aui-inline-dialog></li><li class="user-dropdown"><a class=" aui-dropdown2-trigger user-dropdown-trigger aui-dropdown2-trigger-arrowless" aria-controls="user-dropdown-menu" aria-haspopup="true" role="button" title="Logged in as Sara Mehravar (smehrava)" data-container=".aui-header-secondary" tabindex="0" data-aui-trigger><span id="current-user" class="aui-avatar aui-avatar-small" data-emailaddress="smehrava@uwo.ca" data-username="smehrava" data-avatarurl-small="https://secure.gravatar.com/avatar/5b8e7b6f5399a68e344cb9bab607710c.jpg?s=48&amp;d=mm"><span class="aui-avatar-inner"><img src="https://secure.gravatar.com/avatar/5b8e7b6f5399a68e344cb9bab607710c.jpg?s=48&amp;d=mm" alt="Logged in as Sara Mehravar (smehrava)" /></span></span></a><div id="user-dropdown-menu" class="aui-dropdown2 aui-style-default" role="menu" hidden data-aui-dom-container="body"><div class="aui-dropdown2-section user-settings-section"><ul class="aui-list-truncate" role="presentation"><li role="presentation"><a href="/profile" data-web-item-key="com.atlassian.bitbucket.server.bitbucket-server-web-fragments:profile-menu-item">View profile</a></li><li role="presentation"><a href="/account" data-web-item-key="com.atlassian.bitbucket.server.bitbucket-server-web-fragments:account-menu-item">Manage account</a></li><li role="presentation"><a href="/plugins/servlet/upm/requests?source=header_user" id="upm-requests-link" data-web-item-key="com.atlassian.upm.atlassian-universal-plugin-manager-plugin:bitbucket-upm-requests-menu">Atlassian Marketplace</a></li></ul></div><div class="aui-dropdown2-section user-activities-graph-section"><ul class="aui-list-truncate" role="presentation"><li role="presentation"><a href="/plugins/servlet/user-contributions/smehrava" data-web-item-key="com.stiltsoft.stash.graphs:user-activities-graph-profile-item">My activity</a></li></ul></div><div class="aui-dropdown2-section user-logout-section"><ul class="aui-list-truncate" role="presentation"><li role="presentation"><a href="/j_atl_security_logout"class="logout-link" data-web-item-key="com.atlassian.bitbucket.server.bitbucket-server-web-fragments:logout-menu-item">Log out</a></li></ul></div></div></li></ul></div></div> <!-- End .aui-header-inner --></nav> <!-- End .aui-header --></header><!-- End #header --><!-- Start #content --><section id="content" role="main" tabindex="-1" data-timezone="300"  data-repoSlug="group28" data-projectKey="COMPSCI2212_W2023" data-repoName="group28" data-projectName="COMPSCI 2212 - Winter 2023"><section class="notifications"></section><section id="aui-sidebar-content" class="aui-sidebar "  tabindex="-1"><div class="aui-sidebar-wrapper"><div class="aui-sidebar-body"><script>require('bitbucket/internal/widget/sidebar/sidebar').preload();</script><div class="aui-page-header" ><div class="aui-page-header-inner"><div class="aui-page-header-image" ><a href="/projects/COMPSCI2212_W2023"><span class="aui-avatar aui-avatar-large aui-avatar-project" data-tooltip="COMPSCI 2212 - Winter 2023"><span class="aui-avatar-inner"><img src="/projects/COMPSCI2212_W2023/avatar.png?s=96&amp;v=1699606634034" alt="COMPSCI 2212 - Winter 2023" /></span></span></a></div><div class="aui-page-header-main entity-item" ><ol class="aui-nav aui-nav-breadcrumbs"><li><a href="/projects/COMPSCI2212_W2023" title="COMPSCI 2212 - Winter 2023">COMPSCI 2212 - Winter 2023</a></li></ol><h1><span class="entity-name" title="group28">group28</span></h1><div></div></div></div></div><nav class="aui-navgroup aui-navgroup-vertical" role="navigation"><div class="aui-navgroup-inner"><div class="aui-sidebar-group aui-sidebar-group-tier-one sidebar-actions"><div class="aui-nav-heading"><strong>Actions</strong></div><ul class="aui-nav"><li class=" clone-repo"><a href="#" class="aui-nav-item "  id=clone-repo-button data-web-item-key=com.atlassian.bitbucket.server.bitbucket-server-web-fragments:repository-clone  title=Clone this repository><span class="aui-icon icon-clone"></span><span class="aui-nav-item-label">Clone</span></a></li><li class=" create-branch"><a href="/plugins/servlet/create-branch/projects/COMPSCI2212_W2023/repos/group28" class="aui-nav-item "  data-web-item-key=com.atlassian.bitbucket.server.bitbucket-branch:create-branch-repository-action ><span class="aui-icon icon-create-branch"></span><span class="aui-nav-item-label">Create branch</span></a></li><li class=" create-pull-request"><a href="/projects/COMPSCI2212_W2023/repos/group28/pull-requests?create" class="aui-nav-item "  data-web-item-key=com.atlassian.bitbucket.server.bitbucket-server-web-fragments:repository-pull-request  title=Create a new pull request><span class="aui-icon icon-create-pull-request"></span><span class="aui-nav-item-label">Create pull request</span></a></li><li><a href="/projects/COMPSCI2212_W2023/repos/group28/compare" class="aui-nav-item "  id=repository-nav-compare data-web-item-key=com.atlassian.bitbucket.server.bitbucket-server-web-fragments:bitbucket.repository.nav.compare ><span class="aui-icon icon-compare"></span><span class="aui-nav-item-label">Compare</span></a></li><li class=" graphs-reports"><a href="/plugins/servlet/reports/COMPSCI2212_W2023/group28" class="aui-nav-item "  id=graphs-reports data-web-item-key=com.stiltsoft.stash.graphs:graphs.pull-requests.list.nav.reports  title=Reports><span class="aui-icon aui-icon-small icon-graph-reports"></span><span class="aui-nav-item-label">Reports</span></a></li></ul></div><aui-inline-dialog id="repo-clone-dialog" alignment="left top" data-aui-dom-container="body" data-aui-focus-selector=".clone-url-input"><div id="clone-repo-dialog-content"><div class="clone-url"><div class="aui-buttons"><button id="http-clone-url" class="aui-button repository-protocol"  data-module-key="http-clone-url" data-clone-url="https://repo.csd.uwo.ca/scm/compsci2212_w2023/group28.git" autocomplete="off" aria-disabled="true" disabled="disabled" >HTTP</button><input type="text" class="text quick-copy-text stash-text clone-url-input" readonly="readonly" spellcheck="false" value=""/></div><div id="clone-dialog-options"><!-- This is a client-web-panel --></div><div id="clone-dialog-help-info"><p><a target="_blank" href="https://www.atlassian.com/git/tutorials/setting-up-a-repository/git-clone?utm_campaign=learn-git-clone&amp;utm_medium=in-app-help&amp;utm_source=stash">Learn more about cloning repositories</a></p><p><div id="contributing-guidelines-clone-placeholder" class="hidden"></div></p></div></div><div class="sourcetree-panel"><a id="sourcetree-clone-button" class="aui-button aui-button-primary sourcetree-button"  href="sourcetree://cloneRepo/https://repo.csd.uwo.ca/scm/compsci2212_w2023/group28.git" autocomplete="off" tabindex="0">Clone in Sourcetree</a><p><a href="https://www.sourcetreeapp.com" target="_blank">Sourcetree</a> is a free Git and Mercurial client for Windows and Mac.</p></div></div></aui-inline-dialog><div class="aui-sidebar-group aui-sidebar-group-tier-one sidebar-navigation"><div class="aui-nav-heading"><strong>Navigation</strong></div><ul class="aui-nav"><li class="aui-nav-selected"><a href="/projects/COMPSCI2212_W2023/repos/group28/browse" class="aui-nav-item "  id=repository-nav-files data-web-item-key=com.atlassian.bitbucket.server.bitbucket-server-web-fragments:bitbucket.repository.nav.files ><span class="aui-icon icon-source"></span><span class="aui-nav-item-label">Source</span></a></li><li class=" commits-nav"><a href="/projects/COMPSCI2212_W2023/repos/group28/commits" class="aui-nav-item "  id=repository-nav-commits data-web-item-key=com.atlassian.bitbucket.server.bitbucket-server-web-fragments:bitbucket.repository.nav.commits ><span class="aui-icon icon-commits"></span><span class="aui-nav-item-label">Commits</span></a></li><li><a href="/plugins/servlet/graphs/activity/COMPSCI2212_W2023/group28" class="aui-nav-item "  id=repository-nav-graphs data-web-item-key=com.stiltsoft.stash.graphs:repository-nav-graphs ><span class="aui-icon icon-graph"></span><span class="aui-nav-item-label">Graphs</span></a></li><li><a href="/projects/COMPSCI2212_W2023/repos/group28/branches" class="aui-nav-item "  id=repository-nav-branches data-web-item-key=com.atlassian.bitbucket.server.bitbucket-server-web-fragments:bitbucket.repository.nav.branches ><span class="aui-icon icon-branches"></span><span class="aui-nav-item-label">Branches</span></a></li><li><a href="/projects/COMPSCI2212_W2023/repos/group28/pull-requests" class="aui-nav-item "  id=repository-nav-pull-requests data-web-item-key=com.atlassian.bitbucket.server.bitbucket-server-web-fragments:bitbucket.repository.nav.pull-requests ><span class="aui-icon icon-pull-requests"></span> <span class="aui-nav-item-label">Pull requests</span></a></li><li><a href="/projects/COMPSCI2212_W2023/repos/group28/builds" class="aui-nav-item "  id=repository-nav-builds data-web-item-key=com.atlassian.bitbucket.server.bitbucket-server-web-fragments:bitbucket.repository.nav.builds ><span class="aui-icon icon-builds"></span> <aui-badge class=" nav-onboarding-badge">New</aui-badge><span class="aui-nav-item-label">Builds</span></a></li></ul></div></div></nav></div><div class="aui-sidebar-footer"><button class="aui-button aui-button-subtle aui-sidebar-toggle aui-sidebar-footer-tipsy" title="Expand sidebar ( [ )" data-tooltip="Expand sidebar ( [ )"><span class="aui-icon aui-icon-small aui-iconfont-chevron-double-left"></span></button></div></div></section><div id="aui-page-panel-content-body" class="aui-page-panel content-body"  tabindex="-1"><div class="aui-page-panel-inner"><main role="main" id="main" class="aui-page-panel-content" ><div class="aui-page-header page-header-flex" ><div class="aui-page-header-inner"><div class="aui-page-header-main" ><ol class="aui-nav aui-nav-breadcrumbs repository-breadcrumbs"><li><a href="/projects/COMPSCI2212_W2023" title="COMPSCI 2212 - Winter 2023">COMPSCI 2212 - Winter 2023</a></li><li class="aui-nav-selected"><a href="/projects/COMPSCI2212_W2023/repos/group28/browse" title="group28">group28</a></li></ol><h2 class="page-panel-content-header">Source</h2></div></div></div><div class="aui-toolbar2 branch-selector-toolbar" role="toolbar"><div class="aui-toolbar2-inner"><div class="aui-toolbar2-primary"><div class="aui-group"><div class="aui-item"><div class="aui-buttons"><label for="repository-layout-revision-selector" class="assistive">Source branch</label><button type="button" id="repository-layout-revision-selector" data-aui-trigger aria-controls="inline-dialog-repository-layout-revision-selector-dialog" class="aui-button searchable-selector-trigger revision-reference-selector-trigger" title="master"><span class="aui-icon aui-icon-small aui-iconfont-branch">Branch</span><span class="name" title="master" data-id="refs/heads/master" data-revision-ref="{&quot;latestCommit&quot;:&quot;3b9e4c492086d78d4a32fed689d31a80f186ced8&quot;,&quot;isDefault&quot;:true,&quot;id&quot;:&quot;refs/heads/master&quot;,&quot;displayId&quot;:&quot;master&quot;,&quot;type&quot;:{&quot;name&quot;:&quot;Branch&quot;,&quot;id&quot;:&quot;branch&quot;}}">master</span></button><aui-inline-dialog id="inline-dialog-repository-layout-revision-selector-dialog" class="searchable-selector-dialog" alignment="bottom left" alignment-static data-aui-dom-container="body" role="region"></aui-inline-dialog><button id="branch-actions"  class=" aui-dropdown2-trigger aui-button aui-dropdown2-trigger-arrowless" aria-controls="branch-actions-menu" aria-haspopup="true" role="button" data-aui-trigger autocomplete="off" type="button"><span class="aui-icon aui-icon-small aui-iconfont-more">Branch actions</span></button></div></div><div class="aui-item"><div class="breadcrumbs" ><span class="file-path"><a href="/projects/COMPSCI2212_W2023/repos/group28/browse">group28</a><span class="sep">/</span><a href="/projects/COMPSCI2212_W2023/repos/group28/browse/westernUNav1">westernUNav1</a><span class="sep">/</span><a href="/projects/COMPSCI2212_W2023/repos/group28/browse/westernUNav1/src">src</a><span class="sep">/</span><a href="/projects/COMPSCI2212_W2023/repos/group28/browse/westernUNav1/src/main">main</a><span class="sep">/</span><a href="/projects/COMPSCI2212_W2023/repos/group28/browse/westernUNav1/src/main/java">java</a><span class="sep">/</span><a href="/projects/COMPSCI2212_W2023/repos/group28/browse/westernUNav1/src/main/java/com">com</a><span class="sep">/</span><a href="/projects/COMPSCI2212_W2023/repos/group28/browse/westernUNav1/src/main/java/com/mycompany">mycompany</a><span class="sep">/</span><a href="/projects/COMPSCI2212_W2023/repos/group28/browse/westernUNav1/src/main/java/com/mycompany/westernunav1">westernunav1</a></span><span class="sep">/</span><span class="stub">Room.java</span></div></div></div></div><div class="aui-toolbar2-secondary commit-badge-container"><div class="commit-badge-oneline"><div class="double-avatar-with-name avatar-with-name"><span class="aui-avatar aui-avatar-small user-avatar first-person" data-username="habudaqq"><span class="aui-avatar-inner"><img src="https://secure.gravatar.com/avatar/c445fb6ccc6410557f95ef8719f7e8d2.jpg?s=48&amp;d=mm" alt="habudaqq" /></span></span></div><span class="commit-details"><span class="commit-author" title="habudaqq">habudaqq</span> authored <a class="commitid" href="/projects/COMPSCI2212_W2023/repos/group28/commits/575b881de662ab33bf8264449a10eed3bb096a60" data-commit-message="Added Javadoc-style comments" data-commitid="575b881de662ab33bf8264449a10eed3bb096a60">575b881de66</a><time datetime="2023-04-09T02:12:47-0400" title="09 April 2023 02:12 AM">09 Apr 2023</time></span></div></div></div></div></main></div></div></section><!-- End #content --><!-- Start #footer --><footer id="footer" role="contentinfo"><section class="notifications"></section><section class="footer-body"><ul><li data-key="footer.license.message">Git repository management for enterprise teams powered by <a href="https://www.atlassian.com/software/bitbucket/">Atlassian Bitbucket</a></li></ul><ul><li>Atlassian Bitbucket <span title="352b195675e402f5574235a54489b1566dc01a6b" id="product-version" data-commitid="352b195675e402f5574235a54489b1566dc01a6b" data-system-build-number="352b195"> v8.9.7</span></li><li data-key="footer.links.documentation"><a href="https://docs.atlassian.com/bitbucketserver/docs-089/Bitbucket+Data+Center+and+Server+documentation?utm_campaign=in-app-help&amp;utm_medium=in-app-help&amp;utm_source=stash" target="_blank">Documentation</a></li><li data-key="footer.links.jac"><a href="https://jira.atlassian.com/browse/BSERV?utm_campaign=in-app-help&amp;utm_medium=in-app-help&amp;utm_source=stash" target="_blank">Request a feature</a></li><li data-key="footer.links.about"><a href="/about">About</a></li><li data-key="footer.links.contact.atlassian"><a href="https://www.atlassian.com/company/contact?utm_campaign=in-app-help&amp;utm_medium=in-app-help&amp;utm_source=stash" target="_blank">Contact Atlassian</a></li></ul>Generated by ff46d2de-27d1-4bfa-81da-70a30201208d. Cluster contains one node.<div id="footer-logo"><a href="https://www.atlassian.com/" target="_blank">Atlassian</a></div></section></footer><!-- End #footer --></div><script>require('bitbucket/internal/layout/base/base').onReady({id : 19587, active: true, name : "smehrava", slug : "smehrava", displayName : "Sara Mehravar", avatarUrl : "https:\/\/secure.gravatar.com\/avatar\/5b8e7b6f5399a68e344cb9bab607710c.jpg?s\x3d48\x26d\x3dmm", emailAddress : "smehrava@uwo.ca", type : "NORMAL"}, "Bitbucket" ); require('bitbucket/internal/widget/keyboard-shortcuts/keyboard-shortcuts').onReady();</script><script>require('bitbucket/internal/layout/repository/repository').onReady({"slug":"group28","id":4366,"name":"group28","hierarchyId":"46297ac42d19c7d86a97","scmId":"git","state":"AVAILABLE","statusMessage":"Available","forkable":false,"project":{"key":"COMPSCI2212_W2023","id":1897,"name":"COMPSCI 2212 - Winter 2023","public":false,"type":"NORMAL","links":{"self":[{"href":"https://repo.csd.uwo.ca/projects/COMPSCI2212_W2023"}]},"avatarUrl":"/projects/COMPSCI2212_W2023/avatar.png?s=64&v=1699606634034"},"public":false,"archived":false,"links":{"clone":[{"href":"https://repo.csd.uwo.ca/scm/compsci2212_w2023/group28.git","name":"http"},{"href":"ssh://git@repo.csd.uwo.ca:7999/compsci2212_w2023/group28.git","name":"ssh"}],"self":[{"href":"https://repo.csd.uwo.ca/projects/COMPSCI2212_W2023/repos/group28/browse"}]}}, '#clone-repo-button');</script><div id="branch-actions-menu" class="aui-dropdown2 aui-style-default" role="menu" hidden></div><script>require('bitbucket/internal/layout/branch/branch').onReady('#repository-layout-revision-selector');</script><script>require('bitbucket/internal/layout/files/files').onReady(["westernUNav1","src","main","java","com","mycompany","westernunav1","Room.java"],{"latestCommit":"3b9e4c492086d78d4a32fed689d31a80f186ced8","isDefault":true,"id":"refs/heads/master","displayId":"master","type":{"name":"Branch","id":"branch"}}, '.branch-selector-toolbar .breadcrumbs',false);</script><script>require('bitbucket/internal/page/source/source').onReady( "westernUNav1\/src\/main\/java\/com\/mycompany\/westernunav1\/Room.java",{"latestCommit":"3b9e4c492086d78d4a32fed689d31a80f186ced8","isDefault":true,"id":"refs/heads/master","displayId":"master","type":{"name":"Branch","id":"branch"}},{"id":"575b881de662ab33bf8264449a10eed3bb096a60","displayId":"575b881de66","author":{"name":"habudaqq","emailAddress":"habudaqq@uwo.ca","avatarUrl":"https://secure.gravatar.com/avatar/c445fb6ccc6410557f95ef8719f7e8d2.jpg?s=48&d=mm"},"authorTimestamp":1681020767000,"committer":{"name":"habudaqq","emailAddress":"habudaqq@uwo.ca","avatarUrl":"https://secure.gravatar.com/avatar/c445fb6ccc6410557f95ef8719f7e8d2.jpg?s=48&d=mm"},"committerTimestamp":1681020767000,"message":"Added Javadoc-style comments","parents":[{"id":"e189a8ebbdb3e32b79a083ecdf62d93796580206","displayId":"e189a8ebbdb"}],"properties":{"change":{"type":"MODIFY","path":"westernUNav1/src/main/java/com/mycompany/westernunav1/Room.java"}}}, "westernUNav1\/src\/main\/java\/com\/mycompany\/westernunav1\/Room.java","source", '#content .aui-page-panel-content', 'file-content',10,true,false,null);</script><script type="text/javascript">require('bitbucket/internal/layout/base/menu/repositories/recent').initMenu('repositories-menu-trigger');</script><script type="text/javascript"> require('bitbucket-plugin-awesome-graphs/recent-people').initMenu('#people-menu-trigger'); </script></body></html>