package cn.net.vive.define;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * <p>
 *
 * @author bolen
 * @date 2015/6/13
 * @since 0.1
 */
//@Target(ElementType.CONSTRUCTOR)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAnnotaion {
	String value() default "wjh-default";
}
