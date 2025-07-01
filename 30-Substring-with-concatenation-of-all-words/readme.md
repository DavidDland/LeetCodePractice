<h2><a href="https://leetcode.com/problems/substring-with-concatenation-of-all-words/">30. Substring with Concatenation of All Words</a></h2><h3>Hard</h3><hr><div><p>You are given a string <code>s</code> and an array of strings <code>words</code>. All the strings of <code>words</code> are of the same length.</p>

<p>A concatenated string is a string that exactly contains all the strings of any permutation of <code>words</code> concatenated.</p>

<p>Return an array of the starting indices of all the concatenated substrings in <code>s</code>. You can return the answer in any order.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> s = "barfoothefoobarman", words = ["foo","bar"]
<strong>Output:</strong> [0,9]
<strong>Explanation:</strong> 
The substring starting at 0 is "barfoo". It is the concatenation of ["bar","foo"].
The substring starting at 9 is "foobar". It is the concatenation of ["foo","bar"].
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]
<strong>Output:</strong> []
<strong>Explanation:</strong> No valid concatenated substring exists.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> s = "barfoofoobarthefoobarman", words = ["bar","foo","the"]
<strong>Output:</strong> [6,9,12]
<strong>Explanation:</strong> Valid substrings: "foobarthe", "barthefoo", "thefoobar"
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 10<sup>4</sup></code></li>
	<li><code>1 &lt;= words.length &lt;= 5000</code></li>
	<li><code>1 &lt;= words[i].length &lt;= 30</code></li>
	<li><code>s</code> and <code>words[i]</code> consist of lowercase English letters.</li>
</ul>
</div>
