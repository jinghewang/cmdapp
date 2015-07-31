package jdk8;

/**
 * <p>
 *
 * @author wjh
 * @date 2015/6/16
 * @since 0.1
 */
@FunctionalInterface
public interface Converter<F,T> {
	T convert(F from);
}
