package java210602;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class redAndBlack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int m =sc.nextInt();
            int n =sc.nextInt();
            sc.nextLine();
            Character[][] ch = new Character[m][n];
            Node start =null;
            for (int i = 0; i <m ; i++) {
                String s = sc.nextLine();
                for (int j = 0; j <n ; j++) {
                    ch[i][j] = s.charAt(j);
                    if(s.charAt(j)=='@'){
                        start = new Node(i,j);
                    }
                }
            }
            int [][] direction = {{0,1},{0,-1},{1,0},{-1,0}};
            bfs(ch,direction,start);
        }
    }

    public static void bfs(Character[][] ch, int[][] direction, Node start) {
        Queue<Node> queue = new LinkedList<>();
        boolean [][] v = new boolean[ch.length][ch[0].length];
        queue.add(start);
        v[start.x][start.y]=true;
        int count =1;
        while (!queue.isEmpty()){
            Node cur = queue.poll();
            for (int i = 0; i <4 ; i++) {
                Node next = new Node(cur.x+direction[i][0],cur.y+direction[i][1]);
                if(next.x>=0&&next.x<ch.length&&next.y>=0&&next.y<ch[0].length
                        &&ch[next.x][next.y]!='#'&&!v[next.x][next.y]){
                    count++;
                    queue.add(start);
                    v[next.x][next.y] = true;
                }
            }
        }
        System.out.println(count);
    }

    static class Node{
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
