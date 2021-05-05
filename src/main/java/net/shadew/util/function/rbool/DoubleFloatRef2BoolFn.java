package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code double}, a {@code float} and an object and returns a {@code boolean}.
 */
public interface DoubleFloatRef2BoolFn<P3> {
    boolean invoke(double p1, float p2, P3 p3);
}
