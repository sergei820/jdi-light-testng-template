package org.mytests.tests.testng;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class RetryListenerClass implements IAnnotationTransformer {

    @Override
    public void transform(ITestAnnotation testannotation, Class testClass, Constructor testConstructor, Method testMethod)	{
        Class<?> retry = testannotation.getRetryAnalyzerClass();
        if (retry == null)	{
            testannotation.setRetryAnalyzer(RetryFailedTestCases.class);
        }

    }
}
