package codingDojang.lv1;

/**
 * Created by advJava3_2 on 2017. 4. 2..
 */
public class Pagination {
    public static void main(String[] args) {
        int all = 0;
        int pageSize = 10;
        int pageNum = all/pageSize+1;
        System.out.println(pageNum);
    }
}
