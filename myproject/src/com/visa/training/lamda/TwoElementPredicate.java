package com.visa.training.lamda;
@FunctionalInterface
public interface TwoElementPredicate <T>{

	public boolean isFirstBetter(T s1,T s2);
}
