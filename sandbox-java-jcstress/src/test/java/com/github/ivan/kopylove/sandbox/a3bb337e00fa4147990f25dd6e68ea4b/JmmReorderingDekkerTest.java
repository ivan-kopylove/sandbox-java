package com.github.ivan.kopylove.sandbox.a3bb337e00fa4147990f25dd6e68ea4b;

import jdk.jfr.Description;
import org.openjdk.jcstress.annotations.Actor;
import org.openjdk.jcstress.annotations.Expect;
import org.openjdk.jcstress.annotations.JCStressTest;
import org.openjdk.jcstress.annotations.Outcome;
import org.openjdk.jcstress.annotations.State;
import org.openjdk.jcstress.infra.results.II_Result;

@JCStressTest
@Description("Classic test that demonstrates memory reordering")
@Outcome(id = "1, 1", expect = Expect.ACCEPTABLE, desc = "Have seen both writes")
@Outcome(id = {"0, 1", "1, 0"}, expect = Expect.ACCEPTABLE, desc = "Have seen one of the writes")
@Outcome(id = "0, 0", expect = Expect.ACCEPTABLE_INTERESTING, desc = "Have not seen any write")
public class JmmReorderingDekkerTest {

   @Actor
   public final void actor1(DataHolder dataHolder, II_Result r) {
      r.r1 = dataHolder.actor1();
   }

   @Actor
   public final void actor2(DataHolder dataHolder, II_Result r) {
      r.r2 = dataHolder.actor2();
   }

   @State
   public static class DataHolder {
      private int x;
      private int y;

      public int actor1() {
         x = 1;
         return y;
      }

      public int actor2() {
         y = 1;
         return x;
      }
   }
}