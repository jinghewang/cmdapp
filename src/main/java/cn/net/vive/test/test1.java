package main.java.cn.net.vive.test;

import main.java.cn.net.vive.define.*;

/**
 * <p/>
 *
 * @author bolen
 * @date 2015/6/13
 * @since 0.1
 */

@AnnotationWithoutProperty
@AnnotationWithVal(value = "hello")
@AnnotationWithMyVal(myValue = {"123","456"})
@AnnotationWith2Val(value = "103",myValue = {"888","999"})
@AnnotationWithDefaultVal()
public class test1 {


}
