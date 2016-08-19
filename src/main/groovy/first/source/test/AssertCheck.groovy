package first.source.test

/**
 * Created by Pankaj.Nimgade on 17-08-2016.
 * <p>
 *     This is used to check how assert works in Groovy
 */
class AssertCheck {

    public static void main(String[] args) {

        def a = 9;
        def b = 5;

        assert a == b + b

    }

    /**
     * Exception in thread "main" Assertion failed:

     assert a == b+b
            | |  |||
            9 |  5|5
            |   10
            false

     at org.codehaus.groovy.runtime.InvokerHelper.assertFailed(InvokerHelper.java:398)
     at org.codehaus.groovy.runtime.ScriptBytecodeAdapter.assertFailed(ScriptBytecodeAdapter.java:648)
     at first.source.test.AssertCheck.main(AssertCheck.groovy:13)
     at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
     at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
     at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
     at java.lang.reflect.Method.invoke(Method.java:498)
     at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)

     * */

}
