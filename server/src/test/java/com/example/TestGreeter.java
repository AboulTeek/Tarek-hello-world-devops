package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class TestGreeter {

  @Test
  public void testConcatenate() {
      MyUnit myUnit = new MyUnit();

      String result = myUnit.concatenate("one", "two");

      assertEquals("onetwo", result);

  }
}
