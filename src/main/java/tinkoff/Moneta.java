package tinkoff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
У Артемия есть бесконечное число монет, каждая из которых одного из трех номиналов. Его интересует, какие суммы от ﻿11﻿ до ﻿NN﻿ рублей он может набрать в свой кошелек, если там заранее лежала монета величиной в ﻿11﻿ рубль.

Формат входных данных
Первая строка содержит число ﻿NN﻿ — ограничение на сумарную стоимость монет в кошельке ﻿(1 \leq N \leq 10^{18}).(1≤N≤10
18
 ).﻿
Вторая строка содержит три числа ﻿A,B \ и\ C,A,B и C,﻿ задающие достоинства типов монет ﻿(1 \leq A,B,C \leq 100000).(1≤A,B,C≤100000).﻿

Формат выходных данных
Выведите единственное число — количество сумм, которые можно набрать в кошельке.

Замечание
В первом примере возможны следующие варианты:

﻿1=11=1﻿

﻿1+4=51+4=5﻿

﻿1+7=81+7=8﻿

﻿1+4+4=91+4+4=9﻿

﻿1+9=101+9=10﻿

﻿1+4+7=121+4+7=12﻿

﻿1+4+4+4=131+4+4+4=13﻿

﻿1+4+9=141+4+9=14﻿

﻿1+7+7=151+7+7=15﻿

Примеры данных
Пример 1
15
4  7  9
Вывод:
9

 */
public class Moneta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();

        if (!(1 <= n || n <= Math.pow(10, 18))) {
            return;
        }

        int [] mass = new int[4];
        mass[0] = 1;

        for (int i = 1; i < 4; i++) {
            mass[i] = in.nextInt();
            if (!(1 <= mass[i] || mass[i] <= 100000)) {
                return;
            }
        }
        List<Integer> list = new ArrayList<Integer>();
        list.add(mass[0]);

        for (int i = 1; i < mass.length; i++) {
            List<Integer> listI = new ArrayList<Integer>();

            int sum = list.get(0);
            while (sum + mass[i] <= n) {
                sum = sum + mass[i];
                listI.add(sum);
            }

            sum = 0;

            while (sum <= n) {
                if (list.size() == 1) {
                    break;
                }
                for (int j = 1; j < list.size(); j++) {

                    sum = list.get(j) + mass[i];
                    if (sum <= n) {
                        listI.add(sum);
                    }
                }
            }
            list.addAll(listI);
        }

        System.out.print(list.size());
    }
}
