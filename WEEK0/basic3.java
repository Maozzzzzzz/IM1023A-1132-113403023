//The logistic operation for if-else & switch
public class basic3 {
    public static void main(String[] args) {
        //if:和C一樣!
        int num = 7;
        if (num > 10) {
            System.out.println("數字大於 10");
        } else if (num > 5) {
            System.out.println("數字介於 6 到 10 之間");
        } else {
            System.out.println("數字小於或等於 5");
        }

        //三元運算子(簡化if-else語句)
        /*變數 = (條件) ? 條件為 `true` 時的值 : 條件為 `false` 時的值
        if (條件) {
        變數 = true 時的值;
        } else {
        變數 = false 時的值;
        }
        */
        
        //switch:和C一樣!
        int day = 3;
        switch (day) {
        case 1:
        System.out.println("星期一");
        break;

        case 2:
        System.out.println("星期二");
        break;

        case 3:
        System.out.println("星期三");
        break;

        default://若有全部皆例外不符合(不一定要)
        System.out.println("其他日子");
}

        

    }
}
