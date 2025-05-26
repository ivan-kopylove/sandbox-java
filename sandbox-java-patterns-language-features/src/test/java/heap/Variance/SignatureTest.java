package heap.Variance;

import org.junit.jupiter.api.Test;

class A{
        public Number test1()
        {
                return 1;
        }
}

class B extends A
{
//        public Integer test2()
//        {
//                return 2;
//        }
}

/**
 * Answer the questions stated in {@link heap.Variance.Fruit}.
 */
public class SignatureTest
{


        @Test
        void should_do_something_when_condition()
        {
//            test1(1);
//            test1(1.1);
//            test1(1.1f);
//            test1(0xab);
        }

        private void test1(Number number)
        {
                System.out.println(number);
        }
}
