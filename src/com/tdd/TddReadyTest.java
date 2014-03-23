package com.tdd;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class TddReadyTest {

	@Test
	public void canUseJUnit() {
		assertThat(10, equalTo(10));
	}
}
