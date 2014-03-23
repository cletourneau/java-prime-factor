package com.tdd.primefactor;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class PrimeFactorTest {
	
	@Test
	public void canUseJUnit() {
		assertThat(10, equalTo(10));
	}
	
	@Test
	public void primeOf300() {
		// prime factors of 300 should be : 2, 2, 3, 5, 5
	}
}
