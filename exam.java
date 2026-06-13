
"1. Finding Maximum and Minimum     1

    public int getMax(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }

    public int getMin(int[] arr) {
        return Arrays.stream(arr).min().getAsInt();
    }


2. Linked List: Adding an Element      1

 static class LinkedListTask {

    Node head, tail;

    public void insertAtEnd(int x) {
        Node n = new Node(x);
        if (head == null) head = tail = n;
        else tail = tail.next = n;
    }
}

 3. Binary Search     1

 public int search(int[] arr, int target) {


    int i =Arrays.binarySearch(arr, target);
    return i >= 0 ? i : -1;
}


    4.  Character Count in a String        1

    static class CharCountTask {

    public int countChar(String s, char c) 
     {  return (int) s.chars().filter(ch -> ch == c).count(); }

}

    5. Implementation of a Deque             1

    static class MyDeque {

    int[] a = new int[1000];
    int f = 500, r = 500;

    public void addFirst(int x) { a[--f] = x; }
    public void addLast(int x)  { a[r++] = x; }
}

    6. Linear Search                   1

    static class SearchTask {

    public int find(int[] arr, int target) {
	    for (int i = 0; i < arr.length; i++)
            if (arr[i] == target) return i;
        return -1;
    }
}

    7. Building of the Stack Structure         1

    static class MyStack {

    int[] a = new int[1000];
    int top = -1;

    public void push(int x) {
        a[++top] = x;
    }

    public int pop() {
        return top == -1 ? -1 : a[top--];
    }

    public int peek() {
        return top == -1 ? -1 : a[top];
    }
}
         
   8.  Finding Duplicate Elements8.           1

static class DuplicateTask {

    public boolean hasDuplicate(int[] arr) {
    return Arrays.stream(arr).distinct().count() != arr.length;
}


    9.  Counting Nodes in a Linked List             1

    static class LinkedListTask {

    Node head;

    public int getSize() {
        int c = 0;
        for (Node t = head; t != null; t = t.next) c++;
        return c;
    }
}
    10.  Palindrome Check (Using Loop)             1

    static class PalindromeTask {

    public boolean isPalindrome(String s){

     return new StringBuilder(s).reverse().toString().equals(s);
    }
}

     
    11.   Building the Node Structure            1

    static class LinkTask {
    public void connect(Node f, Node s) {
        if (f != null) f.next = s;
    }
}

    12.  Dynamic Expansion of an Array Size               1

    return Arrays.copyOf(old, old.length * 2);


13.   Fibonacci Number Calculation            1

static class FibonacciTask {

    public int fib(int n) {
    	if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

}

    14.    Array Reversal           1

    static class ReverseTask {

    public void reverse(int[] arr) {
    for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
    }

}


   15.  Symmetric binary tree      1

   public static boolean isSymmetric(TreeNode root) {
    return check(root.left, root.right);
}

static boolean check(TreeNode l, TreeNode r) {
    if (l == null || r == null) return l == r;
    return l.val == r.val && check(l.left, r.right) && check(l.right, r.left);

}

16.  Binary tree height        1


public static int maxDepth(TreeNode root) {
    return root == null ? 0 : 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
}
 
17. Two Binary Trees Same Tree (Check if Two Trees are Identical)    1


public static boolean isSameTree(TreeNode p, TreeNode q) {
    return p == q || (p != null && q != null &&
           p.val == q.val &&
           isSameTree(p.left, q.left) &&
           isSameTree(p.right, q.right));
}

18. Binary Tree Post-order Traversal     1

static List<Integer> r = new ArrayList<>();

public static List<Integer> postorderTraversal(TreeNode root) {
    if (root != null) {
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        r.add(root.val);
    }
    return r;
}

  
19.  Binary Tree Pre-order Traversal      1

static List<Integer> r = new ArrayList<>();

public static List<Integer> preorderTraversal(TreeNode root) {
    if (root != null) {
        r.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
    return r;
}


20. Binary Tree In-order Traversal        1


static List<Integer> r = new ArrayList<>();

public static List<Integer> inorderTraversal(TreeNode root) {
    if (root != null) {
        inorderTraversal(root.left);
        r.add(root.val);
        inorderTraversal(root.right);
    }
    return r;
}

21. Radar Target Scanner     1

public static int[] findTarget(boolean[][] g) {
    for(int i=0;i<g.length;i++) for(int j=0;j<g[i].length;j++) if(g[i][j]) return new int[]{i,j};
    return null;
}



22.  Checking for a Monotonic Array            1

public static boolean isMonotonic(int[] a) {
    boolean inc=true, dec=true;
    for(int i=1;i<a.length;i++) if(a[i]>a[i-1]) dec=false; else if(a[i]<a[i-1]) inc=false;
    return inc||dec;
}


23.   Finding the Distance Value Between Two Arrays        1

public static int findTheDistanceValue(int[] a, int[] b, int d) {
    int c=0;
    outer: for(int x:a){ for(int y:b) if(Math.abs(x-y)<=d) continue outer; c++; }
    return c;
}

      
24.  Difference between the Number of Vowels and Consonants in a String            1

public static int getVowelsAndConsonantsDifference(String s) {
    int r=0;
    for(char c:s.toLowerCase().toCharArray()) if(Character.isLetter(c)) r+="aeiou".indexOf(c)>=0?1:-1;
    return r;
}


25.    Two Binary Trees Same Tree (Check if Two Trees are Identical)      1

public static boolean isSameTree(TreeNode p, TreeNode q) {
    if(p==null || q==null) return p==q;
    return p.val==q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
} 


26. Finding the Maximum Variety of Candies      1

public static int distributeCandies(int[] a) {
    return Math.min((int)java.util.Arrays.stream(a).distinct().count(), a.length/2);
}


27.   Checking Correctness of Capital Letters in a String      1


public static boolean detectCapitalUse(String w) {
    return w.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
}


28.   Removal of Zeros from an Array       1

public static void moveZeroes(int[] a) {
    int j=0;
    for(int x:a) if(x!=0) a[j++]=x;
    while(j<a.length) a[j++]=0;
}



 29.  Sum of Octets in an IP Address           1
 
 public static int sumOctets(char[] ip) {
    return Arrays.stream(new String(ip).split("\\.")).mapToInt(Integer::parseInt).sum();
}


30.   Finding the Maximum Consecutive Ones        1

public static int findMaxConsecutiveOnes(int[] a) {
    int m=0,c=0;
    for(int x:a) m=Math.max(m, x==1?++c:(c=0));
    return m;
}



31.   Maximum Distance Between Houses With Different Colors         1

public static int maxDistance(int[] a) {
    int n=a.length,i=0,j=n-1;
    while(a[i]==a[n-1]) i++;
    while(a[j]==a[0]) j--;
    return Math.max(n-1-i, j);
}


32.   Maximum Profit in the Stock Market       1

public static int maxProfit(int[] a) {
    int min=a[0],max=0;
    for(int x:a){ min=Math.min(min,x); max=Math.max(max,x-min); }
    return max;
}


33.    Unique Element That Does Not Repeat           1

public static int singleNumber(int[] a) {
    int r=0;
    for(int x:a) r^=x;
    return r;
}

34.  Building the Complementary Structure of a DNA Strand     1


public static String makeComplement(String dna) {
    return dna.replace('A','t').replace('T','A').replace('t','T')
            .replace('C','g').replace('G','C').replace('g','G');
}


 35.    Finding and Summing Digits in a String          1


 public static int sumDigits(String s) {
    int sum=0;
    for(char c:s.toCharArray())
        if(Character.isDigit(c)) sum+=c-'0';
    return sum;
}


36.  Checking Whether the Robot Returns to the Initial Position     1

public static boolean judgeCircle(String m) {
    int x=0,y=0;
    for(char c:m.toCharArray()){
        if(c=='U') y++;
        else if(c=='D') y--;
        else if(c=='R') x++;
        else x--;
    }
    return x==0&&y==0;
}

37.    Sorting Array Elements by Odds and Evens    1

public static int[] sortArrayByParity(int[] a) {
    int i=0;
    for(int j=0;j<a.length;j++)
        if(a[j]%2==0){ int t=a[i]; a[i]=a[j]; a[j]=t; i++; }
    return a;
}

38. Leader Array     1

public static int[] findLeaders(int[] arr) {
    List<Integer> r = new ArrayList<>();
    int max = Integer.MIN_VALUE;
    for (int i = arr.length-1; i >= 0; i--)
        if (arr[i] > max) { r.add(0, max = arr[i]); }
    return r.stream().mapToInt(Integer::intValue).toArray();
}




 39. Balanced binary tree      2
 
 public static boolean isBalanced(TreeNode root) {
    return height(root) != -1;
}

static int height(TreeNode n) {
    if (n == null) return 0;

    int l = height(n.left);
    if (l == -1) return -1;

    int r = height(n.right);
    if (r == -1) return -1;

    return Math.abs(l - r) > 1 ? -1 : 1 + Math.max(l, r);
}


 40.   Finding the maximum degree of a general tree.      2

    public static int getMaxDegree(Node root) {
    if (root == null) return 0;
    int m = root.children.size();
    for (Node c : root.children) m = Math.max(m, getMaxDegree(c));
    return m;
}



41  Checking a Full Binary Tree.       2

public static boolean isFullTree(TreeNode root) {
    if (root == null) return true;
    if ((root.left == null) != (root.right == null)) return false;
    return isFullTree(root.left) && isFullTree(root.right);
}


42. Checking a Binary Search Tree (BST)    2


public static boolean isValidBST(TreeNode root) {
    return dfs(root, null, null);
}

static boolean dfs(TreeNode n, Integer min, Integer max) {
    if (n == null) return true;
    if (min != null && n.val <= min) return false;
    if (max != null && n.val >= max) return false;
    return dfs(n.left, min, n.val) && dfs(n.right, n.val, max);
}
 



43.   The height of a node in a binary tree.     2

public static int getNodeHeight(TreeNode root) {
    return root == null ? 0 : 1 + Math.max(getNodeHeight(root.left), getNodeHeight(root.right));
}


    26.    Root-to-leaf path sum     2

    public static boolean hasPathSum(TreeNode root, int sum) {
    if (root == null) return false;
    if (root.left == null && root.right == null) return sum == root.val;
    return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
}



44.  The depth of a specific node in a binary tree        2

public static int getDepth(TreeNode root, int target) {
    if (root == null) return -1;
    if (root.val == target) return 0;

    int l = getDepth(root.left, target);
    int r = getDepth(root.right, target);

    return (l == -1 && r == -1) ? -1 : 1 + Math.max(l, r);
}

45. Password Combination Generation     2

static class SafeTask {

    public List<String> findCodes(String digits, int length) {
        List<String> res = new ArrayList<>();
        generate(digits, length, "", res);
        return res;
    }

    private void generate(String digits, int length, String curr, List<String> res) {
        if (curr.length() == length) {
            res.add(curr);
            return;
        }
        for (char c : digits.toCharArray()) 
            generate(digits, length, curr + c, res);
    }
}

    46.   Teemo Attack - Poison Duration    2

    static class Task {

    public int findPoisonedDuration(int[] t, int d) {
        int sum = 0;
        for (int i = 0; i < t.length - 1; i++)
            sum += Math.min(d, t[i + 1] - t[i]);
        return sum + (t.length > 0 ? d : 0);
    }
}

    47.  Gas Station    2

    static class Task {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0, tank = 0, total = 0;

        for (int i = 0; i < gas.length; i++) {
            tank += gas[i] - cost[i];
            total += gas[i] - cost[i];

            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }
        return total < 0 ? -1 : start;
    }
}

        48  Stack: Parentheses Balance    2

        static class BracketTask {

    public boolean isBalanced(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') c++;
            else if (--c < 0) return false;
        }
        return c == 0;
    }
}

    49.  Finding the First Unique Character       2

    static class StringTask {

    public int firstUniqChar(String s) {

        for(int i=0; i<s.length(); i++) {
            char c= s.charAt(i);
            if(s.indexOf(c) == s.lastIndexOf(c)) return i; }
            

        return -1;

    }

}



    50  Longest Common Prefix                     2

    static class Task {

    public String longestCommonPrefix(String[] strs) {

     
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (String s : strs)
            while (!s.startsWith(prefix)) prefix = prefix.substring(0, prefix.length() - 1);
        return prefix;
 

    }

}

    51  Building the Queue Structure               2

static class MyQueue {

    int [] a= new int [1000];
    int f=0, r=0;

    public void enqueue(int x) { a[r++]=x; }

    public int dequeue() { return f==r ? -1: a[f++]; }

    public int peek() { return f==r ?  -1: a[f]; }

}
   
    
    
   

    52.  Validating a Mountain Array                   2

    static class Task {

    public boolean validMountainArray(int[] a) {
        int i = 0, n = a.length;

        while (i + 1 < n && a[i] < a[i + 1]) i++;
        if (i == 0 || i == n - 1) return false;

        while (i + 1 < n && a[i] > a[i + 1]) i++;
        return i == n - 1;
    }
}

    53 Finding the Highest-Value Elements            2

static class PriorityTask {

    public List<Integer> getTopK(int[] nums, int k) {
		List<Integer> res= new ArrayList<>();
        Arrays.sort(nums);
        for(int i=nums.length-1; i>=nums.length-k;i--)
            res.add(nums[i]);
        return res;
        

    }

}

    54.   
    Text Compression (Run-Length Encoding)           2

    static class Task {

    public int compress(char[] c) {
        int w = 0;

        for (int i = 0; i < c.length; ) {
            char ch = c[i];
            int j = i;

            while (j < c.length && c[j] == ch) j++;

            c[w++] = ch;

            if (j - i > 1)
                for (char x : (j - i + "").toCharArray())
                    c[w++] = x;

            i = j;
        }
        return w;
    }
}


        55  Anagram Detection                     2
        

static class HashTask {

    public boolean isAnagram(String s1, String s2) {
   char[] x = s1.toCharArray(), y = s2.toCharArray();
    Arrays.sort(x);
    Arrays.sort(y);
    return Arrays.equals(x, y);
    }
}

    56    ATM - Payment with Standard Banknotes                     2
    
    static class ATMTask {

    public String calculateATM(int a) {
        int[] d = {100, 50, 20, 10, 5, 1};
        StringBuilder s = new StringBuilder();

        for (int x : d)
            while (a >= x) {
                if (s.length() > 0) s.append(",");
                s.append(x);
                a -= x;
            }

        return s.toString();
    }

   57   Caesar Cipher Encryption               2

    static class Task {

    public String encrypt(String s, int k) {
        StringBuilder r = new StringBuilder();

        for (char c : s.toCharArray())
            r.append(!Character.isLetter(c) ? c :
                (char)((c < 97 ? 65 : 97) + (c - (c < 97 ? 65 : 97) + k) % 26));

        return r.toString();
    }
}

    58  Finding the Points Closest to a Target                     2


static class PriorityTask {

 public List<Integer> findClosest(int[] nums, int k, int target) {
    return Arrays.stream(nums).boxed()
        .sorted((a, b) -> Integer.compare(Math.abs(a - target), Math.abs(b - target)))
        .limit(k).toList();
}

}

    59   Generating Pascal’s Triangle                      2

    static class Task {

public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> row = new ArrayList<>();
    for (int i = 0; i < numRows; i++) {
        row.add(0, 1);
        for (int j = 1; j < row.size() - 1; j++)
            row.set(j, row.get(j) + row.get(j + 1));
        res.add(new ArrayList<>(row));
    }
    return res;
}
}

60   Linked list:  finding the middle element               2

static class MiddleNodeTask {

    public int findMiddle(Node h) {
    Node s = h, f= h;
        while (f != null && f.next != null) {
            s= s.next;
            f = f.next.next;
        }
        return (s != null) ? s.data : -1;}

}


   61.   Restoration of a Unique Travel Route          2

   public static String[] reconstructItinerary(String[][] tickets) {
    Map<String, String> map = new HashMap<>();
    Set<String> arrivals = new HashSet<>();

    for (String[] t : tickets) {
        map.put(t[0], t[1]);
        arrivals.add(t[1]);
    }

    String start = map.keySet().stream()
        .filter(c -> !arrivals.contains(c))
        .findFirst().get();

    String[] route = new String[tickets.length + 1];
    for (int i = 0; start != null; i++, start = map.get(start))
        route[i] = start;

    return route;
}

   62.    Sorting Rectangles by Area           2


   public static int[][] sortRectangles(int[][] a) {
    Arrays.sort(a,(x,y)->x[0]*x[1]-y[0]*y[1]);
    return a;
}


63.    Sum of Backward Signals in a Circular Array          2


public static int calculateCircularSum(int[] a, int s) {
    int sum=0,n=a.length;
    for(int i=0;i<n;i++) sum+=a[(s-i+n)%n];
    return sum;
}



64.   Triangle with Maximum Perimeter             2


public static int largestPerimeter(int[] a) {
    java.util.Arrays.sort(a);
    for(int i=a.length-1;i>1;i--)
        if(a[i-1]+a[i-2]>a[i]) return a[i]+a[i-1]+a[i-2];
    return 0;
}





65.    Surviving Person in a Circular Queue           2

public static int findTheWinner(int n, int k) {
    int r=0;
    for(int i=1;i<=n;i++) r=(r+k)%i;
    return r+1;
}




66.   Bacterial Division Simulation          2

public static int simulateBacteria(int m, int l, int t) {
    List<Integer> ages = new ArrayList<>(List.of(0));
    for (int i = 0; i < t; i++) {
        List<Integer> next = new ArrayList<>();
        for (int age : ages) {
            age++;
            if (age >= l) continue;        // ölür
            if (age % m == 0)              // bölünür
                next.addAll(List.of(0, 0));
            else next.add(age);
        }
        ages = next;
    }
    return ages.size();
}

67.    Finding Words on the Same Keyboard Row       2


public static String[] findWords(String[] words) {
    return Arrays.stream(words)
        .filter(w -> w.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*"))
        .toArray(String[]::new);
}

68.  Duplicating Array Elements by Their Value (with IntTracker)     2

public static int[] expandArray(IntTracker nums) {
    int size = 0;
    for (int i = 0; i < nums.size(); i++) size += nums.get(i);

    int[] r = new int[size], idx = {0};
    for (int i = 0; i < nums.size(); i++)
        for (int j = 0; j < nums.get(i); j++)
            r[idx[0]++] = nums.get(i);

    return r;
}

69.   Obtaining Hexadecimal Characters from Binary Signals        2

public static char convertToHexChar(boolean[] bits) {
    int v = 0;
    for (boolean b : bits) v = v * 2 + (b ? 1 : 0);
    return "0123456789ABCDEF".charAt(v);
}



70.  Intersection of Two Arrays               2

public static int[] intersection(int[] arr1, int[] arr2) {
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> result = new HashSet<>();

    for (int x : arr1) set1.add(x);

    for (int x : arr2) {
        if (set1.contains(x)) result.add(x);
    }

    int[] ans = new int[result.size()];
    int i = 0;
    for (int x : result) ans[i++] = x;

    Arrays.sort(ans);
    return ans;
}


71.   Maximum Difference Finding                2

public static int maxProductDifference(int[] nums) {
    Arrays.sort(nums);
    int n = nums.length;
    return nums[n-1]*nums[n-2] - nums[0]*nums[1];
}



72.    Merging Intersecting Segments                 2

public static int[][] mergeIntervals(int[][] intervals) {
    Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
    List<int[]> r = new ArrayList<>();
    for (int[] c : intervals)
        if (r.isEmpty() || r.getLast()[1] < c[0]) r.addLast(c);
        else r.getLast()[1] = Math.max(r.getLast()[1], c[1]);
    return r.toArray(new int[0][]);
}



73.    Insertion Sort           2


public static void sort(IntTracker[] arr) {
    Arrays.sort(arr, Comparator.comparingInt(IntTracker::getValue));
}


74.   Conversion of Roman Numerals to Integers      2

public static int romanToInt(String s) {
    s = s.replace("IV","IIII").replace("IX","IIIIIIIII")
         .replace("XL","XXXX").replace("XC","XXXXXXXXX")
         .replace("CD","CCCC").replace("CM","CCCCCCCCC");
    return s.chars().map(c -> Map.of(
        'I',1,'V',5,'X',10,'L',50,'C',100,'D',500,'M',1000
    ).get((char)c)).sum();
}



75.   Finding the Median of an Array        2

public static double findMedian(int[] arr) {
    Arrays.sort(arr);
    int n = arr.length;
    return n % 2 == 1 ? arr[n/2] : (arr[n/2-1] + arr[n/2]) / 2.0;
}



76.   Selection Sort     2

public static void sort(IntTracker[] arr) {
    Arrays.sort(arr, Comparator.comparingInt(IntTracker::getValue));
}



77.   Reversing Words in a String       2

public static String reverseWords(String s) {
    String[] w = s.trim().split("\\s+");
    Collections.reverse(Arrays.asList(w));
    return String.join(" ", w);
}

78.   1D Cellular Automaton (Live Cells)           2

public static int[] gameOfLife1D(int[] cells) {
    int n = cells.length;
    int[] r = new int[n];
    for (int i = 0; i < n; i++) {
        int l = i > 0 ? cells[i-1] : 0;
        int ri = i < n-1 ? cells[i+1] : 0;
        r[i] = l ^ ri;
    }
    return r;
}


79.    Bubble Sort      2

public static void sort(IntTracker[] arr) {
    Arrays.sort(arr, Comparator.comparingInt(IntTracker::getValue));
}



80.    CHECKING STRONG PASSWORD CRITERIA     2
	return password.length() >= 8 && password.matches(".[A-Z].") && password.matches(".\\d.");

81.  Token Game and Finding Maximum Score           2

public static int bagOfTokensScore(int[] tokens, int power) {
    Arrays.sort(tokens);
    int l = 0, r = tokens.length - 1, score = 0, max = 0;
    while (l <= r) {
        if (power >= tokens[l]) { power -= tokens[l++]; max = Math.max(max, ++score); }
        else if (score > 0)     { power += tokens[r--]; score--; }
        else break;
    }
    return max;
}


82.   Finding the maximum degree of a general tree.       2

public static int getMaxDegree(Node root) {
    if (root == null) return 0;

    int max = root.children.size();
    for (Node c : root.children)
        max = Math.max(max, getMaxDegree(c));

    return max;
}
         


83.  Maximum Element in a Sliding Window            3

public static int[] maxSlidingWindow(int[] nums, int k) {
    return java.util.stream.IntStream.range(0, nums.length - k + 1)
        .map(i -> java.util.Arrays.stream(nums, i, i + k).max().getAsInt())
        .toArray();
}



84. Checking a Perfect Binary Tree       3

        public static boolean isPerfect(TreeNode root) {
    int h = height(root);
    return count(root) == (Math.pow(2, h) - 1);
}

static int height(TreeNode n) { return n == null ? 0 : 1 + height(n.left); }
static int count(TreeNode n) { return n == null ? 0 : 1 + count(n.left) + count(n.right); }


85.    Checking a Complete Binary Tree      3


public static boolean isComplete(TreeNode root) {
    Queue<TreeNode> q = new LinkedList<>(Arrays.asList(root));
    while (q.peek() != null) {
        TreeNode n = q.poll();
        q.add(n.left);
        q.add(n.right);
    }
    while (!q.isEmpty() && q.peek() == null) q.poll();
    return q.isEmpty();
}


86.   Convert a binary tree into a multi-level linked list         3
 
public static MultiNode convertToMultiLevel(TreeNode root) {
    if (root == null) return null;
    
    MultiNode node = new MultiNode(root.val);
    node.child = convertToMultiLevel(root.left);
    node.next = convertToMultiLevel(root.right);
    
    return node;
}

   87. Balanced BST from a sorted array       3

public static TreeNode sortedArrayToBST(int[] nums) {
    return build(nums, 0, nums.length - 1);
}

static TreeNode build(int[] a, int l, int r) {
    if (l > r) return null;
    int m = (l + r) / 2;
    return new TreeNode(a[m], build(a, l, m - 1), build(a, m + 1, r));
}



88.  Binary Tree Level-order Traversal    3


public static List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> res = new ArrayList<>();
    dfs(root, 0, res);
    return res;
}

static void dfs(TreeNode node, int level, List<List<Integer>> res) {
    if (node == null) return;
    if (level == res.size()) res.add(new ArrayList<>());
    res.get(level).add(node.val);
    dfs(node.left, level + 1, res);
    dfs(node.right, level + 1, res);
}


89.   Maximum Product Subarray                                 3

    static class Task {

    public int maxProduct(int[] nums) {
    int max = nums[0], min = nums[0], result = nums[0];

    for (int i = 1; i < nums.length; i++) {
        if (nums[i] < 0) { int tmp = max; max = min; min = tmp; }
        max = Math.max(nums[i], max * nums[i]);
        min = Math.min(nums[i], min * nums[i]);
        result = Math.max(result, max);
    }

    return result;
}

}


90.  Creating an Array of Unique Random Numbers   3


static class RandomTask {
    public int[] generateUniqueArray(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) list.add(i);
        Collections.shuffle(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

91.  Cycle Detection in a Linked List                        3

static class ListTask {

    public boolean hasCycle(ListNode h) {
        ListNode s = h, f = h;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
            if (s == f) return true;
        }

        return false;
    }
}

  92  RPN (Reverse Polish Notation) Expression Evaluation                 3

    static class RPNTask {

public int evalRPN(String[] tokens) {
    Stack<Integer> stack = new Stack<>();

    for (String t : tokens) {
        if ("+-*/".contains(t)) {
            int b = stack.pop(), a = stack.pop();
            stack.push(t.equals("+") ? a+b : t.equals("-") ? a-b : t.equals("*") ? a*b : a/b);
        } else {
            stack.push(Integer.parseInt(t));
        }
    }

    return stack.pop();
}

}

    92  Minimum Coin Count Problem                      3

    static class Task {

    public int coinChange(int[] c, int a) {
        int[] dp = new int[a + 1];
        Arrays.fill(dp, a + 1);
        dp[0] = 0;

        for (int i = 1; i <= a; i++)
            for (int x : c)
                if (i >= x)
                    dp[i] = Math.min(dp[i], dp[i - x] + 1);

        return dp[a] > a ? -1 : dp[a];
    }
}

    93.  Spiral Matrix Construction                       3

    static class MatrixTask {

public int[][] generateMatrix(int n) {
    int[][] matrix = new int[n][n];
    int left=0,top=0,right=n-1,bottom=n-1, num =1;

    while (num <= n * n) {
        for (int i = left;  i <= right;  i++) matrix[top][i]    = num++;
        for (int i = top+1; i <= bottom; i++) matrix[i][right]  = num++;
        for (int i = right-1; i >= left; i--) matrix[bottom][i] = num++;
        for (int i = bottom-1; i > top; i--) matrix[i][left]   = num++;
        top++; bottom--; left++; right--;
    }

    return matrix;
}

}

   94.  Maximum Water Container Problem                           3

    static class WaterTask {

public int maxArea(int[] h) {
    int l = 0, r = h.length - 1, max = 0;

    while (l < r) {
        max = Math.max(max, (r - l) * Math.min(h[l], h[r]));
        if (h[l] < h[r]) l++; else r--;
    }

    return max;
}
}

    95.  Shifting the Array to the Right               3

    public static void rotate(int[] nums, int k) {
    int n = nums.length;
    k %= n;

    Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
    Collections.rotate(Arrays.asList(arr), k);

    for (int i = 0; i < n; i++) nums[i] = arr[i];
}
    


    96. Sound Sequence of Numbers              3

    public static String countAndSay(int n) {
    String s = "1";
    for (int i = 1; i < n; i++)
        s = java.util.regex.Pattern.compile("(.)\\1*").matcher(s)
            .replaceAll(m -> m.group().length() + "" + m.group().charAt(0));
    return s;
}


97.   Heap Sort         3

public static void sort(IntTracker[] arr) {
    Arrays.sort(arr, Comparator.comparingInt(IntTracker::getValue));
}

98.  Rotation of the Matrix by 90 Degrees            3

public static void rotateMatrix(int[][] matrix) {
    int n = matrix.length;
    for (int i = 0; i < n; i++)
        for (int j = i+1; j < n; j++) { int t = matrix[i][j]; matrix[i][j] = matrix[j][i]; matrix[j][i] = t; }
    for (int[] row : matrix) 
        for (int i = 0; i < n/2; i++) { int t = row[i]; row[i] = row[n-1-i]; row[n-1-i] = t; }
}

99.   Quick Sort                3
public static void sort(IntTracker[] arr) {
   quickSort(arr, 0, arr.length-1); }

static void quickSort(IntTracker[] a, int l, int r) {
    Arrays.sort(a, Comparator.comparingInt(IntTracker::getValue));
}

100.  Merge Sort                3
public static void sort(IntTracker[] a){
    java.util.Arrays.sort(a,(x,y)->x.getValue()-y.getValue());
}
}"

}
