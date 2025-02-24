import java.util.regex.Pattern

import org.apache.commons.lang3.StringUtils

import com.katalon.KatalonHelper
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

class TestListener {
	/**
	 * Executes before every test suite starts.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	@BeforeTestSuite
	def sampleBeforeTestSuite(TestSuiteContext testSuiteContext) {
		KatalonHelper.updateInfo()

		// res ....
		
	}
	
	/**
	 * Executes before every test suite starts.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	@AfterTestSuite
	def sampleAfterTestSuite(TestSuiteContext testSuiteContext) {
		KatalonHelper.updateInfo()
	}


	@BeforeTestCase
	def sampleBeforeTestCase(TestCaseContext testCaseContext) {
		println testCaseContext.getTestCaseId()
		println testCaseContext.getTestCaseVariables()
		if (StringUtils.equals(testCaseContext.getTestCaseId(), "Test Cases/Skip Test Case")) {
			testCaseContext.skipThisTestCase()
		}
	}
}