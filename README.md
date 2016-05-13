# MasterCompiler
It's a compiler from Mx\* to MIPS written in Java, the language reference of Mx\* is [here](http://acm.sjtu.edu.cn/w/images/9/93/Mx_language_manual.pdf).

# Prerequisite
JDK is required.

# Compile
```
make
cd bin
``` 

# Report
My report is [here](https://github.com/yzh119/MasterCompiler/blob/master/report/report.pdf).

# Additional features
* Member function is allowed.
* Declaring a new variable in a for-loop is allowed:
	`for (int i = 0; i < n; i++)`
* Declaring multiple variables at a time is allowed:
	`int a = 1, b, c = 3`