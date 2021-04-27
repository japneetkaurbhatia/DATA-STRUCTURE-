public static void longestConsecutiveSequence(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        int sp = 0, maxLen = 0;

        for (int ele : arr) {
            if (!map.containsKey(ele))
                continue;

            map.remove(ele);
            int le = ele - 1;
            int re = ele + 1;

            while (map.containsKey(le)) {
                map.remove(le);
                le--;
            }

            while (map.containsKey(re)) {
                map.remove(re);
                re++;
            }

            int len = re - le - 1;
            if (len > maxLen) {
                maxLen = len;
                sp = le + 1;
            }
        }

        for (int i = 0; i < maxLen; i++)
            System.out.println(sp + i);

    }