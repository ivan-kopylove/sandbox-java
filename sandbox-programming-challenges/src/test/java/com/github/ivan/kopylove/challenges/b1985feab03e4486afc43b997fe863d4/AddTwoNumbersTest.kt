//package com.github.ivan.kopylove.challenges.b1985feab03e4486afc43b997fe863d4
//
//class AddTwoNumbersTest {
//
//
//    class Solution {
//        fun addTwoNumbers(l1: ListNode, l2: ListNode): ListNode {
//            var l1 = l1
//            var l2 = l2
//            var overflow = 0
//
//            var sum: Int = l1.`val` + l2.`val` + overflow
//            if (sum > 9) {
//                sum %= 10
//                overflow = 1
//            } else {
//                overflow = 0
//            }
//
//            var nextNode = ListNode()
//            val result = ListNode()
//            result.`val` = sum
//            if (l1.next != null || l2.next != null || overflow > 0) {
//                result.next = nextNode
//            }
//
//            sum = 0
//            l1 = l1.next
//            l2 = l2.next
//
//            while (l1 != null || l2 != null) {
//                val val1 = if (l1 == null) 0 else l1.`val`
//                val val2 = if (l2 == null) 0 else l2.`val`
//
//                sum = val1 + val2 + overflow
//                if (sum > 9) {
//                    sum %= 10
//                    overflow = 1
//                } else {
//                    overflow = 0
//                }
//
//                if ((l1 != null && l1.next != null) || (l2 != null && l2.next != null) || (overflow > 0)) {
//                    nextNode.next = ListNode
//                }
//
//                nextNode.`val` = sum
//                nextNode = nextNode.next
//
//                l1 = if (l1 == null) null else l1.next
//                l2 = if (l2 == null) null else l2.next
//            }
//
//            if (overflow > 0) {
//                nextNode.`val` = overflow
//            }
//
//            return result
//        }
//    }
//}