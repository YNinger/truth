package java0320;

public class MyPriorityQueue {
    // 向下调整是创建堆的一个核心操作
    // 前提条件, 要求当前被调整节点的左右子树都已经是堆了
    // 方法参数给出了一个 size 表示当前数组的有效元素大小.
    // 虽然可以通过 arr.length 取到大小, 这个大小是数组的总的大小
    // index 表示从这个位置开始进行向下调整
    // 还是按照大堆的方式来实现.
    // 时间复杂度 O(logN)
    // 如果数据是依次 * 2 / 2 的方式变化的时候, 时间复杂度基本都和 logN 相关
    public static void shiftDown(int[] arr, int size, int index) {
        int parent = index;
        int child = 2 * parent + 1;
        while (child < size) {
            // 需要找到左右子树中较大的值
            // 左右子树下标差 1
            if (child + 1 < size && arr[child + 1] > arr[child]) {
                child = child + 1;
            }
            // 当上述条件执行完后, 就能保证 child 指向左右子树较大的元素
            // 拿父节点和刚才找出的这个较大的节点再去比较, 看是否符合大堆的要求
            if (arr[parent] < arr[child]) {
                // 不满足大堆的要求, 交换两个元素
                int tmp = arr[parent];
                arr[parent] = arr[child];
                arr[child] = tmp;
            } else {
                // 调整完毕了, 已经把父元素放到了合适的位置上
                break;
            }
            // 更新 parent 和 child 以备下次循环
            parent = child;
            child = 2 * parent + 1;
        }
    }
}
