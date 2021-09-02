package tinkoff;

/*
Вам дана строка ﻿SS﻿ длины 4, состоящая из заглавных букв латинского алфавита.

Определите, правда ли, что ﻿SS﻿ состоит из двух различных букв, каждая из которых встречается

дважды.

Вам нужно ответить на ﻿TT﻿независимых наборов входных данных.


Формат входных данных

Первая строка теста содержит одно целое число ﻿T (1 \leqslant T \leqslant 100)T(1⩽T⩽100)﻿ ﻿-−﻿ количество наборов входных данных. Затем следуют ﻿TT﻿наборов входных данных.

В первой строке набора входных данных вводится строка ﻿S(|S|=4)S(∣S∣=4)﻿.


Формат выходных данных

Для каждого набора входных данных выведите ответ на него ﻿- «Yes»−«Yes»﻿ , если ﻿SS﻿

состоит из двух букв, каждая из которых встречается дважды, и ﻿«No»«No»﻿ иначе.

Примеры данных
Пример 1
4
ABBA
GOGO
FIRE
WAPP
Выходные данные
Yes
Yes
No
No

 */

import java.util.Scanner;
public class Letters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        if (!(1 <= t || t <= 100)) {
            return;
        }

        for (int i = 0; i < t; i++) {
            int ch1Count = 0;
            int ch2Count = 0;

            char ch1 = 0;
            char ch2 = 0;
            String s = in.next();
//            ch1 = s.charAt(0);
//            ch1Count = ch1Count + 1;

            for (int j = 0; j < 4; j++) {
                if (ch1 == 0 || s.charAt(j) == ch1) {
                    ch1 = s.charAt(j);
                    ch1Count = ch1Count + 1;
                } else if (ch2 == 0 || s.charAt(j) == ch2) {
                    ch2 = s.charAt(j);
                    ch2Count = ch2Count + 1;
                }
            }

            if (ch1Count == 2 && ch2Count == 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
