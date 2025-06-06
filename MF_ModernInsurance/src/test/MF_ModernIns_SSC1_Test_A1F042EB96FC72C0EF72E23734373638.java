/**@generated
 * WARNING � Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
/******************************************************************
* Licensed Materials - Property of IBM and/or HCL
* Copyright IBM Corporation 2013, 2017. All Rights Reserved.
* Copyright HCL Technologies Ltd. 2017, 2020.  All Rights Reserved.
* 
* U.S. Government Users Restricted Rights - Use, duplication or 
* disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
******************************************************************/
/* TestScript.template - Suitable for collaborative code generation */
package test;

import com.ibm.rational.test.lt.datacorrelation.execution.action.VariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataHarvester;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCArray;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataHarvester;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.DataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.IDataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.ISubRule;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.SubRule;
import com.ibm.rational.test.lt.datatransform.adapters.DataTransformAction;
import com.ibm.rational.test.lt.datatransform.adapters.IDataTransform;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.http.IBasicAuthentication;
import com.ibm.rational.test.lt.execution.http.IConnectionRecord;
import com.ibm.rational.test.lt.execution.http.IHTTPRequest;
import com.ibm.rational.test.lt.execution.http.IHTTPSessionTypes;
import com.ibm.rational.test.lt.execution.http.INtlmAuthenticationContext;
import com.ibm.rational.test.lt.execution.http.ISSLInfo;
import com.ibm.rational.test.lt.execution.http.connection.IConnectionLimitsAlgorithm;
import com.ibm.rational.test.lt.execution.http.impl.ConfigConnection;
import com.ibm.rational.test.lt.execution.http.impl.DynamicHTTPRequestsContainer;
import com.ibm.rational.test.lt.execution.http.impl.DynamicRequestContainer;
import com.ibm.rational.test.lt.execution.http.impl.HTTPAction;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPage;
import com.ibm.rational.test.lt.execution.http.impl.HTTPParallel;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPostData;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPostDataChunk;
import com.ibm.rational.test.lt.execution.http.impl.HTTPRequest;
import com.ibm.rational.test.lt.execution.http.impl.HTTPThink;
import com.ibm.rational.test.lt.execution.http.impl.INextActionGenerator;
import com.ibm.rational.test.lt.execution.http.impl.PerHostPortConnectionAlgorithm;
import com.ibm.rational.test.lt.execution.http.impl.RequestHeaderData;
import com.ibm.rational.test.lt.execution.http.tes.*;
import com.ibm.rational.test.lt.execution.http.util.ConnectionRecordFactory;
import com.ibm.rational.test.lt.execution.http.util.CookieCacheUtil;
import com.ibm.rational.test.lt.execution.http.util.HTTPDataArea;
import com.ibm.rational.test.lt.execution.http.util.PageCacheUtil;
import com.ibm.rational.test.lt.execution.http.vp.IHTTPStatusCodeVP;
import com.ibm.rational.test.lt.execution.http.vp.impl.HTTPStatusCodeVP;
import com.ibm.rational.test.lt.execution.protocol.IProxyServerInfo;
import com.ibm.rational.test.lt.execution.protocol.impl.HTTPTestScriptHelper;
import com.ibm.rational.test.lt.kernel.IDataArea;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.IKAction;
import com.ibm.rational.test.lt.kernel.action.IKTimeoutControl;
import com.ibm.rational.test.lt.kernel.action.impl.KAction;
import com.ibm.rational.test.lt.kernel.action.impl.KComment;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

@SuppressWarnings("all")
public class MF_ModernIns_SSC1_Test_A1F042EB96FC72C0EF72E23734373638 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPPostDataChunk");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPAction");
    }
	private IDataCorrelationVar[] dcVars = DataCorrelationVar.getArrayDCVars(77);
	private DataVar[] vars = new DataVar[2];
	
    
    
private HTTPTestScriptHelper httpTestScriptHelper;

	private HTTPTestScriptHelper getHTTPTest() {
		return httpTestScriptHelper;
	}

	
	public MF_ModernIns_SSC1_Test_A1F042EB96FC72C0EF72E23734373638(IContainer container, String invocationId) {
		super(container, "MF_ModernIns_SSC1", invocationId, "A1F042EB96FC72C0EF72E23734373638", "/MF_ModernInsurance/MF_ModernIns_SSC1.testsuite", "C:/Users/donald.weber/HCL/devopstest/workspace_new/MF_ModernInsurance/MF_ModernIns_SSC1.testsuite");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		this.httpTestScriptHelper = new HTTPTestScriptHelper(this);
        setTimeoutDuration(240000);
        setTimeoutScheme(IKTimeoutControl.CONTINUE);

	}

    public void execute() {
    	try {
				CookieCacheUtil.clearCookieCache((ITestExecutionServices)this);
	PageCacheUtil.clearPageCache((ITestExecutionServices)this);
	PageCacheUtil.setCacheEmulation((ITestExecutionServices)this, true);

	    		if (!isScheduleRun()) setThinkMax(120000);
	
	if (!isScheduleRun() && !isCompoundTestRun()){
this.addEventBehavior(new RPTEventStructure(new HTTPPageTitleVPEvent(), new RPTContinueEvent("Page title verification failed"), 1, "Page title verification failed"));
	this.addEventBehavior(new RPTEventStructure(new HTTPResponseCodeVPEvent(), new RPTContinueEvent("Response code verification failed"), 1, "Response code verification failed"));
	this.addEventBehavior(new RPTEventStructure(new HTTPResponseSizeVPEvent(), new RPTContinueEvent("Response size verification failed"), 1, "Response size verification failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTFailVPEvent(), new RPTContinueEvent("Content Verification Point failed"), 1, "Content Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), new RPTContinueEvent("Connection failed"), 1, "Connection failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), new RPTContinueEvent("Authentication failed"), 1, "Authentication failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(), new RPTStopUserEvent("End of dataset reached"), 1, "End of dataset reached"));
	this.addEventBehavior(new RPTEventStructure(new RPTTestVerdictFailedEvent(), new RPTContinueEvent("Test verdict was set to fail"), 2, "Test verdict was set to fail"));
	this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), new RPTContinueEvent("Failed to extract reference"), 1, "Failed to extract reference"));
	this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), new RPTContinueEvent("Substitution failed"), 1, "Substitution failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), new RPTContinueEvent("Timeout"), 1, "Timeout"));
	this.addEventBehavior(new RPTEventStructure(new RPTDroppedConnectionEvent(), new RPTContinueEvent("Server dropped connection"), 1, "Server dropped connection"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), new RPTContinueEvent("Custom Verification Point failed"), 1, "Custom Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeAlertEvent(), new RPTContinueEvent("Custom Code reported an Alert"), 0, "Custom Code reported an Alert"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(), new RPTStopUserEvent("Custom Code reported an unhandled exception"), 1, "Custom Code reported an unhandled exception"));
	}
	
	
	              this.add(dataTransform(this)); /* GENERIC CREATE TEMPLATE */

      this.add(varAction_1(this)); /* GENERIC CREATE TEMPLATE */

      this.add(confCon_1(this)); /* GENERIC CREATE TEMPLATE */

      this.add(page_1(this)); /* GENERIC CREATE TEMPLATE */

      this.add(comment_1(this)); /* GENERIC CREATE TEMPLATE */

      this.add(page_2(this)); /* GENERIC CREATE TEMPLATE */

      this.add(page_3(this)); /* GENERIC CREATE TEMPLATE */

      this.add(comment_2(this)); /* GENERIC CREATE TEMPLATE */

      this.add(page_4(this)); /* GENERIC CREATE TEMPLATE */

      this.add(comment_3(this)); /* GENERIC CREATE TEMPLATE */

      this.add(page_5(this)); /* GENERIC CREATE TEMPLATE */

      this.add(page_6(this)); /* GENERIC CREATE TEMPLATE */

			this.httpTestScriptHelper.executeHelper();

	    } catch (Throwable e) {
		     log("Test Execution: MF_ModernIns_SSC1_Test_A1F042EB96FC72C0EF72E23734373638 ",e);
	    } finally {
	        super.execute();
		}	    
    }
    
	public void preFinish() {
		this.httpTestScriptHelper.preFinishHelper();

		super.preFinish();
	}
	
	public void stop() {
		
		super.stop();
	}	
	
	private KAction dataTransform(IContainer parent) {
		DataTransformAction action = 
			new DataTransformAction(parent, "Data Transform Action");

		action.setMapFile("A1F042EB96FC72C0EF72E23734373638");

		// Control file contains transforms 
		// com.ibm.rational.test.lt.datatransform.adapters.impl.XMLAdapterVERSION_0
		// com.ibm.rational.test.lt.datatransform.adapters.impl.JsonAdapterVERSION_0

		return action;
	}
private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1F042EB96FC72DEEF72E23734373638");	
			vars[0] = new DataVar("MF_ModernIns_SSC1_Host", "dp1-ap-51794357.prod.hclpnp.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[1] = new DataVar("MF_ModernIns_SSC1_Host_Port", "9082", IDataArea.TEST, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}

	private IKAction confCon_1(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_1",
					(String)(vars[0].getValue()== null?"dp1-ap-51794357.prod.hclpnp.com": (String)vars[0].getValue()),  // host name
					Integer.parseInt((String)(vars[1].getValue()== null?"9082": (String)vars[1].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"dp1-ap-51794357.prod.hclpnp.com",  // unsubstituted host name
					Integer.parseInt((String)("9082")) 
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}

private HTTPPage page_1(final IContainer parent) {
			HTTPThink think = new HTTPThink(0, 1, parent, parent, "A1F042EB9711A878EF72E23734373638");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "ModernizedInsuranceApp", "A1F042EB9711A878EF72E23734373638") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(6, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_1(this, true, "A1F042EB9711A870EF72E23734373638", false, true,
						"Config_1", "ModernizedInsuranceApp",	"/ModernizedInsuranceApp", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_2(this, false, "A1F042EB9711A870EF72E23734373638", false, false,
						"Config_1", "whitetheme.css",	"/ModernizedInsuranceApp/common/stylesheets/whitetheme.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_3(this, false, "A1F042EB9718D460EF72E23734373638", false, false,
						"Config_1", "reverseVideoBlack.css",	"/ModernizedInsuranceApp/common/stylesheets/reverseVideoBlack.css", true, false), 9, 100, "A1F042EB9711A886EF72E23734373638", 2);
				httpParallel.addRequest(2, request_4(this, false, "A1F042EB9718D4BFEF72E23734373638", false, false,
						"Config_1", "env.js",	"/ModernizedInsuranceApp/common/env.js", true, false), 11, 100, "A1F042EB9711A886EF72E23734373638", 2);
				httpParallel.addRequest(3, request_5(this, false, "A1F042EB9718D51EEF72E23734373638", false, false,
						"Config_1", "workAround.css",	"/ModernizedInsuranceApp/common/InsuranceCustom/css/workAround.css", true, false), 11, 100, "A1F042EB9711A886EF72E23734373638", 2);
				httpParallel.addRequest(4, request_6(this, false, "A1F042EB97207580EF72E23734373638", false, false,
						"Config_1", "login.css",	"/ModernizedInsuranceApp/common/InsuranceCustom/css/login.css", true, false), 11, 100, "A1F042EB9711A886EF72E23734373638", 2);
				httpParallel.addRequest(5, request_7(this, false, "A1F042EB972075E3EF72E23734373638", false, false,
						"Config_1", "bootstrap.css",	"/ModernizedInsuranceApp/common/InsuranceCustom/bootstrap/css/bootstrap.css", true, false), 11, 100, "A1F042EB9711A886EF72E23734373638", 2);
				httpParallel.addRequest(0, request_8(this, false, "A1F042EB9711A870EF72E23734373638", false, false,
						"Config_1", "lxgwfunctions.js",	"/ModernizedInsuranceApp/common/lxgwfunctions.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_9(this, false, "A1F042EB9718D460EF72E23734373638", false, false,
						"Config_1", "commontheme.css",	"/ModernizedInsuranceApp/common/stylesheets/commontheme.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_10(this, false, "A1F042EB9718D4BFEF72E23734373638", false, false,
						"Config_1", "calendar.css",	"/ModernizedInsuranceApp/common/stylesheets/calendar.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_11(this, false, "A1F042EB97207580EF72E23734373638", false, false,
						"Config_1", "KBS_GeneralIns.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/KBS_GeneralIns.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_12(this, false, "A1F042EB9718D51EEF72E23734373638", false, false,
						"Config_1", "HatsJS.js",	"/ModernizedInsuranceApp/common/HatsJS.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_13(this, false, "A1F042EB9718D460EF72E23734373638", false, false,
						"Config_1", "jquery.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/jquery/jquery.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_14(this, false, "A1F042EB9718D4BFEF72E23734373638", false, false,
						"Config_1", "bootstrap.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/bootstrap/js/bootstrap.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_15(this, false, "A1F042EB9718D51EEF72E23734373638", false, false,
						"Config_1", "KBS.js",	"/ModernizedInsuranceApp/common/KBS.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_16(this, false, "A1F042EB97207580EF72E23734373638", false, false,
						"Config_1", "HCL_LOGO_vectorial.png",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/HCL_LOGO_vectorial.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_17(this, false, "A1F042EB9711A870EF72E23734373638", false, false,
						"Config_1", "hcl_software_logo.png",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/hcl_software_logo.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_18(this, false, "A1F042EB9718D51EEF72E23734373638", false, false,
						"Config_1", "generalIns-loader.gif",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/generalIns-loader.gif", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_19(this, false, "A1F042EB97207580EF72E23734373638", false, false,
						"Config_1", "login_button_blue.png",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/login_button_blue.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_20(this, false, "A1F042EB972075E3EF72E23734373638", false, false,
						"Config_1", "cancel.png",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/cancel.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_21(this, false, "A1F042EB9711A870EF72E23734373638", false, false,
						"Config_1", "common_script_gi.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/common_script_gi.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_22(this, false, "A1F042EB9718D4BFEF72E23734373638", false, false,
						"Config_1", "validation_gi.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/validation_gi.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_23(this, false, "A1F042EB9718D460EF72E23734373638", false, false,
						"Config_1", "top_bar.png",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/top_bar.png", true, false), 52, 100, "A1F042EB97250960EF72E23734373638", 3);
				httpParallel.addRequest(3, request_24(this, false, "A1F042EB9718D51EEF72E23734373638", false, false,
						"Config_1", "login_background.png",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/login_background.png", true, false), 256, 100, "A1F042EB973FBD50EF72E23734373638", 3);
				httpParallel.addRequest(2, request_25(this, false, "A1F042EB9718D4BFEF72E23734373638", false, false,
						"Config_1", "glyphicons-halflings-regular.woff2",	"/ModernizedInsuranceApp/common/InsuranceCustom/bootstrap/fonts/glyphicons-halflings-regular.woff2", true, false), 321, 100, "A1F042EB973FBEBCEF72E23734373638", 3);
				httpParallel.addRequest(1, request_26(this, false, "A1F042EB9718D460EF72E23734373638", false, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223848908", true, false), 3, 100, "A1F042EB973FBF72EF72E23734373638", 3);
				httpParallel.addRequest(2, request_27(this, false, "A1F042EB9718D4BFEF72E23734373638", false, false,
						"Config_1", "hclsoftwareicon.ico",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/hclsoftwareicon.ico", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_1(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB9711A886EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_1 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_1);

	harvestContainer_1.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[0], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[1], ";jsessionid=(.*?)\"", 1, 1, 0, 0, false, "jsessionid_11", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[2], "<[[^>].]*?NAME=\"PERF_TIMESTAMP\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[3], "<[[^>].]*?NAME=\"HatsCSRF\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_2", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[4], "<[[^>].]*?NAME=\"CURSORPOSITION\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_3", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[5], "<[[^>].]*?NAME=\"KeyboardToggle\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_4", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[6], "<[[^>].]*?NAME=\"SESSIONID\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_5", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[7], "<[[^>].]*?NAME=\"CARETPOS\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_6", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[8], "<[[^>].]*?NAME=\"LINESIZE\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_7", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[9], "\\?heartBeat=(.*?)&", 1, 1, 0, 0, false, "heartBeat_50", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[10], "<[[^>].]*?name=\"password\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value", null, 0, false);
	IDataSub subContainer_1 = new DataSub();
	reqAction.addDataSub(subContainer_1);

		ISubRule sub_0 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_394", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
		ISubRule sub_1 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_393", null, 0, false);
	subContainer_1.addSubInstruction(sub_1);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB9711A889EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_2(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97168A70EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_2 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_2);

	harvestContainer_2.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[11], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_2", null, 0, false);
	IDataSub subContainer_2 = new DataSub();
	reqAction.addDataSub(subContainer_2);

		ISubRule sub_2 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_392", null, 0, false);
	subContainer_2.addSubInstruction(sub_2);
		ISubRule sub_3 = new SubRule("req_hdr_Referer_1", 0, 66, false, (IDCCoreVar)dcVars[0], false, "Referer_196", null, 0, false);
	subContainer_2.addSubInstruction(sub_3);
		ISubRule sub_4 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_391", null, 0, false);
	subContainer_2.addSubInstruction(sub_4);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97168A73EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_3(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB9718D468EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_3 = new DataSub();
	reqAction.addDataSub(subContainer_3);

		ISubRule sub_5 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_390", null, 0, false);
	subContainer_3.addSubInstruction(sub_5);
		ISubRule sub_6 = new SubRule("req_hdr_Referer_1", 0, 66, false, (IDCCoreVar)dcVars[0], false, "Referer_195", null, 0, false);
	subContainer_3.addSubInstruction(sub_6);
		ISubRule sub_7 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_389", null, 0, false);
	subContainer_3.addSubInstruction(sub_7);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB9718D46BEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_4(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB9718D4C7EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_4 = new DataSub();
	reqAction.addDataSub(subContainer_4);

		ISubRule sub_8 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_388", null, 0, false);
	subContainer_4.addSubInstruction(sub_8);
		ISubRule sub_9 = new SubRule("req_hdr_Referer_1", 0, 66, false, (IDCCoreVar)dcVars[0], false, "Referer_194", null, 0, false);
	subContainer_4.addSubInstruction(sub_9);
		ISubRule sub_10 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_387", null, 0, false);
	subContainer_4.addSubInstruction(sub_10);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB9718D4CAEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_5(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB9718D526EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_5 = new DataSub();
	reqAction.addDataSub(subContainer_5);

		ISubRule sub_11 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_386", null, 0, false);
	subContainer_5.addSubInstruction(sub_11);
		ISubRule sub_12 = new SubRule("req_hdr_Referer_1", 0, 66, false, (IDCCoreVar)dcVars[0], false, "Referer_193", null, 0, false);
	subContainer_5.addSubInstruction(sub_12);
		ISubRule sub_13 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_385", null, 0, false);
	subContainer_5.addSubInstruction(sub_13);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB9718D529EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_6(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97207588EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_6 = new DataSub();
	reqAction.addDataSub(subContainer_6);

		ISubRule sub_14 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_384", null, 0, false);
	subContainer_6.addSubInstruction(sub_14);
		ISubRule sub_15 = new SubRule("req_hdr_Referer_1", 0, 66, false, (IDCCoreVar)dcVars[0], false, "Referer_192", null, 0, false);
	subContainer_6.addSubInstruction(sub_15);
		ISubRule sub_16 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_383", null, 0, false);
	subContainer_6.addSubInstruction(sub_16);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB9720758BEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_7(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB972075EBEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_3 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_3);

	harvestContainer_3.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[12], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_3", null, 0, false);
	IDataSub subContainer_7 = new DataSub();
	reqAction.addDataSub(subContainer_7);

		ISubRule sub_17 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_382", null, 0, false);
	subContainer_7.addSubInstruction(sub_17);
		ISubRule sub_18 = new SubRule("req_hdr_Referer_1", 0, 66, false, (IDCCoreVar)dcVars[0], false, "Referer_191", null, 0, false);
	subContainer_7.addSubInstruction(sub_18);
		ISubRule sub_19 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_381", null, 0, false);
	subContainer_7.addSubInstruction(sub_19);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB972075EEEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_8(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97207646EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_8 = new DataSub();
	reqAction.addDataSub(subContainer_8);

		ISubRule sub_20 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_380", null, 0, false);
	subContainer_8.addSubInstruction(sub_20);
		ISubRule sub_21 = new SubRule("req_hdr_Referer_1", 0, 66, false, (IDCCoreVar)dcVars[0], false, "Referer_190", null, 0, false);
	subContainer_8.addSubInstruction(sub_21);
		ISubRule sub_22 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_379", null, 0, false);
	subContainer_8.addSubInstruction(sub_22);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97207649EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_9(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB9720769DEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/common/stylesheets/whitetheme.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_9 = new DataSub();
	reqAction.addDataSub(subContainer_9);

		ISubRule sub_23 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_378", null, 0, false);
	subContainer_9.addSubInstruction(sub_23);
		ISubRule sub_24 = new SubRule("req_hdr_Referer_1", 0, 100, false, (IDCCoreVar)dcVars[11], false, "Referer_189", null, 0, false);
	subContainer_9.addSubInstruction(sub_24);
		ISubRule sub_25 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_377", null, 0, false);
	subContainer_9.addSubInstruction(sub_25);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97168A70EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB972076A0EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_10(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB972076F4EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/common/stylesheets/whitetheme.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_10 = new DataSub();
	reqAction.addDataSub(subContainer_10);

		ISubRule sub_26 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_376", null, 0, false);
	subContainer_10.addSubInstruction(sub_26);
		ISubRule sub_27 = new SubRule("req_hdr_Referer_1", 0, 100, false, (IDCCoreVar)dcVars[11], false, "Referer_188", null, 0, false);
	subContainer_10.addSubInstruction(sub_27);
		ISubRule sub_28 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_375", null, 0, false);
	subContainer_10.addSubInstruction(sub_28);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97168A70EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB972076F7EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_11(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB9720774BEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_11 = new DataSub();
	reqAction.addDataSub(subContainer_11);

		ISubRule sub_29 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_374", null, 0, false);
	subContainer_11.addSubInstruction(sub_29);
		ISubRule sub_30 = new SubRule("req_hdr_Referer_1", 0, 66, false, (IDCCoreVar)dcVars[0], false, "Referer_187", null, 0, false);
	subContainer_11.addSubInstruction(sub_30);
		ISubRule sub_31 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_373", null, 0, false);
	subContainer_11.addSubInstruction(sub_31);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB9720774EEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_12(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB972077A6EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_12 = new DataSub();
	reqAction.addDataSub(subContainer_12);

		ISubRule sub_32 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_372", null, 0, false);
	subContainer_12.addSubInstruction(sub_32);
		ISubRule sub_33 = new SubRule("req_hdr_Referer_1", 0, 66, false, (IDCCoreVar)dcVars[0], false, "Referer_186", null, 0, false);
	subContainer_12.addSubInstruction(sub_33);
		ISubRule sub_34 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_371", null, 0, false);
	subContainer_12.addSubInstruction(sub_34);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB972077A9EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_13(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97250960EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_13 = new DataSub();
	reqAction.addDataSub(subContainer_13);

		ISubRule sub_35 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_370", null, 0, false);
	subContainer_13.addSubInstruction(sub_35);
		ISubRule sub_36 = new SubRule("req_hdr_Referer_1", 0, 66, false, (IDCCoreVar)dcVars[0], false, "Referer_185", null, 0, false);
	subContainer_13.addSubInstruction(sub_36);
		ISubRule sub_37 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_369", null, 0, false);
	subContainer_13.addSubInstruction(sub_37);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97250963EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_14(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB972509BBEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_14 = new DataSub();
	reqAction.addDataSub(subContainer_14);

		ISubRule sub_38 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_368", null, 0, false);
	subContainer_14.addSubInstruction(sub_38);
		ISubRule sub_39 = new SubRule("req_hdr_Referer_1", 0, 66, false, (IDCCoreVar)dcVars[0], false, "Referer_184", null, 0, false);
	subContainer_14.addSubInstruction(sub_39);
		ISubRule sub_40 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_367", null, 0, false);
	subContainer_14.addSubInstruction(sub_40);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB972509BEEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_15(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97250A16EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_15 = new DataSub();
	reqAction.addDataSub(subContainer_15);

		ISubRule sub_41 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_366", null, 0, false);
	subContainer_15.addSubInstruction(sub_41);
		ISubRule sub_42 = new SubRule("req_hdr_Referer_1", 0, 66, false, (IDCCoreVar)dcVars[0], false, "Referer_183", null, 0, false);
	subContainer_15.addSubInstruction(sub_42);
		ISubRule sub_43 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_365", null, 0, false);
	subContainer_15.addSubInstruction(sub_43);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97250A19EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_16(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97250A6DEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_16 = new DataSub();
	reqAction.addDataSub(subContainer_16);

		ISubRule sub_44 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_364", null, 0, false);
	subContainer_16.addSubInstruction(sub_44);
		ISubRule sub_45 = new SubRule("req_hdr_Referer_1", 0, 66, false, (IDCCoreVar)dcVars[0], false, "Referer_182", null, 0, false);
	subContainer_16.addSubInstruction(sub_45);
		ISubRule sub_46 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_363", null, 0, false);
	subContainer_16.addSubInstruction(sub_46);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97250A70EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_17(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97277A60EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_17 = new DataSub();
	reqAction.addDataSub(subContainer_17);

		ISubRule sub_47 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_362", null, 0, false);
	subContainer_17.addSubInstruction(sub_47);
		ISubRule sub_48 = new SubRule("req_hdr_Referer_1", 0, 66, false, (IDCCoreVar)dcVars[0], false, "Referer_181", null, 0, false);
	subContainer_17.addSubInstruction(sub_48);
		ISubRule sub_49 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_361", null, 0, false);
	subContainer_17.addSubInstruction(sub_49);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97277A63EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_18(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB973FBD50EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_18 = new DataSub();
	reqAction.addDataSub(subContainer_18);

		ISubRule sub_50 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_360", null, 0, false);
	subContainer_18.addSubInstruction(sub_50);
		ISubRule sub_51 = new SubRule("req_hdr_Referer_1", 0, 66, false, (IDCCoreVar)dcVars[0], false, "Referer_180", null, 0, false);
	subContainer_18.addSubInstruction(sub_51);
		ISubRule sub_52 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_359", null, 0, false);
	subContainer_18.addSubInstruction(sub_52);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB973FBD53EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_19(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB973FBDABEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_19 = new DataSub();
	reqAction.addDataSub(subContainer_19);

		ISubRule sub_53 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_358", null, 0, false);
	subContainer_19.addSubInstruction(sub_53);
		ISubRule sub_54 = new SubRule("req_hdr_Referer_1", 0, 66, false, (IDCCoreVar)dcVars[0], false, "Referer_179", null, 0, false);
	subContainer_19.addSubInstruction(sub_54);
		ISubRule sub_55 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_357", null, 0, false);
	subContainer_19.addSubInstruction(sub_55);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB973FBDAEEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_20(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB973FBE06EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_20 = new DataSub();
	reqAction.addDataSub(subContainer_20);

		ISubRule sub_56 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_356", null, 0, false);
	subContainer_20.addSubInstruction(sub_56);
		ISubRule sub_57 = new SubRule("req_hdr_Referer_1", 0, 66, false, (IDCCoreVar)dcVars[0], false, "Referer_178", null, 0, false);
	subContainer_20.addSubInstruction(sub_57);
		ISubRule sub_58 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_355", null, 0, false);
	subContainer_20.addSubInstruction(sub_58);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB973FBE09EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_21(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB973FBE61EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_21 = new DataSub();
	reqAction.addDataSub(subContainer_21);

		ISubRule sub_59 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_354", null, 0, false);
	subContainer_21.addSubInstruction(sub_59);
		ISubRule sub_60 = new SubRule("req_hdr_Referer_1", 0, 66, false, (IDCCoreVar)dcVars[0], false, "Referer_177", null, 0, false);
	subContainer_21.addSubInstruction(sub_60);
		ISubRule sub_61 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_353", null, 0, false);
	subContainer_21.addSubInstruction(sub_61);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB973FBE64EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_22(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB973FBEBCEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_22 = new DataSub();
	reqAction.addDataSub(subContainer_22);

		ISubRule sub_62 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_352", null, 0, false);
	subContainer_22.addSubInstruction(sub_62);
		ISubRule sub_63 = new SubRule("req_hdr_Referer_1", 0, 66, false, (IDCCoreVar)dcVars[0], false, "Referer_176", null, 0, false);
	subContainer_22.addSubInstruction(sub_63);
		ISubRule sub_64 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_351", null, 0, false);
	subContainer_22.addSubInstruction(sub_64);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB973FBEBFEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_23(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB973FBF17EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_23 = new DataSub();
	reqAction.addDataSub(subContainer_23);

		ISubRule sub_65 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_350", null, 0, false);
	subContainer_23.addSubInstruction(sub_65);
		ISubRule sub_66 = new SubRule("req_hdr_Referer_1", 0, 66, false, (IDCCoreVar)dcVars[0], false, "Referer_175", null, 0, false);
	subContainer_23.addSubInstruction(sub_66);
		ISubRule sub_67 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_349", null, 0, false);
	subContainer_23.addSubInstruction(sub_67);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB973FBF1AEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_24(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB973FBF72EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_24 = new DataSub();
	reqAction.addDataSub(subContainer_24);

		ISubRule sub_68 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_348", null, 0, false);
	subContainer_24.addSubInstruction(sub_68);
		ISubRule sub_69 = new SubRule("req_hdr_Referer_1", 0, 66, false, (IDCCoreVar)dcVars[0], false, "Referer_174", null, 0, false);
	subContainer_24.addSubInstruction(sub_69);
		ISubRule sub_70 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_347", null, 0, false);
	subContainer_24.addSubInstruction(sub_70);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB973FBF75EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_25(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97427C97EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "http://dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/common/InsuranceCustom/bootstrap/css/bootstrap.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_25 = new DataSub();
	reqAction.addDataSub(subContainer_25);

		ISubRule sub_71 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_346", null, 0, false);
	subContainer_25.addSubInstruction(sub_71);
		ISubRule sub_72 = new SubRule("req_hdr_Referer_1", 0, 117, false, (IDCCoreVar)dcVars[12], false, "Referer_173", null, 0, false);
	subContainer_25.addSubInstruction(sub_72);
		ISubRule sub_73 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_345", null, 0, false);
	subContainer_25.addSubInstruction(sub_73);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB972075EBEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97427C9AEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_26(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97449F60EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_26 = new DataSub();
	reqAction.addDataSub(subContainer_26);

		ISubRule sub_74 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[9], false, "heartBeat", null, 0, false);
	subContainer_26.addSubInstruction(sub_74);
		ISubRule sub_75 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_344", null, 0, false);
	subContainer_26.addSubInstruction(sub_75);
		ISubRule sub_76 = new SubRule("req_hdr_Referer_1", 0, 66, false, (IDCCoreVar)dcVars[0], false, "Referer_172", null, 0, false);
	subContainer_26.addSubInstruction(sub_76);
		ISubRule sub_77 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_343", null, 0, false);
	subContainer_26.addSubInstruction(sub_77);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97449F63EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_27(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97449FB7EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_27 = new DataSub();
	reqAction.addDataSub(subContainer_27);

		ISubRule sub_78 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_342", null, 0, false);
	subContainer_27.addSubInstruction(sub_78);
		ISubRule sub_79 = new SubRule("req_hdr_Referer_1", 0, 66, false, (IDCCoreVar)dcVars[0], false, "Referer_171", null, 0, false);
	subContainer_27.addSubInstruction(sub_79);
		ISubRule sub_80 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_341", null, 0, false);
	subContainer_27.addSubInstruction(sub_80);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9711A886EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97449FBAEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	private KComment comment_1(final IContainer parent) {
		return new KComment(parent, "comment_1", "A1F042EB9744A012EF72E23734373638", "Login Page") ;
	}
private HTTPPage page_2(final IContainer parent) {
			HTTPThink think = new HTTPThink(3448, 1, parent, parent, "A1F042EB9744A016EF72E23734373638");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "ModernizedInsuranceApp_asynch", "A1F042EB9744A016EF72E23734373638") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_28(this, true, "A1F042EB9718D4BFEF72E23734373638", false, true,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{1}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223853913", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_28(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB9744A01AEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_28 = new DataSub();
	reqAction.addDataSub(subContainer_28);

		ISubRule sub_81 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[9], false, "heartBeat", null, 0, false);
	subContainer_28.addSubInstruction(sub_81);
		ISubRule sub_82 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_340", null, 0, false);
	subContainer_28.addSubInstruction(sub_82);
		ISubRule sub_83 = new SubRule("req_hdr_Referer_1", 0, 66, false, (IDCCoreVar)dcVars[0], false, "Referer_170", null, 0, false);
	subContainer_28.addSubInstruction(sub_83);
		ISubRule sub_84 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_339", null, 0, false);
	subContainer_28.addSubInstruction(sub_84);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB9744A01DEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
private HTTPPage page_3(final IContainer parent) {
			HTTPThink think = new HTTPThink(3012, 1, parent, parent, "A1F042EB9750AD48EF72E23734373638");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "ModernizedInsuranceApp {1}", "A1F042EB9750AD48EF72E23734373638") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(6, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_29(this, true, "A1F042EB9718D4BFEF72E23734373638", false, true,
						"Config_1", "entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6",	"/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_30(this, false, "A1F042EB9718D460EF72E23734373638", false, false,
						"Config_1", "GeneralInstheme.css",	"/ModernizedInsuranceApp/common/InsuranceCustom/css/GeneralInstheme.css", true, false), 9, 100, "A1F042EB9750AD4CEF72E23734373638", 2);
				httpParallel.addRequest(2, request_31(this, false, "A1F042EB9718D51EEF72E23734373638", false, false,
						"Config_1", "shim.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/shim.js", true, false), 9, 100, "A1F042EB9750AD4CEF72E23734373638", 2);
				httpParallel.addRequest(3, request_32(this, false, "A1F042EB9711A870EF72E23734373638", false, false,
						"Config_1", "lxgwfunctions_GeneralIns.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/lxgwfunctions_GeneralIns.js", true, false), 10, 100, "A1F042EB9750AD4CEF72E23734373638", 2);
				httpParallel.addRequest(4, request_33(this, false, "A1F042EB972075E3EF72E23734373638", false, false,
						"Config_1", "font-awesome.css",	"/ModernizedInsuranceApp/common/InsuranceCustom/font-awesome/css/font-awesome.css", true, false), 10, 100, "A1F042EB9750AD4CEF72E23734373638", 2);
				httpParallel.addRequest(5, request_34(this, false, "A1F042EB97207580EF72E23734373638", false, false,
						"Config_1", "ionicons.css",	"/ModernizedInsuranceApp/common/InsuranceCustom/Ionicons/css/ionicons.css", true, false), 11, 100, "A1F042EB9750AD4CEF72E23734373638", 2);
				httpParallel.addRequest(0, request_35(this, false, "A1F042EB9718D4BFEF72E23734373638", false, false,
						"Config_1", "CustomTemplate.css",	"/ModernizedInsuranceApp/common/InsuranceCustom/css/CustomTemplate.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_36(this, false, "A1F042EB9718D51EEF72E23734373638", false, false,
						"Config_1", "custom-skin.css",	"/ModernizedInsuranceApp/common/InsuranceCustom/css/custom-skin.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_37(this, false, "A1F042EB9718D460EF72E23734373638", false, false,
						"Config_1", "datatables.min.css",	"/ModernizedInsuranceApp/common/InsuranceCustom/plugins/datatables/datatables.min.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_38(this, false, "A1F042EB972075E3EF72E23734373638", false, false,
						"Config_1", "buttons.dataTables.min.css",	"/ModernizedInsuranceApp/common/InsuranceCustom/plugins/datatables/buttons.dataTables.min.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_39(this, false, "A1F042EB9711A870EF72E23734373638", false, false,
						"Config_1", "HCL_GeneralIns_CustomCSS.css",	"/ModernizedInsuranceApp/common/InsuranceCustom/css/HCL_GeneralIns_CustomCSS.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_40(this, false, "A1F042EB9718D4BFEF72E23734373638", false, false,
						"Config_1", "bootstrap-datepicker.css",	"/ModernizedInsuranceApp/common/InsuranceCustom/bootstrap-datepicker/css/bootstrap-datepicker.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_41(this, false, "A1F042EB9718D51EEF72E23734373638", false, false,
						"Config_1", "select2.min.css",	"/ModernizedInsuranceApp/common/InsuranceCustom/css/select2.min.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_42(this, false, "A1F042EB9718D460EF72E23734373638", false, false,
						"Config_1", "Cart.png",	"/ModernizedInsuranceApp/common/images/icons/Cart.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_43(this, false, "A1F042EB972075E3EF72E23734373638", false, false,
						"Config_1", "Setting.png",	"/ModernizedInsuranceApp/common/images/icons/Setting.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_44(this, false, "A1F042EB9718D4BFEF72E23734373638", false, false,
						"Config_1", "help.png",	"/ModernizedInsuranceApp/common/images/icons/help.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_45(this, false, "A1F042EB9711A870EF72E23734373638", false, false,
						"Config_1", "user.png",	"/ModernizedInsuranceApp/common/images/icons/user.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_46(this, false, "A1F042EB9718D51EEF72E23734373638", false, false,
						"Config_1", "white.png",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/white.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_47(this, false, "A1F042EB97207580EF72E23734373638", false, false,
						"Config_1", "iPadConfig.css",	"/ModernizedInsuranceApp/common/InsuranceCustom/css/iPadConfig.css", true, false), 15, 100, "A1F042EB975A7381EF72E23734373638", 3);
				httpParallel.addRequest(1, request_48(this, false, "A1F042EB9718D460EF72E23734373638", false, false,
						"Config_1", "app-webservice.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/app-webservice.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_49(this, false, "A1F042EB972075E3EF72E23734373638", false, false,
						"Config_1", "fontawesome-webfont.woff2",	"/ModernizedInsuranceApp/common/InsuranceCustom/font-awesome/fonts/fontawesome-webfont.woff2?v=4.7.0", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_50(this, false, "A1F042EB9718D4BFEF72E23734373638", false, false,
						"Config_1", "contact%20icon@2x.webp",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/left_panel_icons/contact%20icon@2x.webp", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_51(this, false, "A1F042EB9711A870EF72E23734373638", false, false,
						"Config_1", "policy@2x.webp",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/left_panel_icons/policy@2x.webp", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_52(this, false, "A1F042EB97207580EF72E23734373638", false, false,
						"Config_1", "comissionnew%20use%20this@1.5x.webp",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/left_panel_icons/comissionnew%20use%20this@1.5x.webp", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_53(this, false, "A1F042EB9718D51EEF72E23734373638", false, false,
						"Config_1", "softwarelogo_white.svg",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/softwarelogo_white.svg", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_54(this, false, "A1F042EB9718D460EF72E23734373638", false, false,
						"Config_1", "report@2x.webp",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/left_panel_icons/report@2x.webp", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_55(this, false, "A1F042EB9718D4BFEF72E23734373638", false, false,
						"Config_1", "claims%20icon@1.5x.webp",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/left_panel_icons/claims%20icon@1.5x.webp", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_56(this, false, "A1F042EB972075E3EF72E23734373638", false, false,
						"Config_1", "document%20icon@1.5x.webp",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/left_panel_icons/document%20icon@1.5x.webp", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_57(this, false, "A1F042EB9711A870EF72E23734373638", false, false,
						"Config_1", "customer@1.5x.webp",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/left_panel_icons/customer@1.5x.webp", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_58(this, false, "A1F042EB97207580EF72E23734373638", false, false,
						"Config_1", "prospect@1.5x.webp",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/left_panel_icons/prospect@1.5x.webp", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_59(this, false, "A1F042EB9718D460EF72E23734373638", false, false,
						"Config_1", "PolicyView.css",	"/ModernizedInsuranceApp/common/InsuranceCustom/css/PolicyView.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_60(this, false, "A1F042EB9718D4BFEF72E23734373638", false, false,
						"Config_1", "home%20icon@1.5x.webp",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/left_panel_icons/home%20icon@1.5x.webp", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_61(this, false, "A1F042EB9711A870EF72E23734373638", false, false,
						"Config_1", "webService.png",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/left_panel_icons/webService.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_62(this, false, "A1F042EB97207580EF72E23734373638", false, false,
						"Config_1", "PolicyViewDetails.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/PolicyViewDetails.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_63(this, false, "A1F042EB972075E3EF72E23734373638", false, false,
						"Config_1", "addnewcustomer.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/addnewcustomer.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_64(this, false, "A1F042EB9718D460EF72E23734373638", false, false,
						"Config_1", "addautopolicy.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/addautopolicy.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_65(this, false, "A1F042EB9718D4BFEF72E23734373638", false, false,
						"Config_1", "sendemailtocustomer.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/sendemailtocustomer.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_66(this, false, "A1F042EB9711A870EF72E23734373638", false, false,
						"Config_1", "addCommercialPolicy.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/addCommercialPolicy.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_67(this, false, "A1F042EB972075E3EF72E23734373638", false, false,
						"Config_1", "addcustomer-policy.css",	"/ModernizedInsuranceApp/common/InsuranceCustom/css/addcustomer-policy.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_68(this, false, "A1F042EB97207580EF72E23734373638", false, false,
						"Config_1", "select2.min.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/jquery/select2.min.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_69(this, false, "A1F042EB9718D460EF72E23734373638", false, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{2}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223861912", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_70(this, false, "A1F042EB9718D4BFEF72E23734373638", false, false,
						"Config_1", "mainpage.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/mainpage.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_71(this, false, "A1F042EB9711A870EF72E23734373638", false, false,
						"Config_1", "navigator_gi.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/navigator_gi.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_72(this, false, "A1F042EB972075E3EF72E23734373638", false, false,
						"Config_1", "reports.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/reports.js", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_29(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB9750AD4CEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "228", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "max-age=0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "http://dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_1(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_4 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_4);

	harvestContainer_4.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[13], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_4", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[14], ";jsessionid=(.*?)\"", 1, 1, 0, 0, false, "jsessionid_12", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[15], "<[[^>].]*?NAME=\"PERF_TIMESTAMP\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_8", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[16], "<[[^>].]*?NAME=\"HatsCSRF\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_9", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[17], "<[[^>].]*?NAME=\"COMMAND\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_10", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[18], "<[[^>].]*?NAME=\"KeyboardToggle\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_11", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[19], "<[[^>].]*?NAME=\"SESSIONID\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_12", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[20], "<[[^>].]*?NAME=\"LINESIZE\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_13", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[21], "\\?heartBeat=(.*?)&", 1, 1, 0, 0, false, "heartBeat_51", null, 0, false);
	IDataSub subContainer_30 = new DataSub();
	reqAction.addDataSub(subContainer_30);

		ISubRule sub_93 = new SubRule("req_uri", 41, 64, false, (IDCCoreVar)dcVars[1], false, "jsessionid", null, 0, false);
	subContainer_30.addSubInstruction(sub_93);
		ISubRule sub_94 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_338", null, 0, false);
	subContainer_30.addSubInstruction(sub_94);
		ISubRule sub_95 = new SubRule("req_hdr_Referer_1", 0, 66, false, (IDCCoreVar)dcVars[0], false, "Referer_169", null, 0, false);
	subContainer_30.addSubInstruction(sub_95);
		ISubRule sub_96 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_337", null, 0, false);
	subContainer_30.addSubInstruction(sub_96);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB9750AD4FEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_1(HTTPPostData postData) {
				StringBuffer strBuf_1 = new StringBuffer();
strBuf_1.append("SESSIONNUMBER=&PERF_TIMESTAMP=0&HatsCSRF=null&COMMAND=macror");
strBuf_1.append("un_LoginMacro&CURSORPOSITION=1696&KeyboardToggle=1&SESSIONID");
strBuf_1.append("=INVALID&CARETPOS=-1&LINESIZE=2&password=********&loginComma");
strBuf_1.append("nd=LOGON+APPLID%28C70A1PP1%29&remember_me_box=on");
String requestData_1 = strBuf_1.toString();
			
	HTTPPostDataChunk pdc_0 = new HTTPPostDataChunk("A1F042EB9750AD98EF72E23734373638", postData, requestData_1, "UTF-8", 28, 169);
	postData.addDataChunk(pdc_0);

	IDataSub subContainer_29 = new DataSub();
	pdc_0.addDataSub(subContainer_29);

		ISubRule sub_85 = new SubRule("req_content", 161, 8, true, (IDCCoreVar)dcVars[10], false, "password", null, 0, false);
	subContainer_29.addSubInstruction(sub_85);
		ISubRule sub_86 = new SubRule("req_content", 150, 1, true, (IDCCoreVar)dcVars[8], false, "LINESIZE", null, 0, false);
	subContainer_29.addSubInstruction(sub_86);
		ISubRule sub_87 = new SubRule("req_content", 138, 2, true, (IDCCoreVar)dcVars[7], false, "CARETPOS", null, 0, false);
	subContainer_29.addSubInstruction(sub_87);
		ISubRule sub_88 = new SubRule("req_content", 121, 7, true, (IDCCoreVar)dcVars[6], false, "SESSIONID", null, 0, false);
	subContainer_29.addSubInstruction(sub_88);
		ISubRule sub_89 = new SubRule("req_content", 109, 1, true, (IDCCoreVar)dcVars[5], false, "KeyboardToggle", null, 0, false);
	subContainer_29.addSubInstruction(sub_89);
		ISubRule sub_90 = new SubRule("req_content", 89, 4, true, (IDCCoreVar)dcVars[4], false, "CURSORPOSITION", null, 0, false);
	subContainer_29.addSubInstruction(sub_90);
		ISubRule sub_91 = new SubRule("req_content", 41, 4, true, (IDCCoreVar)dcVars[3], false, "HatsCSRF", null, 0, false);
	subContainer_29.addSubInstruction(sub_91);
		ISubRule sub_92 = new SubRule("req_content", 30, 1, true, (IDCCoreVar)dcVars[2], false, "PERF_TIMESTAMP", null, 0, false);
	subContainer_29.addSubInstruction(sub_92);
	



	}

	public HTTPAction request_30(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97531E40EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_31 = new DataSub();
	reqAction.addDataSub(subContainer_31);

		ISubRule sub_97 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_336", null, 0, false);
	subContainer_31.addSubInstruction(sub_97);
		ISubRule sub_98 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_168", null, 0, false);
	subContainer_31.addSubInstruction(sub_98);
		ISubRule sub_99 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_335", null, 0, false);
	subContainer_31.addSubInstruction(sub_99);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97531E43EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_31(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97531E9FEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_32 = new DataSub();
	reqAction.addDataSub(subContainer_32);

		ISubRule sub_100 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_334", null, 0, false);
	subContainer_32.addSubInstruction(sub_100);
		ISubRule sub_101 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_167", null, 0, false);
	subContainer_32.addSubInstruction(sub_101);
		ISubRule sub_102 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_333", null, 0, false);
	subContainer_32.addSubInstruction(sub_102);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97531EA2EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_32(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97531EFEEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_33 = new DataSub();
	reqAction.addDataSub(subContainer_33);

		ISubRule sub_103 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_332", null, 0, false);
	subContainer_33.addSubInstruction(sub_103);
		ISubRule sub_104 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_166", null, 0, false);
	subContainer_33.addSubInstruction(sub_104);
		ISubRule sub_105 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_331", null, 0, false);
	subContainer_33.addSubInstruction(sub_105);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97531F01EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_33(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB975938C0EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_5 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_5);

	harvestContainer_5.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[22], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_5", null, 0, false);
	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[23], "\\?v=(.*?)'", 1, 1, 0, 0, false, "v_2", null, 0, false);
	IDataSub subContainer_34 = new DataSub();
	reqAction.addDataSub(subContainer_34);

		ISubRule sub_106 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_330", null, 0, false);
	subContainer_34.addSubInstruction(sub_106);
		ISubRule sub_107 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_165", null, 0, false);
	subContainer_34.addSubInstruction(sub_107);
		ISubRule sub_108 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_329", null, 0, false);
	subContainer_34.addSubInstruction(sub_108);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB975938C3EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_34(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB9759391FEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_35 = new DataSub();
	reqAction.addDataSub(subContainer_35);

		ISubRule sub_109 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_328", null, 0, false);
	subContainer_35.addSubInstruction(sub_109);
		ISubRule sub_110 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_164", null, 0, false);
	subContainer_35.addSubInstruction(sub_110);
		ISubRule sub_111 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_327", null, 0, false);
	subContainer_35.addSubInstruction(sub_111);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97593922EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_35(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB975A7147EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_36 = new DataSub();
	reqAction.addDataSub(subContainer_36);

		ISubRule sub_112 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_326", null, 0, false);
	subContainer_36.addSubInstruction(sub_112);
		ISubRule sub_113 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_163", null, 0, false);
	subContainer_36.addSubInstruction(sub_113);
		ISubRule sub_114 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_325", null, 0, false);
	subContainer_36.addSubInstruction(sub_114);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB975A714AEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_36(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB975A71A6EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_37 = new DataSub();
	reqAction.addDataSub(subContainer_37);

		ISubRule sub_115 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_324", null, 0, false);
	subContainer_37.addSubInstruction(sub_115);
		ISubRule sub_116 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_162", null, 0, false);
	subContainer_37.addSubInstruction(sub_116);
		ISubRule sub_117 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_323", null, 0, false);
	subContainer_37.addSubInstruction(sub_117);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB975A71A9EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_37(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB975A7205EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_38 = new DataSub();
	reqAction.addDataSub(subContainer_38);

		ISubRule sub_118 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_322", null, 0, false);
	subContainer_38.addSubInstruction(sub_118);
		ISubRule sub_119 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_161", null, 0, false);
	subContainer_38.addSubInstruction(sub_119);
		ISubRule sub_120 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_321", null, 0, false);
	subContainer_38.addSubInstruction(sub_120);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB975A7208EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_38(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB975A7264EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_39 = new DataSub();
	reqAction.addDataSub(subContainer_39);

		ISubRule sub_121 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_320", null, 0, false);
	subContainer_39.addSubInstruction(sub_121);
		ISubRule sub_122 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_160", null, 0, false);
	subContainer_39.addSubInstruction(sub_122);
		ISubRule sub_123 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_319", null, 0, false);
	subContainer_39.addSubInstruction(sub_123);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB975A7267EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_39(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB975A72C3EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_40 = new DataSub();
	reqAction.addDataSub(subContainer_40);

		ISubRule sub_124 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_318", null, 0, false);
	subContainer_40.addSubInstruction(sub_124);
		ISubRule sub_125 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_159", null, 0, false);
	subContainer_40.addSubInstruction(sub_125);
		ISubRule sub_126 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_317", null, 0, false);
	subContainer_40.addSubInstruction(sub_126);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB975A72C6EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_40(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB975A7322EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_41 = new DataSub();
	reqAction.addDataSub(subContainer_41);

		ISubRule sub_127 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_316", null, 0, false);
	subContainer_41.addSubInstruction(sub_127);
		ISubRule sub_128 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_158", null, 0, false);
	subContainer_41.addSubInstruction(sub_128);
		ISubRule sub_129 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_315", null, 0, false);
	subContainer_41.addSubInstruction(sub_129);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB975A7325EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_41(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB975A7381EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_42 = new DataSub();
	reqAction.addDataSub(subContainer_42);

		ISubRule sub_130 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_314", null, 0, false);
	subContainer_42.addSubInstruction(sub_130);
		ISubRule sub_131 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_157", null, 0, false);
	subContainer_42.addSubInstruction(sub_131);
		ISubRule sub_132 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_313", null, 0, false);
	subContainer_42.addSubInstruction(sub_132);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB975A7384EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_42(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB975A73E0EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_43 = new DataSub();
	reqAction.addDataSub(subContainer_43);

		ISubRule sub_133 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_312", null, 0, false);
	subContainer_43.addSubInstruction(sub_133);
		ISubRule sub_134 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_156", null, 0, false);
	subContainer_43.addSubInstruction(sub_134);
		ISubRule sub_135 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_311", null, 0, false);
	subContainer_43.addSubInstruction(sub_135);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB975A73E3EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_43(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB975CE240EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_44 = new DataSub();
	reqAction.addDataSub(subContainer_44);

		ISubRule sub_136 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_310", null, 0, false);
	subContainer_44.addSubInstruction(sub_136);
		ISubRule sub_137 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_155", null, 0, false);
	subContainer_44.addSubInstruction(sub_137);
		ISubRule sub_138 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_309", null, 0, false);
	subContainer_44.addSubInstruction(sub_138);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB975CE243EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_44(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB975D7E80EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_45 = new DataSub();
	reqAction.addDataSub(subContainer_45);

		ISubRule sub_139 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_308", null, 0, false);
	subContainer_45.addSubInstruction(sub_139);
		ISubRule sub_140 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_154", null, 0, false);
	subContainer_45.addSubInstruction(sub_140);
		ISubRule sub_141 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_307", null, 0, false);
	subContainer_45.addSubInstruction(sub_141);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB975D7E83EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_45(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB975D7EDBEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_46 = new DataSub();
	reqAction.addDataSub(subContainer_46);

		ISubRule sub_142 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_306", null, 0, false);
	subContainer_46.addSubInstruction(sub_142);
		ISubRule sub_143 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_153", null, 0, false);
	subContainer_46.addSubInstruction(sub_143);
		ISubRule sub_144 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_305", null, 0, false);
	subContainer_46.addSubInstruction(sub_144);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB975D7EDEEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_46(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB975F5363EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_47 = new DataSub();
	reqAction.addDataSub(subContainer_47);

		ISubRule sub_145 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_304", null, 0, false);
	subContainer_47.addSubInstruction(sub_145);
		ISubRule sub_146 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_152", null, 0, false);
	subContainer_47.addSubInstruction(sub_146);
		ISubRule sub_147 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_303", null, 0, false);
	subContainer_47.addSubInstruction(sub_147);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB975F5366EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_47(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB975F53C2EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_48 = new DataSub();
	reqAction.addDataSub(subContainer_48);

		ISubRule sub_148 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_302", null, 0, false);
	subContainer_48.addSubInstruction(sub_148);
		ISubRule sub_149 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_151", null, 0, false);
	subContainer_48.addSubInstruction(sub_149);
		ISubRule sub_150 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_301", null, 0, false);
	subContainer_48.addSubInstruction(sub_150);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB975F53C5EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_48(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB975F5421EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_49 = new DataSub();
	reqAction.addDataSub(subContainer_49);

		ISubRule sub_151 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_300", null, 0, false);
	subContainer_49.addSubInstruction(sub_151);
		ISubRule sub_152 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_150", null, 0, false);
	subContainer_49.addSubInstruction(sub_152);
		ISubRule sub_153 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_299", null, 0, false);
	subContainer_49.addSubInstruction(sub_153);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB975F5424EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_49(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97619D30EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(9);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "http://dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/common/InsuranceCustom/font-awesome/css/font-awesome.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_50 = new DataSub();
	reqAction.addDataSub(subContainer_50);

		ISubRule sub_154 = new SubRule("req_uri", 94, 5, true, (IDCCoreVar)dcVars[23], false, "v", null, 0, false);
	subContainer_50.addSubInstruction(sub_154);
		ISubRule sub_155 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_298", null, 0, false);
	subContainer_50.addSubInstruction(sub_155);
		ISubRule sub_156 = new SubRule("req_hdr_Referer_1", 0, 123, false, (IDCCoreVar)dcVars[22], false, "Referer_149", null, 0, false);
	subContainer_50.addSubInstruction(sub_156);
		ISubRule sub_157 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_297", null, 0, false);
	subContainer_50.addSubInstruction(sub_157);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB975938C0EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB975938C0EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97619D33EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_50(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97619D93EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_51 = new DataSub();
	reqAction.addDataSub(subContainer_51);

		ISubRule sub_158 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_296", null, 0, false);
	subContainer_51.addSubInstruction(sub_158);
		ISubRule sub_159 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_148", null, 0, false);
	subContainer_51.addSubInstruction(sub_159);
		ISubRule sub_160 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_295", null, 0, false);
	subContainer_51.addSubInstruction(sub_160);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97619D96EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_51(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97640E30EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_52 = new DataSub();
	reqAction.addDataSub(subContainer_52);

		ISubRule sub_161 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_294", null, 0, false);
	subContainer_52.addSubInstruction(sub_161);
		ISubRule sub_162 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_147", null, 0, false);
	subContainer_52.addSubInstruction(sub_162);
		ISubRule sub_163 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_293", null, 0, false);
	subContainer_52.addSubInstruction(sub_163);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97640E33EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_52(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB976B6130EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_53 = new DataSub();
	reqAction.addDataSub(subContainer_53);

		ISubRule sub_164 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_292", null, 0, false);
	subContainer_53.addSubInstruction(sub_164);
		ISubRule sub_165 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_146", null, 0, false);
	subContainer_53.addSubInstruction(sub_165);
		ISubRule sub_166 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_291", null, 0, false);
	subContainer_53.addSubInstruction(sub_166);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB976B6133EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_53(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB976B618FEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_54 = new DataSub();
	reqAction.addDataSub(subContainer_54);

		ISubRule sub_167 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_290", null, 0, false);
	subContainer_54.addSubInstruction(sub_167);
		ISubRule sub_168 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_145", null, 0, false);
	subContainer_54.addSubInstruction(sub_168);
		ISubRule sub_169 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_289", null, 0, false);
	subContainer_54.addSubInstruction(sub_169);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB976B6192EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_54(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB976B61EEEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_55 = new DataSub();
	reqAction.addDataSub(subContainer_55);

		ISubRule sub_170 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_288", null, 0, false);
	subContainer_55.addSubInstruction(sub_170);
		ISubRule sub_171 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_144", null, 0, false);
	subContainer_55.addSubInstruction(sub_171);
		ISubRule sub_172 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_287", null, 0, false);
	subContainer_55.addSubInstruction(sub_172);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB976B61F1EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_55(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB976B624DEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_56 = new DataSub();
	reqAction.addDataSub(subContainer_56);

		ISubRule sub_173 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_286", null, 0, false);
	subContainer_56.addSubInstruction(sub_173);
		ISubRule sub_174 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_143", null, 0, false);
	subContainer_56.addSubInstruction(sub_174);
		ISubRule sub_175 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_285", null, 0, false);
	subContainer_56.addSubInstruction(sub_175);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB976B6250EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_56(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB976B62ACEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_57 = new DataSub();
	reqAction.addDataSub(subContainer_57);

		ISubRule sub_176 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_284", null, 0, false);
	subContainer_57.addSubInstruction(sub_176);
		ISubRule sub_177 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_142", null, 0, false);
	subContainer_57.addSubInstruction(sub_177);
		ISubRule sub_178 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_283", null, 0, false);
	subContainer_57.addSubInstruction(sub_178);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB976B62AFEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_57(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB976B630BEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_58 = new DataSub();
	reqAction.addDataSub(subContainer_58);

		ISubRule sub_179 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_282", null, 0, false);
	subContainer_58.addSubInstruction(sub_179);
		ISubRule sub_180 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_141", null, 0, false);
	subContainer_58.addSubInstruction(sub_180);
		ISubRule sub_181 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_281", null, 0, false);
	subContainer_58.addSubInstruction(sub_181);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB976B630EEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_58(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB976B636AEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_59 = new DataSub();
	reqAction.addDataSub(subContainer_59);

		ISubRule sub_182 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_280", null, 0, false);
	subContainer_59.addSubInstruction(sub_182);
		ISubRule sub_183 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_140", null, 0, false);
	subContainer_59.addSubInstruction(sub_183);
		ISubRule sub_184 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_279", null, 0, false);
	subContainer_59.addSubInstruction(sub_184);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB976B636DEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_59(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB976B63C9EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_6 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_6);

	harvestContainer_6.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[24], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_6", null, 0, false);
	IDataSub subContainer_60 = new DataSub();
	reqAction.addDataSub(subContainer_60);

		ISubRule sub_185 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_278", null, 0, false);
	subContainer_60.addSubInstruction(sub_185);
		ISubRule sub_186 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_139", null, 0, false);
	subContainer_60.addSubInstruction(sub_186);
		ISubRule sub_187 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_277", null, 0, false);
	subContainer_60.addSubInstruction(sub_187);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB976B63CCEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_60(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB976B6428EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_61 = new DataSub();
	reqAction.addDataSub(subContainer_61);

		ISubRule sub_188 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_276", null, 0, false);
	subContainer_61.addSubInstruction(sub_188);
		ISubRule sub_189 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_138", null, 0, false);
	subContainer_61.addSubInstruction(sub_189);
		ISubRule sub_190 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_275", null, 0, false);
	subContainer_61.addSubInstruction(sub_190);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB976B642BEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_61(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB976B6487EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_62 = new DataSub();
	reqAction.addDataSub(subContainer_62);

		ISubRule sub_191 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_274", null, 0, false);
	subContainer_62.addSubInstruction(sub_191);
		ISubRule sub_192 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_137", null, 0, false);
	subContainer_62.addSubInstruction(sub_192);
		ISubRule sub_193 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_273", null, 0, false);
	subContainer_62.addSubInstruction(sub_193);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB976B648AEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_62(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB976B64E6EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_63 = new DataSub();
	reqAction.addDataSub(subContainer_63);

		ISubRule sub_194 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_272", null, 0, false);
	subContainer_63.addSubInstruction(sub_194);
		ISubRule sub_195 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_136", null, 0, false);
	subContainer_63.addSubInstruction(sub_195);
		ISubRule sub_196 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_271", null, 0, false);
	subContainer_63.addSubInstruction(sub_196);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB976B64E9EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_63(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB976B6545EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_64 = new DataSub();
	reqAction.addDataSub(subContainer_64);

		ISubRule sub_197 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_270", null, 0, false);
	subContainer_64.addSubInstruction(sub_197);
		ISubRule sub_198 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_135", null, 0, false);
	subContainer_64.addSubInstruction(sub_198);
		ISubRule sub_199 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_269", null, 0, false);
	subContainer_64.addSubInstruction(sub_199);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB976B6548EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_64(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB976B65A4EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_65 = new DataSub();
	reqAction.addDataSub(subContainer_65);

		ISubRule sub_200 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_268", null, 0, false);
	subContainer_65.addSubInstruction(sub_200);
		ISubRule sub_201 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_134", null, 0, false);
	subContainer_65.addSubInstruction(sub_201);
		ISubRule sub_202 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_267", null, 0, false);
	subContainer_65.addSubInstruction(sub_202);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB976B65A7EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_65(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB976B6603EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_66 = new DataSub();
	reqAction.addDataSub(subContainer_66);

		ISubRule sub_203 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_266", null, 0, false);
	subContainer_66.addSubInstruction(sub_203);
		ISubRule sub_204 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_133", null, 0, false);
	subContainer_66.addSubInstruction(sub_204);
		ISubRule sub_205 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_265", null, 0, false);
	subContainer_66.addSubInstruction(sub_205);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB976B6606EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_66(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB976B6662EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_67 = new DataSub();
	reqAction.addDataSub(subContainer_67);

		ISubRule sub_206 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_264", null, 0, false);
	subContainer_67.addSubInstruction(sub_206);
		ISubRule sub_207 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_132", null, 0, false);
	subContainer_67.addSubInstruction(sub_207);
		ISubRule sub_208 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_263", null, 0, false);
	subContainer_67.addSubInstruction(sub_208);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB976B6665EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_67(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB976DD230EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_68 = new DataSub();
	reqAction.addDataSub(subContainer_68);

		ISubRule sub_209 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_262", null, 0, false);
	subContainer_68.addSubInstruction(sub_209);
		ISubRule sub_210 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_131", null, 0, false);
	subContainer_68.addSubInstruction(sub_210);
		ISubRule sub_211 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_261", null, 0, false);
	subContainer_68.addSubInstruction(sub_211);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB976DD233EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_68(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB976DD28FEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_69 = new DataSub();
	reqAction.addDataSub(subContainer_69);

		ISubRule sub_212 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_260", null, 0, false);
	subContainer_69.addSubInstruction(sub_212);
		ISubRule sub_213 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_130", null, 0, false);
	subContainer_69.addSubInstruction(sub_213);
		ISubRule sub_214 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_259", null, 0, false);
	subContainer_69.addSubInstruction(sub_214);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB976DD292EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_69(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB976DD2EEEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_70 = new DataSub();
	reqAction.addDataSub(subContainer_70);

		ISubRule sub_215 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[21], false, "heartBeat", null, 0, false);
	subContainer_70.addSubInstruction(sub_215);
		ISubRule sub_216 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_258", null, 0, false);
	subContainer_70.addSubInstruction(sub_216);
		ISubRule sub_217 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_129", null, 0, false);
	subContainer_70.addSubInstruction(sub_217);
		ISubRule sub_218 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_257", null, 0, false);
	subContainer_70.addSubInstruction(sub_218);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB976DD2F1EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_70(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB976DD349EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_71 = new DataSub();
	reqAction.addDataSub(subContainer_71);

		ISubRule sub_219 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_256", null, 0, false);
	subContainer_71.addSubInstruction(sub_219);
		ISubRule sub_220 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_128", null, 0, false);
	subContainer_71.addSubInstruction(sub_220);
		ISubRule sub_221 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_255", null, 0, false);
	subContainer_71.addSubInstruction(sub_221);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB976DD34CEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_71(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB976DD3A8EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_72 = new DataSub();
	reqAction.addDataSub(subContainer_72);

		ISubRule sub_222 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_254", null, 0, false);
	subContainer_72.addSubInstruction(sub_222);
		ISubRule sub_223 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_127", null, 0, false);
	subContainer_72.addSubInstruction(sub_223);
		ISubRule sub_224 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_253", null, 0, false);
	subContainer_72.addSubInstruction(sub_224);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB976DD3ABEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_72(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB976DD407EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_73 = new DataSub();
	reqAction.addDataSub(subContainer_73);

		ISubRule sub_225 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_252", null, 0, false);
	subContainer_73.addSubInstruction(sub_225);
		ISubRule sub_226 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_126", null, 0, false);
	subContainer_73.addSubInstruction(sub_226);
		ISubRule sub_227 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_251", null, 0, false);
	subContainer_73.addSubInstruction(sub_227);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB9750AD4CEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB976DD40AEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	private KComment comment_2(final IContainer parent) {
		return new KComment(parent, "comment_2", "A1F042EB97752530EF72E23734373638", "CICS command") ;
	}
private HTTPPage page_4(final IContainer parent) {
			HTTPThink think = new HTTPThink(0, 1, parent, parent, "A1F042EB97752534EF72E23734373638");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "xlsxJs_xlsx", "A1F042EB97752534EF72E23734373638") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(6, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_73(this, true, "A1F042EB9718D51EEF72E23734373638", false, false,
						"Config_1", "xlsx.full.max-0.13.5.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/plugins/xlsxJs/xlsx.full.max-0.13.5.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_74(this, false, "A1F042EB9718D460EF72E23734373638", false, false,
						"Config_1", "custom_gi.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/custom_gi.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_75(this, false, "A1F042EB9718D4BFEF72E23734373638", false, false,
						"Config_1", "callToServer.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/callToServer.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_76(this, false, "A1F042EB9711A870EF72E23734373638", false, false,
						"Config_1", "runDBCall.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/runDBCall.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_77(this, false, "A1F042EB972075E3EF72E23734373638", false, false,
						"Config_1", "runMacros_gi.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/runMacros_gi.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_78(this, false, "A1F042EB97207580EF72E23734373638", false, false,
						"Config_1", "dataBindToGUI_gi.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/dataBindToGUI_gi.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_79(this, false, "A1F042EB9718D460EF72E23734373638", false, false,
						"Config_1", "customerProfile.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/customerProfile.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_80(this, false, "A1F042EB9718D4BFEF72E23734373638", false, false,
						"Config_1", "datatables.min.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/plugins/datatables/datatables.min.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_81(this, false, "A1F042EB9711A870EF72E23734373638", false, false,
						"Config_1", "bootstrap-datepicker.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/bootstrap-datepicker/js/bootstrap-datepicker.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_82(this, false, "A1F042EB97207580EF72E23734373638", false, false,
						"Config_1", "lxgwhelper.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/lxgwhelper.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_83(this, false, "A1F042EB972075E3EF72E23734373638", false, false,
						"Config_1", "FileSaver.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/FileSaver.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_84(this, false, "A1F042EB9718D460EF72E23734373638", false, false,
						"Config_1", "TableExport.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/TableExport.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_85(this, false, "A1F042EB9711A870EF72E23734373638", false, false,
						"Config_1", "clientLogger.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/clientLogger.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_86(this, false, "A1F042EB97207580EF72E23734373638", false, false,
						"Config_1", "PolicyEdit.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/PolicyEdit.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_87(this, false, "A1F042EB972075E3EF72E23734373638", false, false,
						"Config_1", "PolicyDelete.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/PolicyDelete.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_88(this, false, "A1F042EB9718D460EF72E23734373638", false, false,
						"Config_1", "ResizeDT.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/ResizeDT.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_89(this, false, "A1F042EB9718D51EEF72E23734373638", false, false,
						"Config_1", "customer_edit.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/customer_edit.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_90(this, false, "A1F042EB9711A870EF72E23734373638", false, false,
						"Config_1", "mailto.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/mailto.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_91(this, false, "A1F042EB97207580EF72E23734373638", false, false,
						"Config_1", "app-webcolor.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/app-webcolor.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_92(this, false, "A1F042EB9718D4BFEF72E23734373638", false, false,
						"Config_1", "secOff.gif",	"/ModernizedInsuranceApp/common/images/secOff.gif", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_93(this, false, "A1F042EB972075E3EF72E23734373638", false, false,
						"Config_1", "systemWait.gif",	"/ModernizedInsuranceApp/common/images/systemWait.gif", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_94(this, false, "A1F042EB9718D460EF72E23734373638", false, false,
						"Config_1", "or.png",	"/ModernizedInsuranceApp/common/images/or.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_95(this, false, "A1F042EB9718D51EEF72E23734373638", false, false,
						"Config_1", "database_icon.png",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/database_icon.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_96(this, false, "A1F042EB9711A870EF72E23734373638", false, false,
						"Config_1", "expandSideBar.png",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/expandSideBar.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_97(this, false, "A1F042EB9718D4BFEF72E23734373638", false, false,
						"Config_1", "refresh_icon.png",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/refresh_icon.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_98(this, false, "A1F042EB972075E3EF72E23734373638", false, false,
						"Config_1", "Icon_Calendr@3x.png",	"/ModernizedInsuranceApp/common/images/Icon_Calendr@3x.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_99(this, false, "A1F042EB9718D460EF72E23734373638", false, false,
						"Config_1", "save-icon.svg",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/save-icon.svg", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_100(this, false, "A1F042EB9718D51EEF72E23734373638", false, false,
						"Config_1", "Close_icn.svg",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/Close_icn.svg", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_101(this, false, "A1F042EB9711A870EF72E23734373638", false, false,
						"Config_1", "edit-profile-icon.svg",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/edit-profile-icon.svg", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_102(this, false, "A1F042EB9718D4BFEF72E23734373638", false, false,
						"Config_1", "edit-icon-small.svg",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/edit-icon-small.svg", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_103(this, false, "A1F042EB972075E3EF72E23734373638", false, false,
						"Config_1", "rubbish-bin.svg",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/rubbish-bin.svg", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_104(this, false, "A1F042EB9718D460EF72E23734373638", false, false,
						"Config_1", "set-reminder-icon.svg",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/set-reminder-icon.svg", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_105(this, false, "A1F042EB97207580EF72E23734373638", false, false,
						"Config_1", "location.jpg",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/location.jpg", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_106(this, false, "A1F042EB9711A870EF72E23734373638", false, false,
						"Config_1", "Bitmap.png",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/Bitmap.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_107(this, false, "A1F042EB972075E3EF72E23734373638", false, false,
						"Config_1", "export.svg",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/export.svg", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_108(this, false, "A1F042EB97207580EF72E23734373638", false, false,
						"Config_1", "email.svg",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/email.svg", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_109(this, false, "A1F042EB972075E3EF72E23734373638", false, false,
						"Config_1", "close.svg",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/close.svg", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_110(this, false, "A1F042EB9711A870EF72E23734373638", false, false,
						"Config_1", "save-icon_sml.svg",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/save-icon_sml.svg", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_111(this, false, "A1F042EB972075E3EF72E23734373638", false, false,
						"Config_1", "houseproprtyimage.webp",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/houseproprtyimage.webp", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_112(this, false, "A1F042EB972075E3EF72E23734373638", false, false,
						"Config_1", "hospitalimage.webp",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/hospitalimage.webp", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_113(this, false, "A1F042EB9718D51EEF72E23734373638", false, false,
						"Config_1", "mainframe_icon.svg",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/mainframe_icon.svg", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_114(this, false, "A1F042EB9718D4BFEF72E23734373638", false, false,
						"Config_1", "add_policy.svg",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/add_policy.svg", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_115(this, false, "A1F042EB9718D460EF72E23734373638", false, false,
						"Config_1", "printer_icon.svg",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/printer_icon.svg", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_116(this, false, "A1F042EB9718D51EEF72E23734373638", false, false,
						"Config_1", "Icon_Adduser@3x.png",	"/ModernizedInsuranceApp/common/images/Icon_Adduser@3x.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_117(this, false, "A1F042EB972075E3EF72E23734373638", false, false,
						"Config_1", "Addpolicy@3x.png",	"/ModernizedInsuranceApp/common/images/Addpolicy@3x.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_118(this, false, "A1F042EB9718D460EF72E23734373638", false, false,
						"Config_1", "x_black.png",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/x_black.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_119(this, false, "A1F042EB9718D51EEF72E23734373638", false, false,
						"Config_1", "x_white.png",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/x_white.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_120(this, false, "A1F042EB97207580EF72E23734373638", false, false,
						"Config_1", "Icon_Upload@3x.png",	"/ModernizedInsuranceApp/common/images/Icon_Upload@3x.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_121(this, false, "A1F042EB972075E3EF72E23734373638", false, false,
						"Config_1", "Term@3x.png",	"/ModernizedInsuranceApp/common/images/Term@3x.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_122(this, false, "A1F042EB9711A870EF72E23734373638", false, false,
						"Config_1", "Icon_Household@3x.png",	"/ModernizedInsuranceApp/common/images/Icon_Household@3x.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_123(this, false, "A1F042EB9718D460EF72E23734373638", false, false,
						"Config_1", "Icon_Auto@3x.png",	"/ModernizedInsuranceApp/common/images/Icon_Auto@3x.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_124(this, false, "A1F042EB9718D51EEF72E23734373638", false, false,
						"Config_1", "Icon_Commercial@3x.png",	"/ModernizedInsuranceApp/common/images/Icon_Commercial@3x.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_125(this, false, "A1F042EB97207580EF72E23734373638", false, false,
						"Config_1", "Map.PNG",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/Map.PNG", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_126(this, false, "A1F042EB972075E3EF72E23734373638", false, false,
						"Config_1", "Weather.PNG",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/Weather.PNG", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_127(this, false, "A1F042EB9711A870EF72E23734373638", true, false,
						"Config_1", "next.svg",	"/ModernizedInsuranceApp/common/images/next.svg", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_128(this, false, "A1F042EB9718D460EF72E23734373638", false, false,
						"Config_1", "insertMode.gif",	"/ModernizedInsuranceApp/common/images/insertMode.gif", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_129(this, false, "A1F042EB9718D51EEF72E23734373638", true, false,
						"Config_1", "overwriteMode.gif",	"/ModernizedInsuranceApp/common/images/overwriteMode.gif", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_130(this, false, "A1F042EB97207580EF72E23734373638", false, false,
						"Config_1", "chevron.png",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/WebServices/chevron.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_131(this, false, "A1F042EB972075E3EF72E23734373638", false, false,
						"Config_1", "webServiceEdit.png",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/WebServices/webServiceEdit.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_132(this, false, "A1F042EB9718D460EF72E23734373638", false, false,
						"Config_1", "webServicesLink.png",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/WebServices/webServicesLink.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_133(this, false, "A1F042EB9718D4BFEF72E23734373638", false, false,
						"Config_1", "webServicesRightCircle.png",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/WebServices/webServicesRightCircle.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_134(this, false, "A1F042EB9718D4BFEF72E23734373638", false, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{3}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223866925", true, false), 396, 100, "A1F042EB97A5ACE3EF72E23734373638", 3);
				httpParallel.addRequest(2, request_135(this, false, "A1F042EB9718D4BFEF72E23734373638", false, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{4}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223871921", true, false), 4743, 100, "A1F042EB97A5AD42EF72E23734373638", 3);
				httpParallel.addRequest(2, request_136(this, false, "A1F042EB9718D4BFEF72E23734373638", false, false,
						"Config_1", "entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{1}",	"/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", true, false), 3220, 100, "A1F042EB97A5AD9DEF72E23734373638", 3);
				httpParallel.addRequest(2, request_137(this, false, "A1F042EB9718D4BFEF72E23734373638", false, false,
						"Config_1", "setupSelect2.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/setupSelect2.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_138(this, false, "A1F042EB9718D4BFEF72E23734373638", false, false,
						"Config_1", "setupCalendar.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/setupCalendar.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_139(this, false, "A1F042EB9718D4BFEF72E23734373638", false, false,
						"Config_1", "initializeSSC1.js",	"/ModernizedInsuranceApp/common/InsuranceCustom/js/initializeSSC1.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_140(this, false, "A1F042EB9718D4BFEF72E23734373638", false, true,
						"Config_1", "entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{2}",	"/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_141(this, false, "A1F042EB9718D460EF72E23734373638", false, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{5}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223877005", true, false), 211, 100, "A1F042EB97A5AF31EF72E23734373638", 3);
				httpParallel.addRequest(1, request_142(this, false, "A1F042EB9718D460EF72E23734373638", true, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{6}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223878121", true, false), 858, 100, "A1F042EB97A5B008EF72E23734373638", 3);
				httpParallel.addRequest(2, request_143(this, false, "A1F042EB9718D4BFEF72E23734373638", false, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{7}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223882014", true, false), 3619, 100, "A1F042EB97A5B063EF72E23734373638", 3);
				httpParallel.addRequest(2, request_144(this, false, "A1F042EB9718D4BFEF72E23734373638", true, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{8}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223883138", true, false), 868, 100, "A1F042EB97A5B0BFEF72E23734373638", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_73(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97752538EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_74 = new DataSub();
	reqAction.addDataSub(subContainer_74);

		ISubRule sub_228 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_250", null, 0, false);
	subContainer_74.addSubInstruction(sub_228);
		ISubRule sub_229 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_125", null, 0, false);
	subContainer_74.addSubInstruction(sub_229);
		ISubRule sub_230 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_249", null, 0, false);
	subContainer_74.addSubInstruction(sub_230);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB9775253BEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_74(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB977A0758EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_75 = new DataSub();
	reqAction.addDataSub(subContainer_75);

		ISubRule sub_231 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_248", null, 0, false);
	subContainer_75.addSubInstruction(sub_231);
		ISubRule sub_232 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_124", null, 0, false);
	subContainer_75.addSubInstruction(sub_232);
		ISubRule sub_233 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_247", null, 0, false);
	subContainer_75.addSubInstruction(sub_233);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB977A075BEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_75(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB977A07B7EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_76 = new DataSub();
	reqAction.addDataSub(subContainer_76);

		ISubRule sub_234 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_246", null, 0, false);
	subContainer_76.addSubInstruction(sub_234);
		ISubRule sub_235 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_123", null, 0, false);
	subContainer_76.addSubInstruction(sub_235);
		ISubRule sub_236 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_245", null, 0, false);
	subContainer_76.addSubInstruction(sub_236);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB977A07BAEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_76(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB977A0816EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_77 = new DataSub();
	reqAction.addDataSub(subContainer_77);

		ISubRule sub_237 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_244", null, 0, false);
	subContainer_77.addSubInstruction(sub_237);
		ISubRule sub_238 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_122", null, 0, false);
	subContainer_77.addSubInstruction(sub_238);
		ISubRule sub_239 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_243", null, 0, false);
	subContainer_77.addSubInstruction(sub_239);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB977A0819EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_77(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB977A0875EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_78 = new DataSub();
	reqAction.addDataSub(subContainer_78);

		ISubRule sub_240 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_242", null, 0, false);
	subContainer_78.addSubInstruction(sub_240);
		ISubRule sub_241 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_121", null, 0, false);
	subContainer_78.addSubInstruction(sub_241);
		ISubRule sub_242 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_241", null, 0, false);
	subContainer_78.addSubInstruction(sub_242);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB977A0878EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_78(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB977A08D4EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_79 = new DataSub();
	reqAction.addDataSub(subContainer_79);

		ISubRule sub_243 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_240", null, 0, false);
	subContainer_79.addSubInstruction(sub_243);
		ISubRule sub_244 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_120", null, 0, false);
	subContainer_79.addSubInstruction(sub_244);
		ISubRule sub_245 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_239", null, 0, false);
	subContainer_79.addSubInstruction(sub_245);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB977A08D7EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_79(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB977C7830EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_7 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_7);

	harvestContainer_7.addHarvestInstruction ("resp_content", dcVars[25], "&COMMAND=(.*?)\"", 2, 2, 0, 0, false, "COMMAND_12", null, 0, false);
	harvestContainer_7.addHarvestInstruction ("resp_content", dcVars[26], "&COMMAND=(.*?)\"", 3, 1, 0, 0, false, "COMMAND_11", null, 0, false);
	IDataSub subContainer_80 = new DataSub();
	reqAction.addDataSub(subContainer_80);

		ISubRule sub_246 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_238", null, 0, false);
	subContainer_80.addSubInstruction(sub_246);
		ISubRule sub_247 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_119", null, 0, false);
	subContainer_80.addSubInstruction(sub_247);
		ISubRule sub_248 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_237", null, 0, false);
	subContainer_80.addSubInstruction(sub_248);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB977C7833EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_80(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB977C788FEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_81 = new DataSub();
	reqAction.addDataSub(subContainer_81);

		ISubRule sub_249 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_236", null, 0, false);
	subContainer_81.addSubInstruction(sub_249);
		ISubRule sub_250 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_118", null, 0, false);
	subContainer_81.addSubInstruction(sub_250);
		ISubRule sub_251 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_235", null, 0, false);
	subContainer_81.addSubInstruction(sub_251);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB977C7892EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_81(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB977C78EEEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_82 = new DataSub();
	reqAction.addDataSub(subContainer_82);

		ISubRule sub_252 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_234", null, 0, false);
	subContainer_82.addSubInstruction(sub_252);
		ISubRule sub_253 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_117", null, 0, false);
	subContainer_82.addSubInstruction(sub_253);
		ISubRule sub_254 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_233", null, 0, false);
	subContainer_82.addSubInstruction(sub_254);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB977C78F1EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_82(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB977C794DEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_83 = new DataSub();
	reqAction.addDataSub(subContainer_83);

		ISubRule sub_255 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_232", null, 0, false);
	subContainer_83.addSubInstruction(sub_255);
		ISubRule sub_256 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_116", null, 0, false);
	subContainer_83.addSubInstruction(sub_256);
		ISubRule sub_257 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_231", null, 0, false);
	subContainer_83.addSubInstruction(sub_257);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB977C7950EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_83(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB977C79ACEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_84 = new DataSub();
	reqAction.addDataSub(subContainer_84);

		ISubRule sub_258 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_230", null, 0, false);
	subContainer_84.addSubInstruction(sub_258);
		ISubRule sub_259 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_115", null, 0, false);
	subContainer_84.addSubInstruction(sub_259);
		ISubRule sub_260 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_229", null, 0, false);
	subContainer_84.addSubInstruction(sub_260);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB977C79AFEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_84(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB977C7A0BEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_85 = new DataSub();
	reqAction.addDataSub(subContainer_85);

		ISubRule sub_261 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_228", null, 0, false);
	subContainer_85.addSubInstruction(sub_261);
		ISubRule sub_262 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_114", null, 0, false);
	subContainer_85.addSubInstruction(sub_262);
		ISubRule sub_263 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_227", null, 0, false);
	subContainer_85.addSubInstruction(sub_263);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB977C7A0EEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_85(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB977C7A6AEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_86 = new DataSub();
	reqAction.addDataSub(subContainer_86);

		ISubRule sub_264 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_226", null, 0, false);
	subContainer_86.addSubInstruction(sub_264);
		ISubRule sub_265 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_113", null, 0, false);
	subContainer_86.addSubInstruction(sub_265);
		ISubRule sub_266 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_225", null, 0, false);
	subContainer_86.addSubInstruction(sub_266);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB977C7A6DEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_86(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB977EE930EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_87 = new DataSub();
	reqAction.addDataSub(subContainer_87);

		ISubRule sub_267 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_224", null, 0, false);
	subContainer_87.addSubInstruction(sub_267);
		ISubRule sub_268 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_112", null, 0, false);
	subContainer_87.addSubInstruction(sub_268);
		ISubRule sub_269 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_223", null, 0, false);
	subContainer_87.addSubInstruction(sub_269);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB977EE933EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_87(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB977F1040EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_88 = new DataSub();
	reqAction.addDataSub(subContainer_88);

		ISubRule sub_270 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_222", null, 0, false);
	subContainer_88.addSubInstruction(sub_270);
		ISubRule sub_271 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_111", null, 0, false);
	subContainer_88.addSubInstruction(sub_271);
		ISubRule sub_272 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_221", null, 0, false);
	subContainer_88.addSubInstruction(sub_272);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB977F1043EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_88(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB977F109FEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_89 = new DataSub();
	reqAction.addDataSub(subContainer_89);

		ISubRule sub_273 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_220", null, 0, false);
	subContainer_89.addSubInstruction(sub_273);
		ISubRule sub_274 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_110", null, 0, false);
	subContainer_89.addSubInstruction(sub_274);
		ISubRule sub_275 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_219", null, 0, false);
	subContainer_89.addSubInstruction(sub_275);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB977F10A2EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_89(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB977F10FEEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_90 = new DataSub();
	reqAction.addDataSub(subContainer_90);

		ISubRule sub_276 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_218", null, 0, false);
	subContainer_90.addSubInstruction(sub_276);
		ISubRule sub_277 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_109", null, 0, false);
	subContainer_90.addSubInstruction(sub_277);
		ISubRule sub_278 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_217", null, 0, false);
	subContainer_90.addSubInstruction(sub_278);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB977F1101EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_90(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB9783A420EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_91 = new DataSub();
	reqAction.addDataSub(subContainer_91);

		ISubRule sub_279 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_216", null, 0, false);
	subContainer_91.addSubInstruction(sub_279);
		ISubRule sub_280 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_108", null, 0, false);
	subContainer_91.addSubInstruction(sub_280);
		ISubRule sub_281 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_215", null, 0, false);
	subContainer_91.addSubInstruction(sub_281);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB9783A423EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_91(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB9783A47FEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_92 = new DataSub();
	reqAction.addDataSub(subContainer_92);

		ISubRule sub_282 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_214", null, 0, false);
	subContainer_92.addSubInstruction(sub_282);
		ISubRule sub_283 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_107", null, 0, false);
	subContainer_92.addSubInstruction(sub_283);
		ISubRule sub_284 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_213", null, 0, false);
	subContainer_92.addSubInstruction(sub_284);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB9783A482EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_92(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB9783A4DEEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_93 = new DataSub();
	reqAction.addDataSub(subContainer_93);

		ISubRule sub_285 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_212", null, 0, false);
	subContainer_93.addSubInstruction(sub_285);
		ISubRule sub_286 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_106", null, 0, false);
	subContainer_93.addSubInstruction(sub_286);
		ISubRule sub_287 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_211", null, 0, false);
	subContainer_93.addSubInstruction(sub_287);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB9783A4E1EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_93(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB9783A539EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_94 = new DataSub();
	reqAction.addDataSub(subContainer_94);

		ISubRule sub_288 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_210", null, 0, false);
	subContainer_94.addSubInstruction(sub_288);
		ISubRule sub_289 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_105", null, 0, false);
	subContainer_94.addSubInstruction(sub_289);
		ISubRule sub_290 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_209", null, 0, false);
	subContainer_94.addSubInstruction(sub_290);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB9783A53CEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_94(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB9783A594EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_95 = new DataSub();
	reqAction.addDataSub(subContainer_95);

		ISubRule sub_291 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_208", null, 0, false);
	subContainer_95.addSubInstruction(sub_291);
		ISubRule sub_292 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_104", null, 0, false);
	subContainer_95.addSubInstruction(sub_292);
		ISubRule sub_293 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_207", null, 0, false);
	subContainer_95.addSubInstruction(sub_293);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB9783A597EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_95(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97861543EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_96 = new DataSub();
	reqAction.addDataSub(subContainer_96);

		ISubRule sub_294 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_206", null, 0, false);
	subContainer_96.addSubInstruction(sub_294);
		ISubRule sub_295 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_103", null, 0, false);
	subContainer_96.addSubInstruction(sub_295);
		ISubRule sub_296 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_205", null, 0, false);
	subContainer_96.addSubInstruction(sub_296);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97861546EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_96(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB978615A2EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_97 = new DataSub();
	reqAction.addDataSub(subContainer_97);

		ISubRule sub_297 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_204", null, 0, false);
	subContainer_97.addSubInstruction(sub_297);
		ISubRule sub_298 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_102", null, 0, false);
	subContainer_97.addSubInstruction(sub_298);
		ISubRule sub_299 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_203", null, 0, false);
	subContainer_97.addSubInstruction(sub_299);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB978615A5EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_97(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97861601EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_98 = new DataSub();
	reqAction.addDataSub(subContainer_98);

		ISubRule sub_300 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_202", null, 0, false);
	subContainer_98.addSubInstruction(sub_300);
		ISubRule sub_301 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_101", null, 0, false);
	subContainer_98.addSubInstruction(sub_301);
		ISubRule sub_302 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_201", null, 0, false);
	subContainer_98.addSubInstruction(sub_302);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97861604EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_98(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97861660EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_99 = new DataSub();
	reqAction.addDataSub(subContainer_99);

		ISubRule sub_303 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_200", null, 0, false);
	subContainer_99.addSubInstruction(sub_303);
		ISubRule sub_304 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_100", null, 0, false);
	subContainer_99.addSubInstruction(sub_304);
		ISubRule sub_305 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_199", null, 0, false);
	subContainer_99.addSubInstruction(sub_305);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97861663EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_99(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB978B6C50EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_100 = new DataSub();
	reqAction.addDataSub(subContainer_100);

		ISubRule sub_306 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_198", null, 0, false);
	subContainer_100.addSubInstruction(sub_306);
		ISubRule sub_307 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_99", null, 0, false);
	subContainer_100.addSubInstruction(sub_307);
		ISubRule sub_308 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_197", null, 0, false);
	subContainer_100.addSubInstruction(sub_308);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB978B6C53EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_100(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB978B6CAFEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_101 = new DataSub();
	reqAction.addDataSub(subContainer_101);

		ISubRule sub_309 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_196", null, 0, false);
	subContainer_101.addSubInstruction(sub_309);
		ISubRule sub_310 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_98", null, 0, false);
	subContainer_101.addSubInstruction(sub_310);
		ISubRule sub_311 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_195", null, 0, false);
	subContainer_101.addSubInstruction(sub_311);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB978B6CB2EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_101(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB978B6D0EEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_102 = new DataSub();
	reqAction.addDataSub(subContainer_102);

		ISubRule sub_312 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_194", null, 0, false);
	subContainer_102.addSubInstruction(sub_312);
		ISubRule sub_313 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_97", null, 0, false);
	subContainer_102.addSubInstruction(sub_313);
		ISubRule sub_314 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_193", null, 0, false);
	subContainer_102.addSubInstruction(sub_314);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB978B6D11EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_102(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB978B6D6DEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_103 = new DataSub();
	reqAction.addDataSub(subContainer_103);

		ISubRule sub_315 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_192", null, 0, false);
	subContainer_103.addSubInstruction(sub_315);
		ISubRule sub_316 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_96", null, 0, false);
	subContainer_103.addSubInstruction(sub_316);
		ISubRule sub_317 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_191", null, 0, false);
	subContainer_103.addSubInstruction(sub_317);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB978B6D70EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_103(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB978B6DCCEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_104 = new DataSub();
	reqAction.addDataSub(subContainer_104);

		ISubRule sub_318 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_190", null, 0, false);
	subContainer_104.addSubInstruction(sub_318);
		ISubRule sub_319 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_95", null, 0, false);
	subContainer_104.addSubInstruction(sub_319);
		ISubRule sub_320 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_189", null, 0, false);
	subContainer_104.addSubInstruction(sub_320);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB978B6DCFEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_104(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB978B6E2BEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_105 = new DataSub();
	reqAction.addDataSub(subContainer_105);

		ISubRule sub_321 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_188", null, 0, false);
	subContainer_105.addSubInstruction(sub_321);
		ISubRule sub_322 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_94", null, 0, false);
	subContainer_105.addSubInstruction(sub_322);
		ISubRule sub_323 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_187", null, 0, false);
	subContainer_105.addSubInstruction(sub_323);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB978B6E2EEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_105(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB978B6E8AEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_106 = new DataSub();
	reqAction.addDataSub(subContainer_106);

		ISubRule sub_324 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_186", null, 0, false);
	subContainer_106.addSubInstruction(sub_324);
		ISubRule sub_325 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_93", null, 0, false);
	subContainer_106.addSubInstruction(sub_325);
		ISubRule sub_326 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_185", null, 0, false);
	subContainer_106.addSubInstruction(sub_326);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB978B6E8DEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_106(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB978B6EE9EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_107 = new DataSub();
	reqAction.addDataSub(subContainer_107);

		ISubRule sub_327 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_184", null, 0, false);
	subContainer_107.addSubInstruction(sub_327);
		ISubRule sub_328 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_92", null, 0, false);
	subContainer_107.addSubInstruction(sub_328);
		ISubRule sub_329 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_183", null, 0, false);
	subContainer_107.addSubInstruction(sub_329);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB978B6EECEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_107(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB978FD920EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_108 = new DataSub();
	reqAction.addDataSub(subContainer_108);

		ISubRule sub_330 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_182", null, 0, false);
	subContainer_108.addSubInstruction(sub_330);
		ISubRule sub_331 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_91", null, 0, false);
	subContainer_108.addSubInstruction(sub_331);
		ISubRule sub_332 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_181", null, 0, false);
	subContainer_108.addSubInstruction(sub_332);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB978FD923EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_108(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB978FD97FEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_109 = new DataSub();
	reqAction.addDataSub(subContainer_109);

		ISubRule sub_333 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_180", null, 0, false);
	subContainer_109.addSubInstruction(sub_333);
		ISubRule sub_334 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_90", null, 0, false);
	subContainer_109.addSubInstruction(sub_334);
		ISubRule sub_335 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_179", null, 0, false);
	subContainer_109.addSubInstruction(sub_335);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"utf-8",
			"A1F042EB978FD982EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_109(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB978FD9DEEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_110 = new DataSub();
	reqAction.addDataSub(subContainer_110);

		ISubRule sub_336 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_178", null, 0, false);
	subContainer_110.addSubInstruction(sub_336);
		ISubRule sub_337 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_89", null, 0, false);
	subContainer_110.addSubInstruction(sub_337);
		ISubRule sub_338 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_177", null, 0, false);
	subContainer_110.addSubInstruction(sub_338);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"utf-8",
			"A1F042EB978FD9E1EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_110(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB978FDA3DEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_111 = new DataSub();
	reqAction.addDataSub(subContainer_111);

		ISubRule sub_339 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_176", null, 0, false);
	subContainer_111.addSubInstruction(sub_339);
		ISubRule sub_340 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_88", null, 0, false);
	subContainer_111.addSubInstruction(sub_340);
		ISubRule sub_341 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_175", null, 0, false);
	subContainer_111.addSubInstruction(sub_341);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB978FDA40EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_111(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB978FDA9CEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_112 = new DataSub();
	reqAction.addDataSub(subContainer_112);

		ISubRule sub_342 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_174", null, 0, false);
	subContainer_112.addSubInstruction(sub_342);
		ISubRule sub_343 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_87", null, 0, false);
	subContainer_112.addSubInstruction(sub_343);
		ISubRule sub_344 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_173", null, 0, false);
	subContainer_112.addSubInstruction(sub_344);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB978FDA9FEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_112(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB978FDAFBEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_113 = new DataSub();
	reqAction.addDataSub(subContainer_113);

		ISubRule sub_345 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_172", null, 0, false);
	subContainer_113.addSubInstruction(sub_345);
		ISubRule sub_346 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_86", null, 0, false);
	subContainer_113.addSubInstruction(sub_346);
		ISubRule sub_347 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_171", null, 0, false);
	subContainer_113.addSubInstruction(sub_347);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB978FDAFEEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_113(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97949410EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_114 = new DataSub();
	reqAction.addDataSub(subContainer_114);

		ISubRule sub_348 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_170", null, 0, false);
	subContainer_114.addSubInstruction(sub_348);
		ISubRule sub_349 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_85", null, 0, false);
	subContainer_114.addSubInstruction(sub_349);
		ISubRule sub_350 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_169", null, 0, false);
	subContainer_114.addSubInstruction(sub_350);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97949413EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_114(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB9794946FEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_115 = new DataSub();
	reqAction.addDataSub(subContainer_115);

		ISubRule sub_351 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_168", null, 0, false);
	subContainer_115.addSubInstruction(sub_351);
		ISubRule sub_352 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_84", null, 0, false);
	subContainer_115.addSubInstruction(sub_352);
		ISubRule sub_353 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_167", null, 0, false);
	subContainer_115.addSubInstruction(sub_353);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97949472EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_115(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB979494CEEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_116 = new DataSub();
	reqAction.addDataSub(subContainer_116);

		ISubRule sub_354 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_166", null, 0, false);
	subContainer_116.addSubInstruction(sub_354);
		ISubRule sub_355 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_83", null, 0, false);
	subContainer_116.addSubInstruction(sub_355);
		ISubRule sub_356 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_165", null, 0, false);
	subContainer_116.addSubInstruction(sub_356);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB979494D1EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_116(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB9794952DEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_117 = new DataSub();
	reqAction.addDataSub(subContainer_117);

		ISubRule sub_357 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_164", null, 0, false);
	subContainer_117.addSubInstruction(sub_357);
		ISubRule sub_358 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_82", null, 0, false);
	subContainer_117.addSubInstruction(sub_358);
		ISubRule sub_359 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_163", null, 0, false);
	subContainer_117.addSubInstruction(sub_359);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97949530EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_117(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97949588EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_118 = new DataSub();
	reqAction.addDataSub(subContainer_118);

		ISubRule sub_360 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_162", null, 0, false);
	subContainer_118.addSubInstruction(sub_360);
		ISubRule sub_361 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_81", null, 0, false);
	subContainer_118.addSubInstruction(sub_361);
		ISubRule sub_362 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_161", null, 0, false);
	subContainer_118.addSubInstruction(sub_362);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB9794958BEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_118(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB979495E3EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_119 = new DataSub();
	reqAction.addDataSub(subContainer_119);

		ISubRule sub_363 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_160", null, 0, false);
	subContainer_119.addSubInstruction(sub_363);
		ISubRule sub_364 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_80", null, 0, false);
	subContainer_119.addSubInstruction(sub_364);
		ISubRule sub_365 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_159", null, 0, false);
	subContainer_119.addSubInstruction(sub_365);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB979495E6EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_119(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97949642EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_120 = new DataSub();
	reqAction.addDataSub(subContainer_120);

		ISubRule sub_366 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_158", null, 0, false);
	subContainer_120.addSubInstruction(sub_366);
		ISubRule sub_367 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_79", null, 0, false);
	subContainer_120.addSubInstruction(sub_367);
		ISubRule sub_368 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_157", null, 0, false);
	subContainer_120.addSubInstruction(sub_368);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97949645EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_120(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB979496A1EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_121 = new DataSub();
	reqAction.addDataSub(subContainer_121);

		ISubRule sub_369 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_156", null, 0, false);
	subContainer_121.addSubInstruction(sub_369);
		ISubRule sub_370 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_78", null, 0, false);
	subContainer_121.addSubInstruction(sub_370);
		ISubRule sub_371 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_155", null, 0, false);
	subContainer_121.addSubInstruction(sub_371);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB979496A4EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_121(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB979496FCEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_122 = new DataSub();
	reqAction.addDataSub(subContainer_122);

		ISubRule sub_372 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_154", null, 0, false);
	subContainer_122.addSubInstruction(sub_372);
		ISubRule sub_373 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_77", null, 0, false);
	subContainer_122.addSubInstruction(sub_373);
		ISubRule sub_374 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_153", null, 0, false);
	subContainer_122.addSubInstruction(sub_374);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB979496FFEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_122(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97949757EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_123 = new DataSub();
	reqAction.addDataSub(subContainer_123);

		ISubRule sub_375 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_152", null, 0, false);
	subContainer_123.addSubInstruction(sub_375);
		ISubRule sub_376 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_76", null, 0, false);
	subContainer_123.addSubInstruction(sub_376);
		ISubRule sub_377 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_151", null, 0, false);
	subContainer_123.addSubInstruction(sub_377);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB9794975AEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_123(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB979497B2EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_124 = new DataSub();
	reqAction.addDataSub(subContainer_124);

		ISubRule sub_378 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_150", null, 0, false);
	subContainer_124.addSubInstruction(sub_378);
		ISubRule sub_379 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_75", null, 0, false);
	subContainer_124.addSubInstruction(sub_379);
		ISubRule sub_380 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_149", null, 0, false);
	subContainer_124.addSubInstruction(sub_380);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB979497B5EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_124(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97972C38EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_125 = new DataSub();
	reqAction.addDataSub(subContainer_125);

		ISubRule sub_381 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_148", null, 0, false);
	subContainer_125.addSubInstruction(sub_381);
		ISubRule sub_382 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_74", null, 0, false);
	subContainer_125.addSubInstruction(sub_382);
		ISubRule sub_383 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_147", null, 0, false);
	subContainer_125.addSubInstruction(sub_383);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97972C3BEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_125(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97972C93EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_126 = new DataSub();
	reqAction.addDataSub(subContainer_126);

		ISubRule sub_384 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_146", null, 0, false);
	subContainer_126.addSubInstruction(sub_384);
		ISubRule sub_385 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_73", null, 0, false);
	subContainer_126.addSubInstruction(sub_385);
		ISubRule sub_386 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_145", null, 0, false);
	subContainer_126.addSubInstruction(sub_386);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97972C96EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_126(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB979BE710EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_127 = new DataSub();
	reqAction.addDataSub(subContainer_127);

		ISubRule sub_387 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_144", null, 0, false);
	subContainer_127.addSubInstruction(sub_387);
		ISubRule sub_388 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_72", null, 0, false);
	subContainer_127.addSubInstruction(sub_388);
		ISubRule sub_389 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_143", null, 0, false);
	subContainer_127.addSubInstruction(sub_389);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB979BE713EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_127(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB979BE76FEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_128 = new DataSub();
	reqAction.addDataSub(subContainer_128);

		ISubRule sub_390 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_142", null, 0, false);
	subContainer_128.addSubInstruction(sub_390);
		ISubRule sub_391 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_71", null, 0, false);
	subContainer_128.addSubInstruction(sub_391);
		ISubRule sub_392 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_141", null, 0, false);
	subContainer_128.addSubInstruction(sub_392);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB979BE772EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_128(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97A5AB10EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_129 = new DataSub();
	reqAction.addDataSub(subContainer_129);

		ISubRule sub_393 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_140", null, 0, false);
	subContainer_129.addSubInstruction(sub_393);
		ISubRule sub_394 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_70", null, 0, false);
	subContainer_129.addSubInstruction(sub_394);
		ISubRule sub_395 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_139", null, 0, false);
	subContainer_129.addSubInstruction(sub_395);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97A5AB13EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_129(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97A5AB6BEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_130 = new DataSub();
	reqAction.addDataSub(subContainer_130);

		ISubRule sub_396 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_138", null, 0, false);
	subContainer_130.addSubInstruction(sub_396);
		ISubRule sub_397 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_69", null, 0, false);
	subContainer_130.addSubInstruction(sub_397);
		ISubRule sub_398 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_137", null, 0, false);
	subContainer_130.addSubInstruction(sub_398);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97A5AB6EEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_130(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97A5ABC6EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_131 = new DataSub();
	reqAction.addDataSub(subContainer_131);

		ISubRule sub_399 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_136", null, 0, false);
	subContainer_131.addSubInstruction(sub_399);
		ISubRule sub_400 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_68", null, 0, false);
	subContainer_131.addSubInstruction(sub_400);
		ISubRule sub_401 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_135", null, 0, false);
	subContainer_131.addSubInstruction(sub_401);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97A5ABC9EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_131(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97A5AC25EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_132 = new DataSub();
	reqAction.addDataSub(subContainer_132);

		ISubRule sub_402 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_134", null, 0, false);
	subContainer_132.addSubInstruction(sub_402);
		ISubRule sub_403 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_67", null, 0, false);
	subContainer_132.addSubInstruction(sub_403);
		ISubRule sub_404 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_133", null, 0, false);
	subContainer_132.addSubInstruction(sub_404);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97A5AC28EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_132(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97A5AC84EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_133 = new DataSub();
	reqAction.addDataSub(subContainer_133);

		ISubRule sub_405 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_132", null, 0, false);
	subContainer_133.addSubInstruction(sub_405);
		ISubRule sub_406 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_66", null, 0, false);
	subContainer_133.addSubInstruction(sub_406);
		ISubRule sub_407 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_131", null, 0, false);
	subContainer_133.addSubInstruction(sub_407);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97A5AC87EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_133(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97A5ACE3EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_134 = new DataSub();
	reqAction.addDataSub(subContainer_134);

		ISubRule sub_408 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_130", null, 0, false);
	subContainer_134.addSubInstruction(sub_408);
		ISubRule sub_409 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_65", null, 0, false);
	subContainer_134.addSubInstruction(sub_409);
		ISubRule sub_410 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_129", null, 0, false);
	subContainer_134.addSubInstruction(sub_410);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97A5ACE6EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_134(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97A5AD42EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_135 = new DataSub();
	reqAction.addDataSub(subContainer_135);

		ISubRule sub_411 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[21], false, "heartBeat", null, 0, false);
	subContainer_135.addSubInstruction(sub_411);
		ISubRule sub_412 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_128", null, 0, false);
	subContainer_135.addSubInstruction(sub_412);
		ISubRule sub_413 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_64", null, 0, false);
	subContainer_135.addSubInstruction(sub_413);
		ISubRule sub_414 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_127", null, 0, false);
	subContainer_135.addSubInstruction(sub_414);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97A5AD45EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_135(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97A5AD9DEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_136 = new DataSub();
	reqAction.addDataSub(subContainer_136);

		ISubRule sub_415 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[21], false, "heartBeat", null, 0, false);
	subContainer_136.addSubInstruction(sub_415);
		ISubRule sub_416 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_126", null, 0, false);
	subContainer_136.addSubInstruction(sub_416);
		ISubRule sub_417 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_63", null, 0, false);
	subContainer_136.addSubInstruction(sub_417);
		ISubRule sub_418 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_125", null, 0, false);
	subContainer_136.addSubInstruction(sub_418);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97A5ADA0EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_136(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97A5ADF8EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(12);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "417", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Requested-With", "XMLHttpRequest", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "http://dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_2(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_8 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_8);

	harvestContainer_8.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[27], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_7", null, 0, false);
	harvestContainer_8.addHarvestInstruction ("resp_content", dcVars[28], ";jsessionid=(.*?)\"", 1, 1, 0, 0, false, "jsessionid_13", null, 0, false);
	harvestContainer_8.addHarvestInstruction ("resp_content", dcVars[29], "<[[^>].]*?NAME=\"PERF_TIMESTAMP\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_14", null, 0, false);
	harvestContainer_8.addHarvestInstruction ("resp_content", dcVars[30], "<[[^>].]*?NAME=\"HatsCSRF\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_15", null, 0, false);
	harvestContainer_8.addHarvestInstruction ("resp_content", dcVars[31], "<[[^>].]*?NAME=\"CURSORPOSITION\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_16", null, 0, false);
	harvestContainer_8.addHarvestInstruction ("resp_content", dcVars[32], "<[[^>].]*?NAME=\"KeyboardToggle\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_17", null, 0, false);
	harvestContainer_8.addHarvestInstruction ("resp_content", dcVars[33], "<[[^>].]*?NAME=\"SESSIONID\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_18", null, 0, false);
	harvestContainer_8.addHarvestInstruction ("resp_content", dcVars[34], "<[[^>].]*?NAME=\"LINESIZE\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_19", null, 0, false);
	harvestContainer_8.addHarvestInstruction ("resp_content", dcVars[35], "<[[^>].]*?name=\"in_291_10\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_2", null, 0, false);
	IDataSub subContainer_138 = new DataSub();
	reqAction.addDataSub(subContainer_138);

		ISubRule sub_425 = new SubRule("req_uri", 41, 64, false, (IDCCoreVar)dcVars[14], false, "jsessionid", null, 0, false);
	subContainer_138.addSubInstruction(sub_425);
		ISubRule sub_426 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_124", null, 0, false);
	subContainer_138.addSubInstruction(sub_426);
		ISubRule sub_427 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[13], false, "Referer_62", null, 0, false);
	subContainer_138.addSubInstruction(sub_427);
		ISubRule sub_428 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_123", null, 0, false);
	subContainer_138.addSubInstruction(sub_428);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97A5ADFBEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_2(HTTPPostData postData) {
				StringBuffer strBuf_2 = new StringBuffer();
strBuf_2.append("SESSIONNUMBER=&PERF_TIMESTAMP=0&HatsCSRF=null&COMMAND=%5Bent");
strBuf_2.append("er%5D&CURSORPOSITION=5&KeyboardToggle=1&SESSIONID=UZzWvcHHMZ");
strBuf_2.append("R2lDdFbM6tHKb&CARETPOS=5&LINESIZE=2&in_1_80=ssc1&disabled=&d");
strBuf_2.append("isabled=&disabled=&disabled=&disabled=&disabled=&disabled=&d");
strBuf_2.append("isabled=&disabled=&disabled=&disabled=&disabled=&disabled=&d");
strBuf_2.append("isabled=&disabled=&disabled=&disabled=&disabled=&disabled=&d");
strBuf_2.append("isabled=&disabled=&disabled=&disabled=&ISCURSORDECR=false");
String requestData_2 = strBuf_2.toString();
			
	HTTPPostDataChunk pdc_1 = new HTTPPostDataChunk("A1F042EB97A5AE40EF72E23734373638", postData, requestData_2, "UTF-8", 41, 155);
	postData.addDataChunk(pdc_1);

	IDataSub subContainer_137 = new DataSub();
	pdc_1.addDataSub(subContainer_137);

		ISubRule sub_419 = new SubRule("req_content", 154, 1, true, (IDCCoreVar)dcVars[20], false, "LINESIZE", null, 0, false);
	subContainer_137.addSubInstruction(sub_419);
		ISubRule sub_420 = new SubRule("req_content", 110, 23, true, (IDCCoreVar)dcVars[19], false, "SESSIONID", null, 0, false);
	subContainer_137.addSubInstruction(sub_420);
		ISubRule sub_421 = new SubRule("req_content", 98, 1, true, (IDCCoreVar)dcVars[18], false, "KeyboardToggle", null, 0, false);
	subContainer_137.addSubInstruction(sub_421);
		ISubRule sub_422 = new SubRule("req_content", 54, 11, true, (IDCCoreVar)dcVars[17], false, "COMMAND", null, 0, false);
	subContainer_137.addSubInstruction(sub_422);
		ISubRule sub_423 = new SubRule("req_content", 41, 4, true, (IDCCoreVar)dcVars[16], false, "HatsCSRF", null, 0, false);
	subContainer_137.addSubInstruction(sub_423);
		ISubRule sub_424 = new SubRule("req_content", 30, 1, true, (IDCCoreVar)dcVars[15], false, "PERF_TIMESTAMP", null, 0, false);
	subContainer_137.addSubInstruction(sub_424);
	



	}

	public HTTPAction request_137(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97A5AE6BEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(9);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/javascript, application/javascript, application/ecmascript, application/x-ecmascript, */*; q=0.01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Requested-With", "XMLHttpRequest", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_139 = new DataSub();
	reqAction.addDataSub(subContainer_139);

		ISubRule sub_429 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_122", null, 0, false);
	subContainer_139.addSubInstruction(sub_429);
		ISubRule sub_430 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[27], false, "Referer_61", null, 0, false);
	subContainer_139.addSubInstruction(sub_430);
		ISubRule sub_431 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_121", null, 0, false);
	subContainer_139.addSubInstruction(sub_431);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97A5ADF8EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97A5AE6EEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_138(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97A5AECEEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(9);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/javascript, application/javascript, application/ecmascript, application/x-ecmascript, */*; q=0.01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Requested-With", "XMLHttpRequest", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_140 = new DataSub();
	reqAction.addDataSub(subContainer_140);

		ISubRule sub_432 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_120", null, 0, false);
	subContainer_140.addSubInstruction(sub_432);
		ISubRule sub_433 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[27], false, "Referer_60", null, 0, false);
	subContainer_140.addSubInstruction(sub_433);
		ISubRule sub_434 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_119", null, 0, false);
	subContainer_140.addSubInstruction(sub_434);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97A5ADF8EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97A5AED1EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_139(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97A5AF31EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(9);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/javascript, application/javascript, application/ecmascript, application/x-ecmascript, */*; q=0.01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Requested-With", "XMLHttpRequest", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_141 = new DataSub();
	reqAction.addDataSub(subContainer_141);

		ISubRule sub_435 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_118", null, 0, false);
	subContainer_141.addSubInstruction(sub_435);
		ISubRule sub_436 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[27], false, "Referer_59", null, 0, false);
	subContainer_141.addSubInstruction(sub_436);
		ISubRule sub_437 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_117", null, 0, false);
	subContainer_141.addSubInstruction(sub_437);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97A5ADF8EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97A5AF34EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_140(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97A5AF94EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(12);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "321", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Requested-With", "XMLHttpRequest", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "http://dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_3(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_9 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_9);

	harvestContainer_9.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[36], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_8", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[37], ";jsessionid=(.*?)\"", 1, 1, 0, 0, false, "jsessionid_14", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[38], "<[[^>].]*?NAME=\"PERF_TIMESTAMP\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_20", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[39], "<[[^>].]*?NAME=\"HatsCSRF\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_21", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[40], "<[[^>].]*?NAME=\"COMMAND\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_22", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[41], "<[[^>].]*?NAME=\"KeyboardToggle\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_23", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[42], "<[[^>].]*?NAME=\"SESSIONID\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_24", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[43], "<[[^>].]*?NAME=\"LINESIZE\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_25", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[44], "\\?heartBeat=(.*?)&", 1, 1, 0, 0, false, "heartBeat_52", null, 0, false);
	IDataSub subContainer_143 = new DataSub();
	reqAction.addDataSub(subContainer_143);

		ISubRule sub_445 = new SubRule("req_uri", 41, 64, false, (IDCCoreVar)dcVars[28], false, "jsessionid", null, 0, false);
	subContainer_143.addSubInstruction(sub_445);
		ISubRule sub_446 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_116", null, 0, false);
	subContainer_143.addSubInstruction(sub_446);
		ISubRule sub_447 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[27], false, "Referer_58", null, 0, false);
	subContainer_143.addSubInstruction(sub_447);
		ISubRule sub_448 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_115", null, 0, false);
	subContainer_143.addSubInstruction(sub_448);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97A5ADF8EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97A5ADF8EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97A5AF97EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_3(HTTPPostData postData) {
				StringBuffer strBuf_3 = new StringBuffer();
strBuf_3.append("SESSIONNUMBER=&PERF_TIMESTAMP=0&HatsCSRF=null&COMMAND=poll_r");
strBuf_3.append("efresh&CURSORPOSITION=291&KeyboardToggle=1&SESSIONID=UZzWvcH");
strBuf_3.append("HMZR2lDdFbM6tHKb&CARETPOS=291&LINESIZE=2&in_291_10=000000000");
strBuf_3.append("0&in_371_10=&in_451_20=&in_531_10=&in_611_20=&in_691_4=&in_7");
strBuf_3.append("71_8=&in_851_20=&in_931_20=&in_1011_27=&in_1705_1=&in_1849_7");
strBuf_3.append("2=&ISCURSORDECR=false");
String requestData_3 = strBuf_3.toString();
			
	HTTPPostDataChunk pdc_2 = new HTTPPostDataChunk("A1F042EB97A5AFDCEF72E23734373638", postData, requestData_3, "UTF-8", 43, 181);
	postData.addDataChunk(pdc_2);

	IDataSub subContainer_142 = new DataSub();
	pdc_2.addDataSub(subContainer_142);

		ISubRule sub_438 = new SubRule("req_content", 171, 10, true, (IDCCoreVar)dcVars[35], false, "in_291_10", null, 0, false);
	subContainer_142.addSubInstruction(sub_438);
		ISubRule sub_439 = new SubRule("req_content", 159, 1, true, (IDCCoreVar)dcVars[34], false, "LINESIZE", null, 0, false);
	subContainer_142.addSubInstruction(sub_439);
		ISubRule sub_440 = new SubRule("req_content", 113, 23, true, (IDCCoreVar)dcVars[33], false, "SESSIONID", null, 0, false);
	subContainer_142.addSubInstruction(sub_440);
		ISubRule sub_441 = new SubRule("req_content", 101, 1, true, (IDCCoreVar)dcVars[32], false, "KeyboardToggle", null, 0, false);
	subContainer_142.addSubInstruction(sub_441);
		ISubRule sub_442 = new SubRule("req_content", 82, 3, true, (IDCCoreVar)dcVars[31], false, "CURSORPOSITION", null, 0, false);
	subContainer_142.addSubInstruction(sub_442);
		ISubRule sub_443 = new SubRule("req_content", 41, 4, true, (IDCCoreVar)dcVars[30], false, "HatsCSRF", null, 0, false);
	subContainer_142.addSubInstruction(sub_443);
		ISubRule sub_444 = new SubRule("req_content", 30, 1, true, (IDCCoreVar)dcVars[29], false, "PERF_TIMESTAMP", null, 0, false);
	subContainer_142.addSubInstruction(sub_444);
	



	}

	public HTTPAction request_141(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97A5B008EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_144 = new DataSub();
	reqAction.addDataSub(subContainer_144);

		ISubRule sub_449 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[44], false, "heartBeat", null, 0, false);
	subContainer_144.addSubInstruction(sub_449);
		ISubRule sub_450 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_114", null, 0, false);
	subContainer_144.addSubInstruction(sub_450);
		ISubRule sub_451 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[36], false, "Referer_57", null, 0, false);
	subContainer_144.addSubInstruction(sub_451);
		ISubRule sub_452 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_113", null, 0, false);
	subContainer_144.addSubInstruction(sub_452);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97A5AF94EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97A5AF94EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97A5B00BEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_142(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97A5B063EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_145 = new DataSub();
	reqAction.addDataSub(subContainer_145);

		ISubRule sub_453 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[44], false, "heartBeat", null, 0, false);
	subContainer_145.addSubInstruction(sub_453);
		ISubRule sub_454 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_112", null, 0, false);
	subContainer_145.addSubInstruction(sub_454);
		ISubRule sub_455 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[36], false, "Referer_56", null, 0, false);
	subContainer_145.addSubInstruction(sub_455);
		ISubRule sub_456 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_111", null, 0, false);
	subContainer_145.addSubInstruction(sub_456);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97A5AF94EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97A5AF94EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97A5B066EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_143(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97A5B0BFEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_146 = new DataSub();
	reqAction.addDataSub(subContainer_146);

		ISubRule sub_457 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[44], false, "heartBeat", null, 0, false);
	subContainer_146.addSubInstruction(sub_457);
		ISubRule sub_458 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_110", null, 0, false);
	subContainer_146.addSubInstruction(sub_458);
		ISubRule sub_459 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[36], false, "Referer_55", null, 0, false);
	subContainer_146.addSubInstruction(sub_459);
		ISubRule sub_460 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_109", null, 0, false);
	subContainer_146.addSubInstruction(sub_460);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97A5AF94EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97A5AF94EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97A5B0C2EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_144(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97A5B11AEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_147 = new DataSub();
	reqAction.addDataSub(subContainer_147);

		ISubRule sub_461 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[44], false, "heartBeat", null, 0, false);
	subContainer_147.addSubInstruction(sub_461);
		ISubRule sub_462 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_108", null, 0, false);
	subContainer_147.addSubInstruction(sub_462);
		ISubRule sub_463 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[36], false, "Referer_54", null, 0, false);
	subContainer_147.addSubInstruction(sub_463);
		ISubRule sub_464 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_107", null, 0, false);
	subContainer_147.addSubInstruction(sub_464);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97A5AF94EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97A5AF94EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97A81C12EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	private KComment comment_3(final IContainer parent) {
		return new KComment(parent, "comment_3", "A1F042EB97A81C6AEF72E23734373638", "Cust Number = 0000000001") ;
	}
private HTTPPage page_5(final IContainer parent) {
			HTTPThink think = new HTTPThink(3627, 1, parent, parent, "A1F042EB97A81C72EF72E23734373638");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "ModernizedInsuranceApp_asynch {1}", "A1F042EB97A81C72EF72E23734373638") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(13, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_145(this, true, "A1F042EB972075E3EF72E23734373638", false, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{9}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223887021", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_146(this, false, "A1F042EB972075E3EF72E23734373638", true, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{10}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223888132", true, false), 842, 100, "A1F042EB97A81C76EF72E23734373638", 3);
				httpParallel.addRequest(1, request_147(this, false, "A1F042EB97207580EF72E23734373638", false, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{11}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223892017", true, false), 3614, 100, "A1F042EB97A81CD2EF72E23734373638", 3);
				httpParallel.addRequest(1, request_148(this, false, "A1F042EB97207580EF72E23734373638", true, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{12}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223893128", true, false), 850, 100, "A1F042EB97A81D2EEF72E23734373638", 3);
				httpParallel.addRequest(2, request_149(this, false, "A1F042EB97AA8D10EF72E23734373638", false, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{13}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223897018", true, false), 3633, 100, "A1F042EB97A81D89EF72E23734373638", 3);
				httpParallel.addRequest(2, request_150(this, false, "A1F042EB97AA8D10EF72E23734373638", true, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{14}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223898134", true, false), 592, 100, "A1F042EB97AA8D18EF72E23734373638", 3);
				httpParallel.addRequest(3, request_151(this, false, "A1F042EB97AA8DCFEF72E23734373638", false, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{15}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223902006", true, false), 3613, 100, "A1F042EB97AA8D73EF72E23734373638", 3);
				httpParallel.addRequest(3, request_152(this, false, "A1F042EB97AA8DCFEF72E23734373638", true, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{16}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223903127", true, false), 600, 100, "A1F042EB97AA8DD7EF72E23734373638", 3);
				httpParallel.addRequest(4, request_153(this, false, "A1F042EB97ACFE6CEF72E23734373638", false, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{17}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223907017", true, false), 3627, 100, "A1F042EB97ACFE10EF72E23734373638", 3);
				httpParallel.addRequest(4, request_154(this, false, "A1F042EB97ACFE6CEF72E23734373638", false, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{18}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223908128", true, false), 587, 100, "A1F042EB97ACFE74EF72E23734373638", 3);
				httpParallel.addRequest(4, request_155(this, false, "A1F042EB97ACFE6CEF72E23734373638", true, true,
						"Config_1", "entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{3}",	"/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", true, false), 2746, 100, "A1F042EB97B1E010EF72E23734373638", 3);
				httpParallel.addRequest(5, request_156(this, false, "A1F042EB97B45110EF72E23734373638", false, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{19}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223912010", true, false), 291, 100, "A1F042EB97B1E06BEF72E23734373638", 2);
				httpParallel.addRequest(5, request_157(this, false, "A1F042EB97B45110EF72E23734373638", false, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{20}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223912738", true, false), 186, 100, "A1F042EB97B45118EF72E23734373638", 3);
				httpParallel.addRequest(5, request_158(this, false, "A1F042EB97B45110EF72E23734373638", true, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{21}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223913136", true, false), 130, 100, "A1F042EB97B6C210EF72E23734373638", 3);
				httpParallel.addRequest(6, request_159(this, false, "A1F042EB97B93310EF72E23734373638", false, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{22}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223917014", true, false), 5295, 100, "A1F042EB97B1E06BEF72E23734373638", 2);
				httpParallel.addRequest(6, request_160(this, false, "A1F042EB97B93310EF72E23734373638", false, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{23}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223917743", true, false), 209, 100, "A1F042EB97B93318EF72E23734373638", 3);
				httpParallel.addRequest(6, request_161(this, false, "A1F042EB97B93310EF72E23734373638", true, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{24}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223918122", true, false), 123, 100, "A1F042EB97BB7D00EF72E23734373638", 3);
				httpParallel.addRequest(7, request_162(this, false, "A1F042EB97BB7DB7EF72E23734373638", false, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{25}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223922007", true, false), 10291, 100, "A1F042EB97B1E06BEF72E23734373638", 2);
				httpParallel.addRequest(7, request_163(this, false, "A1F042EB97BB7DB7EF72E23734373638", false, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{26}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223922744", true, false), 220, 100, "A1F042EB97BB7DBFEF72E23734373638", 3);
				httpParallel.addRequest(7, request_164(this, false, "A1F042EB97BB7DB7EF72E23734373638", true, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{27}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223923127", true, false), 135, 100, "A1F042EB97BDEE00EF72E23734373638", 3);
				httpParallel.addRequest(8, request_165(this, false, "A1F042EB97C05F00EF72E23734373638", false, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{28}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223927007", true, false), 15291, 100, "A1F042EB97B1E06BEF72E23734373638", 2);
				httpParallel.addRequest(8, request_166(this, false, "A1F042EB97C05F00EF72E23734373638", false, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{29}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223927755", true, false), 232, 100, "A1F042EB97C05F08EF72E23734373638", 3);
				httpParallel.addRequest(8, request_167(this, false, "A1F042EB97C05F00EF72E23734373638", true, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{30}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223928126", true, false), 115, 100, "A1F042EB97C05F63EF72E23734373638", 3);
				httpParallel.addRequest(9, request_168(this, false, "A1F042EB97C54100EF72E23734373638", false, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{31}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223932011", true, false), 20295, 100, "A1F042EB97B1E06BEF72E23734373638", 2);
				httpParallel.addRequest(9, request_169(this, false, "A1F042EB97C54100EF72E23734373638", false, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{32}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223932745", true, false), 220, 100, "A1F042EB97C54108EF72E23734373638", 3);
				httpParallel.addRequest(9, request_170(this, false, "A1F042EB97C54100EF72E23734373638", true, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{33}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223933132", true, false), 137, 100, "A1F042EB97C54163EF72E23734373638", 3);
				httpParallel.addRequest(10, request_171(this, false, "A1F042EB97C87550EF72E23734373638", false, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{34}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223937006", true, false), 25287, 100, "A1F042EB97B1E06BEF72E23734373638", 2);
				httpParallel.addRequest(10, request_172(this, false, "A1F042EB97C87550EF72E23734373638", false, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{35}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223937739", true, false), 222, 100, "A1F042EB97C87558EF72E23734373638", 3);
				httpParallel.addRequest(10, request_173(this, false, "A1F042EB97C87550EF72E23734373638", true, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{36}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223938122", true, false), 125, 100, "A1F042EB97CA2300EF72E23734373638", 3);
				httpParallel.addRequest(11, request_174(this, false, "A1F042EB97CC9400EF72E23734373638", false, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{37}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223942011", true, false), 30296, 100, "A1F042EB97B1E06BEF72E23734373638", 2);
				httpParallel.addRequest(11, request_175(this, false, "A1F042EB97CC9400EF72E23734373638", false, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{38}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223942745", true, false), 216, 100, "A1F042EB97CC9408EF72E23734373638", 3);
				httpParallel.addRequest(11, request_176(this, false, "A1F042EB97CC9400EF72E23734373638", true, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{39}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223943127", true, false), 135, 100, "A1F042EB97CC9463EF72E23734373638", 3);
				httpParallel.addRequest(12, request_177(this, false, "A1F042EB97CF0501EF72E23734373638", false, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{40}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223947014", true, false), 35297, 100, "A1F042EB97B1E06BEF72E23734373638", 2);
				httpParallel.addRequest(12, request_178(this, false, "A1F042EB97CF0501EF72E23734373638", false, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{41}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223947746", true, false), 216, 100, "A1F042EB97CF0509EF72E23734373638", 3);
				httpParallel.addRequest(12, request_179(this, false, "A1F042EB97CF0501EF72E23734373638", false, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{42}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223948126", true, false), 126, 100, "A1F042EB97D17600EF72E23734373638", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_145(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97A81C76EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_148 = new DataSub();
	reqAction.addDataSub(subContainer_148);

		ISubRule sub_465 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[44], false, "heartBeat", null, 0, false);
	subContainer_148.addSubInstruction(sub_465);
		ISubRule sub_466 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_106", null, 0, false);
	subContainer_148.addSubInstruction(sub_466);
		ISubRule sub_467 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[36], false, "Referer_53", null, 0, false);
	subContainer_148.addSubInstruction(sub_467);
		ISubRule sub_468 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_105", null, 0, false);
	subContainer_148.addSubInstruction(sub_468);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97A81C79EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_146(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97A81CD2EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_149 = new DataSub();
	reqAction.addDataSub(subContainer_149);

		ISubRule sub_469 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[44], false, "heartBeat", null, 0, false);
	subContainer_149.addSubInstruction(sub_469);
		ISubRule sub_470 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_104", null, 0, false);
	subContainer_149.addSubInstruction(sub_470);
		ISubRule sub_471 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[36], false, "Referer_52", null, 0, false);
	subContainer_149.addSubInstruction(sub_471);
		ISubRule sub_472 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_103", null, 0, false);
	subContainer_149.addSubInstruction(sub_472);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97A81CD5EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_147(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97A81D2EEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_150 = new DataSub();
	reqAction.addDataSub(subContainer_150);

		ISubRule sub_473 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[44], false, "heartBeat", null, 0, false);
	subContainer_150.addSubInstruction(sub_473);
		ISubRule sub_474 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_102", null, 0, false);
	subContainer_150.addSubInstruction(sub_474);
		ISubRule sub_475 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[36], false, "Referer_51", null, 0, false);
	subContainer_150.addSubInstruction(sub_475);
		ISubRule sub_476 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_101", null, 0, false);
	subContainer_150.addSubInstruction(sub_476);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97A81D31EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_148(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97A81D89EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_151 = new DataSub();
	reqAction.addDataSub(subContainer_151);

		ISubRule sub_477 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[44], false, "heartBeat", null, 0, false);
	subContainer_151.addSubInstruction(sub_477);
		ISubRule sub_478 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_100", null, 0, false);
	subContainer_151.addSubInstruction(sub_478);
		ISubRule sub_479 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[36], false, "Referer_50", null, 0, false);
	subContainer_151.addSubInstruction(sub_479);
		ISubRule sub_480 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_99", null, 0, false);
	subContainer_151.addSubInstruction(sub_480);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97A81D8CEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_149(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97AA8D18EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_152 = new DataSub();
	reqAction.addDataSub(subContainer_152);

		ISubRule sub_481 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[44], false, "heartBeat", null, 0, false);
	subContainer_152.addSubInstruction(sub_481);
		ISubRule sub_482 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_98", null, 0, false);
	subContainer_152.addSubInstruction(sub_482);
		ISubRule sub_483 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[36], false, "Referer_49", null, 0, false);
	subContainer_152.addSubInstruction(sub_483);
		ISubRule sub_484 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_97", null, 0, false);
	subContainer_152.addSubInstruction(sub_484);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97AA8D1BEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_150(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97AA8D73EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_153 = new DataSub();
	reqAction.addDataSub(subContainer_153);

		ISubRule sub_485 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[44], false, "heartBeat", null, 0, false);
	subContainer_153.addSubInstruction(sub_485);
		ISubRule sub_486 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_96", null, 0, false);
	subContainer_153.addSubInstruction(sub_486);
		ISubRule sub_487 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[36], false, "Referer_48", null, 0, false);
	subContainer_153.addSubInstruction(sub_487);
		ISubRule sub_488 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_95", null, 0, false);
	subContainer_153.addSubInstruction(sub_488);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97AA8D76EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_151(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97AA8DD7EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_154 = new DataSub();
	reqAction.addDataSub(subContainer_154);

		ISubRule sub_489 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[44], false, "heartBeat", null, 0, false);
	subContainer_154.addSubInstruction(sub_489);
		ISubRule sub_490 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_94", null, 0, false);
	subContainer_154.addSubInstruction(sub_490);
		ISubRule sub_491 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[36], false, "Referer_47", null, 0, false);
	subContainer_154.addSubInstruction(sub_491);
		ISubRule sub_492 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_93", null, 0, false);
	subContainer_154.addSubInstruction(sub_492);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97AA8DDAEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_152(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97ACFE10EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_155 = new DataSub();
	reqAction.addDataSub(subContainer_155);

		ISubRule sub_493 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[44], false, "heartBeat", null, 0, false);
	subContainer_155.addSubInstruction(sub_493);
		ISubRule sub_494 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_92", null, 0, false);
	subContainer_155.addSubInstruction(sub_494);
		ISubRule sub_495 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[36], false, "Referer_46", null, 0, false);
	subContainer_155.addSubInstruction(sub_495);
		ISubRule sub_496 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_91", null, 0, false);
	subContainer_155.addSubInstruction(sub_496);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97ACFE13EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_153(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97ACFE74EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_156 = new DataSub();
	reqAction.addDataSub(subContainer_156);

		ISubRule sub_497 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[44], false, "heartBeat", null, 0, false);
	subContainer_156.addSubInstruction(sub_497);
		ISubRule sub_498 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_90", null, 0, false);
	subContainer_156.addSubInstruction(sub_498);
		ISubRule sub_499 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[36], false, "Referer_45", null, 0, false);
	subContainer_156.addSubInstruction(sub_499);
		ISubRule sub_500 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_89", null, 0, false);
	subContainer_156.addSubInstruction(sub_500);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97ACFE77EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_154(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97B1E010EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_157 = new DataSub();
	reqAction.addDataSub(subContainer_157);

		ISubRule sub_501 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[44], false, "heartBeat", null, 0, false);
	subContainer_157.addSubInstruction(sub_501);
		ISubRule sub_502 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_88", null, 0, false);
	subContainer_157.addSubInstruction(sub_502);
		ISubRule sub_503 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[36], false, "Referer_44", null, 0, false);
	subContainer_157.addSubInstruction(sub_503);
		ISubRule sub_504 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_87", null, 0, false);
	subContainer_157.addSubInstruction(sub_504);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97B1E013EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_155(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97B1E06BEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(12);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "310", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Requested-With", "XMLHttpRequest", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "http://dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_4(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_10 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_10);

	harvestContainer_10.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[45], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_9", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[46], ";jsessionid=(.*?)\"", 1, 1, 0, 0, false, "jsessionid_15", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[47], "<[[^>].]*?NAME=\"PERF_TIMESTAMP\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_31", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[48], "<[[^>].]*?NAME=\"HatsCSRF\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_26", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[49], "<[[^>].]*?NAME=\"CURSORPOSITION\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_27", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[50], "<[[^>].]*?NAME=\"KeyboardToggle\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_28", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[51], "<[[^>].]*?NAME=\"SESSIONID\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_32", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[52], "<[[^>].]*?NAME=\"CARETPOS\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_29", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[53], "<[[^>].]*?NAME=\"LINESIZE\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_30", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[54], "\\?heartBeat=(.*?)&", 1, 1, 0, 0, false, "heartBeat_53", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[55], "<[[^>].]*?name=\"in_291_10\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_3", null, 0, false);
	IDataSub subContainer_159 = new DataSub();
	reqAction.addDataSub(subContainer_159);

		ISubRule sub_511 = new SubRule("req_uri", 41, 64, false, (IDCCoreVar)dcVars[37], false, "jsessionid", null, 0, false);
	subContainer_159.addSubInstruction(sub_511);
		ISubRule sub_512 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_86", null, 0, false);
	subContainer_159.addSubInstruction(sub_512);
		ISubRule sub_513 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[36], false, "Referer_43", null, 0, false);
	subContainer_159.addSubInstruction(sub_513);
		ISubRule sub_514 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_85", null, 0, false);
	subContainer_159.addSubInstruction(sub_514);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97B1E06EEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_4(HTTPPostData postData) {
				StringBuffer strBuf_4 = new StringBuffer();
strBuf_4.append("SESSIONNUMBER=&PERF_TIMESTAMP=0&HatsCSRF=null&COMMAND=%5Bent");
strBuf_4.append("er%5D&CURSORPOSITION=300&KeyboardToggle=1&SESSIONID=UZzWvcHH");
strBuf_4.append("MZR2lDdFbM6tHKb&CARETPOS=301&LINESIZE=2&in_291_10=0000000001");
strBuf_4.append("&disabled=&disabled=&disabled=&disabled=&disabled=&disabled=");
strBuf_4.append("&disabled=&disabled=&disabled=&disabled=1&disabled=&ISCURSOR");
strBuf_4.append("DECR=false");
String requestData_4 = strBuf_4.toString();
			
	HTTPPostDataChunk pdc_3 = new HTTPPostDataChunk("A1F042EB97B1E0B3EF72E23734373638", postData, requestData_4, "UTF-8", 41, 159);
	postData.addDataChunk(pdc_3);

	IDataSub subContainer_158 = new DataSub();
	pdc_3.addDataSub(subContainer_158);

		ISubRule sub_505 = new SubRule("req_content", 158, 1, true, (IDCCoreVar)dcVars[43], false, "LINESIZE", null, 0, false);
	subContainer_158.addSubInstruction(sub_505);
		ISubRule sub_506 = new SubRule("req_content", 112, 23, true, (IDCCoreVar)dcVars[42], false, "SESSIONID", null, 0, false);
	subContainer_158.addSubInstruction(sub_506);
		ISubRule sub_507 = new SubRule("req_content", 100, 1, true, (IDCCoreVar)dcVars[41], false, "KeyboardToggle", null, 0, false);
	subContainer_158.addSubInstruction(sub_507);
		ISubRule sub_508 = new SubRule("req_content", 54, 11, true, (IDCCoreVar)dcVars[40], false, "COMMAND", null, 0, false);
	subContainer_158.addSubInstruction(sub_508);
		ISubRule sub_509 = new SubRule("req_content", 41, 4, true, (IDCCoreVar)dcVars[39], false, "HatsCSRF", null, 0, false);
	subContainer_158.addSubInstruction(sub_509);
		ISubRule sub_510 = new SubRule("req_content", 30, 1, true, (IDCCoreVar)dcVars[38], false, "PERF_TIMESTAMP", null, 0, false);
	subContainer_158.addSubInstruction(sub_510);
	



	}

	public HTTPAction request_156(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97B45118EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_160 = new DataSub();
	reqAction.addDataSub(subContainer_160);

		ISubRule sub_515 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[54], false, "heartBeat", null, 0, false);
	subContainer_160.addSubInstruction(sub_515);
		ISubRule sub_516 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_84", null, 0, false);
	subContainer_160.addSubInstruction(sub_516);
		ISubRule sub_517 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[45], false, "Referer_42", null, 0, false);
	subContainer_160.addSubInstruction(sub_517);
		ISubRule sub_518 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_83", null, 0, false);
	subContainer_160.addSubInstruction(sub_518);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97B4511BEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_157(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97B6C210EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_161 = new DataSub();
	reqAction.addDataSub(subContainer_161);

		ISubRule sub_519 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[54], false, "heartBeat", null, 0, false);
	subContainer_161.addSubInstruction(sub_519);
		ISubRule sub_520 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_82", null, 0, false);
	subContainer_161.addSubInstruction(sub_520);
		ISubRule sub_521 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[45], false, "Referer_41", null, 0, false);
	subContainer_161.addSubInstruction(sub_521);
		ISubRule sub_522 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_81", null, 0, false);
	subContainer_161.addSubInstruction(sub_522);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97B6C213EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_158(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97B6C26BEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_162 = new DataSub();
	reqAction.addDataSub(subContainer_162);

		ISubRule sub_523 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[54], false, "heartBeat", null, 0, false);
	subContainer_162.addSubInstruction(sub_523);
		ISubRule sub_524 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_80", null, 0, false);
	subContainer_162.addSubInstruction(sub_524);
		ISubRule sub_525 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[45], false, "Referer_40", null, 0, false);
	subContainer_162.addSubInstruction(sub_525);
		ISubRule sub_526 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_79", null, 0, false);
	subContainer_162.addSubInstruction(sub_526);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97B6C26EEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_159(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97B93318EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_163 = new DataSub();
	reqAction.addDataSub(subContainer_163);

		ISubRule sub_527 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[54], false, "heartBeat", null, 0, false);
	subContainer_163.addSubInstruction(sub_527);
		ISubRule sub_528 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_78", null, 0, false);
	subContainer_163.addSubInstruction(sub_528);
		ISubRule sub_529 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[45], false, "Referer_39", null, 0, false);
	subContainer_163.addSubInstruction(sub_529);
		ISubRule sub_530 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_77", null, 0, false);
	subContainer_163.addSubInstruction(sub_530);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97B9331BEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_160(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97BB7D00EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_164 = new DataSub();
	reqAction.addDataSub(subContainer_164);

		ISubRule sub_531 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[54], false, "heartBeat", null, 0, false);
	subContainer_164.addSubInstruction(sub_531);
		ISubRule sub_532 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_76", null, 0, false);
	subContainer_164.addSubInstruction(sub_532);
		ISubRule sub_533 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[45], false, "Referer_38", null, 0, false);
	subContainer_164.addSubInstruction(sub_533);
		ISubRule sub_534 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_75", null, 0, false);
	subContainer_164.addSubInstruction(sub_534);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97BB7D03EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_161(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97BB7D5BEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_165 = new DataSub();
	reqAction.addDataSub(subContainer_165);

		ISubRule sub_535 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[54], false, "heartBeat", null, 0, false);
	subContainer_165.addSubInstruction(sub_535);
		ISubRule sub_536 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_74", null, 0, false);
	subContainer_165.addSubInstruction(sub_536);
		ISubRule sub_537 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[45], false, "Referer_37", null, 0, false);
	subContainer_165.addSubInstruction(sub_537);
		ISubRule sub_538 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_73", null, 0, false);
	subContainer_165.addSubInstruction(sub_538);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97BB7D5EEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_162(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97BB7DBFEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_166 = new DataSub();
	reqAction.addDataSub(subContainer_166);

		ISubRule sub_539 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[54], false, "heartBeat", null, 0, false);
	subContainer_166.addSubInstruction(sub_539);
		ISubRule sub_540 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_72", null, 0, false);
	subContainer_166.addSubInstruction(sub_540);
		ISubRule sub_541 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[45], false, "Referer_36", null, 0, false);
	subContainer_166.addSubInstruction(sub_541);
		ISubRule sub_542 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_71", null, 0, false);
	subContainer_166.addSubInstruction(sub_542);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97BB7DC2EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_163(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97BDEE00EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_167 = new DataSub();
	reqAction.addDataSub(subContainer_167);

		ISubRule sub_543 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[54], false, "heartBeat", null, 0, false);
	subContainer_167.addSubInstruction(sub_543);
		ISubRule sub_544 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_70", null, 0, false);
	subContainer_167.addSubInstruction(sub_544);
		ISubRule sub_545 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[45], false, "Referer_35", null, 0, false);
	subContainer_167.addSubInstruction(sub_545);
		ISubRule sub_546 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_69", null, 0, false);
	subContainer_167.addSubInstruction(sub_546);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97BDEE03EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_164(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97BDEE5BEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_168 = new DataSub();
	reqAction.addDataSub(subContainer_168);

		ISubRule sub_547 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[54], false, "heartBeat", null, 0, false);
	subContainer_168.addSubInstruction(sub_547);
		ISubRule sub_548 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_68", null, 0, false);
	subContainer_168.addSubInstruction(sub_548);
		ISubRule sub_549 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[45], false, "Referer_34", null, 0, false);
	subContainer_168.addSubInstruction(sub_549);
		ISubRule sub_550 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_67", null, 0, false);
	subContainer_168.addSubInstruction(sub_550);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97BDEE5EEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_165(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97C05F08EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_169 = new DataSub();
	reqAction.addDataSub(subContainer_169);

		ISubRule sub_551 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[54], false, "heartBeat", null, 0, false);
	subContainer_169.addSubInstruction(sub_551);
		ISubRule sub_552 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_66", null, 0, false);
	subContainer_169.addSubInstruction(sub_552);
		ISubRule sub_553 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[45], false, "Referer_33", null, 0, false);
	subContainer_169.addSubInstruction(sub_553);
		ISubRule sub_554 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_65", null, 0, false);
	subContainer_169.addSubInstruction(sub_554);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97C05F0BEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_166(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97C05F63EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_170 = new DataSub();
	reqAction.addDataSub(subContainer_170);

		ISubRule sub_555 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[54], false, "heartBeat", null, 0, false);
	subContainer_170.addSubInstruction(sub_555);
		ISubRule sub_556 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_64", null, 0, false);
	subContainer_170.addSubInstruction(sub_556);
		ISubRule sub_557 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[45], false, "Referer_32", null, 0, false);
	subContainer_170.addSubInstruction(sub_557);
		ISubRule sub_558 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_63", null, 0, false);
	subContainer_170.addSubInstruction(sub_558);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97C05F66EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_167(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97C2D000EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_171 = new DataSub();
	reqAction.addDataSub(subContainer_171);

		ISubRule sub_559 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[54], false, "heartBeat", null, 0, false);
	subContainer_171.addSubInstruction(sub_559);
		ISubRule sub_560 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_62", null, 0, false);
	subContainer_171.addSubInstruction(sub_560);
		ISubRule sub_561 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[45], false, "Referer_31", null, 0, false);
	subContainer_171.addSubInstruction(sub_561);
		ISubRule sub_562 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_61", null, 0, false);
	subContainer_171.addSubInstruction(sub_562);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97C2D003EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_168(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97C54108EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_172 = new DataSub();
	reqAction.addDataSub(subContainer_172);

		ISubRule sub_563 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[54], false, "heartBeat", null, 0, false);
	subContainer_172.addSubInstruction(sub_563);
		ISubRule sub_564 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_60", null, 0, false);
	subContainer_172.addSubInstruction(sub_564);
		ISubRule sub_565 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[45], false, "Referer_30", null, 0, false);
	subContainer_172.addSubInstruction(sub_565);
		ISubRule sub_566 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_59", null, 0, false);
	subContainer_172.addSubInstruction(sub_566);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97C5410BEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_169(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97C54163EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_173 = new DataSub();
	reqAction.addDataSub(subContainer_173);

		ISubRule sub_567 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[54], false, "heartBeat", null, 0, false);
	subContainer_173.addSubInstruction(sub_567);
		ISubRule sub_568 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_58", null, 0, false);
	subContainer_173.addSubInstruction(sub_568);
		ISubRule sub_569 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[45], false, "Referer_29", null, 0, false);
	subContainer_173.addSubInstruction(sub_569);
		ISubRule sub_570 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_57", null, 0, false);
	subContainer_173.addSubInstruction(sub_570);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97C54166EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_170(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97C541BEEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_174 = new DataSub();
	reqAction.addDataSub(subContainer_174);

		ISubRule sub_571 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[54], false, "heartBeat", null, 0, false);
	subContainer_174.addSubInstruction(sub_571);
		ISubRule sub_572 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_56", null, 0, false);
	subContainer_174.addSubInstruction(sub_572);
		ISubRule sub_573 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[45], false, "Referer_28", null, 0, false);
	subContainer_174.addSubInstruction(sub_573);
		ISubRule sub_574 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_55", null, 0, false);
	subContainer_174.addSubInstruction(sub_574);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97C541C1EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_171(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97C87558EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_175 = new DataSub();
	reqAction.addDataSub(subContainer_175);

		ISubRule sub_575 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[54], false, "heartBeat", null, 0, false);
	subContainer_175.addSubInstruction(sub_575);
		ISubRule sub_576 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_54", null, 0, false);
	subContainer_175.addSubInstruction(sub_576);
		ISubRule sub_577 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[45], false, "Referer_27", null, 0, false);
	subContainer_175.addSubInstruction(sub_577);
		ISubRule sub_578 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_53", null, 0, false);
	subContainer_175.addSubInstruction(sub_578);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97C8755BEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_172(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97CA2300EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_176 = new DataSub();
	reqAction.addDataSub(subContainer_176);

		ISubRule sub_579 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[54], false, "heartBeat", null, 0, false);
	subContainer_176.addSubInstruction(sub_579);
		ISubRule sub_580 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_52", null, 0, false);
	subContainer_176.addSubInstruction(sub_580);
		ISubRule sub_581 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[45], false, "Referer_26", null, 0, false);
	subContainer_176.addSubInstruction(sub_581);
		ISubRule sub_582 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_51", null, 0, false);
	subContainer_176.addSubInstruction(sub_582);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97CA2303EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_173(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97CA235BEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_177 = new DataSub();
	reqAction.addDataSub(subContainer_177);

		ISubRule sub_583 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[54], false, "heartBeat", null, 0, false);
	subContainer_177.addSubInstruction(sub_583);
		ISubRule sub_584 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_50", null, 0, false);
	subContainer_177.addSubInstruction(sub_584);
		ISubRule sub_585 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[45], false, "Referer_25", null, 0, false);
	subContainer_177.addSubInstruction(sub_585);
		ISubRule sub_586 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_49", null, 0, false);
	subContainer_177.addSubInstruction(sub_586);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97CA235EEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_174(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97CC9408EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_178 = new DataSub();
	reqAction.addDataSub(subContainer_178);

		ISubRule sub_587 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[54], false, "heartBeat", null, 0, false);
	subContainer_178.addSubInstruction(sub_587);
		ISubRule sub_588 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_48", null, 0, false);
	subContainer_178.addSubInstruction(sub_588);
		ISubRule sub_589 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[45], false, "Referer_24", null, 0, false);
	subContainer_178.addSubInstruction(sub_589);
		ISubRule sub_590 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_47", null, 0, false);
	subContainer_178.addSubInstruction(sub_590);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97CC940BEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_175(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97CC9463EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_179 = new DataSub();
	reqAction.addDataSub(subContainer_179);

		ISubRule sub_591 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[54], false, "heartBeat", null, 0, false);
	subContainer_179.addSubInstruction(sub_591);
		ISubRule sub_592 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_46", null, 0, false);
	subContainer_179.addSubInstruction(sub_592);
		ISubRule sub_593 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[45], false, "Referer_23", null, 0, false);
	subContainer_179.addSubInstruction(sub_593);
		ISubRule sub_594 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_45", null, 0, false);
	subContainer_179.addSubInstruction(sub_594);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97CC9466EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_176(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97CC94BEEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_180 = new DataSub();
	reqAction.addDataSub(subContainer_180);

		ISubRule sub_595 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[54], false, "heartBeat", null, 0, false);
	subContainer_180.addSubInstruction(sub_595);
		ISubRule sub_596 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_44", null, 0, false);
	subContainer_180.addSubInstruction(sub_596);
		ISubRule sub_597 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[45], false, "Referer_22", null, 0, false);
	subContainer_180.addSubInstruction(sub_597);
		ISubRule sub_598 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_43", null, 0, false);
	subContainer_180.addSubInstruction(sub_598);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97CC94C1EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_177(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97CF0509EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_181 = new DataSub();
	reqAction.addDataSub(subContainer_181);

		ISubRule sub_599 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[54], false, "heartBeat", null, 0, false);
	subContainer_181.addSubInstruction(sub_599);
		ISubRule sub_600 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_42", null, 0, false);
	subContainer_181.addSubInstruction(sub_600);
		ISubRule sub_601 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[45], false, "Referer_21", null, 0, false);
	subContainer_181.addSubInstruction(sub_601);
		ISubRule sub_602 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_41", null, 0, false);
	subContainer_181.addSubInstruction(sub_602);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97CF050CEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_178(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97D17600EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_182 = new DataSub();
	reqAction.addDataSub(subContainer_182);

		ISubRule sub_603 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[54], false, "heartBeat", null, 0, false);
	subContainer_182.addSubInstruction(sub_603);
		ISubRule sub_604 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_40", null, 0, false);
	subContainer_182.addSubInstruction(sub_604);
		ISubRule sub_605 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[45], false, "Referer_20", null, 0, false);
	subContainer_182.addSubInstruction(sub_605);
		ISubRule sub_606 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_39", null, 0, false);
	subContainer_182.addSubInstruction(sub_606);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97D17603EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_179(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97D1765BEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_183 = new DataSub();
	reqAction.addDataSub(subContainer_183);

		ISubRule sub_607 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[54], false, "heartBeat", null, 0, false);
	subContainer_183.addSubInstruction(sub_607);
		ISubRule sub_608 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_38", null, 0, false);
	subContainer_183.addSubInstruction(sub_608);
		ISubRule sub_609 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[45], false, "Referer_19", null, 0, false);
	subContainer_183.addSubInstruction(sub_609);
		ISubRule sub_610 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_37", null, 0, false);
	subContainer_183.addSubInstruction(sub_610);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97B1E06BEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97D1765EEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
private HTTPPage page_6(final IContainer parent) {
			HTTPThink think = new HTTPThink(3085, 1, parent, parent, "A1F042EB97D7DEA3EF72E23734373638");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "ModernizedInsuranceApp {2}", "A1F042EB97D7DEA3EF72E23734373638") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(7, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_180(this, true, "A1F042EB97CF0501EF72E23734373638", false, true,
						"Config_1", "macro;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6",	"/ModernizedInsuranceApp/macro;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_181(this, false, "A1F042EB97CF0501EF72E23734373638", true, false,
						"Config_1", "Search.png",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/Search.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_182(this, false, "A1F042EB97D7DF7EEF72E23734373638", false, false,
						"Config_1", "default_sort.svg",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/default_sort.svg", true, false), 19, 100, "A1F042EB97D7DEA7EF72E23734373638", 3);
				httpParallel.addRequest(2, request_183(this, false, "A1F042EB97D7DFE5EF72E23734373638", false, false,
						"Config_1", "get-customer-info;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6",	"/ModernizedInsuranceApp/dao/customer-information/get-customer-info;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", true, false), 37, 100, "A1F042EB97D7DEA7EF72E23734373638", 3);
				httpParallel.addRequest(3, request_184(this, false, "A1F042EB97D7E060EF72E23734373638", false, false,
						"Config_1", "entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{4}",	"/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", true, false), 37, 100, "A1F042EB97D7DEA7EF72E23734373638", 3);
				httpParallel.addRequest(2, request_185(this, false, "A1F042EB97D7DFE5EF72E23734373638", false, false,
						"Config_1", "get-commercial-policy-info;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6",	"/ModernizedInsuranceApp/dao/commercial-policy/get-commercial-policy-info;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_186(this, false, "A1F042EB97D7DF7EEF72E23734373638", false, false,
						"Config_1", "customerDataFile",	"/ModernizedInsuranceApp/customerDataFile?CustomerID=0000000001&COMMAND=ProfileImageView", true, false), 4, 100, "A1F042EB97DE4740EF72E23734373638", 3);
				httpParallel.addRequest(2, request_187(this, false, "A1F042EB97D7DFE5EF72E23734373638", true, false,
						"Config_1", "exportResized.png",	"/ModernizedInsuranceApp/common/InsuranceCustom/img/exportResized.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_188(this, false, "A1F042EB97D7E060EF72E23734373638", true, false,
						"Config_1", "CollapseSideBar.png",	"/ModernizedInsuranceApp/common/images/CollapseSideBar.png", true, false), 4, 100, "A1F042EB97DE4740EF72E23734373638", 3);
				httpParallel.addRequest(4, request_189(this, false, "A1F042EB97E01D16EF72E23734373638", false, false,
						"Config_1", "macro;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{1}",	"/ModernizedInsuranceApp/macro;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", true, false), 85, 100, "A1F042EB97D7E068EF72E23734373638", 2);
				httpParallel.addRequest(5, request_190(this, false, "A1F042EB97E01D91EF72E23734373638", true, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{43}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223953954", true, false), 89, 100, "A1F042EB97D7E068EF72E23734373638", 2);
				httpParallel.addRequest(6, request_191(this, false, "A1F042EB97E01DF4EF72E23734373638", false, false,
						"Config_1", "GetCommercialPolicyImage",	"/ModernizedInsuranceApp/GetCommercialPolicyImage?PolicyNumber=1002903&&COMMAND=PropertyImageView", true, false), 89, 100, "A1F042EB97D7E068EF72E23734373638", 2);
				httpParallel.addRequest(6, request_192(this, false, "A1F042EB97E01DF4EF72E23734373638", true, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{44}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223954946", true, false), 175, 100, "A1F042EB97E01DFCEF72E23734373638", 3);
				httpParallel.addRequest(4, request_193(this, false, "A1F042EB97E01D16EF72E23734373638", true, false,
						"Config_1", "entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{5}",	"/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_194(this, false, "A1F042EB97D7DF7EEF72E23734373638", false, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{45}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223957060", true, false), 1021, 100, "A1F042EB97E28D9AEF72E23734373638", 3);
				httpParallel.addRequest(1, request_195(this, false, "A1F042EB97D7DF7EEF72E23734373638", false, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{46}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223957746", true, false), 432, 100, "A1F042EB97E28E0FEF72E23734373638", 3);
				httpParallel.addRequest(1, request_196(this, false, "A1F042EB97D7DF7EEF72E23734373638", false, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{47}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223958124", true, false), 126, 100, "A1F042EB97E28E6AEF72E23734373638", 3);
				httpParallel.addRequest(1, request_197(this, false, "A1F042EB97D7DF7EEF72E23734373638", true, false,
						"Config_1", "asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6{48}",	"/ModernizedInsuranceApp/asynch;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6?heartBeat=true&randomValue=1749223959958", true, false), 1574, 100, "A1F042EB97E28EC5EF72E23734373638", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_180(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97D7DEA7EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(12);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "234", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Requested-With", "XMLHttpRequest", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "http://dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_5(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_11 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_11);

	harvestContainer_11.addHarvestInstruction ("resp_content", dcVars[56], ";jsessionid=(.*?)\"", 1, 1, 0, 0, false, "jsessionid_16", null, 0, false);
	harvestContainer_11.addHarvestInstruction ("resp_content", dcVars[57], "<[[^>].]*?NAME=\"PERF_TIMESTAMP\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_33", null, 0, false);
	harvestContainer_11.addHarvestInstruction ("resp_content", dcVars[58], "<[[^>].]*?NAME=\"SESSIONID\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_35", null, 0, false);
	harvestContainer_11.addHarvestInstruction ("resp_content", dcVars[59], "<[[^>].]*?NAME=\"COMMAND\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_34", null, 0, false);
	IDataSub subContainer_185 = new DataSub();
	reqAction.addDataSub(subContainer_185);

		ISubRule sub_615 = new SubRule("req_uri", 41, 64, false, (IDCCoreVar)dcVars[46], false, "jsessionid", null, 0, false);
	subContainer_185.addSubInstruction(sub_615);
		ISubRule sub_616 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_36", null, 0, false);
	subContainer_185.addSubInstruction(sub_616);
		ISubRule sub_617 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[45], false, "Referer_18", null, 0, false);
	subContainer_185.addSubInstruction(sub_617);
		ISubRule sub_618 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_35", null, 0, false);
	subContainer_185.addSubInstruction(sub_618);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97D7DEAAEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_5(HTTPPostData postData) {
				StringBuffer strBuf_5 = new StringBuffer();
strBuf_5.append("&SESSIONNUMBER=&PERF_TIMESTAMP=0&COMMAND=macrorun_SSC1Inquir");
strBuf_5.append("y&CURSORPOSITION=0&KeyboardToggle=1&SESSIONID=UZzWvcHHMZR2lD");
strBuf_5.append("dFbM6tHKb&CARETPOS=0&LINESIZE=2&ISCURSORDECR=false&CustNumbe");
strBuf_5.append("r=0000000001&OnlyforCustrPro=false&traceLevelEnabled=1");
String requestData_5 = strBuf_5.toString();
			
	HTTPPostDataChunk pdc_4 = new HTTPPostDataChunk("A1F042EB97D7DEEFEF72E23734373638", postData, requestData_5, "UTF-8", 26, 151);
	postData.addDataChunk(pdc_4);

	IDataSub subContainer_184 = new DataSub();
	pdc_4.addDataSub(subContainer_184);

		ISubRule sub_611 = new SubRule("req_content", 150, 1, true, (IDCCoreVar)dcVars[53], false, "LINESIZE", null, 0, false);
	subContainer_184.addSubInstruction(sub_611);
		ISubRule sub_612 = new SubRule("req_content", 106, 23, true, (IDCCoreVar)dcVars[51], false, "SESSIONID", null, 0, false);
	subContainer_184.addSubInstruction(sub_612);
		ISubRule sub_613 = new SubRule("req_content", 94, 1, true, (IDCCoreVar)dcVars[50], false, "KeyboardToggle", null, 0, false);
	subContainer_184.addSubInstruction(sub_613);
		ISubRule sub_614 = new SubRule("req_content", 31, 1, true, (IDCCoreVar)dcVars[47], false, "PERF_TIMESTAMP", null, 0, false);
	subContainer_184.addSubInstruction(sub_614);
	



	}

	public HTTPAction request_181(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97D7DF1FEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_186 = new DataSub();
	reqAction.addDataSub(subContainer_186);

		ISubRule sub_619 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_34", null, 0, false);
	subContainer_186.addSubInstruction(sub_619);
		ISubRule sub_620 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[45], false, "Referer_17", null, 0, false);
	subContainer_186.addSubInstruction(sub_620);
		ISubRule sub_621 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_33", null, 0, false);
	subContainer_186.addSubInstruction(sub_621);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97D7DEA7EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97D7DF22EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_182(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97D7DF86EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/common/InsuranceCustom/css/PolicyView.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_187 = new DataSub();
	reqAction.addDataSub(subContainer_187);

		ISubRule sub_622 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_32", null, 0, false);
	subContainer_187.addSubInstruction(sub_622);
		ISubRule sub_623 = new SubRule("req_hdr_Referer_1", 0, 108, false, (IDCCoreVar)dcVars[24], false, "Referer_16", null, 0, false);
	subContainer_187.addSubInstruction(sub_623);
		ISubRule sub_624 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_31", null, 0, false);
	subContainer_187.addSubInstruction(sub_624);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97D7DF89EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_183(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97D7DFEDEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(12);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "27", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Requested-With", "XMLHttpRequest", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/javascript, */*; q=0.01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "http://dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_6(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_188 = new DataSub();
	reqAction.addDataSub(subContainer_188);

		ISubRule sub_625 = new SubRule("req_uri", 78, 64, false, (IDCCoreVar)dcVars[56], false, "jsessionid", null, 0, false);
	subContainer_188.addSubInstruction(sub_625);
		ISubRule sub_626 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_30", null, 0, false);
	subContainer_188.addSubInstruction(sub_626);
		ISubRule sub_627 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[45], false, "Referer_15", null, 0, false);
	subContainer_188.addSubInstruction(sub_627);
		ISubRule sub_628 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_29", null, 0, false);
	subContainer_188.addSubInstruction(sub_628);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97D7DEA7EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97D7DFF0EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_6(HTTPPostData postData) {
				StringBuffer strBuf_6 = new StringBuffer();
strBuf_6.append("{\n  \"customerID\": \"0000000001\"\n}");
String requestData_6 = strBuf_6.toString();
			
	HTTPPostDataChunk pdc_5 = new HTTPPostDataChunk("A1F042EB97D7E035EF72E23734373638", postData, requestData_6, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_5);

	}

	public HTTPAction request_184(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97D7E068EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(12);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "288", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Requested-With", "XMLHttpRequest", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "http://dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_7(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_12 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_12);

	harvestContainer_12.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[60], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_10", null, 0, false);
	harvestContainer_12.addHarvestInstruction ("resp_content", dcVars[61], ";jsessionid=(.*?)\"", 1, 1, 0, 0, false, "jsessionid_17", null, 0, false);
	harvestContainer_12.addHarvestInstruction ("resp_content", dcVars[62], "<[[^>].]*?NAME=\"PERF_TIMESTAMP\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_41", null, 0, false);
	harvestContainer_12.addHarvestInstruction ("resp_content", dcVars[63], "<[[^>].]*?NAME=\"HatsCSRF\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_36", null, 0, false);
	harvestContainer_12.addHarvestInstruction ("resp_content", dcVars[64], "<[[^>].]*?NAME=\"CURSORPOSITION\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_37", null, 0, false);
	harvestContainer_12.addHarvestInstruction ("resp_content", dcVars[65], "<[[^>].]*?NAME=\"KeyboardToggle\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_38", null, 0, false);
	harvestContainer_12.addHarvestInstruction ("resp_content", dcVars[66], "<[[^>].]*?NAME=\"SESSIONID\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_42", null, 0, false);
	harvestContainer_12.addHarvestInstruction ("resp_content", dcVars[67], "<[[^>].]*?NAME=\"CARETPOS\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_39", null, 0, false);
	harvestContainer_12.addHarvestInstruction ("resp_content", dcVars[68], "<[[^>].]*?NAME=\"LINESIZE\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_40", null, 0, false);
	harvestContainer_12.addHarvestInstruction ("resp_content", dcVars[69], "\\?heartBeat=(.*?)&", 1, 1, 0, 0, false, "heartBeat_54", null, 0, false);
	harvestContainer_12.addHarvestInstruction ("resp_content", dcVars[70], "<[[^>].]*?name=\"in_2_79\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_4", null, 0, false);
	IDataSub subContainer_190 = new DataSub();
	reqAction.addDataSub(subContainer_190);

		ISubRule sub_638 = new SubRule("req_uri", 41, 64, false, (IDCCoreVar)dcVars[56], false, "jsessionid", null, 0, false);
	subContainer_190.addSubInstruction(sub_638);
		ISubRule sub_639 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_28", null, 0, false);
	subContainer_190.addSubInstruction(sub_639);
		ISubRule sub_640 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[45], false, "Referer_14", null, 0, false);
	subContainer_190.addSubInstruction(sub_640);
		ISubRule sub_641 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_27", null, 0, false);
	subContainer_190.addSubInstruction(sub_641);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97D7DEA7EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97D7E06BEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_7(HTTPPostData postData) {
				StringBuffer strBuf_7 = new StringBuffer();
strBuf_7.append("SESSIONNUMBER=&PERF_TIMESTAMP=0&HatsCSRF=null&COMMAND=ret_ma");
strBuf_7.append("cro&CURSORPOSITION=1705&KeyboardToggle=1&SESSIONID=UZzWvcHHM");
strBuf_7.append("ZR2lDdFbM6tHKb&CARETPOS=-1&LINESIZE=2&in_291_10=0000000001&i");
strBuf_7.append("n_371_10=&in_451_20=&in_531_10=&in_611_20=&in_691_4=&in_771_");
strBuf_7.append("8=&in_851_20=&in_931_20=&in_1011_27=&in_1705_1=1");
String requestData_7 = strBuf_7.toString();
			
	HTTPPostDataChunk pdc_6 = new HTTPPostDataChunk("A1F042EB97D7E0B0EF72E23734373638", postData, requestData_7, "UTF-8", 55, 178);
	postData.addDataChunk(pdc_6);

	IDataSub subContainer_189 = new DataSub();
	pdc_6.addDataSub(subContainer_189);

		ISubRule sub_629 = new SubRule("req_content", 168, 10, true, (IDCCoreVar)dcVars[55], false, "in_291_10", null, 0, false);
	subContainer_189.addSubInstruction(sub_629);
		ISubRule sub_630 = new SubRule("req_content", 156, 1, true, (IDCCoreVar)dcVars[53], false, "LINESIZE", null, 0, false);
	subContainer_189.addSubInstruction(sub_630);
		ISubRule sub_631 = new SubRule("req_content", 144, 2, true, (IDCCoreVar)dcVars[52], false, "CARETPOS", null, 0, false);
	subContainer_189.addSubInstruction(sub_631);
		ISubRule sub_632 = new SubRule("req_content", 111, 23, true, (IDCCoreVar)dcVars[58], false, "SESSIONID", null, 0, false);
	subContainer_189.addSubInstruction(sub_632);
		ISubRule sub_633 = new SubRule("req_content", 99, 1, true, (IDCCoreVar)dcVars[50], false, "KeyboardToggle", null, 0, false);
	subContainer_189.addSubInstruction(sub_633);
		ISubRule sub_634 = new SubRule("req_content", 79, 4, true, (IDCCoreVar)dcVars[49], false, "CURSORPOSITION", null, 0, false);
	subContainer_189.addSubInstruction(sub_634);
		ISubRule sub_635 = new SubRule("req_content", 54, 9, true, (IDCCoreVar)dcVars[59], false, "COMMAND", null, 0, false);
	subContainer_189.addSubInstruction(sub_635);
		ISubRule sub_636 = new SubRule("req_content", 41, 4, true, (IDCCoreVar)dcVars[48], false, "HatsCSRF", null, 0, false);
	subContainer_189.addSubInstruction(sub_636);
		ISubRule sub_637 = new SubRule("req_content", 30, 1, true, (IDCCoreVar)dcVars[57], false, "PERF_TIMESTAMP", null, 0, false);
	subContainer_189.addSubInstruction(sub_637);
	



	}

	public HTTPAction request_185(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97DE4740EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(12);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "27", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Requested-With", "XMLHttpRequest", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/javascript, */*; q=0.01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "http://dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_8(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_191 = new DataSub();
	reqAction.addDataSub(subContainer_191);

		ISubRule sub_642 = new SubRule("req_uri", 84, 64, false, (IDCCoreVar)dcVars[61], false, "jsessionid", null, 0, false);
	subContainer_191.addSubInstruction(sub_642);
		ISubRule sub_643 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_26", null, 0, false);
	subContainer_191.addSubInstruction(sub_643);
		ISubRule sub_644 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[60], false, "Referer_13", null, 0, false);
	subContainer_191.addSubInstruction(sub_644);
		ISubRule sub_645 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_25", null, 0, false);
	subContainer_191.addSubInstruction(sub_645);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97D7E068EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97D7E068EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97D7DEA7EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97DE4743EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_8(HTTPPostData postData) {
				StringBuffer strBuf_8 = new StringBuffer();
strBuf_8.append("{\n  \"customerID\": \"0000000001\"\n}");
String requestData_8 = strBuf_8.toString();
			
	HTTPPostDataChunk pdc_7 = new HTTPPostDataChunk("A1F042EB97DE4788EF72E23734373638", postData, requestData_8, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_7);

	}

	public HTTPAction request_186(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97E01C00EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_192 = new DataSub();
	reqAction.addDataSub(subContainer_192);

		ISubRule sub_646 = new SubRule("req_uri", 71, 16, true, (IDCCoreVar)dcVars[25], false, "COMMAND", null, 0, false);
	subContainer_192.addSubInstruction(sub_646);
		ISubRule sub_647 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_24", null, 0, false);
	subContainer_192.addSubInstruction(sub_647);
		ISubRule sub_648 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[60], false, "Referer_12", null, 0, false);
	subContainer_192.addSubInstruction(sub_648);
		ISubRule sub_649 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_23", null, 0, false);
	subContainer_192.addSubInstruction(sub_649);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97D7E068EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97E01C03EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/x-png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_187(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97E01C5BEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_193 = new DataSub();
	reqAction.addDataSub(subContainer_193);

		ISubRule sub_650 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_22", null, 0, false);
	subContainer_193.addSubInstruction(sub_650);
		ISubRule sub_651 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[60], false, "Referer_11", null, 0, false);
	subContainer_193.addSubInstruction(sub_651);
		ISubRule sub_652 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_21", null, 0, false);
	subContainer_193.addSubInstruction(sub_652);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97D7E068EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97D7DEA7EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97E01C5EEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_188(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97E01CBAEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_194 = new DataSub();
	reqAction.addDataSub(subContainer_194);

		ISubRule sub_653 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_20", null, 0, false);
	subContainer_194.addSubInstruction(sub_653);
		ISubRule sub_654 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[60], false, "Referer_10", null, 0, false);
	subContainer_194.addSubInstruction(sub_654);
		ISubRule sub_655 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_19", null, 0, false);
	subContainer_194.addSubInstruction(sub_655);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97D7E068EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97E01CBDEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_189(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97E01D1EEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(12);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "228", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Requested-With", "XMLHttpRequest", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "http://dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_9(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_13 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_13);

	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[71], ";jsessionid=(.*?)\"", 1, 1, 0, 0, false, "jsessionid_18", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[72], "<[[^>].]*?NAME=\"PERF_TIMESTAMP\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_43", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[73], "<[[^>].]*?NAME=\"SESSIONID\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_45", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[74], "<[[^>].]*?NAME=\"COMMAND\"(([[^>].]*?VALUE=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "VALUE_44", null, 0, false);
	IDataSub subContainer_196 = new DataSub();
	reqAction.addDataSub(subContainer_196);

		ISubRule sub_660 = new SubRule("req_uri", 41, 64, false, (IDCCoreVar)dcVars[61], false, "jsessionid", null, 0, false);
	subContainer_196.addSubInstruction(sub_660);
		ISubRule sub_661 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_18", null, 0, false);
	subContainer_196.addSubInstruction(sub_661);
		ISubRule sub_662 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[60], false, "Referer_9", null, 0, false);
	subContainer_196.addSubInstruction(sub_662);
		ISubRule sub_663 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_17", null, 0, false);
	subContainer_196.addSubInstruction(sub_663);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97D7E068EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97D7E068EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97E01D21EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_9(HTTPPostData postData) {
				StringBuffer strBuf_9 = new StringBuffer();
strBuf_9.append("&SESSIONNUMBER=&PERF_TIMESTAMP=0&COMMAND=macrorun_SSP4Inquir");
strBuf_9.append("y&CURSORPOSITION=0&KeyboardToggle=1&SESSIONID=UZzWvcHHMZR2lD");
strBuf_9.append("dFbM6tHKb&CARETPOS=0&LINESIZE=2&ISCURSORDECR=false&commpolic");
strBuf_9.append("yNumber=1002903&custNumber=1&traceLevelEnabled=1");
String requestData_9 = strBuf_9.toString();
			
	HTTPPostDataChunk pdc_8 = new HTTPPostDataChunk("A1F042EB97E01D66EF72E23734373638", postData, requestData_9, "UTF-8", 26, 151);
	postData.addDataChunk(pdc_8);

	IDataSub subContainer_195 = new DataSub();
	pdc_8.addDataSub(subContainer_195);

		ISubRule sub_656 = new SubRule("req_content", 150, 1, true, (IDCCoreVar)dcVars[68], false, "LINESIZE", null, 0, false);
	subContainer_195.addSubInstruction(sub_656);
		ISubRule sub_657 = new SubRule("req_content", 106, 23, true, (IDCCoreVar)dcVars[66], false, "SESSIONID", null, 0, false);
	subContainer_195.addSubInstruction(sub_657);
		ISubRule sub_658 = new SubRule("req_content", 94, 1, true, (IDCCoreVar)dcVars[65], false, "KeyboardToggle", null, 0, false);
	subContainer_195.addSubInstruction(sub_658);
		ISubRule sub_659 = new SubRule("req_content", 31, 1, true, (IDCCoreVar)dcVars[62], false, "PERF_TIMESTAMP", null, 0, false);
	subContainer_195.addSubInstruction(sub_659);
	



	}

	public HTTPAction request_190(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97E01D99EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_197 = new DataSub();
	reqAction.addDataSub(subContainer_197);

		ISubRule sub_664 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[69], false, "heartBeat", null, 0, false);
	subContainer_197.addSubInstruction(sub_664);
		ISubRule sub_665 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_16", null, 0, false);
	subContainer_197.addSubInstruction(sub_665);
		ISubRule sub_666 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[60], false, "Referer_8", null, 0, false);
	subContainer_197.addSubInstruction(sub_666);
		ISubRule sub_667 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_15", null, 0, false);
	subContainer_197.addSubInstruction(sub_667);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97D7E068EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97D7E068EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97E01D9CEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_191(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97E01DFCEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_198 = new DataSub();
	reqAction.addDataSub(subContainer_198);

		ISubRule sub_668 = new SubRule("req_uri", 79, 17, true, (IDCCoreVar)dcVars[26], false, "COMMAND", null, 0, false);
	subContainer_198.addSubInstruction(sub_668);
		ISubRule sub_669 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_14", null, 0, false);
	subContainer_198.addSubInstruction(sub_669);
		ISubRule sub_670 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[60], false, "Referer_7", null, 0, false);
	subContainer_198.addSubInstruction(sub_670);
		ISubRule sub_671 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_13", null, 0, false);
	subContainer_198.addSubInstruction(sub_671);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97D7E068EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97E01DFFEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/x-png,image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_192(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97E28D3FEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_199 = new DataSub();
	reqAction.addDataSub(subContainer_199);

		ISubRule sub_672 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[69], false, "heartBeat", null, 0, false);
	subContainer_199.addSubInstruction(sub_672);
		ISubRule sub_673 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_12", null, 0, false);
	subContainer_199.addSubInstruction(sub_673);
		ISubRule sub_674 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[60], false, "Referer_6", null, 0, false);
	subContainer_199.addSubInstruction(sub_674);
		ISubRule sub_675 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_11", null, 0, false);
	subContainer_199.addSubInstruction(sub_675);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97D7E068EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97D7E068EF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97E28D42EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_193(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97E28D9AEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(12);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "443", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Requested-With", "XMLHttpRequest", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "http://dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_10(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_14 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_14);

	harvestContainer_14.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[75], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_11", null, 0, false);
	harvestContainer_14.addHarvestInstruction ("resp_content", dcVars[76], "\\?heartBeat=(.*?)&", 1, 1, 0, 0, false, "heartBeat_55", null, 0, false);
	IDataSub subContainer_201 = new DataSub();
	reqAction.addDataSub(subContainer_201);

		ISubRule sub_685 = new SubRule("req_uri", 41, 64, false, (IDCCoreVar)dcVars[71], false, "jsessionid", null, 0, false);
	subContainer_201.addSubInstruction(sub_685);
		ISubRule sub_686 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_10", null, 0, false);
	subContainer_201.addSubInstruction(sub_686);
		ISubRule sub_687 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[60], false, "Referer_5", null, 0, false);
	subContainer_201.addSubInstruction(sub_687);
		ISubRule sub_688 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_9", null, 0, false);
	subContainer_201.addSubInstruction(sub_688);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97D7E068EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97D7E068EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97D7DEA7EF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97E01D1EEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F042EB97E28D9DEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_10(HTTPPostData postData) {
				StringBuffer strBuf_10 = new StringBuffer();
strBuf_10.append("SESSIONNUMBER=&PERF_TIMESTAMP=0&HatsCSRF=null&COMMAND=ret_ma");
strBuf_10.append("cro&CURSORPOSITION=2&KeyboardToggle=1&SESSIONID=UZzWvcHHMZR2");
strBuf_10.append("lDdFbM6tHKb&CARETPOS=-1&LINESIZE=2&in_2_79=Transaction+ended");
strBuf_10.append("&in_81_80=&in_161_80=&in_241_80=&in_321_80=&in_401_80=&in_48");
strBuf_10.append("1_80=&in_561_80=&in_641_80=&in_721_80=&in_801_80=&in_881_80=");
strBuf_10.append("&in_961_80=&in_1041_80=&in_1121_80=&in_1201_80=&in_1281_80=&");
strBuf_10.append("in_1361_80=&in_1441_80=&in_1521_80=&in_1601_80=&in_1681_80=&");
strBuf_10.append("in_1761_80=&in_1841_80=");
String requestData_10 = strBuf_10.toString();
			
	HTTPPostDataChunk pdc_9 = new HTTPPostDataChunk("A1F042EB97E28DE2EF72E23734373638", postData, requestData_10, "UTF-8", 59, 180);
	postData.addDataChunk(pdc_9);

	IDataSub subContainer_200 = new DataSub();
	pdc_9.addDataSub(subContainer_200);

		ISubRule sub_676 = new SubRule("req_content", 163, 17, true, (IDCCoreVar)dcVars[70], false, "in_2_79", null, 0, false);
	subContainer_200.addSubInstruction(sub_676);
		ISubRule sub_677 = new SubRule("req_content", 153, 1, true, (IDCCoreVar)dcVars[68], false, "LINESIZE", null, 0, false);
	subContainer_200.addSubInstruction(sub_677);
		ISubRule sub_678 = new SubRule("req_content", 141, 2, true, (IDCCoreVar)dcVars[67], false, "CARETPOS", null, 0, false);
	subContainer_200.addSubInstruction(sub_678);
		ISubRule sub_679 = new SubRule("req_content", 108, 23, true, (IDCCoreVar)dcVars[73], false, "SESSIONID", null, 0, false);
	subContainer_200.addSubInstruction(sub_679);
		ISubRule sub_680 = new SubRule("req_content", 96, 1, true, (IDCCoreVar)dcVars[65], false, "KeyboardToggle", null, 0, false);
	subContainer_200.addSubInstruction(sub_680);
		ISubRule sub_681 = new SubRule("req_content", 79, 1, true, (IDCCoreVar)dcVars[64], false, "CURSORPOSITION", null, 0, false);
	subContainer_200.addSubInstruction(sub_681);
		ISubRule sub_682 = new SubRule("req_content", 54, 9, true, (IDCCoreVar)dcVars[74], false, "COMMAND", null, 0, false);
	subContainer_200.addSubInstruction(sub_682);
		ISubRule sub_683 = new SubRule("req_content", 41, 4, true, (IDCCoreVar)dcVars[63], false, "HatsCSRF", null, 0, false);
	subContainer_200.addSubInstruction(sub_683);
		ISubRule sub_684 = new SubRule("req_content", 30, 1, true, (IDCCoreVar)dcVars[72], false, "PERF_TIMESTAMP", null, 0, false);
	subContainer_200.addSubInstruction(sub_684);
	



	}

	public HTTPAction request_194(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97E28E0FEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_202 = new DataSub();
	reqAction.addDataSub(subContainer_202);

		ISubRule sub_689 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[76], false, "heartBeat", null, 0, false);
	subContainer_202.addSubInstruction(sub_689);
		ISubRule sub_690 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_8", null, 0, false);
	subContainer_202.addSubInstruction(sub_690);
		ISubRule sub_691 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[75], false, "Referer_4", null, 0, false);
	subContainer_202.addSubInstruction(sub_691);
		ISubRule sub_692 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_7", null, 0, false);
	subContainer_202.addSubInstruction(sub_692);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97E28D9AEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97E28D9AEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97E28E12EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_195(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97E28E6AEF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_203 = new DataSub();
	reqAction.addDataSub(subContainer_203);

		ISubRule sub_693 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[76], false, "heartBeat", null, 0, false);
	subContainer_203.addSubInstruction(sub_693);
		ISubRule sub_694 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_6", null, 0, false);
	subContainer_203.addSubInstruction(sub_694);
		ISubRule sub_695 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[75], false, "Referer_3", null, 0, false);
	subContainer_203.addSubInstruction(sub_695);
		ISubRule sub_696 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_5", null, 0, false);
	subContainer_203.addSubInstruction(sub_696);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97E28D9AEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97E28D9AEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97E28E6DEF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_196(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97E28EC5EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_204 = new DataSub();
	reqAction.addDataSub(subContainer_204);

		ISubRule sub_697 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[76], false, "heartBeat", null, 0, false);
	subContainer_204.addSubInstruction(sub_697);
		ISubRule sub_698 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_4", null, 0, false);
	subContainer_204.addSubInstruction(sub_698);
		ISubRule sub_699 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[75], false, "Referer_2", null, 0, false);
	subContainer_204.addSubInstruction(sub_699);
		ISubRule sub_700 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host_3", null, 0, false);
	subContainer_204.addSubInstruction(sub_700);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97E28D9AEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97E28D9AEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97E28EC8EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_197(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F042EB97E28F20EF72E23734373638", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "dp1-ap-51794357.prod.hclpnp.com:9082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36 Edg/136.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://dp1-ap-51794357.prod.hclpnp.com:9082/ModernizedInsuranceApp/entry;jsessionid=0000UZzWvcHHMZR2lDdFbM6tHKb:09db84af-872e-4eb2-9446-86c775f3a4f6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "loginCommand=LOGON APPLID(C70A1PP1)", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_205 = new DataSub();
	reqAction.addDataSub(subContainer_205);

		ISubRule sub_701 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[76], false, "heartBeat", null, 0, false);
	subContainer_205.addSubInstruction(sub_701);
		ISubRule sub_702 = new SubRule("req_hdr_Host_1", 32, 4, false, (IDCCoreVar)vars[1], false, "Host_2", null, 0, false);
	subContainer_205.addSubInstruction(sub_702);
		ISubRule sub_703 = new SubRule("req_hdr_Referer_1", 0, 148, false, (IDCCoreVar)dcVars[75], false, "Referer", null, 0, false);
	subContainer_205.addSubInstruction(sub_703);
		ISubRule sub_704 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[0], false, "Host", null, 0, false);
	subContainer_205.addSubInstruction(sub_704);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97E28D9AEF72E23734373638"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F042EB97E28D9AEF72E23734373638"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F042EB97E28F23EF72E23734373638",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
}
