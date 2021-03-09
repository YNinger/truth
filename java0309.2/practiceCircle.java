package java0309;

import java.util.List;

public class practiceCircle {

    //4.实现链表题目: 判断链表带环
    public boolean hasCycle(ListNode head) {
        //运用快慢指针
        //当两者进入环后，fast总比slow快了1步，会从后边不断追赶，距离以1为单位减小，直至相等
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    //5.给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
    public ListNode detectCycle(ListNode head) {
        //思路：先得找到快慢指针的交点，
        //快慢指针的交点和头节点距离入环的第一个节点相等！！！
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            //因为fast一次走两步，所以要判断fast.next是不是为空
            //如果fast.next为null，则fast.next.next不存在
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }
        if(fast == null || fast.next== null){
            //说明没进去上面while循环，则该链表不带环
            return null;
        }
        ListNode cur1 = head;
        ListNode cur2 = fast;
        //如果带环，他们两相遇的第一个点就是链表入环的第一个节点
        while(cur1 != cur2){
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur1;
    }
}
