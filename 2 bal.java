
Reverse Integer
        int result = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            if (result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10) {
                return 0;
            }
            result = result * 10 + digit;
        }
        return result;
    }
}
-------------------------------------------------------------------------------------------------------------
Most Frequent Word
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        String result = "";
        int max = 0;
        for (String word : map.keySet()) {
            if (map.get(word) > max) {
                max = map.get(word);
                result = word;
            }
        }
        return result;
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------
Unique Word Frequency Counter	
           Map<String, Integer> map = new HashMap<>(); 
           for (String word : words) {
           map.put(word, map.getOrDefault(word, 0) + 1);
                }
              return map;
            }
         }
--------------------------------------------------------------------------------------------------------------------
Frequency Sorted Words
Map<String, Integer> map = new HashMap<>(); 
for (String word : words) {
map.put(word, map.getOrDefault(word, 0) + 1);
} 
List<String> result = new ArrayList<>(map.keySet());
result.sort((a, b) -> map.get(b) - map.get(a));
return result;
}
}
---------------------------------------------------------------------------------------------------------------------
Sum of Fibonacci Numbers up to n-th Term
if(n==0) return 0;
        if(n==1) return 1;
        int a=0,b=1;
        int sum=a+b;
        for(int i=2;i<=n;i++){
        int c=a+b;
            sum+=c;
            a=b;
            b=c;
        }
        return sum;
    }
}
----------------------------------------------------------------------------------------------------------------------------
Find the First Non-Repeating Character
Map<Character, Integer> map = new HashMap<>(); 
for (char c : s.toCharArray()) {
map.put(c, map.getOrDefault(c, 0) + 1);
} 
for (char c : s.toCharArray()) {
if (map.get(c) == 1) {
return c;
}
}
return null;
}
}
------------------------------------------------------------------------------------------------------------------------
Move All Zeros to the End of a List
List<Integer> result = new ArrayList<>();
        for (Integer num : list) {
            if (num != 0) {
                result.add(num);
            }
        }
        int zeroCount = list.size() - result.size();
        for (int i = 0; i < zeroCount; i++) {
            result.add(0);
        }        
        return result;
    }
}-----------------------------------------------------------------------------------------------------------------------
Sum of Factorials up to n
long sum=1, fact=1;
        for (int i=1; i<=n; i++){
            fact*=i;
	sum+=fact;
        } return sum;
    }}
------------------------------------------------------------------------------------------------------------------------------------
Average of Two Missing Numbers
int n = nums.length + 2; 
int totalSum = (n * (n + 1)) / 2; 
int arraySum = 0;
for (int num : nums) {
arraySum += num;
} 
int missingSum = totalSum - arraySum; 
return missingSum / 2.0;
}
}
----------------------------------------------------------------------------------------------------------------------------------
Remove Duplicates from a list of Integers
 return new ArrayList<>(new LinkedHashSet<>(list));
    }
}
-------------------------------------------------------------------------------------------------------------------------------
Longest Common Prefix
if (strs == null || strs.length == 0) return ""; 
String prefix = strs[0]; 
for (int i = 1; i < strs.length; i++) { 
while (!strs[i].startsWith(prefix)) {
if (prefix.length() == 0) return "";
prefix = prefix.substring(0, prefix.length() - 1);
}
}
return prefix;
}
}
Migratory birds
public static int solution(int[] arr) {
    Map<Integer, Integer> frequency = new HashMap<>();

    for (int birdId : arr) {
        frequency.put(birdId, frequency.getOrDefault(birdId, 0) + 1);
    }

    int maxCount = 0;
    int minId = Integer.MAX_VALUE;

    for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
        int birdId = entry.getKey();
        int count = entry.getValue();

        if (count > maxCount) {
            maxCount = count;
            minId = birdId;
        } else if (count == maxCount && birdId < minId) {
            minId = birdId;
        }
    }

    return minId;
}

Fair Candy Swap
public static int[] solution(int[] aliceSizes, int[] bobSizes) {
    int Sa = 0, Sb = 0;
    for (int x : aliceSizes) Sa += x;
    for (int x : bobSizes) Sb += x;

    Set<Integer> setB = new HashSet<>();
    for (int x : bobSizes) {
        setB.add(x);
    }

    int diff = (Sb - Sa) / 2;

    for (int x : aliceSizes) {
        int y = x + diff;
        if (setB.contains(y)) {
            return new int[]{x, y};
        }
    }

    return new int[0];
}


Unplaced fruits
public static int solution(int[] fruits, int[] baskets) {
    int n = fruits.length;
    boolean[] basketOccupied = new boolean[n];
    int placedCount = 0;

    for (int fruitQuantity : fruits) {
        boolean placed = false;
        for (int i = 0; i < n; i++) {
            if (!basketOccupied[i] && baskets[i] >= fruitQuantity) {
                basketOccupied[i] = true;
                placed = true;
                break;
            }
        }
        if (placed) {
            placedCount++;
        }
    }

    return n - placedCount;
}


 


Buddy Strings
public static boolean solution(String s, String goal) {
    if (s.length() != goal.length()) {
        return false;
    }

    if (s.equals(goal)) {
        Set<Character> seen = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (seen.contains(c)) {
                return true;
            }
            seen.add(c);
        }
        return false;
    }

    List<Integer> diff = new ArrayList<>();
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) != goal.charAt(i)) {
            diff.add(i);
        }
    }

    if (diff.size() == 2) {
        int i = diff.get(0);
        int j = diff.get(1);
        char[] chars = s.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return new String(chars).equals(goal);
    }

    return false;
}
Find common elements
public static int[] solution(int[] arr1, int[] arr2, int[] arr3) {
    int ptr1 = 0, ptr2 = 0, ptr3 = 0;
    List<Integer> result = new ArrayList<>();

    while (ptr1 < arr1.length && ptr2 < arr2.length && ptr3 < arr3.length) {
        if (arr1[ptr1] == arr2[ptr2] && arr2[ptr2] == arr3[ptr3]) {
            result.add(arr1[ptr1]);
            ptr1++;
            ptr2++;
            ptr3++;
        } else if (arr1[ptr1] < arr2[ptr2]) {
            ptr1++;
        } else if (arr2[ptr2] < arr3[ptr3]) {
            ptr2++;
        } else {
            ptr3++;
        }
    }

    int[] res = new int[result.size()];
    for (int i = 0; i < result.size(); i++) {
        res[i] = result.get(i);
    }
    return res;
}

Diet plan performance
public static int solution(int[] calories, int k, int lower, int upper) {
        int points = 0;
        int n = calories.length;
        if (n < k) {
            return 0;
        }
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += calories[i];
        }
        if (windowSum < lower) {
            points -= 1;
        } else if (windowSum > upper) {
            points += 1;
        }
        for (int i = k; i < n; i++) {
            windowSum += calories[i] - calories[i - k];
            if (windowSum < lower) {
                points -= 1;
            } else if (windowSum > upper) {
                points += 1;
            }
        }
        return points;
    }
Count negative numbers in sorted Matrix
public static int solution(int[][] grid) {
    int count = 0;
    int rows = grid.length;
    int cols = rows > 0 ? grid[0].length : 0;

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (grid[i][j] < 0) {
                
                count += (cols - j);
                break;
            }
        }
    }

    return count;
}
Find destination city
public static String solution(List<List<String>> paths) {
    Set<String> startingCities = new HashSet<>();
    Set<String> allCities = new HashSet<>();

    for (List<String> path : paths) {
        String start = path.get(0);
        String end = path.get(1);

        startingCities.add(start);
        allCities.add(start);
        allCities.add(end);
    }

    for (String city : allCities) {
        if (!startingCities.contains(city)) {
            return city;
        }
    }

    return "";
}
How many games
public static int solution(int p, int d, int m, int s) {
    int gamesCount = 0;
    int currentPrice = p;

    while (s >= currentPrice) {
        s -= currentPrice;
        gamesCount++;
        currentPrice = Math.max(currentPrice - d, m);
    }

    return gamesCount;
}
Sum of even numbers
public static int solution(int[] nums) {
    int sum = 0;
    for (int num : nums) {
        if (num % 2 == 0) {
            sum += num;
        }
    }
    return sum;
}
Game of thrones
public static String correctSolution(String s) {
    Map<Character, Integer> freq = new HashMap<>();

    for (char c : s.toCharArray()) {
        freq.put(c, freq.getOrDefault(c, 0) + 1);
    }

    int oddCount = 0;
    for (int count : freq.values()) {
        if (count % 2 != 0) {
            oddCount++;
        }
    }

    return oddCount > 1 ? "NO" : "YES";
}
