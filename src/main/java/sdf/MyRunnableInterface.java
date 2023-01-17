package sdf;

@FunctionalInterface
public interface MyRunnableInterface<T> {

    //A generic function called process 
    T process(T a, T b);
 
}


