Find Missing Number   ( 1 )
int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
-----------------------------------------------------------------------------------------------------------------------
Sum of Even Indexed Factorials from 0! to n! ( 3 )
long sum=0;
        for (int i=0; i<=n; i+=2){
        sum+=factorial(i);
        }
        return sum;
    }
}
--------------------------------------------------------------------------------------------------------------------------
Maximum Product Subarray ( 3 )
int max=nums[0], min=nums[0], result=nums[0];
        for (int i=1; i<nums.length; i++){
        if (nums[i]<0){
        int temp=max;
            max=min;
            min=temp;
        }
            max=Math.max(nums[i], max*nums[i]);
            min=Math.min(nums[i], min*nums[i]);
            result=Math.max(result,max);
        }
        return result;
    }
}
------------------------------------------------------------------------------------------------------------------------
Fibonacci Number with Recursive ( 1 )
if(n==0) return 0;
        if(n==1) return 1;
        return solution(n-2)+solution(n-1);
    }
}
----------------------------------------------------------------------------------------------------------------------
Sliding Window Sum ( 3 )
List<Integer> result = new ArrayList<>();
        if (nums == null || nums.size() == 0 || k <= 0 || k > nums.size()) {
            return result;
        }
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums.get(i);
        }
        result.add(windowSum);
        for (int i = k; i < nums.size(); i++) {
            windowSum -= nums.get(i - k);
            windowSum += nums.get(i);
            result.add(windowSum);
        }        
        return result;
    }
}
------------------------------------------------------------------------------------------------------------------------
Sum of Odd Fibonacci Numbers up to n-th Term ( 3 )
long a = 0, b = 1, sum = 0;
        for (int i = 0; i <= n; i++) {
            if (a % 2 != 0) sum += a;
            long next = a + b;
            a = b;
            b = next;
        }
        return sum;
    }
}
---------------------------------------------------------------------------------------------------------------------------
Sum of Odd Indexed Factorials from 0! to n! ( 3 )
long sum = 0;
        long factorial = 1;        
        for (int i = 0; i <= n; i++) {
            if (i > 0) {
                factorial *= i;
            }            
            if (i % 2 != 0) { 
                sum += factorial;
            }
        }        
        return sum;
    }
}
--------------------------------------------------------------------------------------------------------------------------
Ugly Number ( 1 )
if (n <= 0) return false;
while (n % 2 == 0) n /= 2;
while (n % 3 == 0) n /= 3;
while (n % 5 == 0) n /= 5;
return n ==1;
}}
-------------------------------------------------------------------------------------------------------------------------
Nice Number ( 1 )
if (n <= 0) return false;
        while (n % 2 == 0) n /= 2;
        while (n % 3 == 0) n /= 3;
        while (n % 5 == 0) n /= 5;
        return n > 1;
    }
}
-----------------------------------------------------------------------------------------------------------------------
Sum of Even Fibonacci Numbers up to n-th Term ( 3 )
long a = 0, b = 1, sum = 0;
        for (int i = 0; i <= n; i++) {
            if (a % 2 == 0) sum += a;
            long next = a + b;
            a = b;
            b = next;
        }
        return sum;
    }
}
-------------------------------------------------------------------------------------------------------------------------
Fibonacci Number ( 1 )
if(n==0) return 0;
        if(n==1) return 1;
        return solution(n-2)+solution(n-1);
    }
}
--------------------------------------------------------------------------------------------------------------------------
Compute n ( 1 )
if(n<=1) return 1;
        return n*factorial(n-1);
    }
}
--------------------------------------------------------------------------------------------------------------------------
Sliding Window Maximum(3)
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<=nums.length-k;i++){
            int max=nums[i];
        	for(int j=i;j<i+k;j++){
                if(max<nums[j]){
                max=nums[j];
                }
            }
            list.add(max);
        }
        return list;
    }}
--------------------------------------------------------------------------------------------------------------------------
Find 2 missing number(3)
        int n = nums.length + 2;

        boolean[] seen = new boolean[n + 1];

        for (int num : nums) {
            seen[num] = true;
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (!seen[i]) {
                result.add(i); 
            }
        }

        return result;
    }
}
Reverve words in String(3)
String[] words= s.trim().split("\\s+");
        StringBuilder result =new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
        	result.append(words[i]);
            if(i!=0){
            result.append(" ");
            
            }
        }
        return result.toString();
}
}
--------------------------------------------------------------------------------------------------------------------------
Sliding Window Average(3)

     	List<Double> avg=new ArrayList<>();
     for(int i=0;i<=nums.size()-k;i++){
     	double sum=0;
         for(int j=i;j<i+k;j++){
        	sum+=nums.get(i); 
        }
         avg.add(sum/k);
     }
        return avg;
    }
}
Remove Duplicates and move zeros to end of a list(3)
List<Integer> result = new ArrayList<>();
int zeroCount = 0;

for (int num : nums) {

if (num == 0) {
zeroCount++;
} 
else if (!result.contains(num)) {
result.add(num);
}
}

for (int i = 0; i < zeroCount; i++) {
result.add(0);
}

return result;
}
}
--------------------------------------------------------------------------------------------------------------------------

Find the top k frequent elements in a list(3)
Map<Integer, Integer> map = new HashMap<>();

// say
for (int n : nums)
map.put(n, map.getOrDefault(n, 0) + 1);

// listə çevir
List<Integer> list = new ArrayList<>(map.keySet());

// frequency-yə görə sort
Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

return list.subList(0, k);
}
}


------------------------------------------------

Group Anagrams using java Collections(3)
Map<String, List<String>> map = new HashMap<>();

for (String s : strs) {
char[] c = s.toCharArray();
Arrays.sort(c);
String key = new String(c);

if (!map.containsKey(key)) {
map.put(key, new ArrayList<>());
}

map.get(key).add(s);
}

return new ArrayList<>(map.values());
}
}
--------------------------------------------------------
Longest Substring  between equal characters(1)
public static int solution(String s) {
    int maxLength = -1;
    Map<Character, Integer> firstOccurrence = new HashMap<>();

    for (int index = 0; index < s.length(); index++) {
        char ch = s.charAt(index);
        if (firstOccurrence.containsKey(ch)) {
            int length = index - firstOccurrence.get(ch) - 1;
            if (length > maxLength) {
                maxLength = length;
            }
        } else {
            firstOccurrence.put(ch, index);
        }
    }

    return maxLength;
}
------------------------------------------------------------
Cells with Odd Values in Matrix(1)
public static int solution(int m, int n, int[][] indices) {
    int[] rows = new int[m];
    int[] cols = new int[n];

    for (int[] idx : indices) {
        int r = idx[0];
        int c = idx[1];
        rows[r]++;
        cols[c]++;
    }

    int oddCount = 0;
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if ((rows[i] + cols[j]) % 2 != 0) {
                oddCount++;
            }
        }
    }

    return oddCount;
}
-------------------------------------------
Consecutive Characters Power(1)
public static int solution(String s) {
    if (s == null || s.isEmpty()) {
        return 0;
    }

    int maxPower = 0;
    int currentPower = 0;
    char currentChar = '\0';

    for (char c : s.toCharArray()) {
        if (c == currentChar) {
            currentPower++;
        } else {
            maxPower = Math.max(maxPower, currentPower);
            currentChar = c;
            currentPower = 1;
        }
    }

    maxPower = Math.max(maxPower, currentPower);
    return maxPower;
}
-------------------------------------------------------
Kids With the Greatest Number of Candies (1)
public static boolean[] correctSolution(int[] candies, int extraCandies) {
    int n = candies.length;
    boolean[] result = new boolean[n];

    int maxCandies = 0;
    for (int candy : candies) {
        if (candy > maxCandies) {
            maxCandies = candy;
        }
    }

    for (int i = 0; i < n; i++) {
        if (candies[i] + extraCandies >= maxCandies) {
            result[i] = true;
        }
    }

    return result;
}
-----------------------------------------------
Replace Elements with Greatest Element on Right(1)
public static int[] correctSolution(int[] arr) {
    int n = arr.length;
    if (n == 0) {
        return new int[0];
    }

    int greatestRight = -1;

    for (int i = n - 1; i >= 0; i--) {
        int currentElement = arr[i];
        arr[i] = greatestRight;
        if (currentElement > greatestRight) {
            greatestRight = currentElement;
        }
    }

    return arr;
}


}
-----------------------------------------------------
Find Special Integer (1)
public static int correctSolution(int[] nums) {
    int n = nums.length;

    for (int x = 0; x <= n; x++) {
        int count = 0;
        for (int num : nums) {
            if (num >= x) {
                count++;
            }
        }
        if (count == x) {
            return x;
        }
    }

    return -1;
}
--------------------------------------------------------
Maximum Sum Less Than K
public static int correctSolution(int[] nums, int k) {
    int maxSum = -1;
    int n = nums.length;

    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            int currentSum = nums[i] + nums[j];
            if (currentSum < k) {
                maxSum = Math.max(maxSum, currentSum);
            }
        }
    }

    return maxSum;
}
---------------------------------------------------------
Can Place Flowers(1)
public static boolean correctSolution(int[] flowerbed, int n) {
    int i = 0;
    int length = flowerbed.length;

    while (i < length) {
        if (flowerbed[i] == 0) {
            boolean emptyPrev = (i == 0) || (flowerbed[i - 1] == 0);
            boolean emptyNext = (i == length - 1) || (flowerbed[i + 1] == 0);

            if (emptyPrev && emptyNext) {
                flowerbed[i] = 1;
                n--;
                if (n == 0) {
                    return true;
                }
                i += 2;
                continue;
            }
        }
        i++;
    }

    return n <= 0;
}
---------------------------------------------------------
Next Greatest Letter(1)
public static String correctSolution(String[] letters, String target) {
    int left = 0, right = letters.length;

    while (left < right) {
        int mid = (left + right) / 2;
        if (letters[mid].compareTo(target) <= 0) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }

    if (left == letters.length) {
        return letters[0];
    } else {
        return letters[left];
    }
}
-------------------------------------------------------------
Chocolate Feast(1)
public static int correctSolution(int n, int c, int m) {
    int chocolates = n / c;
    int wrappers = chocolates;

    while (wrappers >= m) {
        int extraBars = wrappers / m;
        chocolates += extraBars;
        wrappers = wrappers % m + extraBars;
    }

    return chocolates;
}
Reverse Characters in Words(1)
public static String correctSolution(String s) {
    String[] words = s.split("\\s+");
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < words.length; i++) {
        String word = words[i];
        result.append(new StringBuilder(word).reverse());
        if (i < words.length - 1) {
            result.append(" ");
        }
    }

    return result.toString();
}
---------------------------------------------------------
Beautiful days(1)
public static int correctSolution(int i, int j, int k) {
        int count = 0;
        for (int day = i; day <= j; day++) {
            int reversed = 0;
            int num = day;
            while (num > 0) {
                reversed = reversed * 10 + num % 10;
                num /= 10;
            }
            int reverseDay = reversed;
            if (Math.abs(day - reverseDay) % k == 0) {
                count++;
            }
        }
        return count;
    }


























