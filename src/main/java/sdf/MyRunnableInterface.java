package sdf;

@FunctionalInterface //annotation of functional interface is optional
public interface MyRunnableInterface<T> {

    //A generic function called process 
    T process(T a, T b);
 
}


