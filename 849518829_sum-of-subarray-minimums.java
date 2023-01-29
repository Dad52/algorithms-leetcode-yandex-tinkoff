id = 849518829 
lang = java 
runtime  = 76 ms 
memory = 72.3 MB
title_slug = sum-of-subarray-minimums
code =

 class Solution {
public int sumSubarrayMins(int[] arr) {
	int MOD = (int) Math.pow(10, 9) + 7;

	int[] leftArr = new int[arr.length];
	int[] rightArr = new int[arr.length];

	ArrayDeque<Pair<Integer, Integer>> leftStack = new ArrayDeque<>();
	ArrayDeque<Pair<Integer, Integer>> rightStack = new ArrayDeque<>();

	for (int i = 0; i < arr.length; i++) { // Fill Left Array
		int count = 1;

		while (!leftStack.isEmpty() && leftStack.peek().getKey() > arr[i]) {
			count += leftStack.peek().getValue();
			leftStack.pop();
		}

		leftStack.push(new Pair(arr[i], count));
		leftArr[i] = count;
	}

	for (int i = arr.length - 1; i >= 0; i--) { // Fill Right Array
		int count = 1;

		while (!rightStack.isEmpty() && rightStack.peek().getKey() >= arr[i]) {
			count += rightStack.peek().getValue();
			rightStack.pop();
		}

		rightStack.push(new Pair(arr[i], count));
		rightArr[i] = count;
	}

	long ans = 0;

	for (int i = 0; i < arr.length; i++) 
		ans = (ans + (long) arr[i] * leftArr[i] * rightArr[i]) % MOD;

	return (int) ans;
}
}