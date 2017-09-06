package baekjoon.math;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by advJava3_2 on 2017. 5. 4..
 * 스택 (stack)은 기본적인 자료구조 중 하나로,
 * 컴퓨터 프로그램을 작성할 때 자주 이용되는 개념이다.
 * 스택은 자료를 넣는 (push) 입구와 자료를 뽑는 (pop) 입구가 같아 제일 먼저 들어간 자료가 제일 나중에 나오는 (FILO, first in last out) 특성을 가지고 있다.
 * <p>
 * 1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다.
 * 이 때, 스택에 push하는 순서는 반드시 오름차순을 지키도록 한다고 하자.
 * 임의의 수열이 주어졌을 때 스택을 이용해 그 수열을 만들 수 있는지 없는지,
 * 있다면 어떤 순서로 push와 pop 연산을 수행해야 하는지를 알아낼 수 있다.
 * 이를 계산하는 프로그램을 작성하라.
 * <p>
 * 입력
 * 첫 줄에 n(1≤n≤100,000)이 주어진다. 둘째 줄부터 n개의 줄에는 수열을 이루는 1이상 n이하의 정수가 하나씩 순서대로 주어진다.
 * 물론 같은 정수가 두 번 나오는 일은 없다.
 * <p>
 * 출력
 * 입력된 수열을 만들기 위해 필요한 연산을 한 줄에 한 개씩 출력한다.
 * push연산은 +로, pop 연산은 -로 표현하도록 한다. 불가능한 경우 NO를 출력한다.
 * <p>
 * <p>
 * 8
 * 4
 * 3
 * 6
 * 8
 * 7
 * 5
 * 2
 * 1
 * <p>
 * <p>
 * +
 * +
 * +
 * +
 * -
 * -
 * +
 * +
 * -
 * +
 * +
 * -
 * -
 * -
 * -
 * -
 */
public class p1874_stackSequence {
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);

        int N = input.nextInt(); //사이즈 입력

        Stack<Integer> stack = new Stack<Integer>();
        StringBuilder sb = new StringBuilder(); //+,- 결과 저장할 변수
        int seq[] = new int[N]; //입력될 수열 저장할 변수

        for(int i=0;i<N;i++){
            seq[i] = input.nextInt();
        }

        int number = 1; //1~N 숫자
        int pointer = 0; //수열의 비교할 index

        while(pointer!=N && number!=N+2){ //number가 N+1일 경우 나머지 작업은 모두 pop이어야 함.
            if(!stack.isEmpty()){ //스택이 비지않은경우
                if(stack.peek() == seq[pointer]){ //스택젤상단과 수열이 일치하는경우
                    stack.pop(); //스택에서 꺼낸다
                    pointer++;//다음수열
                    sb.append("-\n"); //-출력
                }else{
                    stack.push(number);
                    number++;
                    sb.append("+\n");
                }
            }else{ //스택이 빈경우
                stack.push(number);
                number++;
                sb.append("+\n");
            }
        }
        if(pointer==N)
            System.out.println(sb.toString()); //출력
        else
            System.out.println("NO");
    }
//    static int status;
//
//    public static void main(String[] args) {
//
//        status = 1;
//        Stack stack = new Stack();
//        Scanner scan = new Scanner(System.in);
//        
//        int n = scan.nextInt();
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        int[] input = new int[n+1];
//        for (int i = 1; i <= n; i++) {
//            list.add(i);
//            input[i] = scan.nextInt();
//        }
//        
//        for(int i=1; i<=n; i++){
//            if (input[i] > n) {
//                System.out.println("NO");
//                return ;
//            }
//            System.out.println(status);
//            if(status<input[i]){
//                for(int j=status; j<=input[i]; j++){ //1~4
//                    stack.push(j);
//                    status++;
//                    System.out.println("+");
//                }
//                stack.pop();
//            } else {
//                for(int j=status-1; j>=input[i]; j--){
//                    stack.pop();
//                    status--;
//                    System.out.println("-");
//                }
//            }
//            
//        }

        
//        for (int i = 0; i < n; i++) {
//            if (input[i] > n) {
//                no();
//            }
//            System.out.println("input:" + input[i] + " status:" + status);
//            if (input[i] > status) {
//                for (int j = status; j <= input[i]; j++) {
//                    stack.push(j);
//                    status++;
//                    System.out.println("+");
//                }
//            } else if (input[i] < status) {
//                for (int j = status; j > input[i]; j--) {
//                    stack.pop();
//                    status--;
//                    System.out.println("-");
//                }
//            }
//        }
//    }
}
